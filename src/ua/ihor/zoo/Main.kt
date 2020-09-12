package ua.ihor.zoo

import ua.ihor.zoo.controller.ConsoleController
import ua.ihor.zoo.model.Chicken
import ua.ihor.zoo.model.Dog
import ua.ihor.zoo.model.Parrot
import ua.ihor.zoo.view.ConsoleView

fun main() {
    val animals = listOf(
        Dog("Dog one", "Meat", Dog.Type.HUNTING),
        Parrot("Parrot one", "Grain", 0.25, false),
        Chicken("Chicken one", "Corn", 0.75, true),
        Dog("Dog two", "Fresh meat", Dog.Type.ASSISTANCE),
        Parrot("Parrot two", "Corn", 0.5, true),
        Dog("Dog three", "Pedigree", Dog.Type.RACING),
        Chicken("Chicken two", "Corn", 0.75, false)
    )
    val view = ConsoleView()
    val zoo = Zoo(animals, view)
    val controller = ConsoleController(zoo)
    controller.run()
}