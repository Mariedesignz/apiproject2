public class Television extends ServiceCommunicator{
    public String television;
    public String serviceURL;

    public Television(String television) {
        super("http://api.tvmaze.com" + television);

    }
}

