
package schoolmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Công Hậu
 */
public class MenuItem {

    private static int salary;
    public static void doMenuItem(){
        Scanner sc = new Scanner(System.in);
        Manage manage = new Manage();
        int choice = 0;
        int choice1 = 0, choice1_1 = 0, choice1_2 = 0, choice4 = 0, nhap1 = 0, nhap2 = 0;
        String level = "", position = "";
        int allowance = 0;
        
        
        while (true) {
            System.out.println("--------STAFFS MANAGER----------");
            System.out.println("1. Add staffs");
            System.out.println("2. Update officers informations");
            System.out.println("3. Delete officers ");
            System.out.println("4. Display list of officers");
            System.out.println("5. Delete all data");
            System.out.println("6. Display the salary of all staffs");
            System.out.println("7. Exit");
            System.out.println("Your choice [1-7]: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("--------ADD STAFFS----------");
                    System.out.println("1. Add teacher");
                    System.out.println("2. Add officer");
                    System.out.println("3. Add labor");                   
                    System.out.println("Your choice [1-3]: ");
                    choice1 = sc.nextInt();
                    switch (choice1) {
                        case 1: {   //them giang vien 
                            System.out.print("Input name: ");
                            String name = sc.next();
                            System.out.println("Input year of birth: ");
                            int year = sc.nextInt();
                            System.out.println("Input hometown: ");
                            String hometown = sc.next();
                            System.out.println("Input kind of staff: ");
                            String kindOfStaff = sc.next();
                            System.out.print("Input he so luong: ");
                            int heSoLuong = sc.nextInt();
                            System.out.print("Input falcuty: ");
                            String falcuty = sc.next();
                            do {
                                System.out.println("Input level: ");
                                System.out.println("1. Bachelor");
                                System.out.println("2. Master");
                                System.out.println("3. PH.D");
                                System.out.println("Input number 1-3:");
                                nhap1 = sc.nextInt();
                                switch (nhap1) {
                                    case 1:
                                        level = "Bachelor";
                                        allowance = 300;
                                        break;
                                    case 2:
                                        level = "Master";
                                        allowance = 900;
                                        break;
                                    case 3:
                                        level = "PH.D";
                                        allowance = 2000;
                                    default:
                                        System.out.println("Your input is wrong, pls do again: ");
                                        break;
                                }
                            } while (nhap1 < 1 || nhap1 > 3);
                            System.out.print("Number of teaching periods: ");
                            int teachingPeriods = sc.nextInt();
                            System.out.println("Number of working year: ");
                            int workYears = sc.nextInt();
                            Staffs giaovien = new Teachers( name,  hometown,  kindOfStaff,
                                                            year,  heSoLuong,  allowance,  workYears, falcuty,  level, teachingPeriods, salary);
                            
                                System.out.println("1.1 Add to the end of list");
                                System.out.println("1.2 Add to the beginning of list");
                                System.out.println("1.3 Add to the position k of list");
                                System.out.println("1.4 From file staffs.txt");
                                System.out.println("1.5 From file labors.txt");
                                System.out.println("1.6 Return");
                                System.out.println("Your choice [1-6]:");
                                
                                choice1_1 = sc.nextInt();
                                switch(choice1_1){
                                    case 1:
                                        manage.addStaffs_ToTheEnd(giaovien);
                                        sc.nextLine();                         
                                        break;
                                    case 2:
                                        manage.addStaffs_ToBegin(giaovien);
                                        break;
                                    case 3:
                                        manage.addStaffs_ToPositionK(giaovien);
                                        break;
                                    case 4:
                                        //them tu file staffs.txt
                                    case 5:
                                        //them tu file labors.txt
                                    case 6:
                                        choice1=1;
                                }
                                break;
                       
                        }
                        
                        case 2: {    //them nhan vien                      
                            System.out.print("Input name: ");
                            String name = sc.next();
                            System.out.println("Input year of birth: ");
                            int year = sc.nextInt();
                            System.out.println("Input hometown: ");
                            String hometown = sc.next();
                            System.out.print("Input he so luong: ");
                            int heSoLuong = sc.nextInt();
                            System.out.print("Input department: ");
                            String department = sc.next();
                            do {
                                System.out.println("Input position:   ");
                                System.out.println("1. Head");
                                System.out.println("2. Deputy head");
                                System.out.println("3. Staff");
                                System.out.println("Input number 1-3:");
                                nhap2 = sc.nextInt();
                                switch (nhap2) {
                                    case 1:
                                        position = "Head";
                                        allowance = 1000;
                                        break;
                                    case 2:
                                        position = "Deputy head";
                                        allowance = 600;
                                        break;
                                    case 3:
                                        position = "Staff";
                                        allowance = 400;
                                        break;
                                    default:
                                        System.out.println("Your input is wrong, pls do again!");
                                        break;
                                }
                            } while (nhap2 < 1 || nhap2 > 3);
                            System.out.print("Input number of working days: ");
                            int workingDays = sc.nextInt();
                            System.out.println("Input kind of staff: ");
                            String kindOfStaff = sc.next();
                            System.out.println("Input working year:  ");
                            int workYears = sc.nextInt();
           
                            Staffs vanphong = new Officers( name,  hometown, kindOfStaff, 
                                                            year,  heSoLuong,  allowance,  workYears,  department, position,  workingDays, salary);
                           
                                System.out.println("1. Add to the end of list");
                                System.out.println("2. Add to the beginning of list");
                                System.out.println("3. Add to the position k of list");
                                System.out.println("4. From file staffs.txt");
                                System.out.println("5. From file labors.txt");
                                System.out.println("6. Return");
                                System.out.println("Your choice [1-6]:");
                                
                                choice1_2 = sc.nextInt();
                                switch(choice1_2){
                                    case 1:
                                        manage.addStaffs_ToTheEnd(vanphong);
                                        sc.nextLine();                         
                                        break;
                                    case 2:
                                        manage.addStaffs_ToBegin(vanphong);
                                        break;
                                    case 3:
                                        manage.addStaffs_ToPositionK(vanphong);
                                        break;
                                    case 4:
                                        manage.fromFileStaffs(vanphong);
                                        //them tu file staffs.txt
                                    case 5:
                                        manage.fromFileStaffs(vanphong);
                                        //them tu file labors.txt
                                    case 6:
                                        choice1=1;
                                }
                                break;
            
                        }
                        case 3: { //them lao dong thoi vu
                            System.out.println("Input name: ");
                            String name = sc.next();
        
                            System.out.println("Input year of birth: ");
                            int year = sc.nextInt();

                            System.out.print("Input number of working days: ");
                            int workingDays = sc.nextInt();

                            System.out.println("Input unit price:");
                            int unitPrice = sc.nextInt();
                            Labors laodong = new Labors(name, year, workingDays, unitPrice);
                            manage.addLabors(laodong);
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case 3: {
                    manage.deleteAllData(); break;
                }
                case 4: {
                    System.out.println("4.1 Display list");
                    System.out.println("4.2 Display theo salary");
                    System.out.println("4.3 Display theo name");
                    System.out.println("4.4 Look for theo name");
                    System.out.println("4.5 Look for theo year of birth");
                    System.out.println("Your choice [1-5]");
                    
                    choice4 = sc.nextInt();
                    switch(choice4){
                        case 1: manage.display(); break;
                        case 2: manage.sortSalary(); break; //sap xep thep luong
                        case 3: manage.sortName(); break; //sap xep theo ten
                        case 4:{                         
                            manage.searchOfficerByName();
                            break;
                        }
                        case 5:{       
                            manage.searchOfficerByAge();
                            break;
                        }
                    }      
                }
                case 5: { // xoa tat ca du lieu
                    manage.deleteAllData();
                    break;
                }
                case 6: // hien thi ten + luong
                {
                    manage.searchOfficerByName();
                } 
                case 7: { //quay ve muc truoc
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }
}
     