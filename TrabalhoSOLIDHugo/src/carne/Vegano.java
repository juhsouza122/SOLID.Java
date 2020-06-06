package carne;

import ramenshop.Pedido;

public class Vegano extends Carne{
	
	private final Pedido pedido;
	
	public Vegano(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String getDescricao() {
		return pedido.getDescricao() + "\nVegano -------- +3.90";
	}
	
	@Override
	public double getPreco() {
		return pedido.getPreco() + 3.90;
	}
}
