package constructor;
//Hello
public class copyconstructor {
	    int id;  
	    String name;  
	    copyconstructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	      
	    copyconstructor(copyconstructor s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	copyconstructor s1 = new copyconstructor(1,"sangeetha");  
	    	copyconstructor s2 = new copyconstructor(s1);  
	    s1.display();  
	    s2.display();  
	   }  
	}  


