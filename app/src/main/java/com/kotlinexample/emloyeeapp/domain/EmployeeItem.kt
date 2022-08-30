package com.kotlinexample.emloyeeapp.domain

import java.util.*

data class EmployeeItem(
    val id: Int,
    val name: String,
    val Surname: String,
    val count: Int,
    val photoURL: String,
    val birthDate: Date
)
