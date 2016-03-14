import java.text.DecimalFormat;
import java.text.*;
public class MoneyFormatDemo {
	public static void main (String [] args)
	{
		DecimalFormat dt = new DecimalFormat ("$#,###,###.00");
		System.out.println(dt.format(34456.2));
		String money = dt.format(20043.44);
		System.out.println(money);
		
		
	}

}
