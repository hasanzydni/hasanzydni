package openBrowser;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;


public class UrlOpen 
{

	public static void main(String[] args) 
	{

		
		  try 
		  {
		   
		   URI uri= new URI("https://www.microsoft.com/en-in/");  
		   java.awt.Desktop.getDesktop().browse(uri);
		    System.out.println("Web page opened in browser");
		 System.out.println();
		  } 
		  catch (Exception e) 
		  {
		   
		   e.printStackTrace();
		  }
		 }

		

	}


