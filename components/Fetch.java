package components;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.FileSystems;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import Database.Env;
import java.sql.Blob;

public class Fetch {

    public static void fetch(){

    File path = FileSystems.getDefault().getPath("output").toAbsolutePath().toFile();
    if(!path.isDirectory()){
        path.mkdir();
    }
    FileOutputStream out;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + Env.getName(), Env.getUser(), Env.getPassword());
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + Env.getTable());
            while(rs.next()){
                String name = rs.getString("name");
                Blob blob = rs.getBlob("img");
                byte byteArray[] = blob.getBytes(1, (int)blob.length());
                out = new FileOutputStream("./output/" + name);
                out.write(byteArray);
                System.out.println("Fetched " + name);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

