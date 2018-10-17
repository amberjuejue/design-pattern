package decorate;

/**
 * @author wangyujue
 */
public class PancakeWithEggAndSausage extends PancakeWithEgg {
    @Override
    public String describe() {
        return super.describe() + " 加一跟香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
