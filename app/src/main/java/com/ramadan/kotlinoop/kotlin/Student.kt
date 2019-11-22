package com.ramadan.kotlinoop.kotlin

open class Student  constructor(var firstName:String , lastName :String) {
    var gender: String = "male"
    var job : String = "Software Engineer"
    private var rank : Int =0
    protected var isEligiableForOffer : Boolean = true
    internal  var age : Int = 30

    constructor(firstName: String, lastName: String , gender:String) : this(firstName , lastName) {
        this.gender = gender
    }

    constructor(firstName: String, lastName: String ,gender: String ,job:String) : this(firstName , lastName) {
        this.job = job
    }
}