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
fun RegisterScreen(){
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordConf by remember { mutableStateOf("") }

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
                text = "Create Account",
                style = TextStyle(
                    fontSize = 30.sp,
                    color = Color(0xFF1F41BB),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Row(
            modifier = Modifier.padding(top = 12.dp)
        ){
            Text("Create an account so you can explore all the\nexisting jobs",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp
                )
            )
        }
        Row(
            modifier = Modifier.padding(top = 55.dp)
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
            modifier = Modifier.padding(top = 30.dp)
        ) {
            OutlinedTextField(
                value = passwordConf,
                onValueChange = { passwordConf = it },
                label = { Text("ConfirmPassword") }
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 60.dp, start = 65.dp, end = 65.dp)
        ){
            CustomButton("Sign up", width = 400.dp)
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 30.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Text("Already have an account",
                style = TextStyle(
                    color = Color(0xFF494949),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                ))
        }

        Social()
    }
}