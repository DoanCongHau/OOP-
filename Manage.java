
package schoolmanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Công Hậu
 */
public class Manage {
     private List<Staffs> st;
     private List<Labors> lb;

    public Manage() {
        this.st = new ArrayList<>();
        this.lb = new ArrayList<>();
    }

    public void addStaffs_ToTheEnd(Staffs staffs) {
        this.st.add(staffs);
    }
    
    public void addStaffs_ToBegin(Staffs staffs){
        this.st.add(0,staffs);
    }
    
    public void addStaffs_ToPositionK(Staffs staffs){
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input position k:");
        k=sc.nextInt();
        
        this.st.add(k, staffs);
    }
    
    public void fromFileStaffs(Staffs staffs){
        String fileName="D:/staffs.txt";
		try {
		   File file = new File(fileName);
		   Scanner sc = new Scanner(file);
		   String line;
		   while (sc.hasNextLine()) {
			   line = sc.nextLine();
			   String[] a = line.split(",");
			   
			   if ("teacher".equals(a[0])) {
				   this.st.add(staffs);
			   }		   
			   System.out.println(a[0]);
		   }
		   sc.close();
		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		}
    }
    
    public void addLabors (Labors labors){
        this.lb.add(labors);
    }
    
    public void deleteStaffs(Staffs name){
        this.st.remove(name);
    }
    
    public void deleteAllData(){
        this.st = new ArrayList<>();
        this.lb = new ArrayList<>();
        
    }
    

    public void searchOfficerByName() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Officers> foundOfficers = new ArrayList<Officers>();
        System.out.println("Input OFFICER's name need to find: ");
        String name = sc.nextLine();
        for(Staffs s: st){
            if(name.equalsIgnoreCase(s.getName())){
                foundOfficers.add((Officers) s);
            }
        }
        if(foundOfficers.isEmpty()){
            System.out.println("NOT FOUND");
        }else{
            System.out.println(foundOfficers);
        }
    }
    
    public void searchOfficerByAge() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Officers> foundOfficers2 = new ArrayList<Officers>();
        System.out.println("Input OFFICERS's year of birth need to find: ");
        int year = sc.nextInt();
        for(Staffs s: st){
            if(year == s.getYear()){
                foundOfficers2.add((Officers) s);
            }
        }
        if(foundOfficers2.isEmpty()){
            System.out.println("NOT FOUND");
        }else{
            System.out.println(foundOfficers2);
        }
    }
    public void sortName(){
        Collections.sort(st,new NameComparator());
        showInfo((ArrayList<Staffs>) st);   
    }
        
    public void sortSalary(){
        Collections.sort(st, new SalaryComparator());
        showInfo((ArrayList<Staffs>) st);
    }

    public void display() {
        this.st.forEach(o -> System.out.println(o.toString()));
        this.lb.forEach(o -> System.out.println(o.toString()));
    }
    
    public void showInfo(ArrayList<Staffs> staffs){
        int i=0;
        //System.out.println("STT  NAME    YEAR OF BIRTH    HOMETOWN    LOẠI    C1  C2  C3  C4  C5");
        for(Staffs st : staffs){
            System.out.println(i+"  ");
            System.out.println(st.toString());
            i++;
        }
    }    

}
