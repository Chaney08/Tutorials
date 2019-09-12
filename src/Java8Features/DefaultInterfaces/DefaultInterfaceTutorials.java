package Java8Features.DefaultInterfaces;

public class DefaultInterfaceTutorials{
    public static void main(String[] args) {
        //Needs to be final or effectively final
        Foo testFoo = new Foo("John");
        InterfaceAImpl impl = new InterfaceAImpl();
        impl.myFirstInterface(testFoo);
    }
}
