package fr.theskyblockman.networking_interface.server_type;

public class ProxyServer implements Server {
    public String key;
    private final int port;


    @Override
    public void stop() {

    }

    @Override
    public void start() {

    }


    public ProxyServer(String key, int port) {
        this.key = key;
        this.port = port;
    }
}
