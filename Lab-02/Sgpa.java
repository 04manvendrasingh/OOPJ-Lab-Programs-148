public class Sgpa{
	String usn,name;
	int credits[] = new int[8];
	float marks[]= new float[8];
	public void accept_name_usn(String name,String usn)
	{
	this.name= name;
	this.usn=usn;
	}

public void accept_credits(int credits[]) 
{
	this.credits=credits;
}

public void accept_marks(float marks[]) 
{
	this.marks=marks;
}

public String return_usn() 
{
	return this.usn;
}

public String return_name() 
{
	return this.name;
}

public int [] return_credits() 
{
	return this.credits;
}

public float [] return_marks() 
{
	return this.marks;
}

public float sgpa(int credits[], float marks[]) 
	{
	int total_credits=0;
	float marks_credits=0;
	for(int i=0; i<8; i++) {
	total_credits=total_credits+credits[i];
	}

for(int i=0; i<8; i++) 
{
	marks_credits=marks_credits+(credits[i]*marks[i]);
}

return marks_credits/total_credits;
}

public static void main(String[] args) 
{
	Sgpa p = new Sgpa();
	p.accept_name_usn("Mhammed Zeeshan Umar", "1BM22CS160");
	int [] credits_3rd={4,4,4,3,3,2,1,1};
	p.accept_credits(credits_3rd);
	float [] marks_3rd =  {8.23344f, 7.54454f, 7.3456f, 8.234646f, 8.46774f, 8.34553f, 7.345346f, 7.53454f};
	p.accept_marks(marks_3rd);
	System.out.println("usn: "+ p.return_usn());
	System.out.println("name: "+ p.return_name());                                                                                                                                                                                                                                
	int[] get_credits=p.return_credits();	
	for(int i=0; i<8; i++) {
	System.out.printf("credits:%d  ", get_credits[i]);
}
	System.out.println();
	float[] get_marks=p.return_marks();
	for(int i=0; i<8; i++) {
	System.out.printf("marks:%f  ", get_marks[i]);
	}
	System.out.println();
	System.out.println("sgpa: "+ p.sgpa(get_credits,get_marks));
}
} 