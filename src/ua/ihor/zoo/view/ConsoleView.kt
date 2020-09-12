package ua.ihor.zoo.view

import ua.ihor.zoo.model.Animal
import java.util.*

class ConsoleView : View {
    override fun showAnimals(animals: Collection<Animal>) {
        val joiner = StringJoiner(",\n", "[\n", "\n]")
        joiner.setEmptyValue("[]")
        animals
            .map(Animal::toString)
            .map{ "\t" + it}
            .forEach(joiner::add)
        println(joiner)
    }

    override fun onFriendshipBreak(animal1: Animal, animal2: Animal) {
        println("'${animal1.name}' has lost friendship with '${animal2.name}'")
    }

    override fun onFriendshipEstablish(animal1: Animal, animal2: Animal) {
        println("'${animal1.name}' has established friendship with '${animal2.name}'")
    }
}