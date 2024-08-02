package Week1Task;

public class exercise3c {
	//Quick Sort:
		
		    public static void quickSort(exercise3[] orders, int low, int high) {
		        if (low < high) {
		            int pi = partition(orders, low, high);
		            quickSort(orders, low, pi - 1); // Recursively sort the left part
		            quickSort(orders, pi + 1, high); // Recursively sort the right part
		        }
		    }
		    private static int partition(exercise3[] orders, int low, int high) {
		        double pivot = orders[high].getTotalPrice();
		        int i = (low - 1); // Index of smaller element
		        for (int j = low; j < high; j++) {
		            if (orders[j].getTotalPrice() <= pivot) {
		                i++;
		                exercise3 temp = orders[i];
		                orders[i] = orders[j];
		                orders[j] = temp;
		           }
		        }
		        // Swap orders[i + 1] and orders[high] (or pivot)
		     exercise3 temp = orders[i + 1];
		        orders[i + 1] = orders[high];
		        orders[high] = temp;
		        return i + 1;
		    }
		
}
