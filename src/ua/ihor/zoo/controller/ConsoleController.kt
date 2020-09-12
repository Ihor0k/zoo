package ua.ihor.zoo.controller

import ua.ihor.zoo.Zoo

class ConsoleController(val zoo: Zoo) : Controller {
    override fun run() {
        showHelp()
        while (true) {
            val command = try {
                readLine()?.toInt()
            } catch (e: NumberFormatException) {
                0
            }
            when (command) {
                1 -> zoo.showAnimals()
                2 -> zoo.liveDay()
                3 -> break
                else -> showHelp()
            }
        }
    }

    private fun showHelp() {
        println(
            """
            Enter command number...
            Commands:
            1. List all animals
            2. Live one day
            3. Exit
        """.trimIndent()
        )
    }
}