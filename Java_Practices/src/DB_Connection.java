import java.sql.*;
import java.util.*;
import java.lang.*;
public class DB_Connection {
    public static void main(String[] args){
        try{
            int count = 0;
            String[] names = {"Kelvin", "Dragon", "Hylos", "Kratos", "Oculus"};
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/kit";
            String user = "root";
            String pass = "";
            Connection c = DriverManager.getConnection(url, user, pass);
            Statement s = c.createStatement();
//            for(int i = 1 ; i < 6; i++){
//                s.execute(String.format("insert into b6c (id, sname) values ('%s', '%s')", i, names[i-1]));
//            }
//            s.execute("insert into b6c (id, sname) values ('1', 'Sovichea')");
            ResultSet rs = s.executeQuery("select * from b6c");
            while(rs.next()){
                String name = rs.getString("sname");
                String id = rs.getString("id");
                System.out.println(name + " : " + id);
            }
            System.out.println("Tasks done sucessfully...");
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
