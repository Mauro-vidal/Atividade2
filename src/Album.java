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

    //    @Override
    //    public String toString() {
    //      return "Album{" +
    //                "nome='" + nome + '\'' +
    //                ", anoLancamento=" + anoLancamento +
    //                ", musicas=" + musicas +
    //                '}';
    //    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Album{");
        sb.append("nome='").append(nome).append("', ");
        sb.append("anoLancamento=").append(anoLancamento).append(", ");
        sb.append("musicas=[");
        for (Musica musica : musicas) {
            sb.append(musica.getNome()).append(", ");
        }
        if (!musicas.isEmpty()) {
            sb.setLength(sb.length() - 2); // Remove a última vírgula e espaço
        }
        sb.append("]}");
        return sb.toString();
    }

}
