public class Node {

    String text;
    Node next;

    public Node(String s) {
        text = s;
    }

    public void addString(String s){
        text = s;
    }

    public void pointToNode(Node n){
        next = n;
    }

    public String toString(){
        return text;
    }



}
