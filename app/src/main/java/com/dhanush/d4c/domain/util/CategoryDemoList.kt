package com.dhanush.d4c.domain.util

import com.dhanush.d4c.R
import com.dhanush.d4c.domain.model.Category

fun categoryDemoList(): List<Category> {
    val mutableList = mutableListOf<Category>()
    mutableList.add(
        Category(
            name = "Cleaners",
            imageRes = R.drawable.categorysample
        )
    )
    mutableList.add(
        Category(
            name = "Toner",
            imageRes = R.drawable.product_image
        )
    )
    mutableList.add(
        Category(
            name = "Serums",
            imageRes = R.drawable.categorysample
        )
    )
    mutableList.add(
        Category(
            name = "Moisturisers",
            imageRes = R.drawable.product_image
        )
    )
    mutableList.add(
        Category(
            name = "Sun Screens",
            imageRes = R.drawable.categorysample
        )
    )
    mutableList.add(
        Category(
            name = "Cleaners",
            imageRes = R.drawable.product_image
        )
    )
    mutableList.add(
        Category(
            name = "Toner",
            imageRes = R.drawable.categorysample
        )
    )
    mutableList.add(
        Category(
            name = "Serums",
            imageRes = R.drawable.product_image
        )
    )
    mutableList.add(
        Category(
            name = "Moisturisers",
            imageRes = R.drawable.categorysample
        )
    )
    mutableList.add(
        Category(
            name = "Sun Screens",
            imageRes = R.drawable.product_image
        )
    )
    return mutableList.toList()
}
