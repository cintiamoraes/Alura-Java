
public class Fluxo {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException ex) {// ex ? uma refer?ncia, NullPointer ? um tipo de um classe
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
              
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
       
        //Precisamos falar para o Java pegar esse objeto, transformar em uma exce??o e "jogar" na pilha. 
        //O verbo "jogar", em ingl?s, ? "throw"! Ent?o, vamos "jogar" o objeto a partir da refer?ncia exception
        throw new ArithmeticException("Saiu errado");//criou um objeto da classe ArithmeticException
       
        
      //  System.out.println("Fim do metodo2");
    }

}
