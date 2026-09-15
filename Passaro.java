public class Passaro extends Animal implements Voador {
    public Passaro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() { System.out.println(getNome() + " faz: piu piu!"); }

    @Override
    public void mover() { voar(); }

    @Override
    public void voar() { System.out.println(getNome() + " voa com suas asas."); }
}