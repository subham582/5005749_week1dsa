package Week1Task;
import java.util.Arrays;
public class exercise2c {
	//Binary Search:
	

		    // Binary Search (Assumes products array is sorted by productId)
		    public static exercise2 binarySearch(exercise2[] products, String targetProductId) {
		        int left = 0;
		        int right = products.length - 1;
		        while (left <= right) {
		            int mid = left + (right - left) / 2;
		            int comparison = products[mid].getProductId().compareTo(targetProductId);

		            if (comparison == 0) {
		                return products[mid];
		            } else if (comparison < 0) {
		                left = mid + 1;
		            } else {
		                right = mid - 1;
		            }
		        }
		        return null;
		    }
	

	

	}


