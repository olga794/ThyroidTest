package com.thyroidtest.componenst.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.thyroidtest.R


@Composable
fun FondoIntro(inside: ContentScale) {
    Image(
        painter = painterResource(id = R.drawable.fondo_intro,),
        contentDescription = "fondoIntro",
        contentScale= inside,
        modifier = Modifier
            .fillMaxSize()
            .alpha(alpha = 0.4000000059604645f)
            .background(
                MaterialTheme.colorScheme.onPrimary
            )

    )

}