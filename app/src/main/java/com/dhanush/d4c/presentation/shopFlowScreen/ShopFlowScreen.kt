package com.dhanush.d4c.presentation.shopFlowScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dhanush.d4c.R
import com.dhanush.d4c.domain.util.categoryDemoList
import com.dhanush.d4c.domain.util.productDemoList
import com.dhanush.d4c.presentation.shopFlowScreen.components.Category
import com.dhanush.d4c.presentation.shopFlowScreen.components.ProductItem
import com.dhanush.d4c.presentation.shopFlowScreen.components.ShopFlowCard
import com.dhanush.d4c.presentation.shopFlowScreen.components.text.CountryOldText
import com.dhanush.d4c.presentation.shopFlowScreen.components.text.NeuzeitsltstdText
import com.dhanush.d4c.presentation.ui.theme.surface

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShopFlowScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        containerColor = surface,
        topBar = {
            TopAppBar(
                navigationIcon = {
                    Icon(
                        modifier = modifier.padding(horizontal = 4.dp),
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null
                    )
                },
                colors = TopAppBarColors(
                    containerColor = Color.Transparent,
                    titleContentColor = Color.Transparent,
                    scrolledContainerColor = Color.Transparent,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White,
                ),
                title = {

                    CountryOldText(
                        text = "Shop",
                        fontSize = 32.sp
                    )
                },
                actions = {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        imageVector = Icons.Default.Search,
                        contentDescription = null
                    )
                    Spacer(Modifier.requiredWidth(16.dp))
                    Icon(
                        modifier = Modifier.size(20.dp),
                        painter = painterResource(R.drawable.notheart),
                        contentDescription = null
                    )
                    Spacer(Modifier.requiredWidth(16.dp))
                    Icon(
                        modifier = Modifier.size(20.dp),
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = null
                    )
                    Spacer(Modifier.requiredWidth(16.dp))
                }
            )
        },


        ) { innerPadding ->
        val categoryList = categoryDemoList()
        val productList = productDemoList()
        LazyColumn(
//            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            item {
                ShopFlowCard()
            }
            item {
                Category(categoryList)
                Spacer(Modifier.requiredHeight(8.dp))
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CountryOldText(text = "New Products")
                    NeuzeitsltstdText(
                        text = "See all",
                        textDeclaration = TextDecoration.Underline,
                    )
                }
            }
            items(
                productList,

                ) { product ->
                ProductItem(
                    imgRes = product.imageRes,
                    name = product.name,
                    inStock = product.inStock,
                    description = product.description,
                    highlights = product.highlights,
                    fav = product.fav,
                    isBestSeller = product.isBestSeller,
                    price = product.price,
                    originalPrice = product.originalPrice,
                    reviewCount = product.reviewCount,
                    rating = product.rating
                )
                Spacer(Modifier.requiredHeight(16.dp))
            }
        }
    }

}


