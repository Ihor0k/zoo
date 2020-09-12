package ua.ihor.zoo.model

open class Bird(name: String, favouriteFood: String, val wingspan: Double): Animal(name, favouriteFood) {

    override fun toString(): String {
        return "Bird(name=$name, favouriteFood=$favouriteFood, wingspan=$wingspan, friends=${friendNames()})"
    }
}