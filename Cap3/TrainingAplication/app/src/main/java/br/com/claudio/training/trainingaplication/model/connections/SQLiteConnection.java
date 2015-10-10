package br.com.claudio.training.trainingaplication.model.connections;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by cjunior on 09/10/15.
 */
public class SQLiteConnection {
    private static final SQLiteConnection DBCON = new SQLiteConnection();
    public static SQLiteConnection getInstance() {return DBCON;}

    private String dbPath;

    public void setDbPath(String dbPath) {
        this.dbPath = dbPath;
    }

    public Connection getConnection() {
        return null;
    }

    public void closeConnection(ResultSet results, Statement statement, Connection con) {
        try {
            if(results != null) results.close();
            if(statement != null) statement.close();
            if(con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
