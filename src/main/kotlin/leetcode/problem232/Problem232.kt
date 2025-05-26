package leetcode.problem232


// (Easy) https://leetcode.com/problems/implement-queue-using-stacks
class MyQueue()  {

    private val stack = mutableListOf<Int>()

    fun push(x: Int) {
        stack.add(x)
    }

    fun pop(): Int {
        return stack.removeFirst()
    }

    fun peek(): Int {
        return stack.first()
    }

    fun empty(): Boolean {
        return stack.isEmpty()
    }

}

fun main() {

}