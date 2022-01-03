class Person(val firstname: String, val lastname: String) {
    //We are able to directly initalize the varibale right within the constructor
    //without the need of explicitly creating an init. We can also access these properties directly.
    //val firstname: String = _firstname
    //val lastname: String = _lastname

    //-----another method----------
//    init {
//        firstname = _firstname
//        lastname = _lastname
//    }
    //Secondary Constructor
    //constructor(): this("Peter", "Parker")

    var nickname: String? = null
        set(value) {
            //field stores the actual value of the nickname
            //value is the new value that we would like to assign
            field = value
        }

        get() {
            //some getter logic here
            return field
        }
}

/*
There are many different types of visibility modifiers, some of which are:
internal: meaning that the class will be public within the module
private: it will only be visible inside the file that contains the declaration.
protected: means that the member has the same visibility as one marked as private, but that it is also visible in subclasses.
 */