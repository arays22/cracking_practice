package cracking_practice;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class piToTheNth {

	
	

	      public static void main(String[] args) throws IOException {

	    	  Document doc = Jsoup.connect("https://ftw.usatoday.com/2017/03/pi-day-10000-digits-explanation-how-to-understand").get();

	          //String htmlString = "<html><head><title>My title</title></head>"
	                  //+ "<body>Body content</body></html>";

	          // Document doc = Jsoup.parse(htmlString);
	          String title = doc.title();
	          String body = doc.body().text();

	          System.out.printf("Title: %s%n", title);
	          System.out.printf("Body: %s", body);
	      }
	  }

