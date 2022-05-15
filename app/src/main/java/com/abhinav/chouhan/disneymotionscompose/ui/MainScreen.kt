package com.abhinav.chouhan.disneymotionscompose.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun MainScreen() {
    ConstraintLayout {
        val (toolbar, moviesList, bottomNav) = createRefs()
        Toolbar(title = "DisneyMotions",
            modifier = Modifier.constrainAs(toolbar) {
            top.linkTo(parent.top)
        })
        MoviesList(modifier = Modifier
            .constrainAs(moviesList) {
                top.linkTo(toolbar.bottom)
            }
            .padding(bottom = 110.dp))
        BottomBar(modifier = Modifier.constrainAs(bottomNav) {
            bottom.linkTo(parent.bottom)
        })
    }
}


@Preview(showBackground = true)
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MoviesList(modifier: Modifier = Modifier){
    LazyVerticalGrid(
        cells = GridCells.Fixed(count = 2),
        modifier = modifier,
        ) {
        items(40){
            MovieItem(imageUrl = "https://user-images.githubusercontent.com/24237865/75087936-5c1d9f80-553e-11ea-81d3-a912634dd8f7.jpg", name = "Frozen II" , duration = "1 h 43 min")
        }
    }
}