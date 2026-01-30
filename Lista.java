public class Lista {
    private int size;
    private Nodo head;
    private Nodo cursor;

    public Lista() {
        this.size = 0;
        this.head = null;
        this.cursor = null;
    }

    public int getSize() {
        return size;
    }

    public Nodo getHead() {
        return head;
    }

    public Nodo getCursor() {
        return cursor;
    }

    public void setCursor(Nodo cursor) {
        this.cursor = cursor;
    }

    public void inserimento(Computer value, int index) {
        Nodo newNode = new Nodo();
        newNode.setValue(value);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Nodo current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
        }
        size++;
    }

    public void eliminazione(int index) {
        if (index == 0) {
            head = head.getNext();
        } else {
            Nodo current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        size++;
    }

    public void accoda(Computer value) {
        Nodo newNode = new Nodo(value);
        newNode.setNext(null);

        if (head == null) {
            head = newNode;
        } else {
            Nodo current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public void visita() {
        if (cursor != null) {
            Computer value = cursor.getValue();
            cursor = cursor.getNext();
        }
    }

    public int ricerca (Computer value) {
        Nodo current = head;
        int index = 0;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    public void eliminaValore(Computer value) {
        while (head != null && head.getValue().equals(value)) {
            head = head.getNext();
            size--;
        }
        Nodo current = head;
        while (current != null && current.getNext() != null) {
            if (current.getNext().getValue().equals(value)) {
                current.setNext(current.getNext().getNext());
                size--;
            } else {
                current = current.getNext();
            }
        }
    }

    public void inserimentoOrdineRAM (Computer value) {
        if (head == null) {
            accoda(value);
            return;
        }

        if (value.compareTo(head.getValue()) <= 0) {
            inserimento(value, 0);
            return;
        }

        Nodo current = head;
        int index = 0;

        while (current.getNext() != null &&
                value.compareTo(current.getNext().getValue()) > 0) {
            current = current.getNext();
            index++;
        }

        inserimento(value, index + 1);
    }

    public String toString() {
        return "Lista{ size = " + size + ", head = " + head + ", cursor = " + cursor + " }";
    }
}
