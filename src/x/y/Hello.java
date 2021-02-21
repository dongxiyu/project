package x.y;

public class Hello {

    public static void main(String[] args) {
        System.out.println();
        String[]a={"a","s","q"};
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }

        for (String s : a) {
            System.out.println(s);
        }
    }
}
