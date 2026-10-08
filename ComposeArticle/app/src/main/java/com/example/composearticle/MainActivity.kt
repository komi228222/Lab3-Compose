package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleContent()
                }
            }
        }
    }
}

@Composable
fun ArticleContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Image(
            painter = painterResource(R.drawable.compose_banner),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(R.string.title),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(R.string.paragraph1),
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(R.string.paragraph2),
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        ArticleContent()
    }
}