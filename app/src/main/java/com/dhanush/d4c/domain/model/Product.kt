package com.dhanush.d4c.domain.model

data class Product(
    val name: String,
    val description: String,
    val highlights: String,
    val price: Double,
    val originalPrice: Double,
    val rating: Int,
    val reviewCount: Int,
    val fav: Boolean,
    val isBestSeller: Boolean = false,
    val inStock: Boolean = false,
    val imageRes: Int
)
