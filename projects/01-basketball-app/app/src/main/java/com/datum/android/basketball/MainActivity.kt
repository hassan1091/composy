package com.datum.android.basketball

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.datum.android.basketball.ui.theme.BasketballTheme
import com.datum.android.basketball.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasketballTheme {
                Main()
            }
        }
    }
}

@Composable
fun Main() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            Column() {
                Image(
                    painterResource(R.drawable.ic_baskball),
                    contentDescription = ""
                )
                Box(
                    modifier = Modifier.padding(32.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(top = 32.dp)
                    ) {
                        Text(
                            text = "The Perfect Basketball Courts for you",
                            style = Typography.h1
                        )
                        Text(
                            text = "Explore your dream basketball with advanced basketball courts",
                            style = Typography.body1,
                            modifier = Modifier.padding(top = 16.dp)
                        )
                    }
                }
                Box(
                    modifier = Modifier.fillMaxWidth().padding(end = 48.dp),
                    contentAlignment = Alignment.BottomEnd
                ) {
                    Image(
                        painterResource(id = R.drawable.ic_arr),
                        contentDescription = null
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = false)
fun Main_preview() {
    Main()
}