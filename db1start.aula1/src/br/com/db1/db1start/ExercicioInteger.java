package br.com.db1.db1start;

public class ExercicioInteger {
	
	public static Integer somar(Integer numero1,Integer numero2){
		return numero1+numero2;
		
	}
	public static Integer sub(Integer numero1,Integer numero2){
		return  numero1-numero2;
		
	}
	public static Integer mult(Integer numero1,Integer numero2){
		return numero1*numero2;
		
	}
	public static Integer div(Integer numero1,Integer numero2){
		return numero1/numero2;
		
	}
	public static String par(Integer numero1){
		String par1;
		if(numero1 % 2 == 0){
			par1 = "Par";
		}else {
			par1 = "Impar";
		}
		
		return par1;
	}
	public static Integer maior(Integer numero1,Integer numero2)
	{
		Integer maior;
		 if (numero1 > numero2)
		 {
			 maior = numero1;
		 }else{
			 maior = numero2;
		 }
		 return maior;
	}
	
	
		public static void main(String[] args){
		
		Integer num1 = 150;
		Integer num2 = 5;
		
		Integer sum = num1+num2;
		Integer sub = num1-num2;
		
		
		System.out.println(sum);
		System.out.println(sub);
		
		System.out.println("--------------------------");
		
		
		
		System.out.println(somar(num1, num2));
		System.out.println(sub(num1, num2));
		System.out.println(mult(num1,num2));
		System.out.println(div(num1,num2));
		System.out.println(par(num1));
		System.out.println(maior(num1,num2));
		
		
		
	}

}
