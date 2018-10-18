package adapter.objectadapter;

/**
 * @author wangyujue
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
