package com.datum.android.brainbob

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.datum.android.brainbob.ui.theme.BrainbobTheme

class MainActivity : ComponentActivity() {

    // TODO 2: declare a var
    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BrainbobTheme {

                // TODO 3: to remember which screen
                navController = rememberNavController()

                // TODO 5: Navigation setup
                SetupNavGraph(navController = navController)

            }
        }
    }
}
