package com.ruben.rubencafeteria

import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val userList = listOf(
        User("ruben", "123"),
        User("enaitz", "321")
    )

    fun validateUser(username: String, password: String): Boolean {
        for (user in userList) {
            if (user.username == username && user.password == password) {
                return true
            }
        }
        return false
    }
}
