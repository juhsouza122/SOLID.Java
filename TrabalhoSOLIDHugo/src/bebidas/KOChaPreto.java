package bebidas;

import ramenshop.Pedido;

public class KOChaPreto extends Bebidas{
	
	private final Pedido pedido;
	
	public KOChaPreto(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String getDescricao() {
		return pedido.getDescricao() + "\nKO-Cha(preto) --------- +0.00";
	}
	
	@Override
	public double getPreco() {
		return pedido.getPreco() + 0;
	}
}
