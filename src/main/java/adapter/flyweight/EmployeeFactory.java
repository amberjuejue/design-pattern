package adapter.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangyujue
 */
public class EmployeeFactory {

    private final static Map<String, Manager> EMPLOYEE_MAP = new HashMap<String, Manager>();

    public static Manager get(String department) {
        Manager manager = EMPLOYEE_MAP.get(department);
        if (manager == null) {
            System.out.println(department + "开始初始化");
            manager = new Manager(department);
            manager.setReportInfo(department + "开始汇报工作" + " 工作的内溶是....");
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
