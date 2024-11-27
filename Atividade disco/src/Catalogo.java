import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Disco> discos;
    
    public Catalogo() {
        this.discos = new ArrayList<>();
    }
    public void adicionarDisco(Disco disco) {
        discos.add(disco);
        System.out.println("Disco adicionado: " + disco.getTitulo());
    }
    
    public void listarDiscos() {
        if (discos.isEmpty()) {
            System.out.println("Nenhum disco cadastrado.");
            return;
        }

        System.out.println("\n--- Discos Cadastrados ---");
        for (int i = 0; i < discos.size(); i++) {
            Disco disco = discos.get(i);
            System.out.println((i + 1) + ". " + disco.getTitulo() + " (Ano: " + disco.getAnoLancamento() + ")");
            if (disco.getArtista() != null) {
                System.out.println("   Artista: " + disco.getArtista().getNome());
            }
            if (disco.getFaixas() != null && !disco.getFaixas().isEmpty()) {
                System.out.println("   Faixas:");
                for (Faixa faixa : disco.getFaixas()) {
                    System.out.println("     * " + faixa.getNome() + " (" + faixa.getDuracao() + "s)");
                }
            }
        }
    }
}
