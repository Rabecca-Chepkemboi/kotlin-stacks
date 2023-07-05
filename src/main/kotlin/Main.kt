fun main() {

    val myStack = Stack()
    println(myStack.peek())
    println(myStack.pop())
    println(myStack.isEmpty())
    myStack.push(34)
    myStack.push(12)
    println(myStack.peek())
    myStack.push(3)
    myStack.push(7)
    myStack.pop()
    println(myStack.peek())
    val x = myStack.pop()
    val y = myStack.pop()
    val z = x!! + y!!
    println(z)


    println(reversedStack("hello"))

}

class Stack{
    var data = mutableListOf<Int>()

    fun push(value: Int){
        data.add(value)
    }

    fun pop(): Int?{
        if(data.isEmpty()){
            return null
        }
        var top = data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }

    fun peek(): Int?{
        if(data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }
    fun isEmpty(): Boolean{
        return data.isEmpty()
    }
}

fun reversedStack(str: String): String{
    val stack = Stack()
    for (character in str){
        stack.push(character)
    }
    val result = mutableListOf<Char>()
    while (!stack.isEmpty()){
        result.add(stack.pop()!!)
    }
    return result.joinToString("")
}