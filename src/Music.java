public class Music extends ServiceCommunicator {
    public String music;
    public String serviceURL;
    public Object json;

    public Music(String music) {
        super("https://itunes.apple.com/search?term=" + music + "&limit=1");

    }

    public void printJsonObject(Object json) {
    }

    public static void main(String[] argv) {
        System.out.println(new ServiceCommunicator("https://itunes.apple.com/search?term=" + "bbking" + "\\&limit=1").get());
    }
}