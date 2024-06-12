package practisebeforeexam;
import java.util.*;


public class unlockToFuture {
	public static Lock extractDetails(String lockDetails) {
        //Fill the code here
	    String[] s = lockDetails.split(":");
	    int[] code = new int[Integer.parseInt(s[1])];
	    for(int i=0;i<code.length;i++)
	        code[i] = Integer.parseInt(s[i+2]);
	    Lock l = new Lock(s[0],Integer.parseInt(s[1]),code,s[s.length-1]);
		return l;
		
	}	
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Fill the code here 
		System.out.println("Enter the details");
		String s = sc.nextLine();
		Lock lock = extractDetails(s);
		System.out.println("Enter the code attempts of length "+lock.getCodeLength());
		int len = lock.getCodeLength();
		int codeAtt[] = new int[len];
		for(int i=0;i<len;i++) {
		    codeAtt[i] = sc.nextInt();
		}
		String res = lock.enterCodeToUnlock(codeAtt);
		if(res.contains("Lock correct")){
    		System.out.println("Lock Model: "+lock.getLockModel());
    		System.out.println("Code Length: "+lock.getCodeLength());
    		System.out.println("Lock state: "+lock.getLockState());
    		System.out.println(res);
		}
		else
		    	System.out.println(res);
	}
}

class Lock {
 
	private String lockModel;
	private int codeLength;
	private int[] code;
	private String lockState;
 
 
	public Lock(String lockModel,int codeLength, int[] code, String lockState) {
		super();
		this.lockModel=lockModel;
		this.codeLength = codeLength;
		this.code = code;
		this.lockState = lockState;
	}
 
	public String getLockModel() {
		return lockModel;
	}
 
	public void setLockModel(String lockModel) {
		this.lockModel = lockModel;
	}
 
	public int getCodeLength() {
		return codeLength;
	}
 
	public void setCodeLength(int codeLength) {
		this.codeLength = codeLength;
	}
 
	public int[] getCode() {
		return code;
	}	 	  	  	 		  	     	      	 	
 
	public void setCode(int[] code) {
		this.code = code;
	}
 
	public String getLockState() {
		return lockState;
	}
 
	public void setLockState(String lockState) {
		this.lockState = lockState;
	}
 
 
	public String enterCodeToUnlock(int[] codeAttempts) {
	
		//  Fill the code here
		String s = null;
		if(this.lockState.equalsIgnoreCase("Unlocked")) {
			return "Lock is already unlocked.";
		}
		if(this.lockState.equalsIgnoreCase("Locked")){
            int check=0;
			for(int i = 0; i<this.codeLength;i++) {
				if(code[i]==codeAttempts[i]) {
					continue;
				}
				else {
					check++;
				}
			}
			if(check>0) {
				return "Incorrect code. Please try again.";
			}
			else {
				this.setLockState("Unlocked");
				return "Lock correct";
			}
		}
		return s;
		
}	
}

