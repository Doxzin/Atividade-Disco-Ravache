import java.util.List;

public class Artista {
    private String nome;
    private String genero;
    private List<Disco> discos;

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDiscos(List<Disco> discos) {
        this.discos = discos;
    }
}
