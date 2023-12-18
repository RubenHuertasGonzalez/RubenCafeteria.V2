package com.ruben.rubencafeteria.register

import androidx.lifecycle.ViewModel
import com.ruben.rubencafeteria.User
import com.ruben.rubencafeteria.login.LoginViewModel

class RegisterViewModel : ViewModel() {
    private val registeredUsers: MutableList<User> = mutableListOf()


    fun validateAndRegister(username: String, password: String, loginViewModel: LoginViewModel): Boolean {
        if (username.isNotBlank() && password.isNotBlank()) {
            if (isUserAlreadyRegistered(username, loginViewModel.userList)) {
                return false
            } else {
                registeredUsers.add(User(username, password))
                return true
            }
        } else {
            return false
        }
    }

    private fun isUserAlreadyRegistered(username: String, userList: List<User>): Boolean {
        return userList.any { it.username == username }
    }
}

