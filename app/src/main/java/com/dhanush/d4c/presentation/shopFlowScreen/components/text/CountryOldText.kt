package com.dhanush.d4c.presentation.shopFlowScreen.components.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.dhanush.d4c.R


@Composable
fun CountryOldText(
    modifier: Modifier = Modifier,
    text: String,
    fontSize: TextUnit = 26.sp,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Normal
) {
    Text(
        modifier = modifier,
        text = text,
        fontFamily = FontFamily(Font(R.font.century_old_style_std_bold)),
        fontSize = fontSize,
        color = color,
        fontWeight = fontWeight
    )
}