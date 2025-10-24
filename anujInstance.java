public class anujInstance {

    public class parentclass {
        int a = 7;
        public parentclass() {
            System.out.println("inside parent");
        }
    }

    public class child1 extends parentclass {
        public child1() {
            System.out.println("inside child1");
        }
    }

    public class child2 extends parentclass {
        public child2() {
            System.out.println("inside child2");
        }
    }

    public static void main(String[] args) {
        anujInstance outer = new anujInstance(); // Required to create inner class instances

        parentclass obj = outer.new child2(); // ✅ Correct instantiation of non-static inner class
        System.out.println(obj instanceof child2); // true
        System.out.println(obj instanceof child1); // false

        child1 childobj = outer.new child1();
        System.out.println(childobj instanceof parentclass); // true

        String val = "hello";
        System.out.println(val instanceof String); // true

        // Object unknownObject = new randowmClass(); // ❌ randowmClass is undefined
        // System.out.println(unknownObject instanceof child2); // Compilation error
    }
}