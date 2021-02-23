package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Multa {
	public void multar(Copia copia_dada, Lector lector_multado){
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		GregorianCalendar fecha = new GregorianCalendar();
		String inputString1 = fecha.get(Calendar.DATE)+" "+(fecha.get(Calendar.MONTH)+1)+" "+fecha.get(Calendar.YEAR);

		try {
		    java.util.Date date1 = myFormat.parse(copia_dada.getFecha_dada().get(Calendar.DATE)+" "+
		    		copia_dada.getFecha_dada().get(Calendar.MONTH+1)+" "+copia_dada.getFecha_dada().get(Calendar.YEAR));
		    java.util.Date date2 = myFormat.parse(inputString1);
		    long diff = date2.getTime() - date1.getTime();
		    if((diff / (1000*60*60*24)) > copia_dada.getDias_prestados()) {
		    	int dias_multar = (int) ((diff / (1000*60*60*24)) * 2);
		    	System.out.println("Te pasaste "+(diff / (1000*60*60*24))+" días de la fecha de entrega. Por lo tanto se te aplicará una multa de: "+dias_multar+" días sin poder adquirir otra copia.");
		    	lector_multado.setMulta_dias(dias_multar);
		    }else {
		    	System.out.println("Devolviste el libro en tiempo y forma.");
		    }
		} catch (ParseException e) {
		    e.printStackTrace();
		}

		
	}
}
