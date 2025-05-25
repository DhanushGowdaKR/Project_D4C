package com.dhanush.d4c

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import com.dhanush.d4c.presentation.shopFlowScreen.ShopFlowScreen
import com.dhanush.d4c.presentation.ui.theme.D4CTheme
import com.dhanush.d4c.presentation.ui.theme.surface

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            D4CTheme {
                ShopFlowScreen()
            }
        }
    }
}
