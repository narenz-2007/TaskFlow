package com.narenz.taskflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var task by remember { mutableStateOf("") }
            var tasks by remember { mutableStateOf(listOf<String>()) }
            MaterialTheme {
                Scaffold(Modifier.fillMaxSize()) { p ->
                    Column(Modifier.padding(p).padding(16.dp)) {
                        Text("TaskFlow", style = MaterialTheme.typography.headlineLarge)
                        Spacer(Modifier.height(8.dp))
                        OutlinedTextField(value = task, onValueChange = { task = it }, label = { Text("New Task") }, modifier = Modifier.fillMaxWidth())
                        Button(onClick = { if(task.isNotBlank()){ tasks = tasks + task; task="" } }, modifier = Modifier.fillMaxWidth().padding(top=8.dp)) { Text("Add Task") }
                        tasks.forEach { t -> Card(Modifier.fillMaxWidth().padding(vertical=4.dp)) { Text(t, Modifier.padding(12.dp)) } }
                    }
                }
            }
        }
    }
}
