import java.util.*;
import java.io.*;

public class Test{
	
	public static void main(String[] args){
		Aluno a1 = new Aluno("Ande1", 1, 2000, 2010);
		Aluno a2 = new Aluno("Pedro2", 2, 2004, 2010);
		Aluno a3 = new Aluno("AnaMaria3", 3, 2001, 2012);
		ArrayList<Aluno> array = new ArrayList<>();
		array.add(a1);
		array.add(a2);
		array.add(a3);
		CrescientNumberComparator cnc;
		boolean answer = cnc.compare(array.get(1).getNumber(), array.get(2).getNumber());
		System.out.println(answer);
	}
}