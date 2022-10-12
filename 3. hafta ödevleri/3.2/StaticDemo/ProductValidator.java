package StaticDemo;

//Java da ana classı static yapamayız ama c#' da yaparız
public  class  ProductValidator {
	
	//C# ile farkı budur
	static {
		System.out.println("Static yapıcı Blok Çalıştı");
	}
	
	public ProductValidator() {
		System.out.println("Yapıcı Blok Çalıştı");
	}
	
	
	
	
	
	public static boolean isValid(Product product) {
		if (product.price> 0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	//class içindeki başka bir classı static yapabiliriz.
	
	public static class StaticClass{
		public static void sil() {
			//buna inner class denir
		}
	}
}
