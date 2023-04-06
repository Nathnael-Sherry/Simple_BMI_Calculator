package com.example.simple_bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var text_display:TextView
    private lateinit var txt_Weight:EditText
    private lateinit var txt_height:EditText
    private lateinit var submit_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_display=findViewById(R.id.txtAnswer)
        txt_Weight=findViewById(R.id.txtWeight)
        txt_height=findViewById(R.id.txtHeight)
        submit_button=findViewById(R.id.btnsubmit)


        submit_button.setOnClickListener {
            var first_num = txt_Weight.text.toString().trim()
            var second_num = txt_height.text.toString().trim()

            if (first_num.isEmpty() || second_num.isEmpty()){
                Toast.makeText(this, "ENTER A VALID NUMBER", Toast.LENGTH_SHORT).show()
            }
            else{
                var third_num = second_num.toDouble() * second_num.toDouble()
                var answer = first_num.toDouble() / third_num.toFloat()
                text_display.text = answer.toString()
//                Toast.makeText(this, "trying to calculate BMI", Toast.LENGTH_SHORT).show()
            }

//            Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show()
        }



    }
}