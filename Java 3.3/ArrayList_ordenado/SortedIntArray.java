import java.util.*;
import java.io.*;


public class SortedIntArray {
	private ArrayList<Integer> array;
	private SortingPolicy policy;
		//MUDAR MUDAR MUDAR
	public SortedIntArray(SortingPolicy policy) {
		this.array = new ArrayList<>();
		this.policy = policy;
	}

	public int size() {
		return array.size();
	}
	public void add(int element){
		int counter = 0;
		for(Integer x: array){
			if(policy.isBefore(x, element)){
				array.add(counter, element);
				return;
			}
			counter++;
		}
		array.add(element);
	}
	public int get(int index) {
		return array.get(index);
	}

	public class Descending implements SortingPolicy {

		public boolean isBefore(int a, int b){
			return a < b;
		}
	}

}