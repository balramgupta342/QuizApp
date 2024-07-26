package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvname:TextView = findViewById(R.id.tv_name)
        val tvscore:TextView = findViewById(R.id.tv_score)
        val btnfinish:Button = findViewById(R.id.btn_finish)

        val username = intent.getStringExtra(Constants.USER_NAME)
        tvname.text = username
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        "Your score is $correctAnswers out of $totalQuestions".also { tvscore.text = it }

        btnfinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}