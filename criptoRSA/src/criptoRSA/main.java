package criptoRSA;
import java.math.*;

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
		 * 
		 * para garantir que os primos terao o inverso
		 * 3(4k+3)=1 mod(6k+4)
		 * y.d=1 mod[(p-1).(q-1)]
		 * 
		 * no caso escolhido p=5 e q=11
		 * 6k+4 = (p-1).(q-1)
		 * 6k+4 = (5-1).(11-1)
		 * 6k+4 = 4.10
		 * 6k = 40-4
		 * k = 36/6
		 *k = 6
		 * 
		 *d = 4k+3
		 *d = 4.6 + 3
		 *d = 24+3
		 *d = 27
		 * 
		 */
		
		int p,q,n,b,e,d;
		p = 5;
		q = 17;
		e = 3;
		n = p*q;
		
		d = (4*((((p-1)*(q-1))-4)/6))+3;
		
		String msgm;
		
		int asd[]={17,57,39,61,39};
		
		msgm = "diogo";
		
		//System.out.print(StringAscii("abcd"));
		//int [] nuuu = gerablocos(StringAscii("abcd"), 5);
		//System.out.print(nuuu[2]);
		//System.out.print(RSA(gerablocos("1234", 2),n,e));
		//System.out.println(msgm);
		System.out.println(RSA(gerablocos(StringAscii(msgm), 2),n,e));
		
		System.out.println(RSA(asd,n,d));
		
	}
	
	/*
	 * numbloco -> array de blocos da frase
	 */
	private static String RSA(int[] numbloco, int n, int e) {
		int i;
		BigInteger auxcalc;
		String numcod="";
		
		for(i=0;i<numbloco.length;i++) {
			//Realiza o calculo do valor codificado, BigInteger é utilizado para numeros grandes e modPow calcula a potencia e depois o mod do numero.
			auxcalc = BigInteger.valueOf (numbloco[i]).modPow (BigInteger.valueOf (e), BigInteger.valueOf (n));
			numcod = numcod + auxcalc;			
		}
		
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
		
		for(i=0;i<nblocos;i++) {
			numero[i] = Integer.parseInt(num.substring(nalgarismos*i, nalgarismos*i+nalgarismos));
		}
		
		return numero;
	}

}
