open class Human(var name: String){
    open val isMagic: Boolean = false
    open fun attack(){
        println("$name use Fist Attack!")
    }
}

class Mage(name_param: String): Human(name_param){
    override val isMagic = true
    override fun attack() {
        println("$name use Fireball!")
    }
}

fun main() {
    val persons: Array<Human> = arrayOf(Human("Lai"), Mage("Eva"))
    persons[0].attack()
    persons[1].attack()

    for(item in persons){
        if(item.isMagic)
            println("${item.name} has mana")
        else
            println("${item.name} has no mana")
    }
}