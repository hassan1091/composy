package com.datum.android.brainbob

sealed class Screen(val route: String) {

    // TODO 1: Navigation setup
    object FirstScreen: Screen(route = "first_screen")
    object SecondScreen: Screen(route = "second_screen")
}