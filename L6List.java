class LinkedList{
    private IntNode head; // Head of the list

    // Node class
    private class IntNode{ // add static
        // Feilds
        int data; // Data part of the node
        IntNode pointer;  // Reference to the next node

        // Constructor
        public IntNode(int nodeData){
            this.data = nodeData;
            this.pointer = null;
        }
    }

    // Method to add a node at the end
    public void add(int nodeData){
        IntNode newNode = new IntNode(nodeData);
        if (head == null){
            head = newNode;
        } else {
            IntNode currentNode = head;
            while (currentNode.pointer != null){
                currentNode = currentNode.pointer;
            }
            currentNode.pointer = newNode;
        }
    }

    // Method to remove a node by value
    public void remove(int nodeData){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }

        // Tranverse the list to find the node containing the value
        IntNode currentNode = head;
        while (currentNode != null){
            if (currentNode.pointer.data == nodeData){
                currentNode.pointer = currentNode.pointer.pointer;
                return;
            }
            currentNode = currentNode.pointer;
        }
        System.out.println("Value Not Found");
        return;
    }

    // Replace by value set(int index, int element)
    // 1. Check for Empty list
    // 2. Tranverse the list
    // 3. Replace the value
    // 4. Handle Value "Not Found"

    // Print value given position n
    // 1. Check whether it is out of range or invalid value
    // 2. Tranverse the list n times for loop
    // 3. print currentNode.data

    public void printList(){
        IntNode currentNode = head;
        System.out.print("[");
        while (currentNode != null){
            System.out.print(currentNode.data + ", ");
            currentNode = currentNode.pointer;
        }
        System.out.print("null");
        System.out.println("]");
    }
}

public class L6List{
    // IntNode Node1 = [ 10 | Node3 ]
    // IntNode Node2 = [ 20 | * ]
    // IntNode Node3 = [x, null]

    /*
    What is a Linked Structure?

        A data structure where elements (nodes) are linked using references (pointers).
        Each node contains:
            Data (the element being stored).
            A reference (or pointer) to the next node.

        {10, 20, 30}
        [ 10 | * ] -> [ 20 | * ] -> [ 30 | null ]

        Disadvantages
            Accessing elements takes linear time O(n).
            Uses extra memory for storing pointers.

        Advantages of Linked Structures

            Dynamic size (no need for fixed array size).
            Efficient insertion and deletion (no shifting of elements like arrays).
    */
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.printList();
        a.remove(20);
        a.printList();
    }
}