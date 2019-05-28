package funcoesGeral;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataAtual {
	
	
	public Date getPegaDataAtual() {
		Calendar calendar = new GregorianCalendar();
		Date date = new Date();
		calendar.setTime(date);
		return calendar.getTime();
	}

}
