package bebidas;

import ramenshop.Pedido;

public class OChaVerde extends Bebidas{
	
	private final Pedido pedido;
	
	public OChaVerde(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String getDescricao() {
		return pedido.getDescricao() + "\nO-Cha(verde) -------- +3.90";
	}
	
	@Override
	public double getPreco() {
		return pedido.getPreco() + 3.90;
	}
}
