package com.winnie.regester

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity

private val Any.text: Any
    get() {
        TODO("Not yet implemented")
    }

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener()
    }

    private fun setContentView(root: Any) {

    }

    private fun validateForm(): Boolean {

        return true
    }
}

private fun Any.setOnClickListener() {

}

class HomeActivity : AppCompatActivity() {

}

object ActivityLoginBinding {

    val etPassword: Any = TODO()
    val etEmailAddress: Any = TODO()
    val btnLogin: Any = TODO()
    val root: Any = TODO()


    fun inflate(layoutInflater: LayoutInflater): ActivityLoginBinding {

        TODO()
    }
}

