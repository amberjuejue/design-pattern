package decorate.v2;

/**
 * @author wangyujue
 */
public class Pancake extends AbstractPancake {
    @Override
    protected String desc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
