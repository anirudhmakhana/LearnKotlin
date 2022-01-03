fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Language")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    //for loops
    for(interestingThing in interestingThings){
        println(interestingThing)
    }

    //eliminates index, only iterate over array
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }

    //maintain index
    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is indexed at $index" )
    }

    //----------------------List------------------------------
    val interestingThingsList = listOf<String>("Kolin", "Programming", "Language")

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { (key, value) -> println("$key -> $value") }
}
