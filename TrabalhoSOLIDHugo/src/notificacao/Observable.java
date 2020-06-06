package notificacao;

import java.util.ArrayList;
import java.util.List;

import ramenshop.Pedido;
import arquivo.Arquivo;

public class Observable implements Pedido {
	private static int cont = 0;
	private int numeroPedido;
	private int index = 0;
	private final Pedido pedido;

	private List<Observer> observers = new ArrayList<Observer>();
	
	public Observable(Pedido pedido) {
		cont++;
		this.pedido = pedido;
		this.numeroPedido = cont;
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int ob) {
		this.index = ob;
		
		if(ob == 1) {
			notificacao();
		}else if(ob == 2) {
			enviaArquivo();
		}else {
			System.out.println("Pedido inválido!!");
		}
	}
	
	public int getNumeroPedido() {
		return numeroPedido;
	}
	
	public void adicionarPedido(Observer observer) {
		observers.add(observer);
	}
	
	public void notificacao() {
		for (Observer ob : observers) {
			ob.update();
		}
	}

	private void enviaArquivo() {
		Arquivo arquivo = new Arquivo();
		arquivo.openFile("arquivo.txt");
		arquivo.write(pedido.getDescricao());
		arquivo.write("Preço total: " + pedido.getPreco());
		arquivo.outFile();
		
	}
	
	@Override
	public double getPreco() {
		return pedido.getPreco();
	}

	@Override
	public String getDescricao() {
		return "Numero do seu pedido: " + numeroPedido + ":" + pedido.getDescricao();
	}
}
