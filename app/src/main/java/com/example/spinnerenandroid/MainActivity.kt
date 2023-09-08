package com.example.spinnerenandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.spinnerenandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var diaSelected: DiaSemana? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val diaSemanaList = DiaSemana.values()


        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, diaSemanaList)

        binding.spinner.adapter = adapter

        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                diaSelected = diaSemanaList.get(position)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

        }



        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, NewActivity::class.java)
            startActivity(intent)
//            val name = binding.etName.text.toString()
//            val age = binding.etAge.text.toString()
//
//            if (!name.isNullOrBlank() && !age.isNullOrBlank() && diaSelected != null) {
//
//                val user = User(name = name, age = Integer.parseInt(age), diaSelected!!)
//                val intent = Intent(this, ResultActivity::class.java)
//                intent.putExtra("user", user)
//                startActivity(intent)
//            }
        }
    }




}
