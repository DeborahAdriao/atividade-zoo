public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        zoo.adicionarAnimal(new Cachorro("Simba", 5, 15.0));
        zoo.adicionarAnimal(new Gato("Sírius", 3, 5.0));
        zoo.adicionarAnimal(new Passaro("Bartolomeu", 2, 0.5));
        zoo.adicionarAnimal(new Peixe("Peixe", 1, 0.1));
        zoo.adicionarAnimal(new Pato("Patolino", 4, 3.0));

        zoo.visitar();
    }
}
