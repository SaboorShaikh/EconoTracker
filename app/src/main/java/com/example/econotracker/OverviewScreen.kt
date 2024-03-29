package com.example.econotracker

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun OverViewScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(
            title = {
                Text(text = "OverView Screen")
            }
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp)
        ) {
            ExpandableCard(
                title = "Income",
                discription = "Test"
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp)
        ) {
            ExpandableCard(
                title = "Expenses",
                discription = "Test"
            )
        }
        Row() {
            Column {
                Row {
                    Text(text = "Total")
                }
                Text(text = "RS")
            }
        }
        Text(
            text = "Last Transactions",
            Modifier
                .padding(start = 10.dp)
                .fillMaxWidth()
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .weight(3f)
            ) {
                Text(
                    text = "Description",
                    fontWeight = FontWeight.Bold
                    )
                Text(text = "")
                Text(text = "")
            }
            Column(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .weight(3f)
            ) {
                Text(
                    text = "Ammount",
                    fontWeight = FontWeight.Bold
                )
                Text(text = "")
                Text(text = "")
            }
            Column(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .weight(3f)
            ) {
                Text(
                    text = "Date",
                    fontWeight = FontWeight.Bold
                )
                Text(text = "")
                Text(text = "")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OverViewScreenPreview() {
    OverViewScreen(navController = rememberNavController())
}