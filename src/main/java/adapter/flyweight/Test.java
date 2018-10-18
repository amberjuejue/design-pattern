package adapter.flyweight;

import java.util.Random;

/**
 * @author wangyujue
 */
public class Test {

    public static void main(String[] args) {
        String[] departments = {"RD", "PM", "QA", "SA"};
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Employee employee = EmployeeFactory.get(department);
            employee.report();
        }

    }
}
