public class VarTest{
	public static void main(String[] args){
	float f= 10.5678f;
	double d=1.2345;
	
	System.out.println("f : "+f);
	System.out.println("d : "+d);
	//c형식 출력
	System.out.printf(String.format("f : %.3f\n",f));
	System.out.printf(String.format("d : %.3f\n",d));
	System.out.printf(String.format("f : %.3f , d : %.3f",f,d));
	}
}