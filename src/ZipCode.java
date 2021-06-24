public class ZipCode extends ServiceCommunicator {
    public String zipcode;
    public String serviceURL;

    public ZipCode(String zipcode) {
        super("http://api.zippopotam.us/us/" + zipcode);

    }
}




