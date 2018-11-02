/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpasystem;

import java.util.Scanner;

/**
 *
 * @author Gayanath
 */
public class GpaSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean tf = false;
        double atp = 0;
        double at = 0;
        double fgpa;

        System.out.print("what is your degree program(4 year or 3 year) :");
        int degree = Integer.parseInt(sc.nextLine().trim());
        System.out.print("enter number of years you was sited in the exam  :");
        int year = Integer.parseInt(sc.nextLine().trim());
        System.out.println("");
        for (int y = 0; y < year; y++) {
            int credit = 0;
            double ncg = 0;
            double gpa = 0;
            System.out.println("========================");
            System.out.println("year " + (y + 1));
            System.out.println("========================");
            System.out.println("enter number of subject");
            int subjects = Integer.parseInt(sc.nextLine().trim());
            System.out.println("enter credit and mark for subjects (plece enter capitel letter for mark)");

            for (int x = 0; x < subjects; x++) {
                System.out.println("-------------------------------");
                System.out.println("\tsubject " + "" + (x + 1));
                System.out.print("credit :");
                //you can omite space after and befor the string using the trim()
                int c = Integer.parseInt(sc.nextLine().trim());
                System.out.print("mark :");
                String m = sc.nextLine();
                double cg = 0;
                switch (m) {
                    case "A+":
                        cg = c * 4;
                        break;
                    case "A":
                        cg = c * 4;
                        break;
                    case "A-":
                        cg = c * 3.70;
                        break;
                    case "B+":
                        cg = c * 3.30;
                        break;
                    case "B":
                        cg = c * 3;
                        break;
                    case "B-":
                        cg = c * 2.70;
                        break;
                    case "C+":
                        cg = c * 2.30;
                        break;
                    case "C":
                        cg = c * 2;
                        break;
                    case "C-":
                        cg = c * 1.70;
                        break;
                    case "D+":
                        cg = c * 1.30;
                        break;
                    case "D":
                        cg = c * 1;
                        break;
                    case "E":
                        cg = c * 0;
                        break;
                    default:
                        System.out.println("plece enter valid mark");
                        tf = true;

                }

                credit = credit + c;
                ncg = ncg + cg;
            }
            // stop executing codes when enter invalid mark
            if (tf) {
                return;
            }

            //gpa of year
            gpa = ncg / credit;

            System.out.println("");
            System.out.println("************************");
            System.out.println((y+1) + " year GPA : " + gpa);
            System.out.println("************************\n\n");
            if (degree == 4) {
              
                if (y == 0 ) {
                   
                    atp = atp + (0.2 * credit * gpa);
                    at = at + (0.2 * credit);
                   // System.out.println(atp);

                } else if (y == 1) {
                    atp = atp + (0.2 * credit * gpa);
                    at = at + (0.2 * credit);
                } else if (y == 2) {
                    atp = atp + (0.3 * credit * gpa);
                    at = at + (0.2 * credit);
                } else if (y == 3) {
                    atp = atp + (0.3 * credit * gpa);
                    at = at + (0.2 * credit);
                }

            } else if (degree == 3) {
               
                if (y == 0) {
                    atp = atp + (0.3 * credit * gpa);
                    at = at + (0.3 * credit);

                } else if (y == 1) {
                    atp = atp + (0.3 * credit * gpa);
                    at = at + (0.3 * credit);
                } else if (y == 2) {
                    atp = atp + (0.4 * credit * gpa);
                    at = at + (0.4 * credit);
                }
            }
            

        }
        //final gpa
        fgpa = atp / at;
        System.out.println("");
        System.out.println("#####################");
        System.out.println("your final GPA is :"+fgpa);
        System.out.println("#####################");
    }

}
