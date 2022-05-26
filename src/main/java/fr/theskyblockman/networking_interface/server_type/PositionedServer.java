package fr.theskyblockman.networking_interface.server_type;

public class PositionedServer implements Server {
    public String key;
    private final String ip;
    private final int port;

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    public PositionedServer(String key, String ip, int port) {
        this.key = key;
        this.ip = ip;
        this.port = port;
    }
}
