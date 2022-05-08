public class NodeService<T> {
    public  Node<T> reverse(Node<T> node){
        Node<T> current = node.getNext();
        node.setNext(null);
        Node<T> next;
        while (current != null) {
            next = current.getNext();
            current.setNext(node);
            node = current;
            current = next;
        }
        return node;
    }
}
