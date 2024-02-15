package SchoolManagementSystem;

/**
 * This class is responsible for keeping track of the teacher's
 */

public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	/**
	 * Initializing constructor for a new Teacher object.
	 * @param id -> id of the teacher.
	 * @param Name -> Name of the teacher.
	 * @param Salary -> Salary of the teacher.
	 */
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned=0;
	}
	
	/**
	 * 
	 * @return the id of the teacher.
	 */
	public int getId(){
		return id;
	}
	
	/**
	 * 
	 * @return the name of the teacher.
	 */
	public String getName(){
		return name;
	}
	/**
	 * 
	 * @return the salary of the teacher.
	 */
	public int getSalary(){
		return salary;
	}
	
	/**
	 * Set the salary of the teacher
	 * @param salary
	 */
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	 /**
     * Adds to salaryEarned.
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far $"
                + salaryEarned;
    }
}


