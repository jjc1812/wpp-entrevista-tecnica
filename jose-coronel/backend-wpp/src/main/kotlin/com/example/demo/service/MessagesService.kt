package com.example.demo.service

import com.example.demo.utils.Messages
import com.example.demo.utils.Users
import org.springframework.stereotype.Service
import java.util.*

@Service
class MessagesService {

    companion object {
        private const val EXCEPTION_USER_NOT_FOUND = "No user found for the requested parameters"
    }

    fun getMessage(user: String): Any? = when (user.uppercase(Locale.getDefault())) {
        Users.ANA -> Messages.ANA
        Users.CAR -> Messages.CARLOS
        Users.CAT -> Messages.CATA
        Users.JOS -> Messages.JOSE
        Users.NOM -> Messages.NOME
        Users.PED -> Messages.PEDRO
        else -> throw Exception(EXCEPTION_USER_NOT_FOUND)
    }
}