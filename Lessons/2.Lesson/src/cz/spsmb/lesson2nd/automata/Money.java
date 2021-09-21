package cz.spsmb.lesson2nd.automata;

public enum Money {
    V5000(5000),
    V2000(2000),
    V1000(1000),
    V500(500),
    V200(200),
    V100(100),
    V50(50),
    V20(20),
    V10(10),
    V5(5),
    V2(2),
    V1(1);

    private int value;

    Money(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
