package com.abhinav.chouhan.disneymotionscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.abhinav.chouhan.disneymotionscompose.ui.BottomBar
import com.abhinav.chouhan.disneymotionscompose.ui.MovieItem
import com.abhinav.chouhan.disneymotionscompose.ui.Toolbar
import com.abhinav.chouhan.disneymotionscompose.ui.theme.DisneyMotionsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisneyMotionsComposeTheme {
                // A surface container using the 'background' color from the theme

            }
        }
    }
}




