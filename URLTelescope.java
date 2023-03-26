package DP_builder;

public class URLTelescope {
    private String protocol;
    private String hostname;
    private String port;
    private String pathparam;
    private String queryparam;

    public URLTelescope() {
    }

    public URLTelescope(String protocol) {
        this.protocol = protocol;
    }

    public URLTelescope(String protocol, String hostname) {
        this(protocol);
        this.hostname = hostname;
    }

    public URLTelescope(String protocol, String hostname, String port) {
        this(protocol, hostname);
        this.port = port;
    }

    public URLTelescope(String protocol, String hostname, String port, String pathparam) {
        this(protocol, hostname, port);
        this.pathparam = pathparam;

    }

    public URLTelescope(String protocol, String hostname, String port, String pathparam, String queryparam) {
        this(protocol, hostname, port, pathparam);
        this.queryparam = queryparam;

    }
}
