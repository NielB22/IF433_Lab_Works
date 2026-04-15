package lat_uts.data

import kotlin.coroutines.Continuation

interface Interaction {
    val name: String
    fun sayHello(name: String){
        println("Hello $name, my name is ${this.name}")
    }
}

interface Go {
    fun go() {
        println("Go")
    }
}

interface MoveA {
    fun move() {
        println("Move A")
    }
}

interface MoveB {
    fun move() {
        println("Move B")
    }
}

class Human(override val name: String) : Interaction, Go, MoveA, MoveB {
    override fun move() {
        super<MoveB>.move()
        super<MoveA>.move()
    }
}

