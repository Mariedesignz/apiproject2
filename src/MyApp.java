import java.util.Scanner;

public  class MyApp {

    private static String music;

    public static void main(String[] args) {


        System.out.println("What are you searching for zip, music, television");
        System.out.println("Command> ");
        Scanner sc = new Scanner(System.in);

        String music = sc.next();
        String userInput = null;

        if (userInput == "done" || userInput != "Done")
            while (userInput != "done" || userInput != "Done") {



                //System.out.println("music:" + music + ".");
                System.out.println("You picked music");

                System.out.println("https://itunes.apple.com/search?term=prince" + music);
                System.exit(1);
            }
    }
}