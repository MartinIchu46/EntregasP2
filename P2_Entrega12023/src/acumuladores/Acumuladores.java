package acumuladores;

public class Acumuladores {
	
	public boolean EsMultiplo(int numero1[], int numero2) {
		boolean acum = true;
		for(int i =0;i<numero1.length; i++) {
			acum = acum && numero1[i]% numero2 ==0;
		}
		return acum;
	}
	
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) {
		boolean Multiplo = true;
		boolean Acum = false;
		
		
		for(int fila= 0; fila< mat.length; fila++ ) {
			for(int col=0; col< mat[fila].length; col++ ) {
				Multiplo = Multiplo && EsMultiplo(mat[fila],num);
			}
			Acum = Acum || Multiplo;
		}
		return Acum;
		
	}
	
	public boolean matNoCantFilas(int [] mat1, int [] mat2) {
		return mat1.length == mat1.length;
	}
	 public boolean esVacio(int [][] mat1) {
		 return mat1 == null;
	 }
	
	public boolean hayInterseccionPorFila(int[][] mat1, int[][]mat2) { 
		
	}
	
	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) { 
		
	}
	
	public boolean hayInterseccionPorColumna(int[][] mat1, int[][]mat2) {
		
	}

}
