package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(verticalArrangement = Arrangement.Center) {
                        JetComposeImage()
                        TaskDone(task = "All tasks completed", compliment = "Nice work!")
                    }
                }
            }
        }
    }
}

@Composable
fun TaskDone(task:String, compliment:String, modifier: Modifier = Modifier) {
    Column(  modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        JetComposeImage()
        Text(
            text = task,
            fontWeight = Bold,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)

        )
        Text(
            text = compliment,
            fontSize = 16.sp,
        )
    }


}

@Composable
fun JetComposeImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.check)
    Image(
            painter = image,
            contentDescription = null
        )

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview(modifier: Modifier = Modifier) {
    TaskManagerTheme {
            TaskDone(task = "All tasks completed", compliment = "Nice work!")

    }
}