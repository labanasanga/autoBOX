package com.labanasanga.autobox.ui.theme.screens.Splash

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.labanasanga.autobox.Navigation.ROUTE_HOME
import com.labanasanga.autobox.R
import com.labanasanga.autobox.ui.theme.AutoBOXTheme
import com.labanasanga.autobox.ui.theme.screens.Register.Register
import com.labanasanga.autobox.ui.theme.screens.home.home

//

@Composable
fun SplashScreen(navController: NavHostController) {
    val context= LocalContext.current

    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp)
            .background(color = Color.Black)
        //.background(color = Color.shape)
    ){
        Text(text = "Welcome To autoBOX ",
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            fontSize = 30.sp,
        )
        Spacer(modifier = Modifier.height(150.dp))

        Image(
            painter = painterResource(id = R.drawable.autoboxlogosmalldark),
            contentDescription = "Splashscreen"
        )

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ROUTE_HOME)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "HOME")
        }

    }
}



@Preview(name = "Dark Mode")

@Preview( uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Light Mode")
@Composable
fun Splashprev() {
    SplashScreen(rememberNavController())
}

