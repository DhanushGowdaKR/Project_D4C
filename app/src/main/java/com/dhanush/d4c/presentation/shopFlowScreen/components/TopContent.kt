package com.dhanush.d4c.presentation.shopFlowScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dhanush.d4c.R
import com.dhanush.d4c.presentation.shopFlowScreen.components.text.NeuzeitsltstdText
import com.dhanush.d4c.presentation.ui.theme.card
import com.dhanush.d4c.presentation.ui.theme.primaryColor

@Composable
fun TopContent(
    modifier: Modifier = Modifier,
    fav: Boolean,
    isBestSeller: Boolean
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .size(34.dp)
                .clip(CircleShape)
                .background(card)
                .padding(6.dp),
            painter = if (fav) painterResource(R.drawable.shape) else painterResource(R.drawable.notheart),
            contentDescription = ""
        )
        if (isBestSeller) {
            Box(
                modifier = modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(card)
            ) {
                NeuzeitsltstdText(
                    modifier = modifier
                        .padding(horizontal = 8.dp),
                    text = "Best seller",
                    fontSize = 16.sp,
                    color = primaryColor,
                    fontWeight = FontWeight.ExtraBold,
                )
            }
        }
    }
}