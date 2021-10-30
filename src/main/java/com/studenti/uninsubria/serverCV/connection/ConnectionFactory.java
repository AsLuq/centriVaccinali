package com.studenti.uninsubria.serverCV.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author luqmanasghar
 */
public class ConnectionFactory {

    private ServerInformation serverInformation;

    public ConnectionFactory(String username, String password) throws IOException {
        serverInformation = new ServerInformation();
        serverInformation.setUsername(username);
        serverInformation.setPassword(password);
    }


    public Boolean tryConnection(){
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
