package com.thyroidtest.componenst.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.thyroidtest.R

@Composable
fun LogoCinta() {
    Image(
        painter = painterResource(id = R.drawable.logo_cinta),
        contentDescription = "logoCinta",
        alignment =  Alignment.Center,
        modifier = Modifier.requiredSize(150.dp)
    )

}