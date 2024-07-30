

# Linked List Node


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# Create and Handle list operations


class LinkedList:
    def __init__(self):
        self.head = None  # Head of list

    # Method to reverse the list
    def reverse(self, head):

        # If head is empty or has reached the list end
        if head is None or head.next is None:
            return head

        # Reverse the rest list
        rest = self.reverse(head.next)

        # Put first element at the end
        head.next.next = head
        head.next = None

        # Fix the header pointer
        return rest

    # Returns the linked list in display format
    def __str__(self):
        linkedListStr = ""
        temp = self.head
        while temp:
            linkedListStr = (linkedListStr +
                             str(temp.data) + " ")
            temp = temp.next
        return linkedListStr

    # Pushes new data to the head of the list
    def push(self, data):
        temp = Node(data)
        temp.next = self.head
        self.head = temp


# Driver code
linkedList = LinkedList()
linkedList.push(20)
linkedList.push(4)
linkedList.push(15)
linkedList.push(85)

print("Given linked list")
print(linkedList)

linkedList.head = linkedList.reverse(linkedList.head)

print("Reversed linked list")
print(linkedList)


