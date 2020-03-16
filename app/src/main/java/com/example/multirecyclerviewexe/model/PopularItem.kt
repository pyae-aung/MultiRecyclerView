package com.example.multirecyclerviewexe.model

data class PopularItem(
    var image: Int,
    var name: String,
    var brand: String,
    var price: Double,
    var originalPrice: Double,
    var isNew: Boolean,
    var hasDiscount: Boolean
)