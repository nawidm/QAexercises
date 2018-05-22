package Rektangles;

public class Rektangles {
	
	public void print(String word, int x, int y) {
		char[] ch = word.toCharArray();
		
		String firstLine = word;
		for(int i=1;i<x;i++) {
			
			if(i%2==0) {
				for(int j = 1; j<ch.length;j++) {
					firstLine += ch[j];
				}
			} else {
				for(int j = ch.length-2;j>=0;j--) {
					firstLine += ch[j];
				}
			}
			
		}
		System.out.println(firstLine);
		
		for(int i=;i++) {
			
		}
	
	}
	
	public static void main(String[] args) {
		Rektangles r = new Rektangles();
		r.print("NAWID", 3, 3);
	}
}
