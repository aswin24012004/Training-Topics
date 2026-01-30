package practices;

class Test{
	static {
		System.out.println("Test file is Loaded.......");
	}
	void disply() {
		System.out.println("Test method is runned..........");
	}
}

public class JvmExample {
	public static void main(String args[])  {
		System.out.println("Main method is started.....");
		try {
			Class.forName("practices.Test");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Class loaded successfully.....");
		Test t = new Test();
		t.disply();
	}
}
