package fr.theskyblockman.networking_interface.server_type;

/**
 * @author theskyblockman
 * @implNote The interface who represents where this server should be positioned (Proxy or Positioned Server)
 */
public interface Server {
    boolean serverStarted = false;

    /**
     * Stop the server
     */
    void stop();

    /**
     * Start the server
     */
    void start();
}
