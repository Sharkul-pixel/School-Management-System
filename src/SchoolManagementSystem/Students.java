package SchoolManagementSystem;

/**
 This class is responsible for keeping track of Students
*/

public class Students {
	private int id; 
	private String name;
	private int grade;
	private int paidFees;
	private int totalFees;
	
	
	/**
	 * To create a new student by initializing.
	 * Fees per student is $30,000.
	 * Initial paid fees is 0.
	 * `id` -> id for the student's: unique.
	 * `name` -> name of the student's.
	 * `grade` -> grade of the student's.
	*/
	
	public Students(int id, String name, int grade) {     // Constructor to create a new student object
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	/**
	 * Used to update the student's grade.
	 * @param grade -> new grade of the student.
	 */
	
	public void setGrade(int grade) {       // Not altering students name and id
		this.grade = grade;
	}
	
	/**
	 * Used to update the fees for the student's
	 * Keep adding fees to the paidFees field.
	 * The school is going to receive funds.
	 * @param paidFees -> the fees the student pays.
	 */
	
	public void setPaidFees(int fees) {
		paidFees += fees;
		School.updateTotalMoneyEarned(paidFees);
	}
	
	/**
    *
    * @return id of the student.
    */
   public int getId() {
       return id;
   }

   /**
    *
    * @return name of the student.
    */
   public String getName() {
       return name;
   }

   /**
    *
    * @return the grade of the student.
    */
   public int getGrade() {
       return grade;
   }

   /**
    *
    * @return fees paid by the student.
    */
   public int getFeesPaid() {
       return paidFees;
   }

   /**
    *
    * @return the total fees of the student.
    */
   public int getFeesTotal() {
       return totalFees;
   }

   /**
    *
    * @return the remaining fees.
    */
   public int getRemainingFees(){
       return totalFees-paidFees;
   }

   @Override
   public String toString() {
       return "Student's name :"+name+
               " Total fees paid so far $"+ paidFees;
   }
}
	
	
	
	
	
	
	
	
	
	
