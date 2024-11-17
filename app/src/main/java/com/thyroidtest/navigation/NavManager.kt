package com.thyroidtest.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.thyroidtest.views.HomeView
import com.thyroidtest.views.IntroView
import com.thyroidtest.views.login.LoginView
import com.thyroidtest.views.registration.RegistroView

@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Intro"  ){

        composable("Intro"){
            IntroView(navController)
        }
        composable("login"){
            LoginView(navController)
            //HomeView(navController)
        }
        composable("Registro"){
            RegistroView(navController)
        }
        composable("Home"){
            HomeView(navController)
        }
        composable("Detail/{id}/?{opcional}", arguments = listOf(
            navArgument("id") { type = NavType.IntType },
            navArgument("opcional") { type = NavType.StringType },
        )){
            val id = it.arguments?.getInt("id") ?: 0
            val opcional = it.arguments?.getString("opcional") ?: ""
           // DetailView(navController, id, opcional)
        }
    }
}