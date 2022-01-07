package com.datum.android.brainbob.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun BrainbobTheme(content: @Composable() () -> Unit) {

    // hide the status bar
    val systemUiController = rememberSystemUiController()
        systemUiController.setStatusBarColor(
            color = Color.Transparent
        )

    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}