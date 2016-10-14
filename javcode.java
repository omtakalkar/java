import java.io.*;
import java.net.*;

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
catch (IOException ioe)

{
  system.out.println("error");
}
}
