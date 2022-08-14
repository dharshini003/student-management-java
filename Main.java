import java.util.*;

class  Student 
 {
     String name;
     int rno;
     int age;
     String clas;
     
     static HashSet<Integer> uniquerno=new HashSet<Integer>();
     HashMap <String,Integer> marks=new HashMap<String,Integer>();
     boolean setter(String name,int rno, int age, String clas,String sub[],int m[],int n)
     {
         
         if (uniquerno.contains(rno)==false)
         {
         this.name=String.valueOf(name);
         this.rno=rno;
         this.age=age;
         this.clas=String.valueOf(clas);
         uniquerno.add(rno);
        //  marks.putAll(temp);
         System.out.println(uniquerno);
         for (int i=0;i<n;i++)
         {
             marks.put(sub[i],m[i]);
         }
         
         
         return true;
         }
         else{
             return false;
         }
     }
     
 }


public class Main
{  
    
    
    
   
	public static void main(String[] args) {
		 
		 ArrayList<Student> sarray=new ArrayList <Student>();
		 int choice,i;
		 Scanner sc=new Scanner(System.in);
		 
	
// 		 Student a=new Student();
		 
		 int f=1;
		 while(f==1)
		 {
		 System.out.println("Welcome to student management portal");
		 System.out.println();
		 System.out.println("MENU");
		 System.out.println("====");
		 System.out.println("1.Insert");
		 System.out.println("2.Delete");
		 System.out.println("3.Read");
		 System.out.println("4.Print all");
		 choice=sc.nextInt();
		 switch(choice)
		 {
		     case 1:
		        {   
		            Student a=new Student();
		            System.out.print("Enter Name: ");
		            String name=sc.next();
		            System.out.print("Enter Roll number: ");
		            int rno=sc.nextInt();
		            System.out.print("Enter age: ");
		            int age=sc.nextInt();
		            System.out.print("Enter class: ");
		            String clas=sc.next();
		            HashMap <String,Integer> temp=new HashMap<String, Integer>();
		            System.out.println("Enter the number of subjects");
		            int subs;
		          //  String sub;
		           
		          //  for (int j=0;j<subs;j++)
		          //  {
		          //      sub=sc.next();
		          //      n=sc.nextInt();
		          //      temp.put(sub,n);
		                
		          //  }
		          //  if(a.setter(name,rno, age, clas,temp)==true)
		           subs=sc.nextInt();
		           String sub[]=new String[20];
		           int marks[]=new int[20];
		           for (int j=0;j<subs;j++)
		           {
		               sub[j]=sc.next();
		               marks[j]=sc.nextInt();
		               
		           }
		            if(a.setter(name,rno, age, clas,sub,marks,subs)==true)
		            {
		            sarray.add(a);
		            System.out.println("Record added!");
		            
		            }
		            else{
		                
		                System.out.println("Roll number alread exist! Roll number should be unique");
		            }
		              break;
		        }
		       
		    case 2:
		        {
		            System.out.print("Enter roll number to be deleted");
		            int rno=sc.nextInt();
		            for (i=0;i<sarray.size();i++)
		            {
		                if (sarray.get(i).rno== rno)
		                {
		                   break;
		                   
		                }
		            }
		            
		            if(i==sarray.size())
		            {
		                System.out.println("Element not found cannot be deleted!");
		            }
		            else{
		            sarray.remove(i);
		            System.out.println("Record deleted");
		            }
		            break;
		            
		        }
		        
		    case 3:
		        {
		            System.out.print("Enter roll number to be searched");
		            int rno=sc.nextInt();
		            if(sarray.contains(rno)==false)
		            {
		                System.out.println("Roll number dosent exist!");
		            }
		            
		            else{
		            
		            for (i=0;i<sarray.size();i++)
		            {
		                if (sarray.get(i).rno== rno)
		                {
		                   break;
		                   
		                }
		            }
		            //sarray.remove(i);
		            System.out.println(sarray.get(i).name);
		            System.out.println(sarray.get(i).rno);
		            System.out.println(sarray.get(i).age);
		            System.out.println(sarray.get(i).clas);
		            }
		            break;
		            
		        }
		        
		  case 4:{
		      //System.out.println(sarray);
		      for (i=0;i<sarray.size();i++)
		      {
		          System.out.println("Name: "+sarray.get(i).name);
		          System.out.println("Age : "+sarray.get(i).age);
		          System.out.println("Roll no: "+sarray.get(i).rno);
		          System.out.println("Class: "+sarray.get(i).clas);
		          System.out.println("Marks: "+sarray.get(i).marks);
		      }
		  }
		        
		       
		 }
		 
		 
          System.out.println("Do you want to continue(0/1)");
		  f=sc.nextInt();
		 }
	}
}


