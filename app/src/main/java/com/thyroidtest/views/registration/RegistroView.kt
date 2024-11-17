package com.thyroidtest.views.registration

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.thyroidtest.R
import com.thyroidtest.componenst.ComunButton
import com.thyroidtest.componenst.LinealTextFiel
import com.thyroidtest.componenst.Space
import com.thyroidtest.ui.theme.Blue42

@Composable
fun RegistroView(navController: NavController) {
    var inconv: Painter
    var passwordVisibility: Boolean by remember { mutableStateOf(false) }
    var confirmPasswordVisibility: Boolean by remember { mutableStateOf(false) }
    Box(){

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically

            ){
                IconButton(
                    onClick = {
                        //onBack()
                        navController.popBackStack()
                    }
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        //imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back Icon",
                        tint = MaterialTheme.colorScheme.primary
                    )
                }

                Text(
                    text = "Crear Una Cuenta",
                    style = MaterialTheme.typography.headlineLarge.copy(
                        color = MaterialTheme.colorScheme.primary
                    )
                )

            }//finaliza un fila
            Space(50.dp)
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                var nameValue by  remember { mutableStateOf("") }
                var emailValue by  remember { mutableStateOf("") }
                var phoneValue by  remember { mutableStateOf("") }
                var passwordValue by  remember { mutableStateOf("") }
                var confirmPasswordValue by  remember { mutableStateOf("") }

                LinealTextFiel(
                    Modifier,
                    nameValue,
                    "Nombre",
                    "Nombre de Usuario",
                    onValueChange = {nameValue = it},
                    null,
                    KeyboardCapitalization.Characters,
                    KeyboardType.Text,
                    KeyboardActions(
                        onNext = {
                            // focusManager.moveFocus(FocusDirection.Down)
                        }
                    ),
                    ImeAction.Next,
                    null
                    )

                LinealTextFiel(
                    Modifier,
                    emailValue,
                    "Correo Electronico",
                    " ",
                    onValueChange = {emailValue = it},
                    null,
                    KeyboardCapitalization.None,
                    KeyboardType.Email,
                    KeyboardActions(
                        onNext = {
                            // focusManager.moveFocus(FocusDirection.Down)
                        }
                    ),
                    ImeAction.Next,
                    null
                )
                LinealTextFiel(
                    Modifier,
                    phoneValue,
                    "Numero de Telefono",
                    " ",
                    onValueChange = {phoneValue = it},
                    10,
                    KeyboardCapitalization.None,
                    KeyboardType.Phone,
                    KeyboardActions(
                        onNext = {
                            // focusManager.moveFocus(FocusDirection.Down)
                        }
                    ),
                    ImeAction.Next,
                    null
                )

                LinealTextFiel(
                    Modifier,
                    passwordValue,
                    "Contraseña",
                    " ",
                    onValueChange = {passwordValue = it},
                    10,
                    KeyboardCapitalization.None,
                    KeyboardType.Password,
                    KeyboardActions(
                        onNext = {
                            // focusManager.moveFocus(FocusDirection.Down)
                        }
                    ),
                    ImeAction.Next,
                    trailingIcon = {
                        IconButton(
                            onClick = {
                                passwordVisibility = !passwordVisibility
                           }
                        ) {
                            if (passwordVisibility)
                                {inconv  = painterResource(id = R.drawable.ic_baseline_visibility_24)
                            }else {
                                inconv = painterResource(id = R.drawable.ic_baseline_visibility_off_24)
                            }
                           Icon(
                               painter = inconv,
                                contentDescription = "Mostrar Contraseña"
                            )
                        }
                    },
                    visualTransformation =
                    if (passwordVisibility) {
                        VisualTransformation.None
                    } else{ PasswordVisualTransformation()
                    }

                )
                LinealTextFiel(
                    Modifier,
                    confirmPasswordValue,
                    "Confirmar Contraseña",
                    " ",
                    onValueChange = {confirmPasswordValue = it},
                    10,
                    KeyboardCapitalization.None,
                    KeyboardType.Password,
                    KeyboardActions(
                        onNext = {
                            // focusManager.moveFocus(FocusDirection.Down)
                        }
                    ),
                    ImeAction.Done,
                    trailingIcon = {
                        IconButton(
                            onClick = {
                                confirmPasswordVisibility = !confirmPasswordVisibility
                            }
                        ) {
                            if (confirmPasswordVisibility)
                            {inconv  = painterResource(id = R.drawable.ic_baseline_visibility_24)
                            }else {
                                inconv = painterResource(id = R.drawable.ic_baseline_visibility_off_24)
                            }
                            Icon(
                                painter = inconv,
                                contentDescription = "Mostrar Contraseña"
                            )
                        }
                    },
                    visualTransformation =
                    if (confirmPasswordVisibility) {
                        VisualTransformation.None
                    } else{ PasswordVisualTransformation()
                    }

                )
                Space(6.dp)
                ComunButton(
                    text = "INSCRIBIRSE",
                    imageVector = Icons.Default.Person,
                    textIcon = "registro",
                    displayProgressBar = false,
                    onClick = {
//                        onRegister(
//                            nameValue.value,
//                            emailValue.value,
//                            phoneValue.value,
//                            passwordValue.value,
//                            confirmPasswordValue.value
//
//                        )
                    }
                )
                Space(30.dp)
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text="¿Ya tiene una cuenta? :  ",
                        style = TextStyle(
                            color = Blue42,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    IconButton(onClick = {navController.popBackStack()}) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Back Icon",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }

                }//finaliza un fila 2



//                Button(
//                    onClick = {
//                        //loginVM.login(email, password) {
//                         //   navController.navigate("Home")
//                        }, modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(start = 80.dp, end = 80.dp)
//                ) {
//                    Text(text = "iniciar Sesión",)
//                }
            }//finaliza la columna
        }// finaliza la columna
    }

}