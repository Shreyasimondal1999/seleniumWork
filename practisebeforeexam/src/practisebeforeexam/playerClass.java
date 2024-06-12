package practisebeforeexam;
import java.util.*;
 class Player {
	   private String name;
	   private String country;
	   private int totalRun;
	   private int totalWkt;
	   // setter & getter methods
	public Player(String name, String country, int totalRun, int totalWkt) {
		super();
		this.name = name;
		this.country = country;
		this.totalRun = totalRun;
		this.totalWkt = totalWkt;
	}
	public Player() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getTotalRun() {
		return totalRun;
	}
	public void setTotalRun(int totalRun) {
		this.totalRun = totalRun;
	}
	public int getTotalWkt() {
		return totalWkt;
	}
	public void setTotalWkt(int totalWkt) {
		this.totalWkt = totalWkt;
	}
	}
 class Utility{
	 
 }
public class playerClass {
	
	public int countNoOfPlayers( List<Player> players , String countryName) {
		   int count=0;
		   // fill code , if there is no player for that country, return -1 , check is case sensitive
		   for(Player p:players) {
			   if(p.getCountry().equals(countryName))
				   count++;
		   }
		   if(count>0) {
			   return count;
		   }
		   else {
			   return -1;
		   }
	   }
	public List<String> getPlayerNames(List<Player> players, int minRun, int maxRun){
		   List<String> playerList = null;
		   // fill code here it will return name of players who have run between minRun and maxRun
		   playerList = new ArrayList<>();
		   for(Player p:players) {
			   if(p.getTotalRun()>=minRun && p.getTotalRun()<=maxRun)
				   playerList.add(p.getName());
		   }
		   return playerList;
	   }
	public boolean getPlayer(List<Player> players, String playerName) throws Exception {
		   boolean found =false;
		   // fill the code here
		  // if playername is found in given list, return true 
	     //  otherwise throw an exception with message "player not found"
//		   Iterator<Player> li = players.iterator();
//		   for(;li.hasNext();) {
//			   
//		   }
		   for(Player p:players) {
			   if(p.getName().equals(playerName)) {
				   found=true;
				   break;
			   }
		   }
		   if(found)
		      return found;
		   else
			   throw new Exception("player not found");
	   }
		 
		public static Player makePlayer(String data) throws Exception {
			//Sachin:India:230:23
			Player p=null;
			String s[] = data.split(":");
			//fill code
			if(!s[0].matches("^[A-Za-z\\s]+$")) {
				throw new Exception("Data not proper");
			}
			if(!s[1].matches("^[A-Za-z]{1,}$")) {
				throw new Exception ("country improper");
			}
			if(!s[2].matches("^[0-9]{1,}$")) {
				throw new Exception ("DataRun improper");
			}
			if(!s[3].matches("^[0-9]{1,}$")) {
				throw new Exception ("DataWicket improper");
			}
			if(Integer.parseInt(s[2])<=0 || Integer.parseInt(s[3])<=0) {
				throw new Exception("Data impro");
			}
			p = new Player(s[0],s[1],Integer.parseInt(s[2]),Integer.parseInt(s[3]));
			return p;
		}
		public Map<String,Integer>  getCountryPlayers(List<Player> players) {
			  // fill up code here
			// return { "India":5 , "England":3 }
				Map<String, Integer> map = new HashMap<>();
				for(Player p:players) {
					if(map.containsKey(p.getCountry())) {
						Integer value = map.get(p.getCountry())+1;
						map.put(p.getCountry(), value);
					}
					else {
						map.put(p.getCountry(), 1);
					}
				}
				return map;
			}
			
		public boolean removeKey(Map<String, Integer> map, String key) {
			if(map.containsKey(key)) {
				map.remove(key);
				return true;
			}
			else
				return false;
		}
		public static void main(String args[]) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the input");
			String data = sc.nextLine();
			try {
			Player p =  makePlayer(data);
			}
			catch(Exception e) {
				System.out.print(e.getMessage());
			}
			
		}
}

