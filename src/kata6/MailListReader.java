package kata6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class MailListReader {
    public static ArrayList<Person> read () throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        ArrayList <Person> peopleList = new ArrayList<>();
        
        Class.forName("org.sqlite.JDBC");
        Connection cn= DriverManager.getConnection("jdbc:sqlite:KATA.sDB");
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM people");
        
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String genero = rs.getString("genero");
            String mail = rs.getString("mail");
            float peso = rs.getFloat("peso");
            
            peopleList.add(new Person(id,name,mail,peso,genero));
        }
        
        return peopleList;
    }


}
