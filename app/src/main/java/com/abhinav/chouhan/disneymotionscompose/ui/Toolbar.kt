package com.abhinav.chouhan.disneymotionscompose.ui

import android.graphics.Color
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abhinav.chouhan.disneymotionscompose.R

@Composable
fun Toolbar(title:String,modifier: Modifier = Modifier)
{
    TopAppBar(
        title = {
            Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            color = colorResource(id = R.color.text_color)
            )
        },
        backgroundColor = colorResource(id = R.color.colorPrimary),
        elevation = 2.dp,
        modifier = modifier
    )
}

