package com.thyroidtest.views.login


import android.app.Activity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
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
import com.thyroidtest.componenst.intro.BotonHeader
import com.thyroidtest.componenst.intro.FondoIntro
import com.thyroidtest.componenst.intro.LogoCinta
import com.thyroidtest.componenst.intro.TextLogo
import com.thyroidtest.ui.theme.Blue42

@Composable
fun LoginView(
    navController: NavController

) {
    Box(
        Modifier
            .fillMaxSize()
            .padding(1.dp)
    ) {

        FondoIntro(ContentScale.FillBounds)
        Header(Modifier.align(Alignment.TopEnd))
        Body(Modifier.align( Alignment.Center), navController)




    }
}


@Composable
fun Header(modifier: Modifier) {
   val activity = LocalContext.current as Activity
    BotonHeader(modifier){
        activity.finish()
    }

}
@Composable
fun Body(
    modifier: Modifier,
    navController: NavController

    ) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Row(modifier = modifier.padding( 20.dp)) {
            LogoCinta()
            TextLogo("THYROID TEST")
        }
        Space(10.dp)
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            var emailValue by remember { mutableStateOf("") }
            var passwordValue by  remember { mutableStateOf("") }
            var passwordVisibility: Boolean by remember { mutableStateOf(false)}
            var inconv: Painter
           // val focusManager = LocalFocusManager.current

            LinealTextFiel(
                Modifier,
                emailValue,
                "Usuario",
                "Ingrese su correo electronico",
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

            Space(10.dp)
            LinealTextFiel(
                Modifier,
                passwordValue,
                "Contraseña",
                "Ingrese Contraseña",
                onValueChange = {passwordValue = it},
                null,
                KeyboardCapitalization.None,
                KeyboardType.Password,
                KeyboardActions(
                    onDone = {
                        // focusManager.moveFocus(FocusDirection.Down)
                       // focusManager.clearFocus()
                    }
                ),
                ImeAction.Done,
                trailingIcon = {
                    IconButton (
                      onClick = {
                          passwordVisibility = !passwordVisibility
                      }
                    ) {
                        if(passwordVisibility){
                            inconv  = painterResource(id = R.drawable.ic_baseline_visibility_24)
                            //Icons.Default.
                        }else{
                            inconv = painterResource(id = R.drawable.ic_baseline_visibility_off_24)
                        }
                        Icon(painter = inconv, contentDescription = "icono de ver password")
                    }// fin iconButton
                },
                visualTransformation =
                if(passwordVisibility){
                    VisualTransformation.None
                }else {
                    PasswordVisualTransformation()
                }
            )
            // emailValue.value, passwordValue.value)
            Space(25.dp)
        }
        ComunButton(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "INGRESAR" ,
            imageVector = Icons.Default.Person,
            textIcon = "Person",
           // displayProgressBar = state.displayProgressBar
            displayProgressBar = false

        ) {
             //onLogin(valueEmail, valuePassword)
         }
        Row(
            verticalAlignment = Alignment.CenterVertically

        ) {

            Text(
                text = "¿Ha olvidado su contraseña? ",
                style = TextStyle(
                    color = Blue42,
                    fontWeight = FontWeight.Bold
                )
            )

            IconButton(
                onClick = {
                    //onBack()
                    navController.popBackStack()
                }
            ) {
                Icon(
                    imageVector = Icons.Default.MailOutline,
                    contentDescription = "Back Icon",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }


    }

}


//
//@Composable
//fun (
//    passwordValue: MutableState<String>,
//    textLabel: String,
//    focusManager: FocusManager,
//    valueEmail: String,
//    valuePassword: String
//) {
//
//    var passwordVisibility: Boolean by remember { mutableStateOf(false)}
//    var inconv: Painter
//    LinealTextFiel(
//        textFieldValue = passwordValue,
//        textLabel = textLabel,
//        textSuport = " ",
//        keyboardType = KeyboardType.Password,
//        keyboardActions = KeyboardActions(
//            onDone = {
//                focusManager.clearFocus()
//                //onLogin(valueEmail, valuePassword)
//            }
//        ),
//        imeAction = ImeAction.Done,
//        trailingIcon = {
//            IconButton(
//                onClick = {
//                    passwordVisibility = !passwordVisibility
//                }
//            ) {
//
//                if(passwordVisibility){
//                    inconv  = painterResource(id = R.drawable.ic_baseline_visibility_24)
//                    //Icons.Default.
//                }else{
//                    inconv = painterResource(id = R.drawable.ic_baseline_visibility_off_24)
//                }
//                androidx.compose.material3.Icon(painter = inconv, contentDescription = "icono de ver password")
//            }
//        },
//        visualTransformation = if(passwordVisibility){
//            VisualTransformation.None
//        }else{
//            PasswordVisualTransformation()
//        }
//    )
//}
//
