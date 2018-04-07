package LinkedList;

/**
 * Perform 3 types of Node Insertion on LinkedList
 * 1. At Front
 * 2. After the given Node
 * 3. At the end
 * <p>
 * <p>
 * Created by ©Ameya on 4/6/2018 at 7:55 PM.
 */
public class LinkedListInsertion {

    InsertNode head;

    public static void main(String[] args) {
        LinkedListInsertion linkedList = new LinkedListInsertion();
        linkedList.insertAtFront(5);
        linkedList.insertAtFront(6);
        linkedList.insertAtFront(7);
        linkedList.insertAfter(6, 8);
        linkedList.insertAtEnd(9);
        linkedList.printList();

    }

    /**
     * Print all the nodes present in the linkedlist
     */
    private void printList() {
        InsertNode node = head;
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
            head = new InsertNode(data);
        } else {
            InsertNode prevNode = head;
            while (prevNode.data != prevNodeValue) {
                if (prevNode.nextNode == null) {
                    throw new NullPointerException("Given value not present in list");
                }
                prevNode = prevNode.nextNode;

            }
            InsertNode node = new InsertNode(data);
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
            head = new InsertNode(data);
        } else {
            InsertNode lastNode = head;
            while (lastNode.nextNode != null) {
                lastNode = lastNode.nextNode;
            }
            InsertNode node = new InsertNode(data);
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
            head = new InsertNode(data);
        } else {
            InsertNode node = new InsertNode(data);
            node.nextNode = head;
            head = node;
        }
    }

    class InsertNode {
        int data;
        InsertNode nextNode;

        public InsertNode(int data) {
            this.data = data;
            nextNode = null;
        }
    }


}
