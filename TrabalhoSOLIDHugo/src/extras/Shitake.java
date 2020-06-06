package extras;

import ramenshop.Pedido;

public class Shitake extends Extras{

	private final Pedido pedido;
	
	public Shitake(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String getDescricao() {
		return pedido.getDescricao() + "\nShitake -------- +6.90";
	}
	
	@Override
	public double getPreco() {
		return pedido.getPreco() + 6.90;
	}
}
