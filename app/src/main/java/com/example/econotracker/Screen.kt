package com.example.econotracker

sealed class Screen(val route: String) {
    object MainScreen : Screen(route = "main_screen")
    object AddTransactionScreen : Screen(route = "add_transaction_screen")
    object OverviewScreen : Screen(route = "overview_Screen")
}