package bebidas;

import ramenshop.Pedido;

public class Refrigerante extends Bebidas {
	
	private final Pedido pedido;
	
	public Refrigerante(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String getDescricao() {
		return pedido.getDescricao() + "\nRefrigerante -------- +5.90";
	}
	
	@Override
	public double getPreco() {
		return pedido.getPreco() + 5.90;
	}
}
