package com.kundalik.jetpackcoponse.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {

    var text by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextField(value = text,
            onValueChange = {
                text = it
            })
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
                         navController.navigate(Screens.DetailScreen.withArgs(text))
        },
        modifier = Modifier.align(Alignment.End)) {
            Text(text = "go to next screen")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    //HomeScreen(n)

}