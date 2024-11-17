package com.thyroidtest.componenst

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import com.thyroidtest.ui.theme.Blue42

@Composable
fun Space(tamano: Dp) {
    Spacer(modifier = Modifier.size(tamano))
}

@Composable
fun  MensajeTex(textMensaje: String,){
    Text(
        text=textMensaje,
        style = TextStyle(
            color = Blue42,
            fontWeight = FontWeight.Bold
        )
    )
}