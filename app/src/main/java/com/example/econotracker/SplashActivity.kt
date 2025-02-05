package com.example.econotracker

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.econotracker.ui.theme.EconoTrackerTheme
import kotlinx.coroutines.delay

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EconoTrackerTheme {
                SplashScreen()
            }
        }
    }

    @Preview
    @Composable
    private fun SplashScreen() {
        LaunchedEffect(key1 = true) {
            delay(2000)
            startActivity(
                Intent(
                    this@SplashActivity,
                    MainActivity::class.java
                )
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.LightGray),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null
            )
        }
    }
}