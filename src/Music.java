public class Music extends ServiceCommunicator {
    public String music;
    public String serviceURL;
    public Object json;

    public Music(String music) {
        super("https://itunes.apple.com/search?term=" + music);

    }

    public void printJsonObject(Object json) {
    }
}
