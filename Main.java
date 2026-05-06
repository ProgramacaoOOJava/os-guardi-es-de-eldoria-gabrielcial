public class Main {
    public static void main(String[] args) {
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 10.5);
        Personagem heroi2 = new Personagem("Arthemis", "Arqueira", 5, 80, 12.5);
        System.out.println("--- Herói 1 ---");
        heroi1.exibirStatus();
        System.out.println("--- Herói 2 ---");
        heroi2.exibirStatus();
    }
}
