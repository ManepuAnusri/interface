
interface Mind {
	void show();
	}
interface Calci{
	void disp();
	 
}
class Girl implements Mind{
	public void show() {
		System.out.println("hello");
	}
}
class Boy implements Calci{
	 public void disp() {
		System.out.println("hii");
	}
}

 class Maths{
	public static void main(String args[]) {
		Mind obj = new Girl();
		Calci obj1 = new Boy();
		obj.show();
		obj1.disp();
		
	}
}