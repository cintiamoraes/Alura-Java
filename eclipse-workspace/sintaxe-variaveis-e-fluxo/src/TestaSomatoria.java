
public class TestaSomatoria {
	
	public static void main(String[] args) {
		
		int contador=0;
		int total=0;
		
		while(contador<=10) {
			
			//total=total+contador; � a mesma coisa que a linha debaixo que � a mais comumente utilizada
			total += contador;				
			contador ++;
		}
		
		System.out.println(total);	
				
	}

}
