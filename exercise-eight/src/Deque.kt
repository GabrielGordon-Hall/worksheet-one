class Deque<T> {
    private var head: Element<T>? = null

    fun push(value: T) {
        if (head != null) {
            var pointer = head
            while (pointer?.next != null) {
                pointer = pointer.next
            }
            val tail = Element(value, pointer, null)
            pointer?.next = tail
        } else {
            head = Element(value, null, null)
        }
    }

    fun pop(): T? {
        var pointer = head
        var pointerPrev: Element<T>? = null
        while (pointer?.next != null) {
            pointerPrev = pointer
            pointer = pointer.next
        }
        val res = pointer?.value
        pointerPrev?.next = null
        return res
    }

    fun unshift(value: T) {
        val oldHead = head
        val newHead = Element(value, null, oldHead)
        oldHead?.prev = newHead
        head = newHead
    }

    fun shift(): T? {
        val res = head?.value
        head = head?.next
        return res
    }

    private data class Element<T>(val value: T, var prev: Element<T>? = null, var next: Element<T>? = null)
}
