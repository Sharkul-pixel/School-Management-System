package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2,"Mellisa",700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);


        Students ash = new Students(1,"Ash",4);
        Students lantern = new Students(2,"Lantern",12);
        Students klare = new Students(3,"Klare",5);
        
        List<Students> studentList = new ArrayList<>();

        studentList.add(ash);
        studentList.add(lantern);
        studentList.add(klare);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        ash.setPaidFees(5000);;
        lantern.setPaidFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(lantern);

        mellisa.receiveSalary(mellisa.getSalary());

        System.out.println(mellisa);


    }
}