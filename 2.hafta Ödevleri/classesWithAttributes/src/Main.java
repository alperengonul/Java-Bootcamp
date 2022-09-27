public class Main {
    public static void main(String[] args) {

        Product product=new Product(1,"Laptop","Asus Laptop",5000,4,"black");
        Product product2 = new Product();
       /* eski kullanışsız hali
        product.setName("laptop");
        product.setId(1);
        product.setDescription("Asus laptop");
        product.setPrice(5000);
        product.setStockAmount(5);
        product.setRenk("blue");
        */


        System.out.println(product.getName());
        System.out.println(product.getCode());
        ProductManager productManager= new ProductManager();
        productManager.add(product);

    }
}