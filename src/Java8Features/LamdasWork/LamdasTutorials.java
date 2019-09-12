package Java8Features.LamdasWork;

public class LamdasTutorials {
    public static void main(String[] args) {
        //Needs to be final or effectively final
        Foo testFoo = new Foo("John");
        MyFunctions lambdaTutorial = (foo) -> {  System.out.println(foo.getName()); };

        lambdaTutorial.myFirstFunction(testFoo);
    }
}
