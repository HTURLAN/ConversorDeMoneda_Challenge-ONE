import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarApi {

    public ConversorMoneda nuevaConversion(String monedaLocal, String monedaConsulta, double cantidad){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a2a133a80e1af241f7f87e30/pair/"+ monedaLocal +
                "/" + monedaConsulta + "/"+ cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ConversorMoneda.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
