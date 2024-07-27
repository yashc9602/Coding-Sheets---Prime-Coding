class Node:
    def __init__(self, val=0, next=None, random=None):
        self.val = val
        self.next = next
        self.random = random

def cloneLinkedList(head):
    if not head:
        return None
    
    # Step 1: Create new nodes and insert them next to original nodes
    curr = head
    while curr:
        new_node = Node(curr.val)
        new_node.next = curr.next
        curr.next = new_node
        curr = new_node.next
    
    # Step 2: Copy random pointers
    curr = head
    while curr:
        if curr.random:
            curr.next.random = curr.random.next
        curr = curr.next.next
    
    # Step 3: Separate the copied list from the original list
    curr = head
    new_head = head.next
    while curr:
        copy = curr.next
        curr.next = copy.next
        if copy.next:
            copy.next = copy.next.next
        curr = curr.next
    
    return new_head

# Test Case 1
# Input: 1 -> 2 -> 3 with random pointers: 1.random -> 3, 2.random -> 1, 3.random -> 2
head = Node(1)
head.next = Node(2)
head.next.next = Node(3)
head.random = head.next.next
head.next.random = head
head.next.next.random = head.next

cloned_head = cloneLinkedList(head)
# Now cloned_head should be the head of the cloned list with appropriate random pointers.
