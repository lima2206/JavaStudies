package br.com.lima.screenmatch;

import br.com.lima.screenmatch.model.DataSerial;
import br.com.lima.screenmatch.service.APIConsumer;
import br.com.lima.screenmatch.service.ConvertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String endereco = "https://www.omdbapi.com/?apikey=981b18fe&t=Breaking+Bad";

		var apiConsumer = new APIConsumer();

		var json = apiConsumer.obterDados(endereco);

		ConvertData converser = new ConvertData();

		DataSerial data = converser.getData(json, DataSerial.class);

		System.out.println(data);

	}
}
