package Inheritance;

public class Parent {
    //Attributes
    private int attr1;
    protected int attr2;
    public int attr3;

    //Constructor
    public Parent(int attr1, int attr2, int attr3) {
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.attr3 = attr3;
    }

    //Methods
    private void printAttr1() {
        System.out.println(this.attr1);
    }

    protected void printAttr2() {
        System.out.println(this.attr2);
    }

    public void printAttr3() {
        System.out.println(this.attr3);
    }
}
