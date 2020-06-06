package carne;

import ramenshop.Pedido;

public abstract class Carne implements Pedido{
	
	@Override
	public String getDescricao() {
		return "Carne:";
	}
}
