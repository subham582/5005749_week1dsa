package Week1Task;

public class exercise7 {
	//Recursive Algorithm to Predict Future Values Based on Past Growth Rates:
		
		    public static double predictFutureValue(double initialValue, double growthRate, int years) {
		        // Base case: if no more years to predict, return the initial value
		        if (years == 0) {
		            return initialValue;
		        }
		        return predictFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
		    }

		    public static void main(String[] args) {
		        double initialValue = 1000.0; // Initial investment
		        double growthRate = 0.05; // 5% annual growth rate
		        int years = 10; // Predict for 10 years

		        double futureValue = predictFutureValue(initialValue, growthRate, years);
		        System.out.println("Predicted Future Value: " + futureValue);
		    }
		}


