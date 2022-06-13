package com.datum.android.brainbob.screens

import android.content.ContentValues
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.datum.android.brainbob.Screen
import com.datum.android.brainbob.ui.theme.PrimaryColor
import com.datum.android.brainbob.ui.theme.Typography

@Composable
fun FirstScreen(
    navController: NavController
) {

    val scrollState = rememberScrollState()
    Log.d(ContentValues.TAG, "FirstScreen: $scrollState")

    Box(
        modifier = Modifier
            .verticalScroll(scrollState)
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Column() {
            Logo()
            MainContent()
            MainMsg()
            MainButton(navController)
        }
    }
}

@Composable
fun Logo() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = com.datum.android.brainbob.R.drawable.logo),
            contentDescription = "logo"
        )
    }
}

@Composable
fun MainContent() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = com.datum.android.brainbob.R.drawable.person),
            contentDescription = "logo"
        )
    }
}

@Composable
fun MainMsg() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .padding(top = 16.dp)
    ) {
        Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Be ready to learn English easily",
                style = Typography.h1,
                textAlign = TextAlign.Center
            )
            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Listen to stories, watch videos and improve your language with BrainBob",
                style = Typography.body2,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun MainButton(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = PrimaryColor),
            shape = RoundedCornerShape(40.dp),
            onClick = {
                navController.navigate(route = Screen.SecondScreen.route)
            },
        ) {
            Text(
                text = "Join us",
                style = Typography.button,
                modifier = Modifier
                    .padding(8.dp)
                    .padding(start = 8.dp, end = 8.dp)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = false,
    device = Devices.PIXEL_3
)
@Composable
fun LogoPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column {
            Logo()
            MainContent()
            MainMsg()
            MainButton(navController = rememberNavController())
        }
    }
}