public class Nodo {
    private Computer value;
    public Nodo next;

    public Nodo(Computer value) {
        this.value = value;
        this.next = null;
    }

    public Nodo() {
        this.value = null;
        this.next = null;
    }

    public Computer getValue() {
        return value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public void setValue(Computer value) {
        this.value = value;
    }

    public String toString() {
        return "Nodo[ value: " + value + ", next: " + next +" ]";
    }



}
