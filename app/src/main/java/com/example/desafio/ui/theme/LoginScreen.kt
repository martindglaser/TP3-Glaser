package com.example.desafio.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(){
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Text(
                text = "Login Here",
                style = TextStyle(
                    fontSize = 30.sp,
                    color = Color(0xFF1F41BB),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Row(
            modifier = Modifier.padding(top = 30.dp)
        ){
            Text("Welcome back you’ve\n" +
                    "been missed!",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    fontSize = 22.sp
                )
            )
        }
        Row(
            modifier = Modifier.padding(top = 65.dp)
        ) {
            OutlinedTextField(
                value = username,
                onValueChange = { it.also { username = it } },
                label = { Text("Username") }
            )
        }
        Row(
            modifier = Modifier.padding(top = 30.dp)
        ) {
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") }
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 30.dp, end = 65.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Text("Forgot your password?",
                style = TextStyle(
                  textAlign = TextAlign.Right,
                    color = Color(0xFF1F41BB),
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 60.dp, start = 65.dp, end = 65.dp)
        ){
            CustomButton("Sign in", width = 400.dp)
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 30.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Text("Create new account",
                style = TextStyle(
                    color = Color(0xFF494949),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                    ))
        }

        Social()
    }
}