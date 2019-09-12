package Java8Features.DefaultInterfaces;

public interface InterfaceA {
    default public void myFirstInterface(Foo text){
        System.out.println(text.getName());
    }
    default public void myThirdInterface(Foo text){
        System.out.println(text.getName());
    }
    public void mySecondInterface();
}
