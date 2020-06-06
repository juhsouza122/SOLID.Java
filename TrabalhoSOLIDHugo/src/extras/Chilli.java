package extras;

import ramenshop.Pedido;

public class Chilli extends Extras{

	private final Pedido pedido;
	
	public Chilli(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String getDescricao() {
		return pedido.getDescricao() + "\nChilli -------- +2.50";
	}
	
	@Override
	public double getPreco() {
		return pedido.getPreco() + 2.50;
	}
}
