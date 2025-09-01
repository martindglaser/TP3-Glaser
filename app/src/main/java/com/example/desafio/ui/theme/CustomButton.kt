package com.example.desafio.ui.theme

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit = {}, // acción (por defecto no hace nada)
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFF1F41BB), // color default
    contentColor: Color = Color.White,          // color del texto
    cornerRadius: Dp = 10.dp,                   // redondez default
    width: Dp = 130.dp,                         // ancho default
    height: Dp = 50.dp                          // alto default
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .width(width)
            .height(height),
        shape = RoundedCornerShape(cornerRadius),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = contentColor
        )
    ) {
        Text(text = text)
    }
}