package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    App(
                        stringResource(R.string.montitre),
                        stringResource(R.string.text1),
                        stringResource(R.string.text2)
                    )
                }

            }
        }
    }
}

@Composable
fun App (nom: String, text1: String, text2: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        
        Image(
            painter= painterResource(R.drawable.bg_compose_background),
            contentDescription=""
        )
        Text(
            text= nom,
            modifier = Modifier.padding(24.dp),
        )
        Text(
            text= text1,
            modifier = Modifier.padding(start=16.dp,end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text= text2,
            modifier = Modifier.padding(24.dp),
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    LearnTogetherTheme {
        App(
            stringResource(R.string.montitre),
            stringResource(R.string.text1),
            stringResource(R.string.text2)
        )
    }
}