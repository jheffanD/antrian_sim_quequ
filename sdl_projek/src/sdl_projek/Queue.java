package sdl_projek;

public class Queue<E> {

    LinkedList<E> antrian;

    public Queue() {
        antrian = new LinkedList();
    }

    public void enqueue(E elemen) {
        antrian.addLast(elemen);
    }

    public E dequeue() {
        return antrian.removeFirst();
    }

    public int Sise() {
        return antrian.size();
    }

    public boolean isEmpty() {
        return antrian.isEmpty();
    }

    public String cetak() {
        return antrian.toString();
    }

    public Object Search(E x) {
        return antrian.Search(x).elemen;
    }
}
