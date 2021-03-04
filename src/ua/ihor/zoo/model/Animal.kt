package ua.ihor.zoo.model

open class Animal(val name: String, val favouriteFood: String) {
    private val friends: MutableSet<Animal> = mutableSetOf()

    fun establishFriendship(animal: Animal) {
        friends.add(animal)
        animal.friends.add(this)
    }

    fun breakFriendship(animal: Animal) {
        friends.remove(animal)
        animal.friends.remove(this)
    }

    fun getFriends(): Set<Animal> {
        return friends
    }

    protected fun friendNames(): Collection<String> {
        return friends.map(Animal::name)
    }

    override fun toString(): String {
        return "Animal(name='$name', favouriteFood='$favouriteFood', friends=${friendNames()})"
    }

}