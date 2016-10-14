import java.io.*;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class googlefeeds
{
  public static void main()String [] args)
  {
    System.out.println(readRSS("https://news.google.co.in/news?cf=all&hl=en&pz=1&ned=in&output=rss"));
  }

  public static String readRSS( String urlAddress)
  {
  try
 {
    URL rssURL = new URL(urlAddress);
    
    BufferedReader in = new BufferedReader (new InputStreamReader(rssURl.openStream()));
    
    String line;
    
    While(line=in.readline()!=NULL)
    {
      if(line.contains("<title>") 
      String temp = line.substring(firstPos);
      temp = temp.replace("<title>","");
      int lastPos = temp.indexOf("</title>");
      temp = temp.substring(0,lastPos);
      line = line+temp;
    }
  
  }
 in.close; 
return line;
}
catch(IOException ioe)
{
  System.out.println("error");
}
}


public class SelectStatementSample
{
    public static void main(String[] args) throws Exception
    {
        Connection connection = null;
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
 
            String url = "jdbc:mysql://localhost/testdb";
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
            Statement stmt = connection.createStatement();
            String recods = line;
            String sql = "insert into users (first name,last name,numbers )"+ values(? ? ?);
           PreparedStatement preparedStmt = conn.prepareStatement(sql);
          
          preparedStmt.execute();
          connection.close;
        }  
          catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
   }
}     
          
