typealias Visitors<T> = (T) -> Unit

class LetsBinaryTree<T>(private val dataItem: T) {

    var leftNode : LetsBinaryTree<T>? = null
    var rightNode : LetsBinaryTree<T>? = null

    //Function 1: Which traverse in IN-ORDER
    fun letsTravel_IN_Order(visitors: Visitors<T>) {
        leftNode?.letsTravel_IN_Order(visitors)
        visitors(dataItem)
        rightNode?.letsTravel_IN_Order(visitors)
    }

    //Function 2: Which traverse in PRE-ORDER
    fun letsTravel_PRE_Order(visitors: Visitors<T>) {
        visitors(dataItem)
        leftNode?.letsTravel_PRE_Order(visitors)
        rightNode?.letsTravel_PRE_Order(visitors)
    }

    //Function 3: Which traverse in POST-ORDER
    fun letsTravel_POST_Order(visitors: Visitors<T>) {
        leftNode?.letsTravel_POST_Order(visitors)
        rightNode?.letsTravel_POST_Order(visitors)
        visitors(dataItem)
    }
}

fun main() {
    val root = LetsBinaryTree(1)
    val node2 = LetsBinaryTree(2)
    val node3 = LetsBinaryTree(3)
    val node4 = LetsBinaryTree(4)
    val node5 = LetsBinaryTree(5)
    val node6 = LetsBinaryTree(6)
    val node7 = LetsBinaryTree(7)
    val node8 = LetsBinaryTree(8)
    val node9 = LetsBinaryTree(9)
    val node10 = LetsBinaryTree(10)
    val node11 = LetsBinaryTree(11)

    root.leftNode = node2
    root.rightNode = node3

    node2.leftNode = node4
    node2.rightNode = node5

    node3.leftNode = node6
    node3.rightNode = node7

    node4.leftNode = node8

    node6.leftNode = node9

    node7.leftNode = node10
    node7.rightNode = node11

    println("PRE---------------")
    root.letsTravel_PRE_Order {  print("$it ")}
    println("\n--------IN--------")
    root.letsTravel_IN_Order { print("$it ") }
    println("\n--------------POST")
    root.letsTravel_POST_Order { print("$it ") }
}

//OUTPUT
/**
PRE---------------
1 2 4 8 5 3 6 9 7 10 11
--------IN--------
8 4 2 5 1 9 6 3 10 7 11
--------------POST
8 4 5 2 9 6 10 11 7 3 1
 * **/
