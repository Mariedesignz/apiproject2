import java.util.Scanner;

public  class MyApp {

    //private static String music;



    public static void main(String[] args) {
        String request = "";

        while (true) {
            	// System.in

            request = getRequest(request);
           // String getRequest = sc.next();
            if ( validateRequest(request) )
                doRequest(request);
            else
                displayError();
        }
    }
    public static String getRequest(String request) {
        System.out.println("What are you searching for zip, music, television, wiki");
        System.out.println("Command> ");
        Scanner sc = new Scanner(System.in);
        request = sc.next();
        System.out.println("You requested " + request);
        //String getRequest = sc.next();
        return request;
    }
    public static boolean validateRequest(String request ) {
        if (request.equalsIgnoreCase("Music")) {
            return true;

        } else if (request.equalsIgnoreCase("Zip")) {
            return true;

        } else if (request.equalsIgnoreCase("Television")) {
            return true;

        } else if (request.equalsIgnoreCase("Wiki")) {
            return true;



        } else {
            System.out.println("Enter a valid answer.");
            return false;
        }
    }
    public static void  doRequest(String request) {
        if (request.equalsIgnoreCase("Music")) {

            System.out.println("Please enter song name");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            Music song  = new Music(input);
            song.get();

        } else if (request.equalsIgnoreCase("Zip")) {

            System.out.println("please enter zip you want");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            ZipCode zip  = new ZipCode(input);
            zip.get();

        } else if (request.equalsIgnoreCase("Television")) {
            System.out.println("Please enter show");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            Television show = new Television(input);
            show.get();

        }else if (request.equalsIgnoreCase("wiki")) {
            System.out.println("Please enter response");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            Wiki answer = new Wiki(input);
            answer.get();




            System.out.println("Please enter show you want");
        }
        }
    public static void displayError() {
                System.out.println("info not valid please try again");
                //getRequest();
            }


// (userInput != "done" || userInput != "Done") {
        //if (userInput == "done" || userInput != "Done")




                //System.out.println("music:" + music + ".");

            }


