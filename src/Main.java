import emailapp.*;
public class Main {
    public static void main(String[] args) {
        Email email = new Email("kishi","kishore");
        email.setAlternateEmail("kn331@gmail.com");
        System.out.println(email.getAlternateEmail());

    }
}
