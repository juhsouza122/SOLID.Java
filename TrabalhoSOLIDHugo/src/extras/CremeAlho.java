package extras;

import ramenshop.Pedido;

public class CremeAlho extends Extras{
	
	private final Pedido pedido;
	
	public CremeAlho(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String getDescricao() {
		return pedido.getDescricao() + "\nCréme Alho -------- +1.50";
	}
	
	@Override
	public double getPreco() {
		return pedido.getPreco() + 1.50;
	}
}
