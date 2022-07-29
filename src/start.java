public class start {
    public static void main(String[] args) {
        GSM gsm = new GSM();
        gsm.insertSimCard("0888888888");
        GSM gsm1 = new GSM();
//        gsm1.insertSimCard("0888888888");
        gsm.call(gsm1, 2);
        String test = "Hello";
        char[] s = test.toCharArray();
        System.out.printf("\"%s\"", test);

    }

}