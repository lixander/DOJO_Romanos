package co.edu.udea.appempresariales;

public class Romano {
	
	public String convertirARomano(int numero)
	{
		String [] Unidades={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
		String [] Decenas={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String [] Centenas={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		int unidad, decena, centena;
		String cadena = "";
		
	    if(numero==1000){
	    	cadena = cadena + "M";
	    }
	            
	    else if(numero>=100)
	    {
	            unidad= numero % 10;
	            decena=Math.round(numero/10)%10;  
	            centena=Math.round(numero/100);
	            cadena = cadena + Centenas[centena]+Decenas[decena]+Unidades[unidad];
	    }
	    else
	    {
	            if(numero>=10)
	            {
	                unidad= numero % 10;
	                decena=Math.round(numero/10)%10;
	                cadena = cadena + Decenas[decena]+Unidades[unidad];
	            }
	            else
	            {
	                unidad= numero % 10;
                	cadena = cadena + Unidades[numero];
	            }
	    }
	    return cadena;
	}
}
