package com.thyroidtest.componenst.intro

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.thyroidtest.ui.theme.Grey42
import com.thyroidtest.ui.theme.Pink42


@Composable
fun TextLogo(tituloAppText: String) {
    Text(
        text = tituloAppText,
        style = TextStyle(
            color = Pink42,
            fontFamily = FontFamily.SansSerif,
            fontSize = 56.0.sp,
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight(600.0.toInt()),
            fontStyle = FontStyle.Italic,
            shadow = Shadow(
                color = Grey42,
                offset = Offset(
                    x = 0.0f,
                    y = 4.0f
                ),
                blurRadius = 4.0f
            )


        )

    )

}