
public class Celsius {
	double ConvertToFahrenheit(double Celsius){
		return Celsius*9/5+32;
	}
	public static void main(String[] args) {
		Celsius C=new Celsius();
		double result=C.ConvertToFahrenheit(25.0);
		System.out.println("25°C is equal to"+result+"°F");

	}

}
