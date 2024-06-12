package practisebeforeexam;
class Book{
	
	
public double calculateBookCost() {
	if(publishedYear<1900 || publishedYear>2000) {
		return 0;
	}
	if(cost<=0) {
		return 0;
	}
	if(publishedYear>=1900 && publishedYear<=1940) {
		cost = cost*0.25;
	}
	if(publishedYear>=1941&& publishedYear<=1980) {
		cost = cost * 0.75;
		
	}
	if(publishedYear>=1981 && publishedYear<=2020) {
		cost = cost*0.25;
	}
	retrun cost;
}
	
	
	
	
}

public class book_er_dokan {

}
