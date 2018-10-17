/**
 * @author wangyujue
 */
public class Test {
    public static void main(String[] args) {
        Pancake pancake = new Pancake();
        System.out.println(pancake.describe());
        System.out.println(pancake.cost());

        Pancake pancakeWithEgg = new PancakeWithEgg();
        System.out.println(pancakeWithEgg.describe());
        System.out.println(pancakeWithEgg.cost());

        Pancake pancakeWithEggAndSausage = new PancakeWithEggAndSausage();
        System.out.println(pancakeWithEggAndSausage.describe());
        System.out.println(pancakeWithEggAndSausage.cost());
    }
}
