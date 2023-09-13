package com.example.class5_12092023

import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.class5_12092023.ui.theme.Class5_12092023Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.ImeAction
import com.example.class5_12092023.ui.theme.Class5_12092023Theme
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class Movie(val title: String, val poster: Int)

val movies = listOf(
    Movie("Movie 1", R.drawable.ic_launcher_background),
    Movie("Movie 2", R.drawable.ic_launcher_background),
    Movie("Movie 3", R.drawable.ic_launcher_background)
)

@Composable
fun MovieList(){
    LazyColumn{
        items(movies){
                movie -> MovieItem(movie = movie)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieItem(movie:Movie){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp), elevation = 4.dp, onClick = { }) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = movie.poster),
            contentDescription = movie.title,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop)
        Spacer(modifier = Modifier.height(16.dp))
        Text(movie.title, fontWeight = FontWeight.Bold)
        }
    }
}



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}
