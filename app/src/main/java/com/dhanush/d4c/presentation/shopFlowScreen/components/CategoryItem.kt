package com.dhanush.d4c.presentation.shopFlowScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.dhanush.d4c.presentation.shopFlowScreen.components.text.NeuzeitsltstdText
import com.dhanush.d4c.presentation.ui.theme.card

@Composable
fun CategoryItem(
    modifier: Modifier = Modifier,
    name: String,
    imgRes: Int
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(card),
        ) {
            Image(
                modifier = modifier
                    .fillMaxSize()
                    .padding(8.dp),
                painter = painterResource(imgRes),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
        }
        NeuzeitsltstdText(
            text = name
        )
    }
}