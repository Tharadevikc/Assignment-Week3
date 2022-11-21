package week3.day1.classroomactivity;

public class Smartphone extends Androidphone {

	public void connectWhatsapp()
	{
		System.out.println("Connect whatapp in smartphone");
	}
	
	public void takeVideo()
	{
		System.out.println(" video is taken  from Smart phone");
	}

	public static void main(String[] args) {
Smartphone smart = new Smartphone();
smart.sendMsg();


smart.makeCall();
smart.saveContact();
smart.takeVideo();
smart.connectWhatsapp();
}
	
	
	
	
}