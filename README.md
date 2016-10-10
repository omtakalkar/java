# java

import java.io.*;
import java.net.*;

Public class RSSReader()
{
  public static void main(String[] args)
  {
    System.out.println(readRss("http://timesofindia.indiatimes.com/rssfeedstopstories.cms"));
  }
  
  public static string readRSS(String URLAddress)
  
  {
   URL RSSUrl = new URl(URlAddress);
   
   BufferedReader in = new BufferedReader(new InputStreamReader(RssUrl.openStream()));
   
   String line;
   
   While(line!=null)
   {
     if(line.contains("<title>"))
     {
      int firstPos = line.indexof("<title>")
      string temp = line.substring(firstPos);
      int lastPos = temp.indexof("</title>");
      temp = temp.substring(0,lastPos);
      line = line+temp+"\n" ;
      
      }
     }
    return line;
   }
   Catch (IOException ioe)
   {
    System.out.println("error");
   }
}
