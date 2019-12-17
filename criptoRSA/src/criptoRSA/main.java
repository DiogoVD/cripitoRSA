package criptoRSA;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Codificação RSA
		 * c = b^e MOD(n)
		 * n = p*q
		 * par (e,n) ->chave publica
		 * c -> resultado da decodificação
		 * b -> bloco do numero a ser codificado
		 * e -> numero primo escolhido para (melhor escoha num 3)
		 * p -> numero primo escolhido onde deve ser congruente a 5 MOD(6) = 7
		 * q -> numero primo escolhido onde deve ser congruente a 5 MOD(6) = 11
		 */
		
		int p,q,n,b,e;
		p = 7;
		q = 11;
		e = 3;
		n = p*q;
		
		//System.out.print(StringAscii("abcd"));
		int [] nuuu = gerablocos("1234567893", 5);
		//System.out.print(nuuu[2]);
		
	}
	
	private static int RSA(int nblock, int num, int n1, int e1) {
		int numcod = 0;
		
		return numcod;
	}
	/*
	 * frase -> texto a ser convertido para ascii
	 */
	private static String StringAscii(String frase) {
		int i;
		String num = "";
		frase = frase.toUpperCase(); // converte todas para maiusculas otimizar para mensagem original.
		
		for(i=0;i<frase.length();i++) {
			num = num + (int)frase.charAt(i) + "";
		}
		//return Integer.parseInt(num);
		return num;
	}
	
	/*
	 * num -> numero a ser separado e blocos
	 * nalgarismos -> numero de algarismos em cada bloco
	 */
	private static int[] gerablocos(String num, int nalgarismos) {
		int numero[] , nblocos,i,j=0,k;
		nblocos = num.length()/nalgarismos;
		j = num.length()%nalgarismos;
		if (j!=0) {
			nblocos = nblocos+1;
			for(k=0;k<nalgarismos-j;k++) {
				num = "0" + num;
			}
		}
		numero = new int[nblocos];
		System.out.println(num +" "+ num.length()+" "+ nblocos);
		
		for(i=0;i<nblocos;i++) {
			numero[i] = Integer.parseInt(num.substring(nalgarismos*i, nalgarismos*i+nalgarismos));
			System.out.println(numero[i]);
		}
		
		return numero;
	}

}
