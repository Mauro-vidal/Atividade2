import java.util.ArrayList;
import java.util.Date;

public class Album {

  private String nome;
  private Date anoLancamento;
  private ArrayList<Musica> musicas;


  public Album(String nome, Date anoLancamento, ArrayList<Musica> musicas) {

      this.nome = nome;
      this.anoLancamento = anoLancamento;
      this.musicas = musicas;

  }

  public String getNome(){
      return nome;
  }

  public Date getAnoLancamento(){
      return anoLancamento;
  }

  public ArrayList<Musica> getMusicas(){
      return musicas;
  }

    @Override
    public String toString() {
        return "Album{" +
                "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", musicas=" + musicas +
                '}';
    }
}
