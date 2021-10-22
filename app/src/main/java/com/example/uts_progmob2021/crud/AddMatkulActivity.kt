package com.example.uts_progmob2021.crud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.uts_progmob2021.R

class AddMatkulActivity : AppCompatActivity() {
    lateinit var edKode : EditText
    lateinit var edNama : EditText
    lateinit var edHari : EditText
    lateinit var edSesi : EditText
    lateinit var edSks : EditText
    lateinit var btnSimpanMatkul : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_matkul)

        edKode = findViewById(R.id.edNama)
        edNama = findViewById(R.id.edNama)
        edHari = findViewById(R.id.edHari)
        edSesi = findViewById(R.id.edSesi)
        edSks = findViewById(R.id.edSks)
        btnSimpanMatkul = findViewById(R.id.btnSimpanMatkul)


    }
}