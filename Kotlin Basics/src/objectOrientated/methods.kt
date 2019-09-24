package objectOrientated

class Robot(val name: String ) {

    fun greetHuman(){
        println("Hello Human, my name is $name")
    }

    fun knowItsName(): Boolean = name.isNotBlank()

}

fun main(args: Array<String>) {
    val fightRobot = Robot(name = "Destroyer9000")

    if(fightRobot.knowItsName()) {
        fightRobot.greetHuman()
    }
}