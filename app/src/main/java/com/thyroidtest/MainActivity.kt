package com.thyroidtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.thyroidtest.navigation.NavManager
import com.thyroidtest.ui.theme.ThyroidTestTheme
import com.thyroidtest.views.HomeView
import com.thyroidtest.views.IntroView
import com.thyroidtest.views.diagnostico.DiagnosticoContenido
import com.thyroidtest.views.diagnostico.TabNewDiagView
import com.thyroidtest.views.login.LoginView
import com.thyroidtest.views.registration.RegistroView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //EnableEdgeToEdge() extiende la pantalla sobre la barra de opciones
        setContent {
            ThyroidTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavManager()
                    // TabsView()
                   //     HomeView()
                   //LoginView()
                   //IntroView()// ok
                   // registroView()
                //TabNewDiagView()
                   // DiagnosticoContenido()

                }

                //Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    //Greeting(
                    //    name = "Android",
                    //    modifier = Modifier.padding(innerPadding)
                    //)
                  //  HomeView()
                //}
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello tu $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ThyroidTestTheme {
        Greeting("Android")
    }
}