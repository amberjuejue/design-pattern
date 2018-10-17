package v2;

/**
 * @author wangyujue
 */
public class SausageDecorator extends AbstracPancakeDecorator {
    public SausageDecorator(AbstractPancake abstractPancake) {
        super(abstractPancake);
    }

    @Override
    protected String desc() {
        return super.desc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
