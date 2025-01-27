package collection.list;

public class MyLinkedList<E> implements MyList<E> {

    private Node<E> first;
    
    // 5. 컬렉션프레임워크 6페이지 부터
    private int size = 0;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void add(E e) {

    }

    @Override
    public void add(int index, E e) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(E o) {
        return 0;
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {

            StringBuilder sb = new StringBuilder();
            Node<E> temp = this;
            sb.append("[");
            while (temp != null) {
                sb.append(temp.item);
                if (temp.next != null) {
                    sb.append("->");
                }
                temp = temp.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
