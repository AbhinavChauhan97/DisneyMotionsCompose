package com.abhinav.chouhan.disneymotionscompose.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.abhinav.chouhan.disneymotionscompose.R

@Composable
fun BigBoldText(text: String,modifier: Modifier = Modifier) {
    Text(
        text = text,
        fontSize = 21.sp,
        fontWeight = FontWeight.Bold,
        color = colorResource(id = R.color.text_color),
        textAlign = TextAlign.Center,
        modifier = modifier
    )
}

@Composable
fun NormalText(text: String,modifier: Modifier = Modifier) {
    Text(
        text = text,
        fontSize = 14.sp,
        color = colorResource(id = R.color.text_color),
        textAlign = TextAlign.Center,
        modifier = modifier
    )
}

