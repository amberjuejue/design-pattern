package adapter.classadapter;

/**
 * @author wangyujue
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
