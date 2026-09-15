package com.taskflow
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "TaskFlow - Offline First Task Organizer\n\nBuild Success!"
        tv.textSize = 22f
        tv.setPadding(50, 200, 50, 50)
        setContentView(tv)
    }
}
