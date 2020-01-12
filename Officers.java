/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement;

/**
 *
 * @author Công Hậu
 */
public class Officers extends Staffs {
    private String department, position;
    private int workingDays;
     
    
 
    public Officers(String name, String hometown, String kindOfStaff,
             int year, int heSoLuong, int allowance, int workYears, String department,String position, int workingDays, int salary) {
        
        super(name, hometown, kindOfStaff,
             year, heSoLuong,  allowance,  workYears, salary);
        
        this.department = department;
        this.position = position;
        this.workingDays = workingDays;
    }
 
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
 
    public String getPosition() {
        return position;
    }
 
    public void setPosition(String position) {
        this.position = position;
    }
 
    public int getWorkingDays() {
        return workingDays;
    }
 
    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }
 
  
    public int salary() {
        return (int) (this.getHeSoLuong() * 1000 + this.getAllowance() + this.getWorkingDays() * 30);
    }
 
    
    public String toString() {
        return super.toString() + ", Department: " + this.department + ", Position: " + this.position + 
            ", Number of working days: " + this.workingDays;
    }
}
