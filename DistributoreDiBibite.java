
package distributoredibibite;

import java.lang.*;


public class DistributoreDiBibite {
	protected int numBibite;
	protected int numBibiteIniziale;
	protected double prezzoAlPezzo;
	protected double creditoIniziale;
 public DistributoreDiBibite(int numBibite, double prezzoAlPezzo){
	 this.numBibiteIniziale=numBibite;
	 this.prezzoAlPezzo=prezzoAlPezzo;
	
	 
 } 
	public DistributoreDiBibite(int inizio,int numBibite, double prezzoAlPezzo , double creditoIniziale){
	 numBibiteIniziale=inizio;
	  this.numBibite=numBibite;
	 this.prezzoAlPezzo=prezzoAlPezzo;
	 this.creditoIniziale=creditoIniziale;
	 
 } 
	
	
	
	public void inserisciMoneta(double valore){
	creditoIniziale+=valore;	
		
		
		
		
	}
	public void prelevaBibita(int n){
		if(numBibite==0){
			System.out.println("bibita non  disponibile");
		}
		if(creditoIniziale<prezzoAlPezzo*n){
			System.out.println("credito insufficiente");
			
		}
		else{
		numBibite-=n;
		creditoIniziale-=prezzoAlPezzo*n;
		}
			
		
		
	}
	
	
		public double getCredito(){
			return creditoIniziale;
			
		}	
			
		public boolean vuoto(){
			if(numBibite==0)return true;
			else return false;
		}
			
			
	
		public  String toString() {
			int bibiteVendute=numBibiteIniziale;
			
			 bibiteVendute-=numBibiteIniziale-numBibite;
			
			String s="bibite rimeste: "+numBibite+",bibite vendute:   "+bibiteVendute+", credito : "+creditoIniziale;
		     return s;
		}
			
			
	public static void main(String[] args) {
		DistributoreDiBibite inizio= new DistributoreDiBibite(7,2);
		DistributoreDiBibite b= new DistributoreDiBibite(7,7,2,10);
		b.prelevaBibita(6);
		System.out.println(b.toString());
		//System.out.println(b.vuoto());
		//System.out.println(b.getCredito());
		
		
		
		
		
	}
	
}
