/* There is a distinct difference between a string and a nullable string.
Types in kotlin are non-null by default.

There is no actual need to declare the variable types in kotlin, the complier is smart enough to detect that on its own
however, when we assign null, and are not being explicit, the complier does not know which type of null shoul it assign to the
variable.
 */

//Global variables declaration
var s1: String = "Anriudh"
var s2: String? = "GeeksforGeeks"
var greeting: String? = null
var nullString = null //of type Nothing? Better to be explicit with type in this scenario.

fun main() {
    //s1 = null // compilation error
    s2 = null // ok
    print(s2)


    //control flow if the variable is nullable type.
    if(greeting != null){
        println(greeting)
    }else{
        print("hi")
    }


}

