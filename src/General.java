public class General {
    public static void main(String[] args) {
        System.out.println("Hello Army! ");
        Army army = new Army("army7", "abc123", 16, "dancing", "army@army.com" );
        System.out.println("My username: " + army.getUserName());
        army.setUserName("pizzaheart");
        System.out.println("My username: " + army.getUserName());
        Blink blink = new Blink(21, "Koen");
        System.out.println("My Blink name is:" + blink.getName());
        blink.setName("Paboya");
        System.out.println("My Blink name is:" + blink.getName());


        for (int i = 12; i >= 8; i--) {
            System.out.println("blinkarmy" + i);
//            System.out.println();
        }
        for (int i = 17; i <= 21; i++) {
            System.out.println(i * 2);
        }
    }
}