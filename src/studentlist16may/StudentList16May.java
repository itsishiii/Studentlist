/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist16may;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class StudentList16May {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //hello
        Student s1 = new Student("Ishika","s1");
      Student s2 = new Student("Kali", "s2");
			Student s3 = new Student("Kirtan", "s3");
			Student studentList[] = new Student[3];
			studentList[0] = s1;
			studentList[1] = s2;
			studentList[2] = s3;
			
			for(int i = 0; i < studentList.length; i++){
				System.out.println(studentList[i].getsname());
                                System.out.println("Enter message");
                                String ans = input.nextLine();
			}
		}
	}
 
    

