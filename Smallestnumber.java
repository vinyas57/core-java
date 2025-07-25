//write a program to print smallest numberofStudentsInBatch
//with input as three numbers
class Smallestnumber {
	public static void main(String[] args){
		int batch1 = 30;
		int batch2 = 80;
		int batch3 = 20;
		
		if (batch1 < batch2 && batch1 < batch3){
			
			System.out.println("batch1 is a smaller batch2" + batch1);
		}else if (batch2 < batch1 && batch2 < batch3){
			System.out.println("batch2 is a smaller " +batch2);
		}else {
			System.out.println("batch3 is a smaller " +batch3);
		}
	}
}
