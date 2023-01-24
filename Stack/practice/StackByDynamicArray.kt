import java.lang.RuntimeException

class StackUnderFlowException(message: String) : RuntimeException(message)
class StackOverFlowException(message: String) : RuntimeException(message)

class LetsFixStack<T>(var capacity: Int) {

    private var elements : Array<Any?>
    private var size = 0
    private var peek : Any? = null

    init {
        if(capacity < 0) throw IllegalArgumentException("Invalid Capacity : $capacity")
        elements = arrayOfNulls(capacity)
    }

    //PASS
    fun push(item : T) {
        if(size == elements.size) {
            val incCapacity = size shr 1
            val newArray = arrayOfNulls<Any>(size+incCapacity)
            System.arraycopy(elements,0,newArray,0,size)
            elements = newArray
        }
        elements[size] = item
        size++
    }

    fun pop() {
        if(size > 0) {
            elements[size-1] = null
            size--
        } else throw StackUnderFlowException("Stack is Empty")
    }
    //PASS
    fun isEmpty() : Boolean = size == 0

    //PASS
    fun isFull(): Boolean = size == capacity

    //PASS
    fun peek() : Any? = if (size > 0) elements[size-1] else null

    //PASS
    fun readAll() = elements
}
fun main() {

    LetsFixStack<Int>(5).apply {
        println("${isEmpty()} | ${isFull()} | ${peek()} | ")
        push(10)
        push(11)
        push(12)
        push(13)
        push(14)

        push(15)
        push(16)
        push(17)



        println(readAll().contentToString())
        println("${isEmpty()} | ${isFull()} | ${peek()} | ")
    }
}
