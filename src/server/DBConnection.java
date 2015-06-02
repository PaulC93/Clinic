package server;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

    /**
     * Created by Paul on 02/05/2015.
     */
    public class DBConnection {

    public static Connection getConnection()
    {
       Connection connection=null;
        try {
                Context initCtx = new InitialContext();
                Context envCtx = (Context) initCtx.lookup("java:comp/env");
                DataSource ds = (DataSource) envCtx.lookup("jdbc/ClinicDB");
                connection=ds.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (NamingException e) {
              e.printStackTrace();
            }
        return connection;

    }
}
