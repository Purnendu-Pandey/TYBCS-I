interface Countable{
}
class Product implements Countable
{
    private int productId;
    private String productName;
    private double productCost;
    private int productQuantity;
    private static int objectCount = 0; 
    public Product() 
    {
        objectCount++; 
    }
        public Product(int productId, String productName, double productCost, int productQuantity)
        {
            this.productId = productId;
            this.productName = productName;
            this.productCost = productCost;
            this.productQuantity = productQuantity;
            objectCount++; 
        }
        public void displayProduct() 
        {
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Product Cost: " + productCost);
            System.out.println("Product Quantity: " + productQuantity);
            System.out.println();
        }
        public static void displayObjectCount()
        {
            System.out.println("Total number of products created: " + objectCount);
        }
}
public class setB2 
{
    public static void main(String[] args)
    {
        Product product1 = new Product(1, "Smartwatch", 999.99, 5);
        Product product2 = new Product(2, "Smartphone", 599.99, 10);
        Product product3 = new Product(3, "Headphones", 49.99, 20);

        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();
        Product.displayObjectCount();
    }
}

/*

ty32@pc38:~/TYBCS-32/JAVA/Assignment No 3$ javac setB2.java
ty32@pc38:~/TYBCS-32/JAVA/Assignment No 3$ java setB2
Product ID: 1
Product Name: Smartwatch
Product Cost: 999.99
Product Quantity: 5

Product ID: 2
Product Name: Smartphone
Product Cost: 599.99
Product Quantity: 10

Product ID: 3
Product Name: Headphones
Product Cost: 49.99
Product Quantity: 20

Total number of products created: 3

*/
