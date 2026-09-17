package tiendaJuegos;

public class Game {

	private static int contador = 0;

	private int id;
	private String title;
	private Genre genre;
	private double price;
	private int stock;

	public Game(String title, Genre genre, double price, int stock) {
		contador++;
		this.id = contador;

		this.title = title;
		this.genre = genre;
		this.price = price;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Genre getGenre() {
		return genre;
	}

	public double getPrice() {
		return price;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void aumentarStock(int cantidad) {
		this.stock = this.stock + cantidad;
	}

	
	//recordar que me falta validar que el stock no sea menor que 0 (no se hacerlo por ahora)
	public void reducirStock(int cantidad) {
		this.stock = this.stock-cantidad;
	}

	public boolean hayUnidadesDisponibles() {
		boolean resultado;
		if (stock > 0) {
			resultado=true;
		}else 
			resultado=false;
		return resultado;
	}

	@Override
	public String toString() {
		return "Game{" + "id=" + id + ", title='" + title + '\'' + ", genre=" + genre + ", price=" + price + ", stock="
				+ stock + '}';
	}

}
