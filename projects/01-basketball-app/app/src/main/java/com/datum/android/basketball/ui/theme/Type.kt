package com.datum.android.basketball.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.datum.android.basketball.R


val dosis = FontFamily(
    listOf(
        Font(R.font.dosis_regular, FontWeight.Normal),
        Font(R.font.dosis_medium, FontWeight.Medium),
        Font(R.font.dosis_semi_bold, FontWeight.SemiBold),
        Font(R.font.dosis_bold, FontWeight.Bold),
        Font(R.font.dosis_extra_bold, FontWeight.ExtraBold),
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        color = black,
        fontFamily = dosis,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 32.sp
    ),
    body1 = TextStyle(
        color = TextWhite,
        fontFamily = dosis,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)