package com.student.uicomponents.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tuan3_bai1.navigation.Screen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComponentsListScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // Top Bar
        TopAppBar(
            title = {
                Text(
                    text = "UI Components List",
                    color = Color(0xFF2196F3),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.White
            )
        )

        LazyColumn(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Display Section
            item {
                SectionHeader("Display")
            }
            item {
                ComponentCard(
                    title = "Text",
                    description = "Displays text",
                    onClick = { navController.navigate(Screen.TextDetail.route) }
                )
            }
            item {
                ComponentCard(
                    title = "Image",
                    description = "Displays an image",
                    onClick = { navController.navigate(Screen.ImageDetail.route) }
                )
            }

            // Input Section
            item {
                Spacer(modifier = Modifier.height(8.dp))
                SectionHeader("Input")
            }
            item {
                ComponentCard(
                    title = "TextField",
                    description = "Input field for text",
                    onClick = { navController.navigate(Screen.TextFieldDetail.route) }
                )
            }
            item {
                ComponentCard(
                    title = "PasswordField",
                    description = "Input field for passwords",
                    onClick = { navController.navigate(Screen.PasswordFieldDetail.route) }
                )
            }

            // Layout Section
            item {
                Spacer(modifier = Modifier.height(8.dp))
                SectionHeader("Layout")
            }
            item {
                ComponentCard(
                    title = "Column",
                    description = "Arranges elements vertically",
                    onClick = { navController.navigate(Screen.ColumnDetail.route) }
                )
            }
            item {
                ComponentCard(
                    title = "Row",
                    description = "Arranges elements horizontally",
                    onClick = { navController.navigate(Screen.RowDetail.route) }
                )
            }
        }
    }
}

@Composable
fun SectionHeader(title: String) {
    Text(
        text = title,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = Modifier.padding(vertical = 8.dp)
    )
}

@Composable
fun ComponentCard(
    title: String,
    description: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFE3F2FD)
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF1976D2)
            )
            Text(
                text = description,
                fontSize = 14.sp,
                color = Color(0xFF1976D2),
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}
