package com.example.desafio.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.desafio.R


@Composable
fun Social(){

    Row(
        modifier = Modifier.fillMaxWidth().padding(top = 50.dp),
        horizontalArrangement = Arrangement.Center
    ){
        Text("Or continue with",
            style = TextStyle(
                color = Color(0xFF1F41BB),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
        )

    }

    Row(
    modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
    horizontalArrangement = Arrangement.Center
    ){
        @Composable
        fun NoPassSignInButton(
            imageResId: Int,
            onClick: () -> Unit = {}, // acción (por defecto no hace nada)
            modifier: Modifier = Modifier,
            backgroundColor: Color = Color(0xFFECECEC), // color default
            cornerRadius: Dp = 10.dp,                   // redondez default
            width: Dp = 60.dp,                         // ancho default
            height: Dp = 45.dp                          // alto default
        ) {
            Button(
                    onClick = onClick,
                    modifier = modifier
                        .width(width)
                        .height(height)
                        .padding(3.dp),
                    shape = RoundedCornerShape(cornerRadius),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = backgroundColor,
                    ),
                    contentPadding = PaddingValues(0.dp),
                ) {
                    Image(
                        painter = painterResource(id = imageResId),
                        contentDescription = "",
                        modifier = Modifier.size(17.dp),
                    )
                }
            }
            NoPassSignInButton(R.drawable.google)
            NoPassSignInButton(R.drawable.facebook)
            NoPassSignInButton(R.drawable.apple)
        }
}
