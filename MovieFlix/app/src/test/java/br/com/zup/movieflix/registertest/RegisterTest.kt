package br.com.zup.movieflix.registertest

import br.com.zup.movieflix.register.model.RegisterModel
import br.com.zup.movieflix.register.repositorio.RegisterRepository
import org.junit.Test
import org.junit.Assert.*

class RegisterTest {

    @Test
    fun registerUser(){
        val user = RegisterRepository().registerUser(RegisterModel(
            userName = "Felipe",
            email = "felipe.dearaujo@zup.com.br",
            password = "melhorProfessorDoMundo"))

        assertEquals(user.userName, "Felipe")
        assertEquals(user.email, "felipe.dearaujo@zup.com.br")
        assertEquals(user.password, "melhorProfessorDoMundo")
    }
}