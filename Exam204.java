public class Exam204{
	public static void main(String [] args){
	//변수에 변수를 주입
	int i=100;
	int j=i;
	
	i=300;	
	i=j;
	j=200;

	System.out.println("i : "+i);
	System.out.println("j : "+j);

	}

}