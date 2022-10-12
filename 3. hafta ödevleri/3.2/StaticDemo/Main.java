package StaticDemo;

public  class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product  product = new Product();
		product.Id=1;
		product.name = "İsa";
		product.price=400;
		productManager.add(product);

		
		
	//	DatabaseHelper.Crud.update();
	}

}
