public class L3BooleanExpressionsIf {
    public static void main(String[] args){
        // compound boolean expression
        int x = 10;
        int y = 5;
        // & is logical "intersection"
        // && is "and"
        // || is "or"
        // ! is "not"
        if (!(x < y || y == 5)){
            System.out.println("yes");
        }
        if (x >= y && y != 5){
            System.out.println("yes");
        }

        String a = new String("Hello");
        String b = new String("Hello");
        System.out.println(a == b);
        System.out.println(a.equals(b));

    }
}
