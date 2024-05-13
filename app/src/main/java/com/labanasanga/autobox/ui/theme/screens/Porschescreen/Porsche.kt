package com.labanasanga.autobox.ui.theme.screens.Porschescreen

import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.labanasanga.autobox.R

//
//class Porsche : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            AutoBOXTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    porsche(rememberNavController())
//                }
//            }
//        }
//    }
//}
//@Preview
@Composable
fun porsche(navController: NavHostController) {
    val items = listOf("Porsche ")

    LazyColumn {
        items(items) { item ->
            // Customize the appearance of each item
            Text(text = item)



            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(25.dp)

            )
            {
                Text(
                    text = "autoBOX PORSCHE",
                    color = Color.Gray,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 30.sp,
                )


                Image(
                    painter = painterResource(id = R.drawable.porschecayenne),
                    contentDescription = "Porsche Cayenne"
                )
                //Text(text = "BMWX6", fontFamily= FontFamily.Cursive)

                //Spacer(modifier = Modifier.height(40.dp))

                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I purchase a Porsche Cayenne?")

                        //  context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    shape = RoundedCornerShape(0.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "PURCHASE ",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }
                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I Hire a Porsche Cayenne?")

                        //   context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    shape = RoundedCornerShape(10.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "HIRE",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }
                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I Fix my Porsche Cayenne?")

                        // context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = RoundedCornerShape(10.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "FIX",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }

                Image(
                    painter = painterResource(id = R.drawable.porschemacan),
                    contentDescription = "Porsche Macan"
                )
                //Text(text = "Porsche Macan", fontFamily= FontFamily.Cursive)

                //Spacer(modifier = Modifier.height(40.dp))

                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I purchase a Porsche Macan?")

                        //  context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    shape = RoundedCornerShape(0.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "PURCHASE ",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }
                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I Hire a Porsche Macan?")

                        //   context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    shape = RoundedCornerShape(10.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "HIRE",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }
                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I Fix my Porsche Macan?")

                        // context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = RoundedCornerShape(10.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "FIX",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }

                Image(
                    painter = painterResource(id = R.drawable.porsche911carrera),
                    contentDescription = "Porsche911 Carrera"
                )
                //Text(text = "BMWX6", fontFamily= FontFamily.Cursive)

                //Spacer(modifier = Modifier.height(40.dp))

                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I purchase a Porsche911 Carrera ?")

                        //  context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    shape = RoundedCornerShape(0.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "PURCHASE ",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }
                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I Hire a Porsche911 Carrera ?")

                        //   context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    shape = RoundedCornerShape(10.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "HIRE",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }
                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I Fix my Porsche911 Carrera ?")

                        // context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = RoundedCornerShape(10.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "FIX",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }

                Image(
                    painter = painterResource(id = R.drawable.porschecayenne),
                    contentDescription = "Porsche Cayenne"
                )
                //Text(text = "BMWX6", fontFamily= FontFamily.Cursive)

                //Spacer(modifier = Modifier.height(40.dp))

                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I purchase a Porsche Cayenne?")

                        //  context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    shape = RoundedCornerShape(0.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "PURCHASE ",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }
                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I Hire a Porsche Cayenne?")

                        //   context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    shape = RoundedCornerShape(10.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "HIRE",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }
                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I Fix my Porsche Cayenne?")

                        // context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = RoundedCornerShape(10.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "FIX",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }



            }
        }

    }
}

@Preview( uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Light Mode")
@Composable
fun Porscheprev() {
    porsche(rememberNavController())
}