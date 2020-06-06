package notificacao;

public class Cliente extends Observer{

	public Cliente(Observable pedido) {
		this.pedido = (Observable) pedido;
		this.pedido.adicionarPedido(this);
	}
	
	@Override
	public void update() {
			System.out.println("Pedido Pronto!!" + pedido);
	}
	
	
	
}
