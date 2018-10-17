package decorate;

/**
 * @author wangyujue
 */
public class PancakeWithEgg extends Pancake {
    @Override
    public String describe() {
        return super.describe() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
