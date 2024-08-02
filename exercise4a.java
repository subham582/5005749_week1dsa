package Week1Task;

public class exercise4a {
	
	//Use an Array to Store Employee Records and Implement Methods:
	
	    private exercise4[] employees;
	    private int size;

	    public exercise4a(int capacity) {
	        employees = new exercise4[capacity];
	        size = 0;
	    }

	    // Method to add an employee
	    public void addEmployee(exercise4 employee) {
	        if (size < employees.length) {
	            employees[size] = employee;
	            size++;
	        } else {
	            System.out.println("Array is full. Cannot add more employees.");
	        }
	    }

	    // Method to search an employee by employeeId
	    public exercise4 searchEmployee(String employeeId) {
	        for (int i = 0; i < size; i++) {
	            if (employees[i].getEmployeeId().equals(employeeId)) {
	                return employees[i];
	            }
	        }
	        return null;
	    }

	    // Method to traverse and display all employees
	    public void traverseEmployees() {
	        for (int i = 0; i < size; i++) {
	            System.out.println("Employee ID: " + employees[i].getEmployeeId());
	            System.out.println("Name: " + employees[i].getName());
	            System.out.println("Position: " + employees[i].getPosition());
	            System.out.println("Salary: " + employees[i].getSalary());
	            System.out.println("----------");
	        }
	    }

	    // Method to delete an employee by employeeId
	    public void deleteEmployee(String employeeId) {
	        for (int i = 0; i < size; i++) {
	            if (employees[i].getEmployeeId().equals(employeeId)) {
	                // Shift elements to the left to fill the gap
	                for (int j = i; j < size - 1; j++) {
	                    employees[j] = employees[j + 1];
	                }
	                employees[size - 1] = null;
	                size--;
	                return;
	            }
	        }
	        System.out.println("Employee not found.");
	    }
	

}

