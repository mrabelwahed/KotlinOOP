package com.ramadan.kotlinoop.kotlin

import java.lang.IllegalArgumentException

class Book ( var title: String,  val isbn: Long ){
    var desc : String  ="default"
    set(value) {
        if (!value.isNotEmpty()){
            throw  IllegalArgumentException("Description should not be empty !!")
        }
        field = value
    }

    get() {
        return  field.toUpperCase()
    }
}