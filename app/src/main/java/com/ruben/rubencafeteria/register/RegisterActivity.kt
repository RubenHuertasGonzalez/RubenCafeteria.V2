package com.ruben.rubencafeteria.register

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.ruben.rubencafeteria.R
import com.ruben.rubencafeteria.User
import com.ruben.rubencafeteria.login.LoginProvider
import com.ruben.rubencafeteria.login.LoginViewModel

class RegisterActivity : AppCompatActivity() {

    private lateinit var registerViewModel: RegisterViewModel
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        registerViewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)

        val usernameEditText: EditText = findViewById(R.id.editTextRegisterUsername)
        val passwordEditText: EditText = findViewById(R.id.editTextRegisterPassword)
        val registerButton: Button = findViewById(R.id.buttonDoRegister)

        registerButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (registerViewModel.validateAndRegister(username, password, loginViewModel)) {
                Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show()
                LoginProvider.addUser(User(username, password))
                finish()
            } else {
                Toast.makeText(this, "Error en el registro", Toast.LENGTH_SHORT).show()
            }
        }
    }
}





