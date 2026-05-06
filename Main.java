public class Main {
    public static void main(String[] args) {
        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 10.5);
        Personagem heroi2 = new Personagem("Arthemis", "Arqueira", 5, 80, 12.5);
        heroi1.exibirStatus();
        heroi2.exibirStatus();
    }
}
