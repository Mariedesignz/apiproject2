public class ZipCode extends ServiceCommunicator {
    public String zipcode;
    public String serviceURL;

    public ZipCode(String zipcode) {
        super("http://api.zippopotam.us/us/" + zipcode);

    }

    public static void main(String[] argv) {
        System.out.println(new ServiceCommunicator("http://api.zippopotam.us/us/" + "10011").get());
    }
}




