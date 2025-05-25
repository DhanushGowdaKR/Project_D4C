package com.dhanush.d4c.presentation.shopFlowScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import com.dhanush.d4c.domain.util.SvgImageLoader

@Composable
fun ProductItem(
    modifier: Modifier = Modifier,
    imgRes: Int,
    name: String,
    inStock: Boolean,
    isBestSeller: Boolean,
    description: String,
    highlights: String,
    fav: Boolean,
    price: Double,
    originalPrice: Double,
    reviewCount: Int,
    rating: Int
) {
    val context = LocalContext.current
    val imageLoader = SvgImageLoader.provide(context)
    Box(
        modifier = modifier
            .size(375.dp, 528.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        AsyncImage(
            modifier = Modifier
                .fillMaxSize(),
            model = ImageRequest.Builder(context)
                .data("file:///android_asset/product_bg_card.svg")
                .build(),
            imageLoader = imageLoader,
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        //matchparentused here
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween

        ) {
            TopContent(
                fav = fav,
                isBestSeller = isBestSeller
            )
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(top = 16.dp)
                    .align(Alignment.CenterHorizontally),
                painter = painterResource(imgRes),
                contentDescription = null,
                contentScale = ContentScale.FillBounds
            )
            ProductDetailsItem(
                name = name,
                inStock = inStock,
                description = description,
                highlights = highlights,
                price = price,
                originalPrice = originalPrice,
                reviewCount = reviewCount,
                rating = rating
            )
        }
    }
}
