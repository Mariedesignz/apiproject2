public class Television extends ServiceCommunicator{
    public String television;
    public String serviceURL;

    public Television(String serviceURL) {
        super(serviceURL);
        this.serviceURL = serviceURL;
        this.television = television;
    }
    public String getTelevision() {
        return this.serviceURL + this.television;
    }

    public static void main(String[] args) {
        Television i = new Television("http://api.tvmaze.com/singlesearch/shows?q=monk");
        System.out.println(i.getTelevision());
    }
}

