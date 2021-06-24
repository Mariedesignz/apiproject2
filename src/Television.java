public class Television extends ServiceCommunicator{
    public String television;
    public String serviceURL;

    public Television(String television) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + television);

    }

    public static void main(String[] argv) {
        System.out.println("http://api.tvmaze.com/singlesearch/shows?q=SEARCH");
    }
}

