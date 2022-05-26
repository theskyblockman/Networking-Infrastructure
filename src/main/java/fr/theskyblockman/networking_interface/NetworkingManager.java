package fr.theskyblockman.networking_interface;

import fr.theskyblockman.networking_interface.server_type.Server;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author theskyblockman
 * @implNote This networking manager is where you should manage the server, when creating a new networking manager it will store the Server who was given, but to start this server please use the {@link #start()} method
 */
public class NetworkingManager {

    /**
     * The server which is used by the networking manager
     */
    public Server registeredServer;
    public static Logger logger = LogManager.getLogger();


    /**
     * The constructor of the networking manager
     * @param registerAs the server which going to be used by the networking manager
     */
    public NetworkingManager(Server registerAs) {
        logger.info("Started new server");
    }

    /**
     * The method to start the server stored in the networking manager
     */
    public void start() {
        if(this.registeredServer.serverStarted) {
            logger.warn("Trying to start the server even if it is already started !");
            return;
        }

        this.registeredServer.start();
    }

    /**
     * The method to stop the server stored in the networking manager
     */
    public void stop() {
        if(!this.registeredServer.serverStarted) {
            logger.warn("Trying to stop an already stopped server !");
            return;
        }

        this.registeredServer.stop();
    }

    /**
     * The method to restart the server stored in the networking manager
     */
    public void restart() {
        if(this.registeredServer.serverStarted) {
            this.stop();
        } else {
            logger.warn("Trying to restart an already stopped server !");
        }

        this.start();
    }
}
