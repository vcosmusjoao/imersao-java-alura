import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Items;
import pojo.Movie;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class Program {
    public static void main(String[] args) throws IOException, InterruptedException {
        String  url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        var client = HttpClient.newHttpClient();
        var uri = URI.create(url);
        var request = HttpRequest.newBuilder(uri).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String result = response.body();

        ObjectMapper mapper = new ObjectMapper();

        try {
           List<Movie> lista = mapper.readValue(result, Items.class).getItems();

            for(Movie x : lista){
                int round = Math.round(Float.parseFloat(x.getImdbRating()));
                for(int i=1; i<= round; i++){
                    System.out.print("\u2B50");
                }
                System.out.println();
                System.out.println("Classificação: "+x.getImdbRating());
                System.out.println("Title: "+x.getTitle());
                System.out.println("Poster:" +x.getImage());
                System.out.println();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
