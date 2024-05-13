package com.labanasanga.autobox.ui.theme.screens.carmodels

import android.content.Intent
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
import com.labanasanga.autobox.Navigation.ROUTE_AUDI
import com.labanasanga.autobox.Navigation.ROUTE_BMW
import com.labanasanga.autobox.Navigation.ROUTE_HOME
import com.labanasanga.autobox.Navigation.ROUTE_MERCEDES
import com.labanasanga.autobox.Navigation.ROUTE_CARMODEL
import com.labanasanga.autobox.Navigation.ROUTE_PORSCHE
import com.labanasanga.autobox.Navigation.ROUTE_RANGE
import com.labanasanga.autobox.Navigation.ROUTE_TOYOTA
import com.labanasanga.autobox.R


@Composable
fun Carmodelscreen(navController: NavHostController) {

    val context= LocalContext.current

    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp)
        // .background(color = Color.Gray)
        //.background(color = Color.shape)
    ){
        Text(text = "autoBox Car Models",
            color = Color.Gray,
            fontFamily = FontFamily.Monospace,
            fontSize = 30.sp,
        )

        Image(painter = painterResource(id = R.drawable.mercedesbenzcover),
            contentDescription = "mercedesbenzlogo")
        Text(text = "PICK A CAR MODEL", fontFamily= FontFamily.Cursive)

        Button(onClick = {
            navController.navigate(ROUTE_MERCEDES)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "MERCEDES")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ROUTE_AUDI)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "AUDI")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ROUTE_BMW)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "BMW")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ROUTE_PORSCHE)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "PORSCHE")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ROUTE_RANGE)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "RANGEROVER")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ROUTE_TOYOTA)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "TOYOTA")
        }



        Image(painter = painterResource(id = R.drawable.mercedesbenzcover),
            contentDescription = "mercedesbenzlogo")
        Text(text = "THANK YOU FOR USING autoBOX", fontFamily= FontFamily.Cursive)
    }
}



@Preview(name = "Dark Mode")

@Preview( uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Light Mode")
@Composable
fun CarModelprev() {
    Carmodelscreen(rememberNavController())
}