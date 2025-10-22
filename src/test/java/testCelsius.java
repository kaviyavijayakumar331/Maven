import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class testCelsius {
@Test
void convertToFahrenheit() {
	Celsius C=new Celsius();
	double result=C.ConvertToFahrenheit(25.0);
	assertEquals(77.0,result,0.001,"25.0°C is equal to 77.0°F");
}
}
