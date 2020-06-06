package extras;

import ramenshop.Pedido;

public class Croutons extends Extras{

	private final Pedido pedido;
	
	public Croutons(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String getDescricao() {
		return pedido.getDescricao() + "\nCroutons -------- +2.00";
	}
	
	@Override
	public double getPreco() {
		return pedido.getPreco() + 2;
	}
}
