package comperssion;

public class Tag {
  int posision,lllength;
  String next;
  public  void Set_posision(int p) {
	  posision=p;
  }
   public  void Set_length(int l) {
	  lllength=l;
  }
  public  void Set_next(char a) {
	  String s="";
	  s+=a;
	  next=s;
  }
  public  void set_null() {
	  next="NULL";
  }
  void print() {
	  System.out.print("<");
	  System.out.print(posision);
	  System.out.print(",");
	  System.out.print(lllength);
	  System.out.print(",");
	  System.out.print(next); 
	  System.out.print(">");
	  System.out.println();
	
  }
  
}
