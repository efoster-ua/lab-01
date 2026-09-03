package com.example.petshop

abstract class Mood(val date:String) {
    abstract fun tellMood(): String
}

class Happy(date: String): Mood(date) {
    override fun tellMood(): String {
        return "Happy! :D"
    }
}

class Sad(date: String): Mood(date) {
    override fun tellMood(): String {
        return "Sad. D:"
    }

}