package cracking_practice;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class piToTheNth {

	
	static String pi = "1415926535897932384626433832795028"
			+ "841971693993751058209749445923"
			+ "0781640628620899862803482534211706798214808651328230664709384460"
			+ "9550582231725359408128481117450284102701938521105559644622948954"
			+ "9303819644288109756659334461284756482337867831652712019091456485"
			+ "6692346034861045432664821339360726024914127372458700660631558817"
			+ "4881520920962829254091715364367892590360011330530548820466521384"
			+ "1469519415116094330572703657595919530921861173819326117931051185"
			+ "4807446237996274956735188575272489122793818301194912983367336244"
			+ "0656643086021394946395224737190702179860943702770539217176293176"
			+ "7523846748184676694051320005681271452635608277857713427577896091"
			+ "7363717872146844090122495343014654958537105079227968925892354201"
			+ "9956112129021960864034418159813629774771309960518707211349999998"
			+ "3729780499510597317328160963185950244594553469083026425223082533"
			+ "4468503526193118817101000313783875288658753320838142061717766914"
			+ "7303598253490428755468731159562863882353787593751957781857780532"
			+ "171226806613001927876611195909216420198";
			

			static void digitsOfPi(int digits) {
				for (int i = 0; i < pi.length() - digits; i++){
				    char c = pi.charAt(i);        
				    System.out.println(Character.toString(c));
				}
			}
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
	    	  String text = removeSpaces(doc.select("tt").text());
	    		  //System.out.println(text);
	    		  
	    		  
	    			
	    	  }
	      
	      static String removeSpaces(String str) {
	    	  str.replaceAll(" ", "");
	    	  return str;
	      }
	    	    
	      
	  }

