package com.example.parcial.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController

@Composable
fun DashboardPage(modifier: Modifier = Modifier, name: String){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        Text(text = "Bienvenido!", style = MaterialTheme.typography.titleLarge)
        Text(text = "PedroPe", style = MaterialTheme.typography.titleMedium)
    }
}