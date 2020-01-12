/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement;
import java.util.Scanner;
/**
 *
 * @author Công Hậu
 */
public class Labors {
    
    Scanner sc = new Scanner(System.in);
    private String name;
    private int year, workingDays, unitPrice;
     
    public Labors() {
        super();
    }
 
    public Labors(String name, int year, int workingDays, int unitPrice) {
        this.name = name;
        this.year = year;
        this.workingDays = workingDays;   
        this.unitPrice = unitPrice;
    }
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    
    public int getWorkingDays(){
        return workingDays;
    }
    public void setWorkingDays(int workingDays){
        this.workingDays = workingDays;
    }
    
    public int getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(int unitPrice){
        this.unitPrice = unitPrice;
    }
    
    public void input(){
        System.out.println("Input name: ");
        name = sc.next();
        
        System.out.println("Input year of birth: ");
        year = sc.nextInt();
        
        System.out.print("Input number of working days: ");
        workingDays = sc.nextInt();
        
        System.out.println("Input unit price:");
        unitPrice = sc.nextInt();
    }
        
    public int salary(){
        return (int) (this.getUnitPrice() *this.getWorkingDays());
    }
    
    public String toString(){
        return "Name :"+this.name+", Year of birth: "+this.year+", Salary: "+unitPrice*workingDays;
    }
}
