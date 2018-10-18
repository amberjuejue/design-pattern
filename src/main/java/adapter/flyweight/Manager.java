package adapter.flyweight;

/**
 * @author wangyujue
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportInfo);
    }

    public Manager(String department) {
        this.department = department;
    }

    private String reportInfo;

    private String department;



    public void setReportInfo(String reportInfo) {
        this.reportInfo = reportInfo;
    }
}
