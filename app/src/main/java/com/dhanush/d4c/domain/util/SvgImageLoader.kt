package com.dhanush.d4c.domain.util

import android.content.Context
import coil3.ImageLoader
import coil3.svg.SvgDecoder

object SvgImageLoader {
    fun provide(context: Context): ImageLoader {
        return ImageLoader.Builder(context)
            .components {
                add(SvgDecoder.Factory())
            }
            .build()
    }
}