package projo1;

public class hello {
	public
	int liczba;
	
	hello(){		
		liczba=1;		
	}
	
	hello(int a){		
		liczba=a;
	}
	
	void sayhello(){
		for (int i=0; i<this.liczba; i++){
			System.out.println("siema Kubrak");
		}
	}
	
}
