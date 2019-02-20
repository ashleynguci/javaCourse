import java.text.DecimalFormat;

public class Pizza {
DecimalFormat twoZero = new DecimalFormat("0.00");
private  String name;


private  double price;
public Pizza(String name, double price) {
	super();
	this.name = name;
	this.price = price;
}
public String getName() {
	return name;
}
public double getPrice() {
	return price;
}
public String toString() {
	return name+" ("+twoZero.format(price).replace(".", ",")+" euros)";
}

}

