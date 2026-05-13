public class Mago extends Personagem {
    double inteligencia;


    public Mago(String nome, String classe, int nivel, int pontosDeVida, double poderBase, double inteligencia) {
        super(nome, classe, nivel, pontosDeVida, poderBase);
        this.inteligencia = inteligencia;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Plim: -"+ inteligencia + " de restauração");
    }





}