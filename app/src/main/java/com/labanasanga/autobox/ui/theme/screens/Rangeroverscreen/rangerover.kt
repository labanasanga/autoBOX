package com.labanasanga.autobox.ui.theme.screens.Rangeroverscreen

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
//class rangerover : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            AutoBOXTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    rover(rememberNavController())
//                }
//            }
//        }
//    }
//}
//@Preview
@Composable
fun rover(navController: NavHostController) {
    val items = listOf("RANGE ROVER ")

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
                    text = "autoBOX RANGE ROVER",
                    color = Color.Gray,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 30.sp,
                )


                Image(
                    painter = painterResource(id = R.drawable.rangerovervogue4),
                    contentDescription = "RANGE ROVER Vogue"
                )
                //Text(text = "BMWX6", fontFamily= FontFamily.Cursive)

                //Spacer(modifier = Modifier.height(40.dp))

                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I purchase a RANGE ROVER Vogue?")

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

                        intent.putExtra("Hello", "Can I Hire a RANGE ROVER Vogue?")

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

                        intent.putExtra("Hello", "Can I Fix my RANGE ROVER Vogue?")

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
                    painter = painterResource(id = R.drawable.rangerovervaler1),
                    contentDescription = "Range Rover valer"
                )
                //Text(text = "Porsche Macan", fontFamily= FontFamily.Cursive)

                //Spacer(modifier = Modifier.height(40.dp))

                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I purchase a Range Rover valer?")

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

                        intent.putExtra("Hello", "Can I Hire a Range Rover valer?")

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

                        intent.putExtra("Hello", "Can I Fix my Range Rover valer?")

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
                    painter = painterResource(id = R.drawable.rangerovervogued300),
                    contentDescription = "Range Rover Vogue 300"
                )
                //Text(text = "BMWX6", fontFamily= FontFamily.Cursive)

                //Spacer(modifier = Modifier.height(40.dp))

                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I purchase a Range Rover Vogue 300 ?")

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

                        intent.putExtra("Hello", "Can I Hire a Range Rover Vogue 300 ?")

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

                        intent.putExtra("Hello", "Can I Fix my Range Rover Vogue 300 ?")

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
                    painter = painterResource(id = R.drawable.rangerovervaler1),
                    contentDescription = "RANGE ROVER VALER 300CC"
                )
                //Text(text = "Range Rover Vogue 300", fontFamily= FontFamily.Cursive)

                //Spacer(modifier = Modifier.height(40.dp))

                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0798162561")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hello", "Can I purchase a RANGE ROVER VALER 300CC?")

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

                        intent.putExtra("Hello", "Can I Hire a RANGE ROVER VALER 300CC?")

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

                        intent.putExtra("Hello", "Can I Fix my RANGE ROVER VALER 300CC?")

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
fun roverprev() {
    rover(rememberNavController())
}