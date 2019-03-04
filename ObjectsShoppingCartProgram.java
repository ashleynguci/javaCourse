import java.text.DecimalFormat;
import java.util.ArrayList;

public class ObjectsShoppingCartProgram {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product product_1 = new Product(10, "Bicycle", 500.00);
        Product product_2 = new Product(11, "Energy bar", 1.50);
        Product product_3 = new Product(12, "Water bottle", 6.00);
        
        System.out.println(cart);

        cart.add(product_1, 1);
        cart.add(product_2, 5);
        cart.add(product_3, 2);    
        System.out.println(cart);
        
        cart.remove(product_2);
        System.out.println(cart);
    }
}

 class ShoppingCart {
	private ArrayList<Item> itemList;

	public ShoppingCart() {
		this.itemList = new ArrayList<Item>();
		
	}

	public void add(Product product, int quantity) {
		
		itemList.add(new Item(product,quantity));
	}

	public void remove(Product product) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getProduct().equals(product)) {
				itemList.remove(i);
			}
		}
	}

	public double getTotalPrice() {
		double totalPrice = 0;
		for (int i = 0; i < itemList.size(); i++) {
			totalPrice += itemList.get(i).getSubtotal();
		}
		return totalPrice;
	}

	public String toString() {
		DecimalFormat twoZero = new DecimalFormat("0.00");
		String output = "";
		if(itemList.size()==0) {
			output = "There are no items in the shopping cart."+"\n";
		}
		else {
			output = "=== Shopping cart ==="+"\n";
		for (int i = 0; i < itemList.size(); i++) {
			output += itemList.get(i).getProduct().getProductId() + ": " + itemList.get(i).getProduct().getProductName()
					+ ", quantity: " + itemList.get(i).getQuantity() + ", unit price: "
					+ twoZero.format(itemList.get(i).getProduct().getProductPrice()) +", subtotal: "+twoZero.format(itemList.get(i).getSubtotal())+ "\n";
		}
		output += "TOTAL PRICE: "+ twoZero.format(getTotalPrice()) +" euros"+"\n";
		
		}
		return output;
	}
}

 class Item {
private Product product;
private int quantity;
public Item(Product product, int quantity) {
	super();
	this.product = product;
	this.quantity = quantity;
}
public Product getProduct() {
	return product;
}
public int getQuantity() {
	return quantity;
}
public double getSubtotal() {
	return quantity*product.getProductPrice();
}

}

 class Product {
	private int productId;
	private String productName;
	private double productPrice;

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

}
