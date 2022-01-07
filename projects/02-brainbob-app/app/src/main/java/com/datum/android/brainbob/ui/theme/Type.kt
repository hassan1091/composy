package com.datum.android.brainbob.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.datum.android.brainbob.R

//
//val dosis = FontFamily(
//    listOf(
//        Font(R.font.dosis_light, FontWeight.Light),
//        Font(R.font.dosis_regular, FontWeight.Normal),
//        Font(R.font.dosis_medium, FontWeight.Medium),
//        Font(R.font.dosis_semi_bold, FontWeight.SemiBold),
//        Font(R.font.dosis_bold, FontWeight.Bold),
//        Font(R.font.dosis_extra_bold, FontWeight.Black),
//    )
//)
//
//val sarala = FontFamily(
//    listOf(
//        Font(R.font.lato_regular, FontWeight.Normal),
//        Font(R.font.lato_bold, FontWeight.Bold)
//    )
//)

val lato = FontFamily(
    listOf(
        Font(R.font.lato_light, FontWeight.Light),
        Font(R.font.lato_regular, FontWeight.Normal),
        Font(R.font.lato_regular, FontWeight.Medium),
        Font(R.font.lato_bold, FontWeight.SemiBold),
        Font(R.font.lato_bold, FontWeight.Bold),
        Font(R.font.lato_black, FontWeight.Black),
    )
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 40.sp
    ),
    h2 = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Black,
        fontSize = 32.sp
    ),
    h3 = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Black,
        fontSize = 24.sp
    ),
    body1 = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = Black
    ),
    body2 = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = Dark_Gray,
//        shadow = Shadow(
//            color = Black,
//            offset = Offset(1f,2f),
//            blurRadius = 2.0f
//        )
    ),
    button = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = SecondayColor
    ),
    subtitle1 = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Light,
        fontSize = 32.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        color = Black
    )
)