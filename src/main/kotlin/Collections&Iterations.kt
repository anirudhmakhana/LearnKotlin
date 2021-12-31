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
}
