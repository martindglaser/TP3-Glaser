package com.example.desafio.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.desafio.R

@Composable
fun HomeScreen(){
    Column (
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.welcome_image),
                contentDescription = "",
                modifier = Modifier.size(350.dp)
            )
        }
        Row(
            modifier = Modifier.padding(top = 80.dp)
        ){
            Text(
                text = "Discover Your\n" +
                        "Dream Job here",
                style = TextStyle(
                    fontSize = 30.sp,
                    color = Color(0xFF1F41BB),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Row(
            modifier = Modifier.padding(top=25.dp)
        ){
            Text(
                text="Explore all the existing job roles based on your\ninterest and study major",
                style = TextStyle(
                    textAlign = TextAlign.Center
                )
            )
        }
        Row(
            modifier = Modifier.padding(top = 80.dp)
        ){
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CustomButton("Login")
            }
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CustomButton(
                    "Register",
                    backgroundColor = Color.Transparent,
                    contentColor = Color.Black
                )
            }

        }
    }
}