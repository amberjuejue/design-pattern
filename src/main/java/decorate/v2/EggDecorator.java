package decorate.v2;

/**
 * @author wangyujue
 */
public class EggDecorator extends AbstracPancakeDecorator {
    public EggDecorator(AbstractPancake abstractPancake) {
        super(abstractPancake);
    }

    @Override
    protected String desc() {
        return super.desc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
