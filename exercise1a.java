package Week1Task;
import java.util.HashMap;
import java.util.Map;
public class exercise1a {
	//Using HashMap to store the products, where the key is the productId.
			
			
			    private Map<String, exercise1> productMap;

			    public exercise1a() {
			        productMap = new HashMap<>();
			    }

			    // Method to add a product
			    public void addProduct(exercise1 product) {
			        productMap.put(product.getProductId(), product);
			    }

			    // Method to update a product
			    public void updateProduct(exercise1 product) {
			        if (productMap.containsKey(product.getProductId())) {
			            productMap.put(product.getProductId(), product);
			        } else {
			            System.out.println("Product not found.");
			        }
			    }

			    // Method to delete a product
			    public void deleteProduct(String productId) {
			        if (productMap.containsKey(productId)) {
			            productMap.remove(productId);
			        } else {
			            System.out.println("Product not found.");
			        }
			    }

			    // Method to display all products
			    public void displayProducts() {
			        for (exercise1 product : productMap.values()) {
			            System.out.println("Product ID: " + product.getProductId());
			            System.out.println("Product Name: " + product.getProductName());
			            System.out.println("Quantity: " + product.getQuantity());
			            System.out.println("Price: " + product.getPrice());
			            System.out.println("----------");
			        }
			    }
			    public void displayInventory() {
			        if (productMap.isEmpty()) {
			            System.out.println("Inventory is empty.");
			        } else {
			            System.out.println("Current inventory:");
			            for (exercise1 product : productMap.values()) {
			                System.out.println(product);
			            }
			        }
			    }
			    public void updateProduct(String productId, int quantity, double price) {
			        exercise1 product = productMap.get(productId);
			        if (product != null) {
			            product.setQuantity(quantity);
			            product.setPrice(price);
			            System.out.println("Product updated: " + product);
			        } else {
			            System.out.println("Product not found. Cannot update.");
			        }
			    }
			    public static void main(String[] args) {
			        exercise1a inventoryManagement = new exercise1a();

			        // Add products
			        exercise1 product1 = new exercise1("1", "Laptop", 10, 999.99);
			        exercise1 product2 = new exercise1("2", "Smartphone", 50, 499.99);
			        exercise1 product3 = new exercise1("3", "Tablet", 30, 299.99);

			        inventoryManagement.addProduct(product1);
			        inventoryManagement.addProduct(product2);
			        inventoryManagement.addProduct(product3);

			        // Display current inventory
			        inventoryManagement.displayInventory();

			        // Update a product
			        inventoryManagement.updateProduct("2", 45, 479.99);

			        // Display updated inventory
			        inventoryManagement.displayInventory();

			        // Delete a product
			        inventoryManagement.deleteProduct("3");

			        // Display final inventory
			        inventoryManagement.displayInventory();
			    }
	}


