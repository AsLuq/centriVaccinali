package com.studenti.uninsubria.serverCV.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author luqmanasghar
 */
public class ConnectionFactory {

    public static void main(String[] args) throws IOException {
        new ConnectionFactory();
    }

    public ConnectionFactory() throws IOException {
        ServerInformation serverInfo = new ServerInformation();
        if(tryConnection(serverInfo))
            System.out.println("Server connesso!");
        else
            System.out.println("Errore durante la connessione al server");

    }

    public static Boolean verifyUser(String username, String password) throws IOException {
        ServerInformation serverInfo = new ServerInformation();
        return serverInfo.getUsername().equals(username) && serverInfo.getPassword().equals(password);
    }



    public Boolean tryConnection(ServerInformation serverInformation){
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://"
                            + serverInformation.getIpServer() + ":"
                            + serverInformation.getPort() + "/"
                            + serverInformation.getDb(),
                    serverInformation.getUsername(),
                    serverInformation.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            return false;
        }
        return true;
    }
}
