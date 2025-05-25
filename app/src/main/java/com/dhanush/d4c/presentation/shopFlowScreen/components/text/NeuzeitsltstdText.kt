package com.dhanush.d4c.presentation.shopFlowScreen.components.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.dhanush.d4c.R


@Composable
fun NeuzeitsltstdText(
    modifier: Modifier = Modifier,
    text: String,
    textDeclaration: TextDecoration = TextDecoration.None,
    fontSize: TextUnit = 12.sp,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Normal
    ) {
    Text(
        modifier = modifier,
        text = text,
        textDecoration = textDeclaration,
        fontFamily = FontFamily(Font(R.font.neuzeitsltstd_book)),
        fontSize = fontSize,
        color = color,
        fontWeight = fontWeight
    )
}