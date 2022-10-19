package coderHacker;

public class CadenaReverse {

	public static void main(String[] args) {
		reverser("Hola Mundo");
		reverse("Hola Santiago");
		
		Palindromo(1221);
		Palindromo(422);
	}
		public static String reverser(String texto) { 
		String cadena =texto;
		String invertido="";
		for(int i=cadena.length()-1;i>=0;i--) {
			invertido+=cadena.charAt(i);
		}
      System.out.println("cadena original :" + cadena.toUpperCase());
      System.out.println("cadena reverse :" + invertido.toUpperCase());
	return invertido;
      
		}
		
      public static String reverse(String texto) {
    	  
      String cadena=texto;
      StringBuilder st=new StringBuilder(cadena);
      String Invertida= st.reverse().toString(); 
      System.out.println("cadena original :" + cadena.toLowerCase());
      System.out.println("cadena reverse :" + Invertida.toLowerCase());
	return Invertida;
	}

  public static void Palindromo(int x) {
	int numeroEntero=x;
	String numCadena=String.valueOf(numeroEntero);
	StringBuilder sB=new StringBuilder(numCadena);
	String invertido=sB.reverse().toString();
	if(invertido.equals(numCadena)) {
		System.out.println("el numero :" + x + " es un palindromo");
		
	}else {
		System.out.println("numero no es palindromo");
	}
}
}