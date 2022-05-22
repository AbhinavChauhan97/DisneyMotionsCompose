package com.abhinav.chouhan.disneymotionscompose.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Preview(showBackground = true)
@Composable
fun TvScreen(){
    TvList()
}

@Composable
fun TvList(){
    LazyColumn{
        items(40) {
            TvItem(
                imageUrl = "https://user-images.githubusercontent.com/24237865/75087936-5c1d9f80-553e-11ea-81d3-a912634dd8f7.jpg",
                name = "Frozen II",
                duration = "1 h 43 min"
            )
        }
    }
}