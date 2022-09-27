public class ProductManager {

    public void add(Product product) {
        //JDBC
        System.out.println("Ürün eklendi " + product.getName());
    }

    //hatalı kullanım bir attribute eklendiğinde tüm gelenler için değişmesi gerekiyor.
    public void add2(int id, String name, String discription, int stockAmount, double price) {

    }
}
