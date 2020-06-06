package notificacao;

public abstract class Observer {
	protected Observable pedido;

	public abstract void update();
}
