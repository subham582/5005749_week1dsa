package Week1Task;

public class exercise5 {

		public class Task {
		    private String taskId;
		    private String taskName;
		    private String status;

		    public Task(String taskId, String taskName, String status) {
		        this.taskId = taskId;
		        this.taskName = taskName;
		        this.status = status;
		    }

		    // Getters and Setters
		    public String getTaskId() {
		        return taskId;
		    }

		    public void setTaskId(String taskId) {
		        this.taskId = taskId;
		    }

		    public String getTaskName() {
		        return taskName;
		    }

		    public void setTaskName(String taskName) {
		        this.taskName = taskName;
		    }

		    public String getStatus() {
		        return status;
		    }

		    public void setStatus(String status) {
		        this.status = status;
		    }
		}
		
		//Implement a Singly Linked List to Manage Tasks:
		public class SinglyLinkedList {
		    private Node head;
		private static class Node {
		        private Task task;
		       private Node next;

		        public Node(Task task) {
		            this.task = task;
		            this.next = null;
		        }
		    }

		    public void addTask(Task task) {
		        Node newNode = new Node(task);
		        if (head == null) {
		            head = newNode;
		        } else {
		            Node current = head;
		            while (current.next != null) {
		                current = current.next;
		            }
		            current.next = newNode;
		        }
		    }

		    public Task searchTask(String taskId) {
		        Node current = head;
		        while (current != null) {
		            if (current.task.getTaskId().equals(taskId)) {
		                return current.task;
		            }
		            current = current.next;
		        }
		        return null;
		    }

		    public void traverseTasks() {
		        Node current = head;
		        while (current != null) {
		            System.out.println("Task ID: " + current.task.getTaskId());
		            System.out.println("Task Name: " + current.task.getTaskName());
		            System.out.println("Status: " + current.task.getStatus());
		            System.out.println("----------");
		            current = current.next;
		        }
		    }
		    public void deleteTask(String taskId) {
		        if (head == null) {
		            System.out.println("List is empty.");
		            return;
		        }

		        if (head.task.getTaskId().equals(taskId)) {
		            head = head.next;
		            return;
		        }

		        Node current = head;
		        while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
		            current = current.next;
		        }

		        if (current.next == null) {
		            System.out.println("Task not found.");
		        } else {
		            current.next = current.next.next;
		        }
		    }
		}

}
