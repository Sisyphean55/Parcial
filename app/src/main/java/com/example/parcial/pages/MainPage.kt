package com.example.parcial.pages

import android.widget.EditText
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.parcial.ui.theme.ParcialTheme

@Composable
fun MainPage(modifier: Modifier = Modifier, ){
    val navHostController = rememberNavController()
    LoginForm(modifier)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ParcialTheme {
        MainPage()
    }
}

@Composable
fun LoginForm(modifier: Modifier, onLoginForm: (email:String, pass:String) -> Unit){
    var email by remember { mutableStateOf("") }
    var pass by remember { mutableStateOf("") }
    Column(modifier = modifier) {
        Text(text = "Bienvenido!")
        Text(text = "Email")
        TextField(value = email, onValueChange = {email = it})
        Text(text = "Password")
        TextField(value = pass, onValueChange = {pass = it})
        Button(
            onClick = {
                onLoginForm(email, pass)
            }
        ) {
            Text(text = "Login",  modifier = modifier)
        }
    }
}

@Composable
fun MainNavHost(
    modifier: Modifier = Modifier,
    navHostController : NavHostController,
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = "/Login"
    ) {
        composable("/Login") {
            LoginForm(modifier, onLoginForm = {email, pass ->
                if(email === "pedro@pe.com.ar" && pass === "abc123" ) {
                    navHostController.navigate("/Dashboard")
                }else { 
                 //error   
                }
            })
        }
        composable("/DashboardPage") {
            DashboardPage(name = "Pedro Pe")
        } 
    }
}