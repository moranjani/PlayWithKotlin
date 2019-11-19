package moran.kotlincourse

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import moran.kotlincourse.utils.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wordValidator = WordValidator()
        println(wordValidator.isValidIdentifier("name"))   // true
        println(wordValidator.isValidIdentifier("_name"))  // true
        println(wordValidator.isValidIdentifier("_12"))    // true
        println(wordValidator.isValidIdentifier(""))       // false
        println(wordValidator.isValidIdentifier("012"))    // false
        println(wordValidator.isValidIdentifier("no$"))    // false

        val sum = sum(listOf(1, 2, 3))
        val mySum = listOf(1, 2, 3).mySum()
        println(sum)    // 6
        println(mySum)
    }

}
