package ejercicio52;

public class Vehiculo
{
	private int numeroRuedas;
	private int velocidadMaxima;
	private int velocidadActual;
	private int peso;

	/**
	 * Construye un objeto Vehiculo
	 * @param numeroRuedas
	 * @param velocidadMaxima
	 * @param velocidadActual
	 * @param peso En kilos
	 */
	public Vehiculo(int numeroRuedas, int velocidadMaxima, int velocidadActual, int peso)
	{
		this.numeroRuedas = numeroRuedas;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadActual = velocidadActual;
		this.peso = peso;
	}

	public int getNumeroRuedas()
	{
		return numeroRuedas;
	}
	public void setNumeroRuedas(int numeroRuedas)
	{
		this.numeroRuedas = numeroRuedas;
	}
	public int getVelocidadMaxima()
	{
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima)
	{
		this.velocidadMaxima = velocidadMaxima;
	}
	public int getVelocidadActual()
	{
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual)
	{
		this.velocidadActual = velocidadActual;
	}
	public int getPeso()
	{
		return peso;
	}
	public void setPeso(int peso)
	{
		this.peso = peso;
	}

	/**
	 * Compara dos vehículos
	 * @param vehiculo
	 * @return true Si son iguales false Si no lo son
	 */
	public boolean esIgual(Vehiculo vehiculo)
	{
		if(vehiculo.getNumeroRuedas() == numeroRuedas &&
				vehiculo.getVelocidadMaxima() == velocidadMaxima &&
				vehiculo.getVelocidadActual() == velocidadActual &&
				vehiculo.getPeso() == peso)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Copia los atributos de un vehículo en otro
	 * @param vehiculo
	 */
	public void copia(Vehiculo vehiculo)
	{
		numeroRuedas = vehiculo.getNumeroRuedas();
		velocidadMaxima = vehiculo.getVelocidadMaxima();
		velocidadActual = vehiculo.getVelocidadActual();
		peso = vehiculo.getPeso();
	}
}
