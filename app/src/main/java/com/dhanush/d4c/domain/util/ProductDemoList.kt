package com.dhanush.d4c.domain.util

import com.dhanush.d4c.R
import com.dhanush.d4c.domain.model.Product

fun productDemoList(): List<Product> {
    val mutableList = mutableListOf<Product>()

    mutableList.add(
        Product(
            name = "clencera",
            description = "French clay and algae-powered cleanser",
            highlights = "Skin Tightness . Dry & Dehydrated Skin",
            price = 355.20,
            originalPrice = 444.00,
            rating = 4,
            reviewCount = 249,
            fav = true,
            isBestSeller = true,
            inStock = true,
            imageRes = R.drawable.product_image
        )
    )
    mutableList.add(
        Product(
            name = "glow",
            description = "French clay and algae-powered cleanser",
            highlights = "Skin Tightness > Dry & Dehydrated Skin",
            price = 200.00,
            originalPrice = 500.00,
            rating = 3,
            reviewCount = 120,
            fav = false,
            isBestSeller = false,
            inStock = true,
            imageRes = R.drawable.categorysample
        )
    )
    mutableList.add(
        Product(
            name = "afterglow",
            description = "French clay and algae-powered cleanser",
            highlights = "Skin Tightness > Dry & Dehydrated Skin",
            price = 440.00,
            originalPrice = 550.00,
            rating = 4,
            reviewCount = 303,
            fav = false,
            isBestSeller = false,
            inStock = false,
            imageRes = R.drawable.product_image
        )
    )
    return mutableList.toList()
}
