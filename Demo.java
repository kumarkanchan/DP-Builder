package DP_builder;

public class Demo {
    public static void main(String[] args) {
        URL url = new URL();

        url.setProtocol("http://");
        url.setHostname("mywebsite");
        url.setPort("8080/");
        url.setPathparam("homepage");
        url.setPathparam("random");

        System.out.println("Using called get-method from Url class");
        System.out.println(url.getProtocol() + url.getHostname() + url.getPort() + url.getPathparam());

        System.out.println("Using URLBuilder.Builder");
        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("http://").hostname("newwebsite:").port("443");
        URLBuilder urlBuilder = builder.build();
        System.out.println(urlBuilder.protocol + urlBuilder.hostname + urlBuilder.port);

        System.out.println("In Builder if need based on your choice eg: protocol, hostname and pathparam");
        URLBuilder.Builder builder1 = new URLBuilder.Builder();
        builder1.protocol("http://").hostname("newwebsitetwo").pathparam("abc");
        URLBuilder builder2 = builder1.build();
        System.out.println(builder2.protocol + builder2.hostname + builder2.pathparam);
    }
}
