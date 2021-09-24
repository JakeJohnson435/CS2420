public class LinkedList {

    Node start;


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.start = new Node("World!");

        Node newNode = new Node("Hello");

        list.addToFront(newNode);

        list.print();


    }

    public void addToFront(Node n) {

        n.pointToNode(start);
        start = n;

    }

    public void removeFromNode(){

    }

    public void print(){
        Node temp = start;
        while (temp != null){
            System.out.print(temp.text + " ");
            temp = temp.next;
        }
    }

}
