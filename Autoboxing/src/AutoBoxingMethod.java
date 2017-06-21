
public class AutoBoxingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoBoxingMethod o1=new AutoBoxingMethod();
		Integer iob=o1.m1(1000);
		System.out.println(iob);
		
		Integer i1;
		int i2;
		
		i1=20;
		i1++;
		System.out.println(i1);
		
		i1=200;
		i2=200;
		int i3=i1.byteValue();
		System.out.println(i3);
	}
	
	public int m1(Integer v){
		return v;
	}

}
