/*@Author Matthew J. McKay 
 * @StudentNumber T00057652
 * @University Thompson Rivers University
 */

public class Task implements Comparable<Task> {				// We implement the Comparable interface and select the proper type
	public int priority;
	public String task;
	public String name;
	
	public Task(int taskPriority, String taskString){ 		// Here is our Task Object constructor
		priority = taskPriority;
		name = taskString;
	}
	public void setPriority(int taskPriority){				// This method allows us to change an objects priority
		priority = taskPriority;
	}
	public String toString(){								// Here is our toString() method that returns a String representation of our object
		String result = "The task is " + this.name + " and The priority level of this task is " + this.priority;
		return result;
	}
	public int getPriority(){								// This method returns the objects priority
		return priority;
	}
	public int compareTo(Task data){						// We have designed our compareTo() method to return an integer for 3 different scenarios
		int result = 0;

	    if (this.priority > data.getPriority()) {
	        result = 1;
	    } else if (this.priority < data.getPriority()) {
	        result = -1;
	    } else if (this.priority == data.getPriority()) {
	        result = 0;
	    }

	    return result;
		}

	}
		
	
	



