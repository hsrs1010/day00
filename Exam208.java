public class Exam208{
	public static void main(String[] args){
	boolean b=true;
	boolean c=true;

	char a='A';
	char b2='��';
	int ai=a;
	System.out.println("Ai : "+(ai+32));
	System.out.println("A : "+a);
	System.out.println("B2 : "+b2);
	

	boolean result=false;
	System.out.println("result : "+result);
	//result����
	//||�� or �Ǵ�, �ݴ�� && and �׸���

	result=b && c;
	System.out.println("result2 : "+result);

	System.out.println("B : "+b);
	System.out.println("C : "+c);
	}
}