import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void visitar() {
        System.out.println("--- Visitando os Animais ---");
        for (Animal a : animais) {
            a.emitirSom();
            a.mover();
            System.out.println("-");
        }
    }
}