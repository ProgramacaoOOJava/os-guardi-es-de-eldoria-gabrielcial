import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nomeDoGrupo;
    private List<Personagem> membros;

    public Grupo(String nomeDoGrupo) {
        this.nomeDoGrupo = nomeDoGrupo;
        this.membros = new ArrayList<>();
    }

    public String getNomeDoGrupo() {
        return nomeDoGrupo;
    }

    public void adicionarMembro(Personagem personagem) {
        membros.add(personagem);
        System.out.println(personagem.getNome() + " foi adicionado ao grupo"); 
    }

    public void listarMembros() {
        System.out.println("----------MEMBROS DO GRUPOR " + nomeDoGrupo + " ----------");

        for (Personagem membro : membros) {
            System.out.println(membro.getNome());
        }

        System.out.println("----------------");
    }

    public void batalhar(Personagem p1, Personagem p2) {
        System.out.println("----------INICIO DA BATALHA----------");

         double poderTotalP1 = p1.calcularPoderTotal();
        double poderTotalP2 = p2.calcularPoderTotal();

        System.out.println(
            p1.getNome() + " Poder Total: " + 
            String.format("%.2f", poderTotalP1)
        );

        System.out.println(
            p2.getNome() + " Poder Total: " + 
            String.format("%.2f", poderTotalP2)
        );

        if (poderTotalP1 > poderTotalP2) {
            System.out.println(p1.getNome() + " venceu a batalha!");
        } else if (poderTotalP1 < poderTotalP2) {
            System.out.println(p2.getNome() + " venceu a batalha!");
        } else {
            System.out.println("A batalha terminou empatada!");
        }

    
        System.out.println("----------FIM DA BATALHA----------");
    }

    public List<Personagem> getMembros() {
        return membros;
    }
}
