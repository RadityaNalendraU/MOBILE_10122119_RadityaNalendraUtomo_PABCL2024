package com.example.tip_time

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

 class MainActivity : AppCompatActivity() , View.OnClickListener {
    private lateinit var editTextCm: EditText
    private lateinit var editTextScale1:EditText
    private lateinit var editTextScale2: EditText
    private lateinit var TextResult:TextView
    private lateinit var BtnCalculate:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map_scale)
        editTextCm = findViewById(R.id.CmMapScale)
        editTextScale1 = findViewById(R.id.Scale1)
        editTextScale2 = findViewById(R.id.Scale2)
        TextResult = findViewById(R.id.result)
        BtnCalculate = findViewById(R.id.BtnCalculate)
        BtnCalculate.setOnClickListener(this)

    }

     override fun onClick(View: View?) {
         if (View?.id == R.id.BtnCalculate) {
             val cm : Double = editTextCm.text.toString().toDouble()
             val scale1 : Double = editTextScale1.text.toString().toDouble()
             val scale2 : Double = editTextScale2.text.toString().toDouble()

             //Menghitung skala
             val scale : Double = (cm*scale2)/scale1
             //Mengubah skala nya dari CM ke KM
             val resultScale : Double = scale / 100000
             //Hasil Dari perhitungan Skala yang sudah di ubah ke dalam KM
             TextResult.text = resultScale.toString() + " KM"

         }


     }
 }