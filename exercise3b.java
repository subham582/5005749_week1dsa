package Week1Task;
import Week1Task.exercise3;
public class exercise3b {
	

	
	//Bubble Sort:

	    public static void bubbleSort(exercise3[] orders) {
	        int n = orders.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
	                    // Swap orders[j] and orders[j + 1]
	                    exercise3 temp = orders[j];
	                    orders[j] = orders[j + 1];
	                    orders[j + 1] = temp;
	                }
	            }
	        }
	    }
	}

	