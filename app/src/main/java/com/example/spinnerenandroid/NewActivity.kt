package com.example.spinnerenandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import com.example.spinnerenandroid.databinding.ActivityNewBinding

class NewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewBinding
    var name: String? = null
    var lastName: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.editTextName.addTextChangedListener { nombre ->
            name = nombre.toString()
            validateFields()
        }

        binding.editTextLastName.addTextChangedListener { nombre ->
            lastName = nombre.toString()
            validateFields()
        }




    }

    private fun validateFields() {
        name.let { first ->
            lastName.let {  second ->
                if (first != null && first.isNotBlank() && second != null && second.isNotBlank()) {
                    binding.btnMaterialClick.isEnabled = true
                }
            }
        }
    }
}