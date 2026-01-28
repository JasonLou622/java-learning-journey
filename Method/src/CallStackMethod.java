
public class CallStackMethod {

    public static void method4() {
        String begin = "Push m4 into the stack.\n";
        System.out.println(begin);
        System.out.println(" --- Last-In-First-Out --- ");
        String end = "Pop out m4 from the stack, method fout is completed.";
        System.out.println(end);
    }

    public static void method3() {
        String begin = "Push m3 into the stack.";
        System.out.println(begin);
        method4();
        String end = "Pop out m3 from the stack, method three is completed.";
        System.out.println(end);
    }

    public static void method2() {
        String begin = "Push m2 into the stack.";
        System.out.println(begin);
        method3();
        String end = "Pop out m2 from the stack, method two is completed.";
        System.out.println(end);
    }

    public static void method1() {
        String begin = "Push m1 into the stack.";
        System.out.println(begin);
        method2();
        String end = "Pop out m1 from the stack, method one is completed.";
        System.out.println(end);
    }

    public static void main(String[] args) {
        String str = " --- First-In-Last-Out ---";
        System.out.println(str);
        method1();
    }
}
