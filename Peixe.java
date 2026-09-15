public class Peixe extends Animal implements Nadador {
    public Peixe(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() { System.out.println(getNome() + " faz: glub glub!"); }

    @Override
    public void mover() { System.out.println(getNome() + " se move nadando."); }

    @Override
    public void nadar() { System.out.println(getNome() + " nada no aquário."); }
}