class details{
	int rollno;
	String name,college;
	float fee;
	
	details(int rollno, String name, float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		//this(rollno,name,fee);
	}
	details(int rollno, String name,String college, float fee){
		this(rollno,name,fee);
		this.college=college;
	}
	void display(){
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
	
}

class Student{
	public static void main(String[] args){
		details d1 = new details(22,"Stark",4000);
		details d2 = new details(32,"Wayne","ITER",4000);
		d1.display();
		d2.display();
				
	}
}