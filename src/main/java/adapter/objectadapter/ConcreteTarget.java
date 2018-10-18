package adapter.objectadapter;

/**
 * @author wangyujue
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget");
    }
}
