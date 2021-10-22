package com.example.uts_progmob2021.crud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_progmob2021.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class GetMatkulActivity : AppCompatActivity() {
    lateinit var rvMatkul : RecyclerView
    lateinit var fabAddMatkul : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_matkul)

        rvMatkul = findViewById(R.id.rvMatkul)
        fabAddMatkul = findViewById(R.id.fabAddMatkul)

        fabAddMatkul.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@GetMatkulActivity, AddMatkulActivity::class.java)
            startActivity(intent)
        })
    }
}