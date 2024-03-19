import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<Musica> musicas = new ArrayList<>();

        musicas.add(new Musica("Good Vibe"));
        musicas.add(new Musica("Ilusão"));
        musicas.add(new Musica("O preço"));
        musicas.add(new Musica("Iluminado"));
        musicas.add(new Musica("life"));


        Date anoLancamento = new Date(2024, 6, 9);

        Album album = new Album("Caminhos", anoLancamento, musicas);
        System.out.println(album);

    }
}