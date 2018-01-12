class Deque<T> {
    private var head: Element<T>? = null

    fun push(value: T) {
        if (head == null) {
            head = Element(value, null, null)
        } else {
            var pointer = head
            while (pointer?.next != null) {
                pointer = pointer.next
            }
            Element(value, pointer, null)
        }
    }

    fun pop(): T? {
        var pointer = head
        while (pointer?.next != null) {
            pointer = pointer.next
        }
        val res = pointer?.value
        pointer = Element(null, pointer?.prev, null)
        return res
    }

    fun unshift(value: T) {
//        val newHead = Element(value, null, head)
//        head = Element(head?.value, newHead, head?.next)
    }

    fun shift(): T? {
        return head?.value
    }

    private data class Element<T>(val value: T, var prev: Element<T>? = null, var next: Element<T>? = null)
}

fun main(args: Array<String>) {
    var link = Deque<Int>()
    link.push(5)
    link.push(10)
    println(link.shift())
}