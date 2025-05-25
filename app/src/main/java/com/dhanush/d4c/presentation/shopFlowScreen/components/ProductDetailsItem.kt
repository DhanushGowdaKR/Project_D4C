package com.dhanush.d4c.presentation.shopFlowScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import com.dhanush.d4c.domain.util.SvgImageLoader
import com.dhanush.d4c.presentation.shopFlowScreen.components.text.NeuzeitsltstdText
import com.dhanush.d4c.presentation.shopFlowScreen.components.text.TangerineText
import com.dhanush.d4c.presentation.ui.theme.primaryColor

@Composable
fun ProductDetailsItem(
    modifier: Modifier = Modifier,
    name: String,
    inStock: Boolean,
    description: String,
    highlights: String,
    price: Double,
    originalPrice: Double,
    reviewCount: Int,
    rating: Int
) {
    val context = LocalContext.current
    val imageLoader = SvgImageLoader.provide(context)

    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        AsyncImage(
            modifier = Modifier,
            model = ImageRequest.Builder(context)
                .data("file:///android_asset/product_title_card.svg")
                .build(),
            imageLoader = imageLoader,
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        //match parent height used here
        Column(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Spacer(Modifier.height(12.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (inStock) {
                    TangerineText(text = name)
                    NeuzeitsltstdText(
                        text = "In stock",
                        color = primaryColor
                    )
                } else {
                    TangerineText(text = name)
                    NeuzeitsltstdText(
                        text = "Out of stock",
                        color = MaterialTheme.colorScheme.error
                    )
                }

            }
            Spacer(Modifier.height(4.dp))
            NeuzeitsltstdText(
                modifier = Modifier.padding(start = 12.dp),
                text = description
            )
            NeuzeitsltstdText(
                modifier = Modifier.padding(start = 12.dp),
                text = highlights,
                fontWeight = FontWeight.ExtraBold
            )
            Spacer(Modifier.height(8.dp))
            DetailsWithCartComponent(
                price = price,
                originalPrice = originalPrice,
                reviewCount = reviewCount,
                rating = rating
            )
        }
    }
}