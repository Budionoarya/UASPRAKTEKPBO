/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Daffa
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yy");

        Scanner key = new Scanner(System.in);
        int pilihan;
        
        Employee[] employee = new Employee[9];
        try {

            employee[0] = new Staff("Paita", "Allen", "123", 'M', sdf.parse("2/23/59"), 50.00); 

            employee[1] = new Staff("Steven", "Zapata", "456", 'F', sdf.parse("7/12/64"), 35.00);

            employee[2] = new Staff("Enrique", "Rios", "789", 'M', sdf.parse("6/2/70"), 40.00);

            employee[3] = new Faculty("Anne", "Johnson", "243", 'F', sdf.parse("4/27/62"), Faculty.Level.FU,
                    new Education("Ph.D", "Engineering", 3));

            employee[4] = new Faculty("William", "Bouris", "791", 'F', sdf.parse("3/14/75"), Faculty.Level.AO,
                    new Education("Ph.D", "English", 1));

            employee[5] = new Faculty("Christopher", "Andrade", "623", 'F', sdf.parse("5/22/80"), Faculty.Level.AS,
                    new Education("MS", "Physical Education", 0));

            employee[6] = new Partime("Augusto", "Guzman", "455", 'F', sdf.parse("8/10/77"), 35.00, 30);

            employee[7] = new Partime("Martin", "Depirro", "678", 'F', sdf.parse("9/15/87"), 30.00, 15);

            employee[8] = new Partime("Marque", "Aldaco", "945", 'M', sdf.parse("11/24/88"), 20.00, 35);
            
            System.out.println("Menu test program : ");
            System.out.println("1. Employee order ascending ");
            System.out.println("2. Detail semua staff employee");
            System.out.println("3. Detail semua faculty employee");
            System.out.println("4. Detail semua partime employee");
            System.out.println("5. Total salary semua partime employee");
            System.out.println("6. Total salary semua employee");
            
            System.out.print("Pilihan = ");
            pilihan  = key.nextInt();


            if(pilihan == 1){
                System.out.println("Employee Info in ascending order of employee id\n");

                Collections.sort(Arrays.asList(employee), new Comparator<Employee>() {

                    public int compare(Employee o1, Employee o2) {

                        return o1.getId().compareToIgnoreCase(o2.getId());

                    }

                });

                for (Employee emp : employee) {

                    System.out.println(emp.toString());

                    System.out.println("");

                }
            }
            else if(pilihan == 2){
                System.out.println("Details of all STAFF employees\n");

                for (Employee emp : employee) {

                    if (emp.getClass() == Staff.class) { /* checking if its a Staff object */

                        System.out.println(emp.toString());

                        System.out.println("---");

                    }

                }
            }
            else if(pilihan == 3){
                 System.out.println("Details of all FACULTY employees\n");

                for (Employee emp : employee) {

                    if (emp.getClass() == Faculty.class) { /* checking if its a Faculty object */

                        System.out.println(emp.toString());

                        System.out.println("---");

                    }

                }
            }
            else if(pilihan == 4){
                System.out.println("Details of all PART TIME employees\n");

                for (Employee emp : employee) {

                    if (emp.getClass() == Partime.class) { /* checking if its a Partime object */

                        System.out.println(emp.toString());

                        System.out.println("---");

                    }

                }
            }
            else if(pilihan == 5){
                float total_salary_all_employees = 0;

                float total_salary_partime_employees = 0;

                for (Employee emp : employee) {

                    if (emp.getClass() == Partime.class) { /* checking if its a Partime object */

                        total_salary_partime_employees += emp.monthlyEarning();

                    }

                    total_salary_all_employees += emp.monthlyEarning();

                }

                System.out.println("\nTotal salary of all part time employees: " + total_salary_partime_employees);
            }
            else if(pilihan == 6){
                float total_salary_all_employees = 0;

                float total_salary_partime_employees = 0;

                for (Employee emp : employee) {

                    if (emp.getClass() == Partime.class) { /* checking if its a Partime object */

                        total_salary_partime_employees += emp.monthlyEarning();

                    }

                    total_salary_all_employees += emp.monthlyEarning();

                }
                System.out.println("Total salary of all employees: " + total_salary_all_employees);
            }
            else{
                System.out.println("Pilihan tidak valid");
            }
            

        } catch (ParseException e) {

            e.printStackTrace();

        }
    }
    
}
