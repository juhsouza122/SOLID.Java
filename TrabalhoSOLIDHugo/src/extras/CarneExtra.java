package extras;

import ramenshop.Pedido;

public class CarneExtra extends Extras{

	private final Pedido pedido;
	
	public CarneExtra(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String getDescricao() {
		return pedido.getDescricao() + "\nCarne Extra -------- +4.00";
	}
	
	@Override
	public double getPreco() {
		return pedido.getPreco() + 4;
	}
}
