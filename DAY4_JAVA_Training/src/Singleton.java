public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Singleton{
	
	private static Sigleton s; // Refernce pointing to NULL
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(s==NULL){
			s = new Singleton();
		}
		return s;
	}

}
