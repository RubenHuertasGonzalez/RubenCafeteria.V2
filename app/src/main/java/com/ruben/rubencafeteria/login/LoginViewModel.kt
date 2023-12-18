package com.ruben.rubencafeteria.login

import androidx.lifecycle.ViewModel
import com.ruben.rubencafeteria.User

class LoginViewModel : ViewModel() {
    val userList: List<User> get() = LoginProvider.loadUsers()

    fun validateUser(username: String, password: String): Boolean {
        for (user in userList) {
            if (user.username == username && user.password == password) {
                return true
            }
        }
        return false
    }
}

