import java.util.HashMap;
import java.util.Map;

public class HasMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student(1, "Mukesh");
		Student s1=new Student(1, "Mukesh");
	//	HashMap<Integer,String> hm=new HashMap<Integer,String>();  
	 HashMap<Student,String> employeeMap = new HashMap<Student,String>(); 
		
	 employeeMap.put(s,"India"); 
	 employeeMap.put(s1,"India");
	 
	    for (Map.Entry<Student, String> employeeStringEntry : employeeMap.entrySet()) {

	        System.out.println(employeeStringEntry.getKey().hashCode()+"//"+employeeStringEntry.getKey()+"//"+employeeStringEntry.getValue());   

	    }
	}

}
