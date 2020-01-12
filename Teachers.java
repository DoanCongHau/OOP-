
package schoolmanagement;

/**
 *
 * @author Công Hậu
 */
public class Teachers extends Staffs{
    private String falcuty, level;
    private int teachingPeriods;
       
 
    public Teachers(String name, String hometown, String kindOfStaff,
             int year, int heSoLuong, int allowance, int workYears,String falcuty, String level,int teachingPeriods, int salary) {
        
        super(name, hometown, kindOfStaff,
             year, heSoLuong,  allowance,  workYears, salary);
        
        this.falcuty = falcuty;
        this.level = level;
        this.teachingPeriods = teachingPeriods;
    }
    
 
    public String getFalcuty() {
        return falcuty;
    }
 
    public void setFalcuty(String falcuty) {
        this.falcuty = falcuty;
    }
 
    public String getLevel() {
        return level;
    }
 
    public void setLevel(String level) {
        this.level = level;
    }
 
    public int getTeachingPeriods() {
        return teachingPeriods;
    }
 
    public void setTeachingPeriods(int teachingPeriods) {
        this.teachingPeriods = teachingPeriods;
    }
 
    
    @Override
    public int salary() {
        return (int) (this.getHeSoLuong() * 1000 + this.getAllowance() + this.getTeachingPeriods() * 45);
    }
 
  
    @Override
    public String toString() {
        return super.toString() +", year of birth: "+this.year+", Hometown: "+this.hometown+", falcuty: " + this.falcuty + ", level: " + this.level + 
            ", number of teaching periods: " + this.teachingPeriods;
    }
   
     
}
