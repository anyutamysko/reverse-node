public class Main {
    public static final int listSize = 10;
    public static final String nodeValue = "node";
    public static void main(String[] args) {
        Node<String> node = addNode(listSize);
        System.out.println(node);
        NodeService<String> nodeService = new NodeService<>();
        System.out.println(nodeService.reverse(node));
    }

    public static Node<String> addNode(int size) {
        Node<String> first = new Node<>(nodeValue + 1, null);
        Node<String> node = first;
        for (int i = 2; i <= size; i++) {
            node.setNext(new Node<>(nodeValue + i, null));
            node = node.getNext();
        }
        return first;
    }
}
