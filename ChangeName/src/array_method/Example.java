package array_method;

public class Example {
    public String getName() {
        return "HELLO EVERYONE";
    }

    public static class Example1 extends Example {
        @Override
        public String getName() {
            return "TRan VAn NHut";
        }

    }

    public static void main(String[] args) {
        Example object = new Example();
        System.out.println(object.getName());
        Example1 object1 = new Example1();
        System.out.println(object1.getName());
    }
}


