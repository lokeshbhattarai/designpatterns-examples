package iterator;

public class Main {

	public static void main(String[] args) {
		String[][] names = new String[][]{
			{"-","Shyam","Hari"},
			{"Sita","-","-"},
			{"Mata","Pita","Neta"}
			
		};
		NameRepository repo = new NameRepository(names);
		INameIterator<String> iterator = repo.getIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

}
