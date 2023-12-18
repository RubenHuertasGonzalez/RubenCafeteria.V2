package com.ruben.rubencafeteria.login

import com.ruben.rubencafeteria.User
class LoginProvider {
    companion object {
        private var registeredUsers: MutableList<User> = mutableListOf(
            User("Ruben", "123"),
            User("Enaitz", "321")
        )

        fun loadUsers(): List<User> {
            return registeredUsers.toList()
        }

        fun addUser(user: User) {
            registeredUsers.add(user)
        }
    }
}
