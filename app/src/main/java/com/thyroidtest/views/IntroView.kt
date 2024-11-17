package com.thyroidtest.views

import android.app.Activity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.thyroidtest.componenst.ComunButton
import com.thyroidtest.componenst.Space
import com.thyroidtest.componenst.intro.BotonHeader
import com.thyroidtest.componenst.intro.FondoIntro
import com.thyroidtest.componenst.intro.LogoCinta
import com.thyroidtest.componenst.intro.TextLogo
import com.thyroidtest.ui.theme.Purple42

@Composable
fun IntroView(navController: NavController) {
    Box(
        Modifier
            .fillMaxSize()
            .padding(1.dp)
    ) {
        FondoIntro(ContentScale.FillBounds)
        Header(Modifier.align(Alignment.TopEnd))
        BodyIntro(Modifier.align(Alignment.Center),navController)
        Footer(Modifier.align(Alignment.BottomCenter))
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
fun BodyIntro(modifier: Modifier,navController: NavController) {

    //val isLoginEnable:Boolean by introViewModel.isLoginEnable.observeAsState(initial =  true)
    //val isSingninEnable:Boolean by introViewModel.isLoginEnable.observeAsState(initial = true)

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = modifier.padding( 20.dp)) {
            LogoCinta()
            TextLogo("THYROID TEST")
        }
        Space(50.dp)
        Bienvenida("¡BIENVENIDO!.",modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
        Space(40.dp)
        TexIntro(Modifier.align(alignment = Alignment.CenterHorizontally), fontSize = 15.0.sp,"¿Tiene una Cuenta?")
        LoginButtonIntro(Modifier.align(alignment = Alignment.CenterHorizontally),navController)
        Space(40.dp)
        TexIntro(Modifier.align(alignment = Alignment.CenterHorizontally), fontSize = 15.0.sp,"Inscribirse")
        SingninButtonIntro(Modifier.align(alignment = Alignment.CenterHorizontally),navController)
        Space(16.dp)
    }
}


@Composable
fun Bienvenida(bienvenidaText: String, modifier: Modifier) {
    Text(text = bienvenidaText,
        fontWeight = FontWeight.Bold,
        fontSize = 34.0.sp,
        color = Purple42,
        modifier = modifier)
}

@Composable
fun TexIntro(modifier: Modifier, fontSize: TextUnit, textoText: String ) {
    Text(
        text = textoText,
        fontSize = fontSize,
        fontWeight = FontWeight.Bold,
        modifier = modifier
    )
}


@Composable
fun LoginButtonIntro(align: Modifier, navController: NavController) {

    //var recurse = R.drawable.ic_round_login_24

    ComunButton(
        modifier = align,
        text = "INICIAR SESIÓN" ,
        imageVector = Icons.Default.Person,
        textIcon = "Person",
        displayProgressBar = false,
    ) {
        navController.navigate("Login")
        //println("soy boton inciaar session")
    }

}

@Composable
fun SingninButtonIntro(align: Modifier,  navController: NavController) {
    ComunButton (
        modifier = align,
        text = "CREAR CUENTA" ,
        imageVector = Icons.Default.AddCircle,
        textIcon = "Crear Cuenta",
        displayProgressBar = false,
    ) {
        //
        navController.navigate("Registro")
    }
}

@Composable
fun Footer(modifier: Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Space(10.dp)
        EchoApp("Elaborado: por @OLF ")
        Space(15.dp)
    }
}


@Composable
fun EchoApp(tituloEchoText: String) {
    Text(
        text = tituloEchoText,
        fontSize = 12.sp,
        style = TextStyle(
            color = Color(
                alpha = 255,
                red = 0,
                green = 0,
                blue = 0
            ),
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Right,
            fontWeight = FontWeight.SemiBold,
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






