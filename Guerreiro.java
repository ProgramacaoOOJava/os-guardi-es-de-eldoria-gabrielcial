public class Guerreiro extends Personagem {
    double forca;


    public Guerreiro(String nome, String classe, int nivel, int pontosDeVida, double poderBase, double forca) {
        super(nome, classe, nivel, pontosDeVida, poderBase);
        this.forca = forca;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Pow: -"+ forca + " de dano");
    }





}