package tiendaJuegos;

public class Purchase {

	private Customer cliente;
	private Game juego;
	private int quantity;
	private double totalprice;

	public Purchase(Customer cliente, Game juego, int quantity) {

		this.cliente = cliente;
		this.juego = juego;
		this.quantity = quantity;
		
		/*/Aquí calculo el precio total de la compra Cojo el precio 
		 * del juego y lo multiplico por la cantidad que se ha comprado, y lo guardo en precioTotal
		 */

		this.totalprice = juego.getPrice() * quantity;
	}

	public Customer getCliente() {
		return cliente;
	}

	public Game getJuego() {
		return juego;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getTotalprice() {
		return totalprice;
	}

	@Override
	public String toString() {
		return "Purchase{" + "cliente=" + cliente + ", juego=" + juego + ", cantidad=" + quantity + ", precioTotal="
				+ totalprice + '}';
	}

}
