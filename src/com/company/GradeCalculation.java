package com.company;

import javax.tools.StandardLocation;
import java.util.Scanner;

public class GradeCalculation {

    public static void main(String[] args) {

        //All grade-associated variables of the term..
        double quiz, midterm_grade, project, presentation, final_grade, grade;
        boolean lecture_passed = false;

        Scanner input =new Scanner(System.in);

        System.out.println("\tEnter the all grades");
        System.out.print("Quiz: ");
        quiz = input.nextDouble();
        System.out.print("Project: ");
        project = input.nextDouble();
        System.out.print("Midterm: ");
        midterm_grade = input.nextDouble();
        System.out.print("Final: ");
        final_grade = input.nextDouble();
        System.out.print("Presentation: ");
        presentation = input.nextDouble();

        grade = (quiz * 0.05) + (project * 0.15) + (midterm_grade * 0.35) + (final_grade * 0.4) + (presentation * 0.05);

        System.out.println("Grade : " + grade);

        String result = (grade >= 50) ? "\tThe lecture is passed! Well Done!" : "\tSee You later Alligator :P";
        System.out.println(result);

        if(grade >= 50){
            lecture_passed = true;
            System.out.println("\tThe lecture is passed! Well Done!");
        } else{
            System.out.println("\tSee You later Alligator :P");
        }
    }

}
