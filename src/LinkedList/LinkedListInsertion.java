package LinkedList;

/**
 * Perform 3 types of Node Insertion on LinkedList and Deletion
 * 1. At Front
 * 2. After the given Node
 * 3. At the end
 * <p>
 * <p>
 * Created by ©Ameya on 4/6/2018 at 7:55 PM.
 */
public class LinkedListInsertion {

    //Head of the linked list
    node head;

    public static void main(String[] args) {
        LinkedListInsertion linkedList = new LinkedListInsertion();
        linkedList.insertAtFront(5);
        linkedList.insertAtFront(6);
        linkedList.insertAtFront(7);
        linkedList.insertAtFront(7);
        linkedList.insertAfter(6, 8);
        linkedList.insertAtEnd(9);
        linkedList.insertAtEnd(9);
        linkedList.insertAtEnd(9);
        linkedList.printList();
        linkedList.deleteNode(6);
        System.out.println();
        linkedList.printList();
        linkedList.findMiddleElement();
    }

    private void findMiddleElement() {
        int count = 0;
        node traverseNode1 = head, traverseNode2 = head;
        while (traverseNode1 != null && traverseNode1.nextNode != null) {
            traverseNode1 = traverseNode1.nextNode.nextNode;
            traverseNode2 = traverseNode2.nextNode;
            count++;
        }
        System.out.println("The middle element is at index :-" + count);
    }

    /**
     * Delete the node having a particular value
     *
     * @param deleteValue to be deleted
     */

    private void deleteNode(int deleteValue) {
        if (head != null) {
            node node = head;
            LinkedListInsertion.node prevNode = head;
            while (node.data != deleteValue) {
                prevNode = node;
                node = node.nextNode;
            }
            prevNode.nextNode = node.nextNode;
        }
    }

    /**
     * Print all the nodes present in the linkedlist
     */
    private void printList() {
        node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.nextNode;
        }
    }

    /**
     * Insert the element after the provided node
     *
     * @param prevNodeValue value after which the node is to be inserted
     * @param data          value of the new node
     */
    private void insertAfter(int prevNodeValue, int data) {
        if (head == null) {
            head = new node(data);
        } else {
            node prevNode = head;
            while (prevNode.data != prevNodeValue) {
                if (prevNode.nextNode == null) {
                    throw new NullPointerException("Given value not present in list");
                }
                prevNode = prevNode.nextNode;

            }
            node node = new node(data);
            node.nextNode = prevNode.nextNode;
            prevNode.nextNode = node;
        }
    }

    /**
     * Insert the new node at the end of the linkedlist
     *
     * @param data value of the new node
     */
    private void insertAtEnd(int data) {
        if (head == null) {
            head = new node(data);
        } else {
            node lastNode = head;
            while (lastNode.nextNode != null) {
                lastNode = lastNode.nextNode;
            }
            node node = new node(data);
            lastNode.nextNode = node;
        }

    }

    /**
     * Insert the new node at the front of the linkedlist
     *
     * @param data value of the data
     */
    private void insertAtFront(int data) {

        if (head == null) {
            head = new node(data);
        } else {
            node node = new node(data);
            node.nextNode = head;
            head = node;
        }
    }

    class node {
        int data;
        node nextNode;

        public node(int data) {
            this.data = data;
            nextNode = null;
        }
    }


}
