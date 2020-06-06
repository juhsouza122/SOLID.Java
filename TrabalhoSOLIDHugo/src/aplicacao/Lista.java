package aplicacao;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import notificacao.Cliente;
import notificacao.Observable;

public class Lista {
	private static Lista listaPedidos = new Lista();
	private static List<Observable> pedidos = new ArrayList<Observable>();
	
	private Lista() {
		super();
	}

	public static Lista getInstance() {
		return listaPedidos;
	}
	
	public void setPedido(Observable pedido) {
		pedidos.add(pedido);
		new Cliente(pedido);
		System.out.println("Número do seu pedido: " + pedido.getNumeroPedido() + " assim que estiver pronto avisaremos");
	}
	
	public List<Observable> getList(){
    	return pedidos;
    }
	
	public Observable buscarPedido(int numeroPedido) {
    	for(Observable pedido : getInstance().getList()) {
    		if (numeroPedido == pedido.getNumeroPedido())
    			return pedido;
    	}
    	return null;
    }
	
}
