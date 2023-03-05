package com.kundalik.jetpackcoponse.navigation

sealed class Screens(val route: String) {

    object HomeScreen: Screens("main_screen")
    object DetailScreen: Screens("detail_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg->
                append("/$arg")
            }
        }
    }
}