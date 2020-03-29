package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseManager<T> {
    /**
     * This method is to run a SQL query passed by the client
     * The client must parameterize the query
     * @param stringBuilder This is the first paremeter and the SQL query
     *                      which the client will pass
     * @param type  This is the second parameter which determines the return
     *              type of the method.  The client must know the data type
     *              of the column they are expecting when running this method.
     *              The java equivalent of that return type should be passed
     *              in this parameter
     * @return T    This returns the value of the query.  Currently this method
     *              only supports single value returns
     */
    public T runGenericQuery(StringBuilder stringBuilder, Class<T> type) {
        String hostName = "server-pointofsales.database.windows.net";
        String dbName = "PointOfSales";
        String user = "patrickmcguire176";
        String password = "******";
        String url = String.format("jdbc:sqlserver://server-pointofsales.database.windows.net:1433;database=PointOfSales;" +
                        "user=patrickmcguire176@server-pointofsales;password=BsRodeo720!;" +
                        "encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;",
                hostName, dbName, user, password);
        Connection connection;

        Object result = null;
        try {
            connection = DriverManager.getConnection(url);

            String selectSql = stringBuilder.toString();

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectSql)) {

                while (resultSet.next()) {
                    result = resultSet.getObject(1);
                }
                connection.close();
                if (result == null){
                    return null;
                } else {
                    return type.cast(result);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

