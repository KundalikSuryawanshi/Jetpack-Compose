package com.kundalik.jetpackcoponse.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import coil.transform.RoundedCornersTransformation

@Composable
fun CoilImage() {

    Box(
        modifier = Modifier
            .height(200.dp)
            .width(200.dp),
        contentAlignment = Alignment.Center
    ) {
        val painter = rememberImagePainter(
            data = "https://static.toiimg.com/thumb/msid-47811536,width-800,height-600,resizemode-75/47811536.jpg",
            builder = {
                //placeholder(R.drawable.ic_placeholder)
                //error(R.drawable.ic_error)
                crossfade(1000)
                transformations(
                    //GrayscaleTransformation(),
                    //CircleCropTransformation()
                RoundedCornersTransformation(50f)
                )
            }
        )
        val painterState = painter.state
        Image(painter = painter, contentDescription = "image")
        if (painterState is ImagePainter.State.Loading) {
            CircularProgressIndicator()
        }
    }
}