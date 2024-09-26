import java.sql.*;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            String url = "jdbc:mysql://localhost:3306/sakila";
            Connection myConn = DriverManager.getConnection(url, "root", "Dell1234");
            Statement statement = myConn.createStatement();
            ResultSet result = statement.executeQuery("select * from customer");
       
            FileWriter csvWriter = new FileWriter("C:\\Mac\\Home\\Documents\\GitHub\\Java-2\\test.csv");
            
                int columnCount = result.getMetaData().getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    csvWriter.append(result.getMetaData().getColumnName(i));
                    if (i < columnCount) {
                        csvWriter.append(",");
                    }
                }
                csvWriter.append("\n");
    
                while (result.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        //int id = result.getInt("customer_id");
                        System.out.println(result.getString(i));
                        csvWriter.append(result.getString(i));  // Get column data as string
                        if (i < columnCount) {
                            csvWriter.append(",");
                        }
                    }
                    csvWriter.append("\n");
                }
    
                System.out.println("CSV file created successfully!");

        myConn.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }

    
    }
}
