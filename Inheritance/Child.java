package Inheritance;

public class Child extends Parent {
    //Attributes
    public int attr4; 

    //Constructor
    public Child(int attr1, int attr2, int attr3, int attr4) {
        super(attr1, attr2, attr3);
        this.attr4 = attr4;
    }

    //Methods
    @Override
    public void printAttr2() {
        System.out.println("OVERRIDEN");
    }

    public void printAttr4() {
        System.out.println(this.attr4);
    }

    public void printAttr2Alt() {
        super.printAttr2();
    }
}
