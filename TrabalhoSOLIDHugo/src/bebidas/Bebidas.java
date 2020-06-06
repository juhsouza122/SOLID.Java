package bebidas;

import ramenshop.Pedido;

public abstract class Bebidas implements Pedido{
	
	@Override
	public String getDescricao() {
		return "Bebidas:";
	}
}
