package com.student.uicomponents.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextDetailScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // Top Bar
        TopAppBar(
            title = {
                Text(
                    text = "Text Detail",
                    color = Color(0xFF2196F3),
                    fontSize = 20.sp
                )
            },
            navigationIcon = {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color(0xFF2196F3)
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.White
            )
        )

        // Content
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = buildAnnotatedString {
                        append("The quick ")
                        withStyle(style = SpanStyle(
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFF9800)
                        )) {
                            append("Brown")
                        }
                        append("\nfox j u m p s ")
                        withStyle(style = SpanStyle(
                            fontWeight = FontWeight.Bold
                        )) {
                            append("over")
                        }
                        append("\nthe ")
                        withStyle(style = SpanStyle(
                            fontStyle = FontStyle.Italic,
                            textDecoration = TextDecoration.Underline
                        )) {
                            append("lazy")
                        }
                        append(" dog.")
                    },
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center,
                    lineHeight = 32.sp
                )
            }
        }
    }
}
