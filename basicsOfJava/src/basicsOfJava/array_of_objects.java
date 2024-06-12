package basicsOfJava;
class Subject{
private String subid;
private String subname;
private int maxMarks;
private int marksObtain;
public Subject(String subjectid,String subjectname){
subid = subjectid;
subname = subjectname;
}
 
public void setmaxMarks(int maximumMarks){
maxMarks=maximumMarks;
}
public void setmaxMarksObtain(int obtainMarks){
marksObtain = obtainMarks;
}
public String getsubId(){return subid;}
public String getsubname(){return subname;}
public int getmaxmarks(){return maxMarks;}
public int getobtainmarks(){return marksObtain;}
@Override
public String toString(){
return "\nsubject id : " + subid + "\nsubject name : " + subname + "\n maximum marks :" + maxMarks + "\n obtained marks : " + marksObtain;
}
}
 
class Student{
private String name;
private String dept;
private String rollno;
private Subject sub[];
 
public Student(String stu_name, String stu_dept, String Stu_rollno){
name = stu_name;
dept=stu_dept;
rollno = Stu_rollno;
sub = new Subject[3];
}
 
public String getName(){return name;}
public String getDept(){return dept;}
public String getRollno(){return rollno;}
 
public void setSubjects(Subject ...subs){
    
   for(int x = 0 ; x<subs.length;x++)
   {
       this.sub[x]=subs[x];
       
   }
 
}
 
public Subject[] getSubject(){
return sub;}
public int Maximummarkonsubject() {
	int maxMarks=0;
	int temp = sub[0].getobtainmarks();
	System.out.println(sub[0].getobtainmarks());
	for(Subject x : sub) {
		System.out.println(sub[0].getobtainmarks());
		if(x.getobtainmarks()>temp) {
			temp=x.getobtainmarks();
		maxMarks = x.getobtainmarks();}
	}
	return maxMarks;
}
}
public class array_of_objects {
	public static void main(String[] args) {
        // TODO code application logic here
         Subject sub[] = new Subject [3];
       sub[0] = new Subject("s1","math");
        sub[0].setmaxMarks(100);
        sub[0].setmaxMarksObtain(97);
       // System.out.println(sub[0]);
         
        sub[1] = new Subject("s2","physics");
        sub[1].setmaxMarks(100);
        sub[1].setmaxMarksObtain(98);
        
        sub[2] = new Subject("s3","chemistry");
        sub[2].setmaxMarks(100);
        sub[2].setmaxMarksObtain(96);   
        
         Student st1 = new Student("srijit", "comp","1");
        st1.setSubjects(sub);
        for(Subject x : st1.getSubject()){
        System.out.println(x);
        }
        System.out.println("maximum marks : "+st1.Maximummarkonsubject());
    }
    
}
 