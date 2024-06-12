package practisebeforeexam;
import java.util.*;
import java.util.Map.Entry;
public class Zmovies {
	private Map<String,Float> mp = new HashMap<>();
	public Map<String,Float> getMovieDetails(){
		return mp;
	}
		public void setMovieDetails(Map<String,Float>  mp){
			this.mp = mp;
		}
		public float findMovieRating(String mvname) {
			float val = 0;
			for(Map.Entry<String, Float> m : mp.entrySet()) {
				if(m.getKey().equalsIgnoreCase(mvname)) {
				 val = m.getValue();
				}
			}
			return val;
		}
		public List<String> finMovieWithHighestRating(){
			List<String> lis = new ArrayList<String>();
			
//			List<Map.Entry<String,Float>> l = new ArrayList<>(mp.entrySet());
//			Collections.sort(l,Map.Entry.comparingByValue());
			float max = 0;
			String temp= "";
			for(Map.Entry<String, Float> m : mp.entrySet()) {
				if(m.getValue()>=max) {
				 max = m.getValue();
			}
			}
			for(Map.Entry<String, Float> m : mp.entrySet()) {
				if(m.getValue()>=max) {
				 max = m.getValue();
			}
			}
			for(Map.Entry<String, Float> m : mp.entrySet()) {
				if(m.getValue()==max) {
				lis.add(m.getKey());
			}
			}
			
			return lis;
		}
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			Zmovies mv = new Zmovies();
			List<String> l = new ArrayList<>();
			Map<String,Float> mp = new HashMap<>();
			System.out.println("Enter the no of records to be added");
			int no = sc.nextInt();
			System.out.println("Enter the movie records:");
			sc.nextLine();
			String movierecords[] = new String[no];
			for(int i = 0; i< no;i++) {
				movierecords[i] = sc.nextLine();
;			}
			for(int i = 0; i< no;i++) {
				String arr[]=movierecords[i].split(":");
				mp.put(arr[0], Float.parseFloat(arr[1]));
				mv.setMovieDetails(mp);
;			}
			System.out.println("enter the movie names to be searched:");
			//sc.nextLine();
			String str = sc.nextLine();
			float rating = mv.findMovieRating(str);
			System.out.println(rating);
			l = mv.finMovieWithHighestRating();
			System.out.println(l);
			
			
		}
	}

