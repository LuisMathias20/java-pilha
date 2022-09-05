public class FluxoComTratamento {

    public static void main(String[] args) throws MinhaExcecao {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException e) {
        	String msg = e.getMessage();
        	System.out.println("Exception: "+msg);
        	e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao{
        System.out.println("Ini do metodo1");
        try {
        	metodo2();
        } catch(ArithmeticException e) {
        	System.out.println(e.toString());
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do metodo2");
        
        throw new MinhaExcecao("Deu muito ruim");
        //System.out.println("Fim do metodo2");
    }
}