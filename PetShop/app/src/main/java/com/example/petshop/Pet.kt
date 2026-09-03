package com.example.petshop

abstract class Pet(val name: String, var age: Int) {
    abstract fun speak(): String
}

class Cat(name: String, age: Int): Pet(name, age), Pettable {
    override fun speak(): String {
        return "Meow"
    }
    override fun pet() {
        println("The cat $name is being petted")
    }
}

class Dog(name: String, age: Int): Pet(name, age), Pettable {
    override fun speak(): String {
        return "bark"
    }
    override fun pet() {
        println("The dog $name is being petted")
    }
}

class Scorpion(name: String, age: Int): Pet(name, age) {
    override fun speak(): String {
        return "hiss"
    }
}

interface Pettable {
    fun pet()
}