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
		int [] nuuu = gerablocos("123456789", 3);
		System.out.print(nuuu[1]);
		
	}
	
	private static int RSA(int nblock, int num, int n1, int e1) {
		int numcod = 0;
		
		return numcod;
	}
	
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
	
	private static int[] gerablocos(String num, int nalgarismos) {
		int numero[] , nblocos,i;
		nblocos = num.length()/nalgarismos;
		numero = new int[nblocos];
		for(i = nblocos;i<nblocos;i--) {
			numero[i] = Integer.parseInt(num.substring(4*i, 4*i+3));
		}
		
		return numero;
	}

}
