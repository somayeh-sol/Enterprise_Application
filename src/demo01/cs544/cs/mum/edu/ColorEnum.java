package demo01.cs544.cs.mum.edu;

/**
 *
 * @author Somayeh
 */
public enum ColorEnum {

    Unknown(0),
    Black(1),
    White(2),
    Blue(3),
    Red(4),
    purple(5),
    Gold(6),
    Silver(7),
    Yellow(8),
    Green(9),
    Pink(10);

    private int value;

    private ColorEnum() {

        for (ColorEnum c : ColorEnum.values()) {
            System.out.printf("color  %s %d\n", c, c.value);
        }
    }

    private ColorEnum(int value) {
        this.value = value;
    }

}
