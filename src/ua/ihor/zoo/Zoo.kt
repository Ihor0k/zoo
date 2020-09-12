package ua.ihor.zoo

import ua.ihor.zoo.model.Animal
import ua.ihor.zoo.view.View
import kotlin.random.Random

class Zoo(private val animals: Collection<Animal>, private val view: View) {

    fun showAnimals() {
        view.showAnimals(animals)
    }

    internal fun liveDay() {
        val breaks = animals
            .mapNotNull(this::breakFriendship)

        val establishments = animals
            .mapNotNull(this::establishFriendship)

        breaks
            .forEach {
                it.first.brakeFriendship(it.second)
                view.onFriendshipBreak(it.first, it.second)
            }

        establishments
            .forEach {
                it.first.establishFriendship(it.second)
                view.onFriendshipEstablish(it.first, it.second)
            }

    }

    private fun breakFriendship(animal: Animal): Pair<Animal, Animal>? {
        val friends = animal.getFriends()
        if (friends.isEmpty()) {
            return null
        }
        val index = Random.nextInt(friends.size)
        val oldFriend = friends.elementAt(index)
        return Pair(animal, oldFriend)
    }

    private fun establishFriendship(animal: Animal): Pair<Animal, Animal>? {
        val friends = animal.getFriends()
        val animalWithFriends = friends.plus(animal)
        val nonFriends = animals
            .filterNot(animalWithFriends::contains)
        if (nonFriends.isEmpty()) {
            return null
        }
        val index = Random.nextInt(nonFriends.size)
        val newFriend = nonFriends[index]
        return Pair(animal, newFriend)
    }
}