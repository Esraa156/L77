 package comperssion;
import java.util.Scanner;
public class main {
	  static void Compression(String data,int sea_mindow,int look_ahead){
		  char [] charArr=data.toCharArray();
			Tag obj[]= new Tag[200];
			 int Tag_number=0;
			 //loop on array
		  for(int i=0;i<charArr.length;i++)
			 {
			  //find the longest sequence 
				 int position_search=i-sea_mindow,length=0,temp=i;
			        if(position_search<0)
			        {
			            position_search=0;
			        }
			        int t=length,pos_i=0;

			        for(; position_search<i;position_search++)
			        {
			            int yj=position_search,yi=i;
			            if(charArr[i]==charArr[position_search])
			            {
			                int nodes=0;
			                while(yi<charArr.length&&charArr[yi]==charArr[yj]&&yj<i&&yi<look_ahead+i)
			                {
			                    yi++;
			                    yj++;
			                    nodes++;
			                }
			                if(nodes==length)
			                {
			                    temp=position_search;
			                    pos_i=yi;
			                    length=nodes;
			                }
			                else
			                {
			                    t=length;
			                    //if we get longer sequence 
			                    length=Math.max(length,nodes);


			                    if(length>t){

			                        pos_i=yi;

			                        temp=position_search;
			                    }
			                }
			            }
			        }
			        obj[Tag_number]=new Tag();
			        int Position=i-temp;
			        obj[Tag_number].Set_posision(Position);
			        obj[Tag_number].Set_length(length);
			      
			        if(pos_i>=charArr.length)
			        {
			            obj[Tag_number].set_null();
			        }
			        else
			        {
			        	char Nextsymbol;
			            if(pos_i>0)
			            	Nextsymbol =charArr[pos_i];
			            	
			            else
			            	Nextsymbol=charArr[i];
			            
			            	obj[Tag_number].Set_next(Nextsymbol);

			            
			        }
			        if(pos_i>0)
			            i=pos_i;
			        Tag_number++;
			 }
			        for(int i=0; i<Tag_number; i++)
				    {
				    	obj[i].print();
				    }

			    }
	public static void main(String[] args) {

		 Scanner INPUT = new Scanner(System.in);
		 System.out.println("Enter your DATA : ");
		 String data = INPUT.nextLine(); 
		 System.out.println("Enter Search : ");
		 int sea_mindow = INPUT.nextInt();
		 System.out.println("Enter Look : ");
		 int look_ahead = INPUT.nextInt();
		 Compression(data,sea_mindow,look_ahead);
		}	
}