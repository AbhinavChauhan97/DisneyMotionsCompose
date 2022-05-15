package com.abhinav.chouhan.disneymotionscompose.ui

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.vectorResource
import com.abhinav.chouhan.disneymotionscompose.R

@Composable
fun BottomBar(
    modifier: Modifier = Modifier
) {
    val bottomBarItems = arrayOf(
        Pair("Home", R.drawable.home),
        Pair("Tv", R.drawable.music),
        Pair("Radio", R.drawable.radio),
    )
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.colorPrimary),
        modifier = modifier
    ) {
        val iconColor = colorResource(id = R.color.white)
        bottomBarItems.forEach { item ->
            BottomNavigationItem(
                label = { Text(text = item.first) },
                icon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = item.second),
                        contentDescription = null
                    )
                },
                unselectedContentColor = iconColor,
                selectedContentColor = iconColor,
                selected = false, onClick = {})
        }
    }
}