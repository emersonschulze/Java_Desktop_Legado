
package util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Emerson
 */
public class relmysql {

public Connection getConnection(){

try {
  Class.forName("com.mysql.jdbc.Driver");
String driver = "jdbc:mysql://localhost/sigfaz";
Connection con = (Connection) DriverManager.getConnection(driver, "root", "alemao");
return con;
}catch (Exception e) {
 e.printStackTrace();
}
return null;
}
}

