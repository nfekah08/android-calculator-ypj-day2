package com.example.myapplication

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //    enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val num1 = binding.num1EditText.text
        val num2 = binding.num2EditText2.text

        binding.plusBtn.setOnClickListener {

            val sum = num1.toString().toDouble() + num2.toString().toDouble()
            binding.resultTextView.text = "The sum of $num1 and $num2 is $sum"

        }



        binding.minusBtn.setOnClickListener {

            val subtract = num1.toString().toDouble() - num2.toString().toDouble()
            binding.resultTextView.text = "$num1 minus $num2 is $subtract"

        }



        binding.productBtn.setOnClickListener {

            val multiplication = num1.toString().toDouble() * num2.toString().toDouble()
            binding.resultTextView.text = "$num1 multiply $num2 is $multiplication"

        }



        binding.divideBtn.setOnClickListener {

            val div = num1.toString().toDouble() / num2.toString().toDouble()
            binding.resultTextView.text = "The division of $num1 and $num2 is $div"

        }
    }
}