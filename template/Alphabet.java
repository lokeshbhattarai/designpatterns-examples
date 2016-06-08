package template;

public class Alphabet extends AlphabetCore{

	final int resultRowCount = 20;
	final int resultColumnCount = 10;
	
	@Override
	public Symmetry getSymmetry(String[][] input) {
		
		if(input==null) return Symmetry.INVALID;
		
		int length = input.length;
		if(length==8){
			return Symmetry.HORIZONTAL;
		}else{
			int columnLength = input[0].length;
			if(columnLength==5){
				return Symmetry.VERTICAL;
			}else if(columnLength==9){
				return Symmetry.NONE;
			}else{
				return Symmetry.INVALID;
			}
		}
		
	}

	@Override
	public String[][] reconstruct(String[][] input, Symmetry symmetry) {
		switch (symmetry) {
		case VERTICAL:
			String[][] mirrorArray = mirrorVertical(input);
			String[][] mergedArray = mergeVerticalArray(input, mirrorArray);
			return mergedArray;

		case HORIZONTAL:
			String[][] mirror = mirrorHorizontal(input);
//			printLetter(mirror);
			
			String[][] mergedOutput = mergeHorizontalArrays(input, mirror);
			
			printLetter(mergedOutput);
			break;
			
		case NONE:
			printLetter(input);
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public void printLetter(String[][] source) {
		if(source==null) return;
		
		 int totalRows = source.length;
		 for(int i=0;i<totalRows;i++){

			 String[] row = source[i];
			 int rowLength = row.length;
			 
			 for(int j=0;j<rowLength;j++){
				 	
				 System.out.print(row[j]);
			 }
			 System.out.print("\n");
		 }
		 
	}

	
	public String[][] mirrorVertical(String[][] input){
		
		int inputLength = input.length;

		String[][] mirrorArray = new String[inputLength][];
		
		for(int i=0;i<inputLength;i++){
			
			String[] inputRow = input[i];
			int rowLength = inputRow.length;
			String[] mirrorRow = new String[rowLength];
			for(int j=0;j<rowLength;j++){
				mirrorRow[j] = inputRow[rowLength-1-j];
			}
			mirrorArray[i] = mirrorRow;
			
		}
		
		return mirrorArray;	
	}
	
	public String[][] mergeVerticalArray(String[][]arr1,String[][]arr2){
		
		String[][] result = new String[arr1.length][];
		for(int i=0;i<result.length;i++){
			
			
			String[] arr1Row = arr1[i];
			String[] arr2Row = arr2[i];
			
			int finalRowLength = arr1Row.length + arr2Row.length;

			String[] finalRow = new String[finalRowLength];
			
			for(int j=0;j<arr1Row.length;j++){
				finalRow[j] = arr1Row[j];
			}
			for(int j=0;j<arr2Row.length;j++){
				finalRow[arr1Row.length + j] = arr2Row[j];
			}
			
			result[i] = finalRow;
			
		}
		System.out.println("printing merged array");
		printLetter(result);
		
		String  [][] refinedArray = new String[resultRowCount][resultColumnCount];
		
		int dividendToAdd = (resultRowCount-result.length)/2;
		
		int j=0;
		for(int i=0;i<resultRowCount;i++){
			
			if(0<=i && i<dividendToAdd){
				System.out.println("first if");
				refinedArray[i]= result[0];
			}else if(i>=dividendToAdd && i < (result.length+dividendToAdd)){
				System.out.println("else");
				refinedArray[i]= result[j];
				j++;
			}else {
				System.out.println("else if");
				refinedArray[i]= result[0];
			}
			
		}
		
		
		return refinedArray;
	}
	
	public String[][] mirrorHorizontal(String[][] source){
		
		int length = source.length;
		String[][] result = new String[length][];
		for(int i=0;i<length;i++){
			result[length-1-i] = source[i];
		}
		return result;
	}
	
	public String[][] mergeHorizontalArrays(String[][] upper,String[][] lower){
		
		int lengthUpper = upper.length;
		int lengthLower = lower.length;
		
		String[][] result = new String[lengthUpper+lengthLower][];
		
		for(int i=0;i<lengthUpper;i++){
			result[i]=upper[i];
		}
		
		for(int i=0;i<lengthLower;i++){
			result[i+lengthUpper]=lower[i];
		}
		
		String  [][] refinedArray = new String[resultRowCount][resultColumnCount];
		int dividendToAdd = (resultRowCount-result.length)/2;
		//adding rows
		int j=0;
		for(int i=0;i<resultRowCount;i++){
			
			if(0<=i && i<dividendToAdd){
				System.out.println("first if");
				System.arraycopy(result[0], 0, refinedArray[i], 0, result[0].length);
			}else if(i>=dividendToAdd && i < (result.length+dividendToAdd)){
				System.out.println("else");
				System.arraycopy(result[j], 0, refinedArray[i], 0, result[j].length);
				j++;
			}else {
				System.out.println("else if");
				System.arraycopy(result[0], 0, refinedArray[i], 0, result[0].length);
			}
			
		}
		
		//adding columns
		for(int x=0;x<resultRowCount;x++){
			System.out.println("refinedArray[+"+x+"] length"+refinedArray[x].length);
			refinedArray[x][resultColumnCount-1] = "-";
		}
		
		return refinedArray;
	}
	
}
