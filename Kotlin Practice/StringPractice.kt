fun main() {
    for (i in 0..255) {
        println("$i  --->  ${i.toChar()}")
    }
}
// Complexity : O(255)
//================================================================================================
fun main() {
    val name1 = " "
    println(name1.isBlank())  //true
    println(name1.isEmpty())  //false
    println(name1.isNullOrBlank()) //true
    println()

    val name2 :String? = null
    println(name2?.isEmpty())       //null
    println(name2?.isNullOrBlank()) //null
    println(name2?.isNullOrEmpty()) //null
    println()

    
    val name3 : String? = null
    println(name3.isNullOrEmpty())  //true
    println(name3?.isEmpty())       //null
    println(name3.isNullOrBlank())  //true
}
//Complexity : O(11)
//================================================================================================
 fun main() {
    val char = '*'

    when(char.code) {
        //capital letters
        in 65..91 -> {
            println("Its a Capital Letter")
        }
        //small letters
        in 97..123 -> {
            println("Its a Small Letter")
        }
        //digits
        in 48..57 -> {
            println("Its a Digit")
        }
        //special symbol
        else -> {
            println("Its a Special Character or Symbol")
        }
    }

    //Method 2 :
    when {
        char.isDigit() -> {
            println("Its a Digit")
        }
        char.isLetter() -> {
            println("Its a Letter")
        }
        else -> {
            println("Its a Symbol")
        }
    }
}
//================================================================================================
fun main() {
    val string = "This is testing string of mine, its ok"
    val checkFor = 'i'
    var count = 0

    for (s in string) {
        if(s == checkFor) count++
    }
    println("Character \'$checkFor\' came $count Times")
}


//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================
