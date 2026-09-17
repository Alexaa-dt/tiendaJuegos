package tiendaJuegos;

public class Customer {
	
	// no he usado excepciones aqui, acordar implementarlas

	private static int contador = 0;

	private int id;
	private String nombre;
	private double saldo;

	public Customer(String nombre, double saldo) {
		contador++;
		this.id = contador;
		this.nombre = nombre;

		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			this.saldo = 0;
		}
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public double consultarSaldo() {
		return saldo;
	}

	public void añadirSaldo(double cantidad) {
		if (cantidad > 0) {
			saldo = saldo + cantidad;
		} else {
			System.out.println("La cantidad no es válida");
		}
	}

	public void retirarSaldo(double cantidad) {
		if (cantidad > 0) {
			if (cantidad <= saldo) {
				saldo = saldo - cantidad;
			} else {
				System.out.println("No hay suficiente saldo");
			}
		} else {
			System.out.println("La cantidad no es válida");
		}
	}

	public boolean tieneSaldo(double cantidad) {
		if (saldo >= cantidad) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Cliente: " + nombre + ", ID: " + id + ", Saldo: " + saldo;
	}
}