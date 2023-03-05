package com.kundalik.jetpackcoponse

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.kundalik.jetpackcoponse.navigation.HomeScreen
import com.kundalik.jetpackcoponse.navigation.Screens
import com.kundalik.jetpackcoponse.ui.theme.JetpackCoponseTheme


class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCoponseTheme() {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxSize()
                        .background(MaterialTheme.colors.background)
                        .padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    HomeScreen(navController = navController)
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "light mode")
@Preview(showBackground = true, name = "dark mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreview() {
    JetpackCoponseTheme {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxSize()
                .background(MaterialTheme.colors.background)
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


        }
    }
}


//class MainActivity : ComponentActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            JetpackCoponseTheme {
//                Surface(color = MaterialTheme
////
////                }
////            }
////        }
////    }
////}
////@Composable
////fun CustomText() {
////    Text(
////        text = stringResource(id = R.string.app_name),.colors.background) {
//
//        modifier = Modifier
//            .background(MaterialTheme.colors.primary)
//            .padding(15.dp)
//            .width(200.dp),
//        color = Color.Magenta,
//        fontSize = MaterialTheme.typography.h6.fontSize,
//        fontStyle = FontStyle.Italic,
//        fontWeight = FontWeight.ExtraBold,
//        textAlign = TextAlign.End
//    )
//}
//
//@Composable
//fun CustomText2() {
//    Text(
//        buildAnnotatedString {
//            withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)) {
//                withStyle(
//                    style = SpanStyle(
//                        color = MaterialTheme.colors.primary,
//                        fontSize = 30.sp,
//                        fontWeight = FontWeight.ExtraBold
//                    )
//                ) {
//                    append("gaurav")
//                }
//                append("suryawnashi")
//                append("BCA")
//            }
//        }, modifier = Modifier.width(250.dp)
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JetpackCoponseTheme {
//
//        Column(modifier = Modifier.fillMaxSize()) {
//            CustomText()
//        }
//    }
//}
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            JetpackCoponseTheme {
//                // A surface container using the 'background' color from the theme
//
////                Surface(color = MaterialTheme.colors.primary) {
////                    ShowBox()
//
//                }
//
////                Column(
////                    modifier = Modifier.fillMaxSize(),
////                    horizontalAlignment = Alignment.CenterHorizontally,
////                    verticalArrangement = Arrangement.SpaceAround
////                ) {
////                    CustomItem(weight = 2f, color = MaterialTheme.colors.secondary)
////                    CustomItem(weight = 1f, color = MaterialTheme.colors.primaryVariant)
////                    CustomItem(weight = 3f, color = MaterialTheme.colors.primary)
////
////                }
//
//                }
//
////                Surface(
////                    modifier = Modifier.fillMaxSize(),
////                    color = MaterialTheme.colors.background
////                ) {
////                   Column {
////                       Greeting("Android")
////                       CustomText(text = "Kundalik")
////                   }
////                }
//            }
//        }
//
//
//@Composable
//fun ShowBox() {
//    Box(
//        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.TopCenter
//    ) {
//        Box(
//            modifier = Modifier
//                .background(Color.Blue),
//            contentAlignment = Alignment.Center
////                    .width(100.dp)
////                    .height(100.dp)
////                    .verticalScroll(rememberScrollState())
//        ) {
//            Box(modifier = Modifier.height(50.dp) .height(50.dp) .background(Color.Blue))
//            Text(text = "I Love Android", fontSize = 40.sp, color = Color.Yellow)
//        }
//
//    }
//}
//
//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
//@Composable
//fun CustomText(text: String) {
//    Text(
//        text = text,
//        style = Typography.h5
//    )
//}
//
//@Composable
//fun ColumnScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.primary) {
//    Surface(
//        modifier = Modifier
//            .width(200.dp)
//            .height(50.dp),
//        color = color
//    ) {
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JetpackCoponseTheme {

//        Box(
//            modifier = Modifier.fillMaxSize(),
//            contentAlignment = Alignment.TopCenter
//        ) {
//            Box(
//                modifier = Modifier
//                    .background(Color.Blue),
//                contentAlignment = Alignment.Center
////                    .width(100.dp)
////                    .height(100.dp)
////                    .verticalScroll(rememberScrollState())
//            ) {
//                Box(modifier = Modifier.height(50.dp) .height(50.dp) .background(Color.Blue))
//                Text(text = "I Love Android", fontSize = 40.sp, color = Color.Yellow)
//            }
//        }


//        Column(
//            modifier = Modifier.fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.SpaceAround
//        ) {
//            CustomItem(weight = 2f, color = MaterialTheme.colors.secondary)
//            CustomItem(weight = 1f, color = MaterialTheme.colors.primaryVariant)
//            CustomItem(weight = 3f, color = MaterialTheme.colors.primary)
//
//        }

//        Column() {
//            Greeting("Android")
//            CustomText(text = "Kundalik")
//        }
//   }
//}