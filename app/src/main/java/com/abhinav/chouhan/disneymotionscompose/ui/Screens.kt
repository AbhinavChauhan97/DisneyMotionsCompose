package com.abhinav.chouhan.disneymotionscompose.ui

sealed class Screens(val route:String) {
    object HomeScreen : Screens("main_screen")
    object TvSceen : Screens("tv_screen")
}