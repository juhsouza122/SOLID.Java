package extras;

import ramenshop.Pedido;

public class Tofu extends Extras{
	
	private final Pedido pedido;
	
	public Tofu(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String getDescricao() {
		return pedido.getDescricao() + "\nTofu -------- +2.70";
	}
	
	@Override
	public double getPreco() {
		return pedido.getPreco() + 2.70;
	}
}
