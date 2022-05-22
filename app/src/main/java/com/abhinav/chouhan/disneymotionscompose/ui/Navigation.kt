package com.abhinav.chouhan.disneymotionscompose.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun Navigation(navController:NavHostController){
    NavHost(navController = navController, startDestination = Screens.HomeScreen.route){
        composable(route = Screens.HomeScreen.route){
            HomeScreen()
        }
        composable(route = Screens.TvSceen.route){
            TvScreen()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun NavigationPreview(navController:NavHostController = rememberNavController()){

}