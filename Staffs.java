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
public class Staffs {
    protected String name, hometown, kindOfStaff;
    protected  int year,heSoLuong, allowance, workYears, salary;
    protected int choice;
    
    
    
    public Staffs(String name,String hometown,String kindOfStaff,
            int year,int heSoLuong, int allowance, int workYears, int salary ){
        
        this.name = name;
        this.hometown = hometown;
        this.kindOfStaff = kindOfStaff;
        this.year = year;
        this.heSoLuong = heSoLuong;
        this.allowance = allowance;
        this.workYears = workYears;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getHometown() {
        return hometown;
    }
    public void setHometown(String hometown) {
        this.hometown = hometown ;
    }
    
    public String getKindOfStaff() {
        return kindOfStaff;
    }
    public void setKindOfStaff(String kindOfStaff) {
        this.kindOfStaff = kindOfStaff;
    }
    
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getHeSoLuong() {
        return heSoLuong;
    }
    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    
    public int getAllowance() {
        return allowance;
    }
    public void setAllowance(int allowance) {
        this.allowance = allowance ;
    }
    
    public int getWorkYears(){
        return workYears;
    }
    public void setWorkYears(int workYears){
        this.workYears = workYears;
    }
    
     
    public int salary() {
        return 0;
    }
    
    public int getSalary(){
        return salary;
    }
    
     
 
    public String toString() {
        return "Tên: " + this.name + ", hệ số lương: " + this.heSoLuong + ", allowance: " + 
                allowance + ", Salary: " + this.salary();
    }
    public String toString2(){
        return "Tên \t Hệ số lương \t Phụ cấp \t Lương \n"
             + this.name +"\t"+  +this.heSoLuong +"\t"+ this.allowance+ "\t"+this.salary();
    }
}
