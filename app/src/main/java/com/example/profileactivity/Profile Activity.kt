package com.example.profileactivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .verticalScroll(rememberScrollState())
//            .padding(horizontal = 16.dp)
    ) {
Column(modifier = Modifier
    .fillMaxSize()
    .background(Color(0xFF181818))) {


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp, bottom = 24.dp, start = 15.dp, end = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(Icons.Default.ArrowBack, contentDescription = "Back", tint = Color.White)
        Text("Profile", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start=10.dp))
        Spacer(Modifier.weight(1f))

        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(Color.Black),
            contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp),
        ) {
            Icon(Icons.Default.Add, contentDescription = "Support", tint = Color.White)
            Text("support", color = Color.White, fontSize = 14.sp)
        }
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp)
    ) {
        Box(
            modifier = Modifier
                .size(75.dp)
                .clip(CircleShape)
                .background(Color.DarkGray),
            contentAlignment = Alignment.Center
        ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground), // Replace with actual image
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(56.dp)
                .clip(CircleShape)
        )
            }
        Spacer(Modifier.width(16.dp))
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "andaz Kumar",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = "member since Dec, 2020",
                color = Color.Gray,
                fontSize = 14.sp
            )
        }

        Box(
            modifier = Modifier
                .size(40.dp)
                .border(2.dp, Color(0xFF555555), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = null,
                tint = Color(0xFF555555),
                modifier = Modifier.size(20.dp)
            )
        }

    }

    Spacer(Modifier.height(24.dp))


    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        colors = CardDefaults.cardColors(Color.Black),
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(top = 10.dp, bottom = 20.dp, start = 10.dp, end = 10.dp)

    )
    {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .size(40.dp)
                    .border(2.dp, Color(0xFF555555), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Car",
                    tint = Color(0xFF555555),
                    modifier = Modifier.size(20.dp)
                )
            }


            Spacer(Modifier.width(12.dp))
            Column {
                Text("get to know your vehicles, inside out", color = Color.White, fontSize = 14.sp)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("CRED garage", color = Color.White, fontWeight = FontWeight.Bold)
                    Icon(Icons.Default.ArrowForward, contentDescription = "Go", tint = Color.White)
                }
            }
        }
    }
    Spacer(Modifier.height(24.dp))



    ProfileStatRow2("credit score", ". REFRESH AVAILABLE", "757")
    DividerComponent(color = Color.Gray)
    ProfileStatRow2("lifetime cashback", null, "₹3")
    DividerComponent(color = Color.Gray)
    ProfileStatRow2("bank balance", null, "check")
    Spacer(Modifier.height(24.dp))


}
        Text(
            "YOUR REWARDS & BENEFITS",
            color = Color.Gray,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top=15.dp,start=15.dp,bottom=10.dp)
        )

        Spacer(Modifier.height(8.dp))
        ProfileInfoRow("cashback balance", "₹0")
        DividerComponent(color = Color.Gray)
        ProfileInfoRow("coins", "26,46,583")
        DividerComponent(color = Color.Gray)
        ProfileInfoRow("win upto Rs 1000", "refer and earn")
        Spacer(Modifier.height(24.dp))


        Text("TRANSACTIONS & SUPPORT", color = Color.Gray, fontSize = 15.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 15.dp))
        Spacer(Modifier.height(8.dp))
        ProfileInfoRow("all transactions", "")
    }
}

@Composable
fun ProfileStatRow1(label: String, subLabel: String?, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(label, color = Color.White, fontSize = 16.sp)
        if (subLabel != null) {
            Spacer(Modifier.width(8.dp))
            Text(subLabel, color = Color.Green, fontSize = 12.sp, fontWeight = FontWeight.Bold)
        }
        Spacer(Modifier.weight(1f))
        Text(value, color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Icon(Icons.Default.ArrowForward, contentDescription = "Go", tint = Color.White)
    }
}
@Composable
fun ProfileStatRow2(label: String, subLabel: String?, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF181818))
            .padding(vertical = 12.dp, horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(20.dp)
                .border(1.dp, Color(0xFF555555), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.Check,
                contentDescription = null,
                tint = Color(0xFF555555),
                modifier = Modifier.size(12.dp)
            )
        }
        Spacer(Modifier.width(10.dp))
        Text(
            text = label,
            color = Color(0xFFCCCCCC),
            fontSize = 16.sp
        )
        if (subLabel != null) {
            Text(
                text = "  ",
                color = Color(0xFFCCCCCC),
                fontSize = 16.sp
            )
            Text(
                text = subLabel,
                color = Color(0xFF20C997),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(Modifier.weight(1f))
        Text(
            text = value,
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.width(12.dp))
        Icon(
            imageVector = Icons.Default.ArrowForward,
            contentDescription = "Go",
            tint = Color(0xFF555555),
            modifier = Modifier.size(20.dp)
        )
    }
}

@Composable
fun ProfileInfoRow(label: String, value: String) {
    Column(modifier = Modifier) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp, horizontal = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(label, color = Color.White, fontSize = 16.sp)
            Spacer(Modifier.weight(1f))

            Icon(Icons.Default.ArrowForward, contentDescription = "Go", tint = Color.White)

        }
            if (value.isNotEmpty()) {
                Text(value, color = Color.Gray, fontSize = 16.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start=15.dp))
            }

    }
}

@Composable
fun DividerComponent(modifier: Modifier = Modifier,color: Color) {
    Divider(
        thickness = 1.dp,
        modifier = Modifier
            .padding(vertical = 8.dp)
            .padding(horizontal = 15.dp)

    )

}
@Preview(showBackground = true)
@Composable
private fun ProfileScreenPreivew() {
    ProfileScreen()
}

