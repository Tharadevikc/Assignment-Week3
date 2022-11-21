package week3.day1.classroomactivity;

public class Studentdetail {
public void getStudentInfo(String name) {
	System.out.println(name);
}
public void getStudentInfo(int rollno)
{
	
	System.out.println(rollno);

}
public void getStudentInfo(int rollno,String name)
{
	System.out.println(rollno+name);
}
public void getStudentInfo(String name ,int Phno)
{
	System.out.println(name+Phno);
}
public static void main(String[] args) {
Studentdetail Detail = new Studentdetail();
Detail.getStudentInfo(0);
Detail.getStudentInfo("hara");
Detail.getStudentInfo(22, "Tharadevi");
Detail.getStudentInfo("Devi", 999);
System.out.println(org.apache.xmlbeans.impl.soap.Detail.class);
}
}