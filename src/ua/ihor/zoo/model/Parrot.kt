package ua.ihor.zoo.model

class Parrot(name: String, favouriteFood: String, wingspan: Double, val canSpeak: Boolean) :
    Bird(name, favouriteFood, wingspan) {

    override fun toString(): String {
        return "Parrot(name=$name, favouriteFood=$favouriteFood, wingspan=$wingspan, canSpeak=$canSpeak, friends=${friendNames()})"
    }
}