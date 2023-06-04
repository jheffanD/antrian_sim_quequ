package sdl_projek;

public class ListNode <E> {

     E elemen;
     ListNode next;
     ListNode previous;

    public ListNode(E elemen, ListNode next, ListNode previous) {
        this.elemen = elemen;
        this.next = next;
        this.previous = previous;
    }

    public ListNode(E elemen) {
        this.elemen = elemen;
    }

    public ListNode() {
    }
}
