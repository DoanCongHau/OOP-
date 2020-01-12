package schoolmanagement;

import java.util.Comparator;

/**
 *
 * @author Công Hậu
 */
public class SalaryComparator implements Comparator<Staffs> {

    @Override
    public int compare(Staffs st1, Staffs st2) {
        return (int) (st1.getSalary() - st2.getSalary());
    }
}
