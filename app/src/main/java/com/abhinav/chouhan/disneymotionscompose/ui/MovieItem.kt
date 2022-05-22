package com.abhinav.chouhan.disneymotionscompose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.abhinav.chouhan.disneymotionscompose.R

@Preview(showBackground = true)
@Composable
fun MovieItem(
    imageUrl: String? = "https://user-images.githubusercontent.com/24237865/75087936-5c1d9f80-553e-11ea-81d3-a912634dd8f7.jpg",
    name: String = "Frozen II",
    duration: String = "1 Hr 45 min"
) {

    Card(
        modifier = Modifier.padding(4.dp),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = colorResource(id = R.color.items_background)
    ) {
        Column {
            Image(painter = rememberAsyncImagePainter(model = imageUrl),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth().height(230.dp),
            contentScale = ContentScale.FillWidth)
            Spacer(modifier = Modifier.height(10.dp))
            BigBoldText(text = name, modifier = Modifier.padding(start = 10.dp))
            Spacer(modifier = Modifier.height(5.dp))
            NormalText(text = duration, modifier = Modifier.padding(start = 10.dp))
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}