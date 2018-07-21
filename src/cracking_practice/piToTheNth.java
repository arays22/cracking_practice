package cracking_practice;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class piToTheNth {

	
	

	      public static void main(String[] args) throws IOException {

	    	  Document doc = Jsoup.connect("https://www.angio.net/pi/digits.html").get();

	          //String htmlString = "<html><head><title>My title</title></head>"
	                  //+ "<body>Body content</body></html>";

	          // Document doc = Jsoup.parse(htmlString);
	          //String title = doc.title();
	          //String body = doc.body().text();

	          //System.out.printf("Title: %s%n", title);
	          //System.out.printf("Body: %s", body);
	    	  // Elements paragraphs = doc.select("p");
	    	 // for(Element p : paragraphs)
	    	   // System.out.println(p.text());
	    	 // Elements ps = doc.select("div[id=articleBody] > p");
	    	  //for (Element p : ps) {
	    		  System.out.println(doc.select("tt").text());
	    	  }
	    	    
	      
	  }

