package ejercicio52;

public class Main {

	public static void main(String[] args)
	{
		Vehiculo vehiculo1 = new Vehiculo(4, 200, 0, 1000);
		Vehiculo vehiculo2 = new Vehiculo(2, 100, 0, 300);

		if(vehiculo1.esIgual(vehiculo2))
		{
			System.out.println("Son iguales.");
		}
		else
		{
			System.out.println("No son iguales.");
		}

		vehiculo1.copia(vehiculo2);
		System.out.println("Numero ruedas: " + vehiculo1.getNumeroRuedas());
	}
}
