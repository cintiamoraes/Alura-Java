
public class TestaLacos {

        public static void main(String[] args) {
        	
            for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            	
                for(int contador = 0; contador <= 10; contador++) {
                	
                    System.out.print(multiplicador * contador);
                    
                    //utilizado para dar o espa�o
                    System.out.print(" ");
                    
                }
                
                //utilizado somente para pular a linha depois que fizer o la�o do For. 
                System.out.println();
                
            }
        }
}