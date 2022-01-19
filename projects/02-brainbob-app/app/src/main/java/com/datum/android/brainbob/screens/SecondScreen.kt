package com.datum.android.brainbob.screens

import android.content.ContentValues
import android.graphics.drawable.Icon
import android.text.Layout
import android.util.Log
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.datum.android.brainbob.R
import com.datum.android.brainbob.ui.theme.*


@Composable
fun SecondScreen(
    navController: NavController
) {

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(start = 16.dp)
    ) {
        Column {
            SecondHeader()
            Tags(chips = listOf("Brainstorm", "Books", "Video", "Images"))
            MainCard()
            Recommendation()
            Recommendation_list()
        }
    }
}

@Composable
fun SecondHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.TopStart
    ) {
        Column() {
            Text(
                text = "Choose what",
                style = Typography.subtitle1
            )
            Text(
                text = "to learn today?",
                style = Typography.h2
            )
        }
    }
}

@Composable
fun Tags(chips: List<String>) {

    var selectedItem by remember {
        mutableStateOf(0)
    }

    LazyRow {
        items(chips.size) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(top = 32.dp, end = 16.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .clickable {
                        selectedItem = it
                    }
                    .background(
                        if (selectedItem == it) Black
                        else Light_Gray
                    )
            ) {
                Text(
                    text = chips[it],
                    style = Typography.subtitle2,
                    modifier = Modifier.padding(start = 32.dp, end = 32.dp, top = 16.dp, bottom = 16.dp),
                    color = if (selectedItem == it) SecondayColor else Black
                )
            }
        }
    }
}


@Composable
fun MainCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp, end = 24.dp)
    ) {
        Card(
            backgroundColor = PrimaryColor,
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Vocabulary",
                        color = Color.White,
                        modifier = Modifier.padding(8.dp),
                        style = Typography.h3
                    )
                    Text(
                        text = "Listen 20 new words",
                        color = Color.White,
                        modifier = Modifier.padding(8.dp),
                        style = TextStyle(
                            fontFamily = lato,
                            fontWeight = FontWeight.Medium,
                            fontSize = 16.sp,
                            color = Gray,
                        )
                    )
                    Button(
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.padding(top = 24.dp),
                        onClick = { },
                    ) {
                        Text(
                            text = "Start",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 16.sp,
                            ),
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(start = 8.dp)
                        )
                        Icon(
                            painter = painterResource(id = com.datum.android.brainbob.R.drawable.ic_circle),
                            contentDescription = null,
                            modifier = Modifier.padding(start = 8.dp)
                        )
                    }
                }
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterEnd
                ) {
                    Image(
                        painterResource(id = R.drawable.person),
                        contentDescription = "",
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp),
                    )
                }

            }
        }
    }
}


@Composable
fun Recommendation() {
    Column() {
        Text(
            text = "Recommended",
            style = Typography.h3,
            modifier = Modifier.padding(top = 24.dp, bottom = 16.dp)
        )
    }
}

@Composable
fun Recommendation_list() {

    val lst = listOf("Chatting", "Listen", "Speak")
    val min = listOf("5 minutes", "2 minutes", "3 minutes")
    val icons = listOf(
        R.drawable.ic_chat,
        R.drawable.ic_headset,
        R.drawable.ic_mic
    )
    val colors = listOf(
        Color(0xFFF56D63),
        Color(0xFF493EAA),
        Color(0xFFED8658)
    )

    var selected by remember {
        mutableStateOf(0)
    }

    LazyColumn {
        items(lst.size) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 24.dp)
                    .clickable { selected = it }
            ) {
                
                Card(
                    backgroundColor = Light_Gray,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(15.dp),
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(8.dp)
                    ) {

                        Card(
                            modifier = Modifier.padding(8.dp),
                            backgroundColor = colors[it]
                        ) {
                            Icon(
                                painter = painterResource(
                                    id = icons[it]),
                                contentDescription = null,
                                modifier = Modifier.padding(8.dp),
                                tint = Color.White
                            )
                        }
                        Column(
                            modifier = Modifier
                                .padding(8.dp)
                                .padding(start = 8.dp)
                        ) {
                            Text(
                                text = lst[it],
                                style = TextStyle(
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp
                                )
                            )
                            Text(
                                text = min[it],
                                style = TextStyle(
                                    fontWeight = FontWeight.Light,
                                    fontSize = 16.sp
                                )
                            )
                        }
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.CenterEnd
                        ) {
                            Icon(
                                painter = painterResource(
                                    id = R.drawable.ic_bookmark),
                                contentDescription = null,
                                tint = if (selected != it) Gray else Black

                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun SecondScreenPreivew() {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(start = 32.dp)) {
        Column {
            SecondHeader()
            Tags(chips = listOf("BrainStorm", "Books", "Video", "Images"))
            MainCard()
            Recommendation()
            Recommendation_list()
        }
    }
}