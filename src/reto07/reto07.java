package reto07;

public class reto07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        double baseImponible = 200; 

       
        double iva = baseImponible * 0.21;
      
        double totalFactura = baseImponible + iva;
        System.out.println("Base imponible: " + baseImponible + " euros");
        System.out.println("IVA (21%): " + iva + " euros");
        System.out.println("Total factura: " + totalFactura + " euros");
    

	}

}
