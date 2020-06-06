package extras;

import ramenshop.Pedido;

public abstract class Extras implements Pedido {
	
	@Override
	public String getDescricao() {
		return "Extras:";
	}
}
