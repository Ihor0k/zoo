package ua.ihor.zoo.model

class Dog(name: String, favouriteFood: String, val type: Type) : Animal(name, favouriteFood) {

    override fun toString(): String {
        return "Dog(name=$name, favouriteFood=$favouriteFood, type=$type, friends=${friendNames()})"
    }

    enum class Type {
        HUNTING, RACING, ASSISTANCE
    }
}