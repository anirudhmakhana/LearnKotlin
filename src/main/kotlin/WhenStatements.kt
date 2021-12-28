/*
When{} block is essentially an advanced form of the switch-case statement known from Java.

In Kotlin, if a matching case is found then only the code in the respective case block is executed and execution continues
with the next statement after the when block. This essentially means that no break statements are needed at the end of each
case block.
 */

var variable: String? = null
fun main() {
    //these can also be used to assign variable to a specific value
    when(variable){
        null -> println("Hello")
        else -> println(variable)
    }
}