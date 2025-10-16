package com.example.tuan3_bai1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tuan3_bai1.navigation.Screen
import com.example.tuan3_bai1.screens.*
import com.example.tuan3_bai1.ui.theme.Tuan3_bai1Theme
import com.student.uicomponents.screens.ColumnDetailScreen
import com.student.uicomponents.screens.ComponentsListScreen
import com.student.uicomponents.screens.ImageDetailScreen
import com.student.uicomponents.screens.PasswordFieldDetailScreen
import com.student.uicomponents.screens.RowDetailScreen
import com.student.uicomponents.screens.TextDetailScreen
import com.student.uicomponents.screens.TextFieldDetailScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tuan3_bai1Theme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(Screen.ComponentsList.route) {
            ComponentsListScreen(navController = navController)
        }
        composable(Screen.TextDetail.route) {
            TextDetailScreen(navController = navController)
        }
        composable(Screen.ImageDetail.route) {
            ImageDetailScreen(navController = navController)
        }
        composable(Screen.TextFieldDetail.route) {
            TextFieldDetailScreen(navController = navController)
        }
        composable(Screen.PasswordFieldDetail.route) {
            PasswordFieldDetailScreen(navController = navController)
        }
        composable(Screen.ColumnDetail.route) {
            ColumnDetailScreen(navController = navController)
        }
        composable(Screen.RowDetail.route) {
            RowDetailScreen(navController = navController)
        }
    }
}
