public class Wiki extends ServiceCommunicator{
    public String wiki;
    public String serviceURL;

    public Wiki(String wiki) {
        super("https://en.wikipedia.org/w/api.php?action=query&list=search&srsearch=" + wiki + "&format=json");
    }
}
