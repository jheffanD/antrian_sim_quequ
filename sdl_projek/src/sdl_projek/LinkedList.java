package sdl_projek;

public class LinkedList<E> {

    private ListNode header;
    private int size;

    public LinkedList() {
        header = new ListNode();
        header.next = header;
        header.previous = header;
        size = 0;
    }

    public LinkedList(int size) {
        this.size = size;
    }

    public LinkedList(ListNode header, int size) {
        this.header = header;
        this.size = size;
    }

    private void addBefore(E x, ListNode bantu) {
        ListNode baru = new ListNode(x);
        baru.next = bantu;
        baru.previous = bantu.previous;
        bantu.previous.next = baru;
        bantu.previous = baru;
        size++;
    }

    public E remove(ListNode bantu) {
        bantu.previous.next = bantu.next;
        bantu.next.previous = bantu.previous;
        size--;
        return (E) bantu.elemen;
    }

    public void addFirst(E x) {
        addBefore(x, header.next);
    }

    public void addLast(E x) {
        addBefore(x, header);
    }

    public E removeFirst() {
        return remove(header.next);
    }

    public E removeLast() {
        return remove(header.previous);
    }

    public boolean isEmpty() {
        if (header == header.next) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String temp = "";

        ListNode bantu = header.next;
        while (bantu != header) {
            temp = temp + bantu.elemen + " \n";
            bantu = bantu.next;
        }
        return temp;
    }

    public ListNode Search(E x) {
        ListNode bantu = header.next;

        while (bantu != header) {
            if (((Comparable) bantu.elemen).compareTo(x) == 0) {
                return bantu;

            } else {
                bantu = bantu.next;
            }

        }
        return null;
    }

    public int size() {
        return size;
    }

}
