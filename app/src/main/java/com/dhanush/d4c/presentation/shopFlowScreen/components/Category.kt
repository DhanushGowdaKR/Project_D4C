package com.dhanush.d4c.presentation.shopFlowScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.dhanush.d4c.domain.model.Category
import com.dhanush.d4c.presentation.shopFlowScreen.components.text.CountryOldText
import com.dhanush.d4c.presentation.shopFlowScreen.components.text.NeuzeitsltstdText

@Composable
fun Category(
    categoryList: List<Category>
) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CountryOldText(text = "Categories")
            NeuzeitsltstdText(
                text = "See all",
                textDeclaration = TextDecoration.Underline,
            )
        }
        LazyRow(
            contentPadding = PaddingValues(start = 16.dp)
        ) {
            items(categoryList) {category->
                CategoryItem(
                    name = category.name,
                    imgRes = category.imageRes
                )
                Spacer(Modifier.requiredWidth(16.dp))
            }
        }
    }
}