import java.util.*;

public class ArrayDuplicateElemntFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {10,20,10,30,40,40,50,60,71,10,71,80,50,90,91,20,30,80,80,100,100};
		HashSet<Integer> duplicates = new HashSet<Integer>(); 
		HashMap<Integer,Integer> list = new HashMap<Integer,Integer>(); 
		boolean check;
		for(int i=0;i<data.length;i++) {
			int x=1;
			check=duplicates.add(data[i]);
			if(check!=true) {
				if(list.get(data[i])!=null) {
					x=list.get(data[i]);
				}
			list.put(data[i],++x);
			}
		}
		System.out.println(list);
	}

}
