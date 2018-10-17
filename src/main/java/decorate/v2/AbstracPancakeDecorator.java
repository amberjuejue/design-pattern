package v2;

/**
 * @author wangyujue
 */
public class AbstracPancakeDecorator extends AbstractPancake {

    private AbstractPancake abstractPancake;

    public AbstracPancakeDecorator(AbstractPancake abstractPancake) {
        this.abstractPancake = abstractPancake;
    }

    @Override
    protected String desc() {
        return this.abstractPancake.desc();
    }

    @Override
    protected int cost() {
        return this.abstractPancake.cost();
    }
}
