package adapter.objectadapter;

import adapter.objectadapter.Adapter;
import adapter.objectadapter.ConcreteTarget;
import adapter.objectadapter.Target;

/**
 * @author wangyujue
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        Target adapter = new Adapter();
        adapter.request();
    }
}
