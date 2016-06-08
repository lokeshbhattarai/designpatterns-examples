package iterator;

import java.util.function.Predicate;

public class NameRepository {
	
	private String names[][];
	
	
	public NameRepository(String[][] names){
		this.names = names;
	}
	
	public  INameIterator<String> getIterator(){
		return new NameIterator(new MyFilter());
	}

	
	private class NameIterator implements INameIterator<String>{

		int i=0,j=0;
		Predicate<String> filter;
		
		public NameIterator(Predicate<String> filter){
			this.filter = filter;
		}
		@Override
		public boolean hasNext() {
			int i1 =i;//keep copy index to make sure you traverse and come back to same index for next operation
			int j1=j;
			while(i1<names.length){
			
			if(j1>=names[i1].length){
				i1++;
				j1=0;
			}
			
			if(i1>=names.length){
				return false;
			}
			
			if(filter.test(names[i1][j1++])){//true means is -
				j++;
				
				if(j>=names[i].length){
					i++;
					j=0;
				}
				
				if(j1>=names[i1].length){
					i1++;
					j1=0;
				}
				continue;
			}else{
				return true;
				}
			}
			
			return false;
		}
		@Override
		public String next() {
			if(hasNext()){
				String name= names[i][j++];
				if(j>=names[i].length){
					i++;
					j=0;
				}
				return name;
			}
				
			return null;
		}
	}
}
