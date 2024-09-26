import java.sql.*;

public class App2 {
    public static void main(String[] args) throws Exception {
        
            String url = "jdbc:mysql://localhost:3306/sakila";
            Connection myConn = DriverManager.getConnection(url, "root", "Dell1234");
            Statement statement = myConn.createStatement();
            ResultSet result = statement.executeQuery("select * from customer");
            
                int columnCount = result.getMetaData().getColumnCount();
    
                while (result.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        //int id = result.getInt("customer_id");
                        System.out.println(result.getString(i));
                       
                    }
                    
                }       

        myConn.close();


    
    }
}
