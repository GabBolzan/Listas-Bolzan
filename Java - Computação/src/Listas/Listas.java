package Listas;

import java.util.ArrayList;

public class Listas {
	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<>();
		
		alunos.add("Fabio");
		alunos.add("Varela");
		alunos.add("Cleber");
		alunos.add("Julia");
		
		for (String string : alunos) {
			System.out.println(string);
		}
		
		System.out.println("\n");
		
		for (int j=0; j<alunos.size(); j++) {
			System.out.println(alunos.get(j));
		}
		
		System.out.println("\n");
		
		alunos.remove(2);
		
		for (String string : alunos) {
			System.out.println(string);
		}
	}
}
