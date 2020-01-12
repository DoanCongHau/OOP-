
package schoolmanagement;

import java.util.Comparator;

/**
 *
 * @author Công Hậu
 */
public class NameComparator implements Comparator<Staffs>{
    @Override
    public int compare(Staffs st1,Staffs st2){
        return st1.getName().compareTo(st2.getName());
    }
}
