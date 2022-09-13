package constructor;

public class Overridig_Sub extends Overriding_Super {
	
	
static 	void super_01() {
		
		System.out.println("Sub_01");
	}
	
  void super_01(int a) {
		
		System.out.println("Sub_02");
	}
   void  sub() {
	  super.super_01(); 
	  
  }
  
	

public static void main(String[] args) {
	
	Overridig_Sub sub =new Overridig_Sub();
	sub.sub();
    
	
	
	
}

}
