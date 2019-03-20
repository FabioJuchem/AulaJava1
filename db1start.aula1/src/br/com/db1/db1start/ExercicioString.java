package br.com.db1.db1start;

public class ExercicioString {
	
	public static String upper (String nome1){
		String nome = nome1.toUpperCase();
		return nome;
	}
	public static String lower (String nome2){
		String nome = nome2.toLowerCase();
		return nome;
	}
	
	public static void main(String[] args){
		
		String nome = "nome";
		String nome2 = "NOME";
		nome = nome.toUpperCase();
		nome2 = nome2.toLowerCase();
		System.out.println(nome);
		System.out.println(nome2);
		
		
		System.out.println("---------------------------------");
		
		System.out.println(upper(nome));
		System.out.println(lower(nome2));
		
	}

}


