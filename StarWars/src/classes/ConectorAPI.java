/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Miguel Matul <https://github.com/MigueMat4>
 */
public class ConectorAPI {
    private static String STARWARS_API_URL;
    
    public ConectorAPI(){
        STARWARS_API_URL = "https://swapi.py4e.com/api/people/";
    }
        
    public Personaje buscarPersonaje() throws IOException, InterruptedException{
        int aleatorio = (int) Math.floor(Math.random() * 88 + 1);
        System.out.println("Conectando a la API...");
        // código para conectarse a la API y descargar los datos.
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .header("Accept", "application/json")
                    .uri(URI.create(STARWARS_API_URL+String.valueOf(aleatorio)+"/"))
                    .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("¡Conexión exitosa! Descargando datos...");
        ObjectMapper mapper = new ObjectMapper();
        // obtener los datos del pokémon en el objeto correspondiente
        return mapper.readValue(response.body(), Personaje.class);
    }
}
