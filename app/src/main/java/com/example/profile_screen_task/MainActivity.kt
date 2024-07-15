package com.example.profile_screen_task

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.profile_screen)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        val backButton = findViewById<ImageView>(R.id.back)
        backButton.setOnClickListener {
            finish() // Triggers system Back button functionality
        }

        val linkedinIcon = findViewById<ImageView>(R.id.linkedin_icon)

        linkedinIcon.setOnClickListener {
            val url = "https://www.linkedin.com/in/mariam-a-el-sheikh-b403531b1/" // Replace with your profile name
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val githubIcon = findViewById<ImageView>(R.id.github_icon)

        githubIcon.setOnClickListener {
            val url = "https://github.com/mariam123570" // Replace with your profile name
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val facebookIcon = findViewById<ImageView>(R.id.facebook_icon)

        facebookIcon.setOnClickListener {
            val url = "https://web.facebook.com/mariam.elsheikh.7/" // Replace with your profile name
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        }
    }
