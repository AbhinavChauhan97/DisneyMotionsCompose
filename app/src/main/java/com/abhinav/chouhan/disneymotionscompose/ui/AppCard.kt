package com.abhinav.chouhan.disneymotionscompose.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.abhinav.chouhan.disneymotionscompose.R

@Composable
fun AppCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
){
    Card(
        modifier = modifier.then(Modifier.padding(4.dp)),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = colorResource(id = R.color.items_background),
        content = content
    )
}