package com.kundalik.jetpackcoponse.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.HomeScreen.route) {
        composable(route = Screens.HomeScreen.route) {
            Screens.HomeScreen
        }
        composable(
            route = Screens.DetailScreen.route+"/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "gaurav"
                    nullable = true
                }
            )
        ) {entry ->
            entry.arguments?.getString("name")?.let { DetailScreen(name = it) }
        }

    }
}