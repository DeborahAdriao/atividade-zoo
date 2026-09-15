public class Pato extends Animal implements Voador, Nadador {
    public Pato(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() { System.out.println(getNome() + " faz: quack quack!"); }

    @Override
    public void mover() { System.out.println(getNome() + " anda com suas patas."); }

    @Override
    public void voar() { System.out.println(getNome() + " voa em bando."); }

    @Override
    public void nadar() { System.out.println(getNome() + " nada no lago."); }
}
