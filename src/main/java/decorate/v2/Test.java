package v2;

/**
 * @author wangyujue
 */
public class Test {

    public static void main(String[] args) {

        AbstractPancake abstractPancake;
        abstractPancake = new Pancake();
        abstractPancake = new EggDecorator(abstractPancake);
        abstractPancake = new EggDecorator(abstractPancake);
        abstractPancake = new SausageDecorator(abstractPancake);
        abstractPancake = new SausageDecorator(abstractPancake);
        System.out.println(abstractPancake.desc());
        System.out.println(abstractPancake.cost());

    }
}
