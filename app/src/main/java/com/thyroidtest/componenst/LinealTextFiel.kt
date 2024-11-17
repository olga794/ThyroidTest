package com.thyroidtest.componenst

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation




@Composable
fun LinealTextFiel(
    modifier: Modifier = Modifier,
    textValue: String,
    textLabel: String,
    textSuport: String,
    onValueChange: (String) -> Unit,
    maxChar: Int? = null,
    capitalization: KeyboardCapitalization = KeyboardCapitalization.None,
    keyboardType: KeyboardType,
    keyboardActions: KeyboardActions,
    imeAction: ImeAction,
    trailingIcon: @Composable() (() -> Unit)? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None
) {

    TextField(
        modifier = modifier.fillMaxWidth(),
        value = textValue.take(maxChar ?: 40),
        onValueChange = onValueChange,
        label = {
            Text(text = textLabel)
        },
        supportingText= {
            Text(text = textSuport)
        },
        trailingIcon = trailingIcon,
        keyboardOptions = KeyboardOptions(
            capitalization = capitalization,
            keyboardType = keyboardType,
            imeAction = imeAction
        ),
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation
//        colors = TextFieldDefaults.textFieldColors(
//            textColor = Color(0xFF030303),
//            focusedIndicatorColor = Color(0xFF522581),
//            unfocusedIndicatorColor = Color(0xFF199CA3)
//
//        )
//        colors = TextFieldDefaults.textFieldColors(
//            textColor = Color(0xFF030303),
//            backgroundColor = Color(0xFFFAFAFA),
//            focusedIndicatorColor = Color(0xFF522581),
//            unfocusedIndicatorColor = Color(0xFF199CA3)
//
//        )
    )

}