package com.abhinav.chouhan.disneymotionscompose.ui

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.vectorResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.abhinav.chouhan.disneymotionscompose.R

@Composable
fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    val bottomBarItems = arrayOf(
        BottomNavItem("Home", R.drawable.home, Screens.HomeScreen.route),
        BottomNavItem("Tv", R.drawable.music, Screens.TvSceen.route),
        //Pair("Radio", R.drawable.radio),
    )
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.colorPrimary),
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        val iconColor = colorResource(id = R.color.white)
        bottomBarItems.forEach { item ->
            BottomNavigationItem(
                label = { Text(text = item.title) },
                icon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = item.icon),
                        contentDescription = null
                    )
                },
                unselectedContentColor = iconColor,
                selectedContentColor = iconColor,
                selected = currentDestination?.hierarchy?.any { it.route == item.route } == true,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                })
        }
    }
}

data class BottomNavItem(
    val title: String,
    val icon: Int,
    val route: String,
)