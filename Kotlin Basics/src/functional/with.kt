package functional

fun main(args: Array<String>) {

    // with()-> groups calls together and remove need to repeat variable declaration

    val props = System.getProperties()

    with(props) {
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.home"))
    }

}