package fr.theskyblockman.networking_interface.server_type;

import java.net.Socket;

/**
 * @author theskyblockman
 * @implNote The representation of a proxy to communicate with the proxy and not to a server through the proxy
 */
public class ProxyConnexion implements Connexion {
    public String ip;
    public int port;
    public Socket socket;

    public ProxyConnexion(String ip, int port, Socket socket) {

    }
}
