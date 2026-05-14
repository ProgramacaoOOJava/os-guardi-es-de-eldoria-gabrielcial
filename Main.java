import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando Instancias / Objetos
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
        Guerreiro arthus = new Guerreiro("Arthus", "Guerreiro", 1, 100, 10.5, 8.0);
        Mago morgana = new Mago("Morgana", "Arqueira", 5, 80, 12.5, 10.0);
        Guerreiro borin = new Guerreiro("Borin", "Guerreiro", 1, 100, 10.5, 8.0);
        Mago elara = new Mago("Elara", "Arqueira", 5, 80, 12.5, 10.0);


        // Criando Grupos
        Grupo grupoA = new Grupo("Os Vingadores");
        Grupo grupoB = new Grupo("Thunderbolts");
        grupoA.adicionarMembro(arthus);
        grupoA.adicionarMembro(elara);
        grupoB.adicionarMembro(borin);
        grupoB.adicionarMembro(morgana);


        // Exibindo Status
        System.out.println("--- Guerreiro ---");
        arthus.exibirStatus();
        System.out.println("--- Mago ---");
        morgana.exibirStatus();

        // Usando Habilidades Especiais
        System.out.println("--- Guerreiro ---");
        arthus.usarHabilidadeEspecial();
        System.out.println("--- Mago ---");
        morgana.usarHabilidadeEspecial();


        // Polimorfismo
        System.out.println("\n----- Demo de Polimorfismo -----");
        List<Personagem> herois = new ArrayList<>();
        herois.add(arthus);
        herois.add(morgana);


        herois.add(new Guerreiro("Borin", "Arqueiro", 3, 120, 10.0, 6.0));


        for (Personagem p : herois) {
            p.exibirStatus();
            p.usarHabilidadeEspecial();
            System.out.println("--------------------------");
        }

        System.out.println("\n ----- Batalha interna (apenas para demonstração) ----");
        grupoA.batalhar(grupoA.getMembros().get(0), grupoA.getMembros().get(1));
    }
}
