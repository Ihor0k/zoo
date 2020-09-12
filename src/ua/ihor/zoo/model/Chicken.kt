package ua.ihor.zoo.model

class Chicken(name: String, favouriteFood: String, wingspan: Double, val isBroiler: Boolean) :
    Bird(name, favouriteFood, wingspan) {

    override fun toString(): String {
        return "Chicken(name=$name, favouriteFood=$favouriteFood, wingspan=$wingspan, isBroiler=$isBroiler, friends=${friendNames()})"
    }
}