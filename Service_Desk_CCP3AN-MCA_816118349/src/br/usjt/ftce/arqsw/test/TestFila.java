package br.usjt.ftce.arqsw.test;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.ftce.arqsw.entity.Fila;
import br.usjt.ftce.arqsw.service.FilaService;

public class TestFila {
	
	public static void main(String[] args) {
		FilaService service = new FilaService();
		try {
			ArrayList<Fila> filas = service.listarFilas();
			for(Fila fila:filas) {
				System.out.println(fila);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
