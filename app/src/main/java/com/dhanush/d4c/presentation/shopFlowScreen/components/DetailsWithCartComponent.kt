package com.dhanush.d4c.presentation.shopFlowScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dhanush.d4c.R
import com.dhanush.d4c.presentation.shopFlowScreen.components.text.NeuzeitsltstdText
import com.dhanush.d4c.presentation.ui.theme.purple

@Composable
fun DetailsWithCartComponent(
    modifier: Modifier = Modifier,
    price: Double,
    originalPrice: Double,
    reviewCount: Int,
    rating: Int
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start
            ) {
                NeuzeitsltstdText(
                    text = "RS. $price",
                    fontSize = 14.sp,
                    color = purple,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(Modifier.width(8.dp))
                NeuzeitsltstdText(
                    modifier = Modifier.alpha(0.75f),
                    text = "RS. $originalPrice",
                    textDeclaration = TextDecoration.LineThrough,
                    color = Color.Gray,
                    fontWeight = FontWeight.Light
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                repeat(rating) {
                    Image(
                        modifier = Modifier
                            .size(12.dp)
                            .align(Alignment.CenterVertically),
                        painter = painterResource(R.drawable.star),
                        contentDescription = ""
                    )
                    Spacer(Modifier.width(4.dp))
                }
                repeat(5-rating) {
                    Image(
                        modifier = Modifier
                            .size(14.dp)
                            .align(Alignment.CenterVertically),
                        painter = painterResource(R.drawable.star),
                        contentDescription = "",
                        colorFilter = ColorFilter.tint(Color.Black)
                    )
                    Spacer(Modifier.width(4.dp))
                }
                Spacer(Modifier.width(8.dp))
                NeuzeitsltstdText(
                    text = "$reviewCount reviews",
                    textDeclaration = TextDecoration.Underline,
                    color = Color.White,
                    fontWeight = FontWeight.Light
                )
            }
        }
        Box(
            modifier
                .size(56.dp)
                .clip(CircleShape)
                .background(Color.White)
        ) {
            Image(
                modifier = modifier
                    .fillMaxSize()
                    .padding(16.dp),
                painter = painterResource(R.drawable.cart3),
                alignment = Alignment.TopCenter,
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
        }
    }
}