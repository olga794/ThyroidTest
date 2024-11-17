package com.thyroidtest.componenst.intro


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun BotonHeader(modifier: Modifier,onClick: () -> Unit ) {

    FloatingActionButton(
        modifier = modifier
            .padding(1.dp)
            .size(30.dp),
        contentColor = MaterialTheme.colorScheme.secondary,
        onClick =onClick
    ) {

        Icon(
            modifier= Modifier.size(35.dp),
            imageVector = Icons.Rounded.Close,
            contentDescription = "cerrar app",

        )
    }

}