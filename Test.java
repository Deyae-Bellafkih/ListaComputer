public class Test {
    public void main(String[] args){

        Lista lista = new Lista();

        Computer c1 = new Computer("HP", "i5", 8);
        Computer c2 = new Computer("Dell", "i7", 16);
        Computer c3 = new Computer("Lenovo", "i6", 8);

        lista.inserimentoOrdineRAM(c1);
        lista.inserimentoOrdineRAM(c2);
        lista.inserimentoOrdineRAM(c3);

        lista.stampa();
    }
}
