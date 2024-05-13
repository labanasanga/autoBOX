package com.labanasanga.autobox.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.labanasanga.autobox.ui.theme.screens.Login.Login
import com.labanasanga.autobox.ui.theme.screens.Register.Register
import com.labanasanga.autobox.ui.theme.screens.Splash.SplashScreen
import com.labanasanga.autobox.ui.theme.screens.carmodels.Carmodelscreen
import com.labanasanga.autobox.ui.theme.screens.bmwscreen.Beamer
import com.labanasanga.autobox.ui.theme.screens.Mercedesscreen.Mercedesbenz
import com.labanasanga.autobox.ui.theme.screens.Audiscreen.audi
import com.labanasanga.autobox.ui.theme.screens.Porschescreen.porsche
//import com.labanasanga.autobox.ui.theme.screens.cartype.rangerover
import com.labanasanga.autobox.ui.theme.screens.Rangeroverscreen.rover
import com.labanasanga.autobox.ui.theme.screens.Toyotascreen.toyota
import com.labanasanga.autobox.ui.theme.screens.home.home
//import com.labanasanga.autobox.ui.theme.screens.home.homescreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String= ROUTE_SPLASH) {

    NavHost(navController = navController, modifier=modifier,
        startDestination = startDestination ){


        composable(ROUTE_LOGIN){
            Login(navController)
        }
        composable(ROUTE_REGISTER){
            Register(navController)
        }
        composable(ROUTE_HOME){
            home(navController)
        }
        composable(ROUTE_CARMODEL){
            Carmodelscreen(navController)
        }
        composable(ROUTE_MERCEDES){
            Mercedesbenz(navController)
        }
        composable(ROUTE_AUDI){
            audi(navController)
        }
        composable(ROUTE_BMW){
            Beamer(navController)
        }
        composable(ROUTE_PORSCHE){
            porsche(navController)
        }
        composable(ROUTE_RANGE){
            rover(navController)
        }
        composable(ROUTE_TOYOTA){
            toyota(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
    }
}