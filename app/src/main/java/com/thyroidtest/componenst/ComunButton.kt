package com.thyroidtest.componenst

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ComunButton(
    modifier: Modifier = Modifier,
    text: String,
    imageVector: ImageVector,
    textIcon: String,
    displayProgressBar: Boolean = false,
    onClick: () -> Unit
) {
    if(!displayProgressBar) {
        Button(
            modifier = modifier.width(280.dp).height(50.dp),
            onClick = onClick,
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color(0xFF6751A3)
            )

        ) {
            Icon(
                imageVector,
                contentDescription = textIcon,
                modifier = Modifier.size(ButtonDefaults.IconSize),
                tint =  Color(0xFFFFFFFF)

            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text(
                text = text ,
                style = TextStyle(
                    color = Color(red = 255, green = 255, blue = 255, alpha = 255),
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 23.0.sp,
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight(700.0.toInt()),
                    fontStyle = FontStyle.Italic,
                    shadow = Shadow(
                        color = Color(
                            alpha = 63,
                            red = 0,
                            green = 0,
                            blue = 0
                        ),
                        offset = Offset(
                            x = 0.0f,
                            y = 4.0f
                        ),
                        blurRadius = 4.0f
                    )
                )
            )

        }
    } else {
        CircularProgressIndicator(
            modifier = Modifier.size(50.dp),
            color = MaterialTheme.colorScheme.primary,
            strokeWidth = 6.dp
        )
    }
}