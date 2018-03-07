package br.usjt.ftce.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.ftce.arqsw.dao.FilaDAO;
import br.usjt.ftce.arqsw.entity.Fila;

public class FilaService {
private FilaDAO dao;
	
	public FilaService() {
		dao = new FilaDAO();
	}
	
	public ArrayList<Fila> listarFilas() throws IOException{
		return dao.listarFilas();
	}
	
	public Fila carregar(int id) throws IOException{
		return null;
	}

}
