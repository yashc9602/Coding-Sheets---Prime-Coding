#include <iostream>
using namespace std;

class Node {
public:
    int val;
    Node* next;
    Node* random;

    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};

Node* cloneLinkedList(Node* head) {
    if (!head) return NULL;

    // Step 1: Create new nodes and insert them next to original nodes
    Node* curr = head;
    while (curr) {
        Node* new_node = new Node(curr->val);
        new_node->next = curr->next;
        curr->next = new_node;
        curr = new_node->next;
    }

    // Step 2: Copy random pointers
    curr = head;
    while (curr) {
        if (curr->random) {
            curr->next->random = curr->random->next;
        }
        curr = curr->next->next;
    }

    // Step 3: Separate the copied list from the original list
    curr = head;
    Node* new_head = head->next;
    while (curr) {
        Node* copy = curr->next;
        curr->next = copy->next;
        if (copy->next) {
            copy->next = copy->next->next;
        }
        curr = curr->next;
    }

    return new_head;
}

int main() {
    // Test Case 1
    Node* head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(3);
    head->random = head->next->next;
    head->next->random = head;
    head->next->next->random = head->next;

    Node* cloned_head = cloneLinkedList(head);
    // Now cloned_head should be the head of the cloned list with appropriate random pointers.
    return 0;
}
