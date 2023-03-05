package com.kundalik.jetpackcoponse.ui.theme

import android.app.Application
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InputEditText() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        var text by remember { mutableStateOf(" type here ...") }
        TextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            label = {
                Text(text = "Title")
            },
            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Email, contentDescription ="email-icon")
                }
            },
            trailingIcon = {
                IconButton(onClick = {
                    Log.d("MainActivity", "check")
                }) {
                    Icon(imageVector = Icons.Filled.Check, contentDescription = "check")

                }
            }
        )

    }
}


@Composable
fun InputEditText2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        var text by remember { mutableStateOf(" type here ...") }
        OutlinedTextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            label = {
                Text(text = "Title")
            },
            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Email, contentDescription ="email-icon")
                }
            },
            trailingIcon = {
                IconButton(onClick = {
                    Log.d("MainActivity", "check")
                }) {
                    Icon(imageVector = Icons.Filled.Check, contentDescription = "check")
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                //imeAction = ImeAction.Done
                //imeAction = ImeAction.Go
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSend = {
                    Log.d("MainActivit", "searching")
                }
            )
        )

    }
}


@Preview
@Composable
fun DefaultPreview() {
    JetpackCoponseTheme {

        InputEditText2()
    }
}