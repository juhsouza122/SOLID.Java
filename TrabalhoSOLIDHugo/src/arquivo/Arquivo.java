package arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {

	BufferedWriter saida;
	
	public void openFile(String nomeArquivo){	
		
		try {
			saida = new BufferedWriter(new FileWriter(nomeArquivo, true));
		}
		catch (IOException excecao) {
			System.out.println("Erro na abertura do arquivo: " + excecao);
		}
	}
	
	public void outFile() {
		
		try {
			saida.close();
		}
		catch (IOException excecao) {
			System.out.println("Erro no fechamento do arquivo: " + excecao);	
		}
	}
	
	public void write(String textoEntrada) {
	
		try {
			saida.write(textoEntrada);
			saida.newLine();
		}
		catch (IOException excecao){
			System.out.println("Erro de entrada/saida " + excecao);
		}
	}
}
