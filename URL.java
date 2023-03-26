package DP_builder;

public class URL {
    private String protocol;
    private String hostname;
    private String port;
    private String pathparam;
    private String queryparam;

    public URL() {
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPathparam() {
        return pathparam;
    }

    public void setPathparam(String pathparam) {
        this.pathparam = pathparam;
    }

    public String getQueryparam() {
        return queryparam;
    }

    public void setQueryparam(String queryparam) {
        this.queryparam = queryparam;
    }


    public URL(String protocol) {
        this.protocol = protocol;
    }

    public URL(String protocol, String hostname) {
        this.protocol = protocol;
        this.hostname = hostname;
    }

    public URL(String protocol, String hostname, String port) {
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
    }

    public URL(String protocol, String hostname, String port, String pathparam) {
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
        this.pathparam = pathparam;
    }

    public URL(String protocol, String hostname, String port, String pathparam, String queryparam) {
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
        this.pathparam = pathparam;
        this.queryparam = queryparam;
    }


}
