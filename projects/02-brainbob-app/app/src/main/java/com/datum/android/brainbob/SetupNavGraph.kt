package com.datum.android.brainbob

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.datum.android.brainbob.screens.FirstScreen
import com.datum.android.brainbob.screens.SecondScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {

    // TODO 4: Navigation setup
    NavHost(
        navController = navController, startDestination = Screen.FirstScreen.route
    ) {

        // TODO 6: Navigation setup (from)
        composable(
            route = Screen.FirstScreen.route
        ) {
            FirstScreen(navController = navController)
        }

        // TODO 7: Navigation setup (to)
        composable(
            route = Screen.SecondScreen.route
        ) {
            SecondScreen(navController = navController)
        }
    }
}

