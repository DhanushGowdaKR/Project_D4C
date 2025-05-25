package com.dhanush.d4c.presentation.shopFlowScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import com.dhanush.d4c.domain.util.SvgImageLoader
import com.dhanush.d4c.presentation.shopFlowScreen.components.text.NeuzeitsltstdText
import com.dhanush.d4c.presentation.ui.theme.primaryColor

@Composable
fun ShopFlowCard(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val imageLoader = SvgImageLoader.provide(context = context)
    Box(
        modifier = Modifier
            .size(375.dp,223.dp)
    ) {
        AsyncImage(
            modifier = modifier
                .fillMaxSize(),
            model = ImageRequest.Builder(context)
                .data("file:///android_asset/banner_card.svg")
                .build(),
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            imageLoader = imageLoader,
        )
        Column(
            modifier = Modifier.padding(start = 44.dp, top = 44.dp)
        ) {
            NeuzeitsltstdText(
                text = "GET 20% OFF",
                fontSize = 28.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Spacer(Modifier.height(12.dp))
            NeuzeitsltstdText(text = "Get 20% off",fontSize = 16.sp,)
            Spacer(Modifier.height(24.dp))
            Box(
                modifier = modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(primaryColor),
                contentAlignment = Alignment.CenterStart
            ) {
                NeuzeitsltstdText(
                    modifier = modifier
                        .padding(horizontal = 4.dp),
                    color = Color.Black,
                    text = "12-16 October"
                )
            }
        }

    }
}