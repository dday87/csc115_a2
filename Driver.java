/*@Author Matthew J. McKay 
 * @StudentNumber T00057652
 * @University Thompson Rivers University
 */

public class Driver {
	


	public static void main(String[] args) {
		Task toDoList[] = new Task[10];				// Create an array of Task objects with 11 place holders
		Task laundry = new Task(3, "Laundry");		// Create Task objects with the parameters @priority 
		Task dishes = new Task(1, "Dishes");
		Task homework = new Task(4, "Homework");
		Task haircut = new Task(5, "Haircut");
		Task gym = new Task(9, "Gym");
		Task shave = new Task(7, "Shave");
		Task walkDog = new Task(6, "Walk Sparky!");
		Task feedFish = new Task(10, "Feed the goldfish");
		Task finishResume = new Task(2, "Finish my resume to get a job");
		Task valentinesDayDate = new Task(8, "Take the misses out for a Valentines Day date!!!");
		toDoList[0] = laundry;						// Put each object into the Task array
		toDoList[1] = dishes;
		toDoList[2] = homework;
		toDoList[3] = haircut;
		toDoList[4] = gym;
		toDoList[5] = shave;
		toDoList[6] = walkDog;
		toDoList[7] = feedFish;
		toDoList[8] = finishResume;
		toDoList[9] = valentinesDayDate;
		for(int j = 0; j<toDoList.length;j++){			// This algorithm sorts the Task objects with respect to priority less code here than the compareTo() way!!
			for(int i = 0, index = 1;i<toDoList.length-1;i++, index++){
						if(toDoList[i].priority>toDoList[index].priority){
							Task Temp = toDoList[index];
							toDoList[index] = toDoList[i];
							toDoList[i] = Temp;
						}
			}
		}
		System.out.println("We have successfully organized our To-Do List and here it is ranked from highest priority to least.\n");
		for(int b=0;b<toDoList.length; b++){
			System.out.println(toDoList[b].getPriority());		
		}
		System.out.println("Now we will use our Task setPriority() method to change our task priorities and then reorder them using the compareTo method and display them on the screen");
		toDoList[0].setPriority(9);
		toDoList[1].setPriority(6);
		toDoList[2].setPriority(5);
		toDoList[3].setPriority(2);
		toDoList[4].setPriority(8);
		toDoList[5].setPriority(1);
		toDoList[6].setPriority(7);
		toDoList[7].setPriority(3);
		toDoList[8].setPriority(0);
		toDoList[9].setPriority(4);
		for(int b=0;b<toDoList.length; b++){
			System.out.println(toDoList[b].getPriority());		
		}
		for(int j = 0; j<toDoList.length;j++){				// This algorithm sorts the Task objects with respect to the integer returned by the comprateTo() method
			for(int i = 0, index = 1;i<toDoList.length-1;i++, index++){
						int result = toDoList[i].compareTo(toDoList[index]);
						if(result == 1){
							Task Temp = toDoList[index];
							toDoList[index] = toDoList[i];
							toDoList[i] = Temp;
						}
			}
		}
		System.out.println("We have successfully organized our To-Do List using the compareTo() and here it is ranked from highest priority to least.\n");
		for(int b=0;b<toDoList.length; b++){
			System.out.println(toDoList[b].getPriority());
		}
		
		
}
}

