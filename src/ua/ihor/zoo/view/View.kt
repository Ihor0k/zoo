package ua.ihor.zoo.view

import ua.ihor.zoo.model.Animal

interface View {
    fun showAnimals(animals: Collection<Animal>)
    fun onFriendshipEstablish(animal1: Animal, animal2: Animal)
    fun onFriendshipBreak(animal1: Animal, animal2: Animal)
}