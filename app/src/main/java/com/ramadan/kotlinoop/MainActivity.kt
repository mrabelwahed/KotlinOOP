package com.ramadan.kotlinoop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ramadan.kotlinoop.kotlin.Book
import com.ramadan.kotlinoop.kotlin.Student

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daggerBook = Book("Dagger", isbn = 767676)
        val rxjavaBook = Book("Rxjava", 889)


        //Access

        var title = daggerBook.title

        daggerBook.title = "xjhdjhjdhj"

        rxjavaBook.desc = "jdksjkdjskj"

       val des =  rxjavaBook.desc


        val student = Student("Mahmoud" , "Ramadan")
        val student2 = Student("Mahmoud" , "Ramadan","male")
        val student3 = Student("Mahmoud" , "Ramadan","male" , "engineer")





    }
}
