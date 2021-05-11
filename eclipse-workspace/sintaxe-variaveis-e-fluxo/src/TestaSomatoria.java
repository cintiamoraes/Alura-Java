
public class TestaSomatoria {
	
	public static void main(String[] args) {
		
		int contador=0;
		int total=0;
		
		while(contador<=10) {
			
			//total=total+contador; é a mesma coisa que a linha debaixo que é a mais comumente utilizada
			total += contador;				
			contador ++;
		}
		
		System.out.println(total);	
				
	}

}
