package Database;

import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Add {
     public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + Env.getName(), Env.getUser(), Env.getPassword());
            Path path = FileSystems.getDefault().getPath("./Database/upload").toAbsolutePath();
            if(path == null){
                System.out.println("upload not found");
                return;
            }
            File folder = new File(path.toString()); 
            File[] fileList = folder.listFiles();
            if(fileList.length == 0){
                System.out.println("Nothing to upload");
                return;
            }
            for(File ele : fileList){
                InputStream in = new FileInputStream(ele);
                int lastIndex = ele.toString().lastIndexOf("\\");
                String name = ele.toString().substring(lastIndex + 1);
                PreparedStatement statement = con.prepareStatement("INSERT INTO " + Env.getTable() + "(name, img) VALUES(?, ?)");
                statement.setString(1, name);
                statement.setBlob(2, in);
                statement.execute();
                System.out.println("inserito " + name);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

