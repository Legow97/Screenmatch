package com.alura.screenmatch.principal;

import com.alura.screenmatch.calculos.TitleOmdb;
import com.alura.screenmatch.exception.ErrorConversionDurationException;
import com.alura.screenmatch.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        List<Title> titles = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(true){
            try{
                System.out.println("Escriba el nombre de la película: ");
                var search = scanner.nextLine();

                if(search.equals("salir")){
                    break;
                }

                String direction = "https://www.omdbapi.com/?t="+
                        search.replace(" ", "+")+
                        "&apikey=d4d0bf92";
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direction))
                        .build();

                HttpResponse<String> response = client
                        .send(request,HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(myTitleOmdb);


                Title myTitle = new Title(myTitleOmdb);
                System.out.println("Titulo convertido: "+myTitle);

                FileWriter writer = new FileWriter("peliculas.txt");
                writer.write(myTitle.toString());
                writer.close();

                titles.add(myTitle);

            }catch (NumberFormatException e){
                System.out.println("Ocurrió un error");
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("Error en la URI, verifique la dirección");
                System.out.println(e.getMessage());
            }catch (ErrorConversionDurationException e){
                System.out.println(e.getMessage());
            }
        }


        System.out.println(titles);

        FileWriter writer = new FileWriter("titulos.json");
        writer.write(gson.toJson(titles));
        writer.close();

        System.out.println("Finalizó la ejecución del programa");

    }

}
