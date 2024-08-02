package Week1Task;

public class exercise2b {

	//Implement Linear Search and Binary Search Algorithms:
	//Linear Search:

	    public static exercise2 linearSearch(exercise2[] products, String targetProductId) {
	        for (exercise2 product : products) {
	            if (product.getProductId().equals(targetProductId)) {
	                return product;
	            }
	        }
	        return null;
	    }
	}
	