//URI - 1065 (25/08/2021)

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Count;
import entities.Pair;

public class Program {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
	    Count count = new Count();
	    List<Pair> list = new ArrayList<>();
	    Double value;
	    int repeat = sc.nextInt();
	    
	    for (int i = 0; i < repeat; i++) {
	    	value = sc.nextDouble();
	    	
	    	list.add(new Pair(value));
	    }
	    
	    //A parte comentada do codigo e apenas para lembrar que existe esta opcao tambem
	    //Deve ser utilizada apenas uma delas
	    
		 /*
	    for(Pair pa : list) { //testa se o valor e par
	    	if(pa.getValue() % 2 == 0) {
	    		count.addCount();
	    	}
	    }
	    */
	    
	    List<Pair> result = list.stream().filter(x -> x.getValue() % 2 == 0).collect(Collectors.toList()); //testa se o valor e par
	    
	    for(Pair pa : result) { 
	    	count.addCount();
	    }
	    
	    //Integer c = count(list);  // puxa do metodo
	    
	    //System.out.println(c + " pair values"); //imprime na tela
	    
	    System.out.println(count); //imprime na tela
		sc.close();
	}	
	/*
	public static Integer count (List<Pair> list) { //testa se o valor e par
		Integer count = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getValue() % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	*/
}