package Mon_03_04_2023;

public class RingAlarm {

	
		public static String ringAlarm(int dayOfWeek, boolean onVacation) {
		    if (dayOfWeek < 0 || dayOfWeek > 6 || !(onVacation == true || onVacation == false)) {
		        return "Invalid Inputs";
		    } else if (dayOfWeek >= 1 && dayOfWeek <= 5 && onVacation == true) {
		        return "10:00";
		    } else if (dayOfWeek >= 1 && dayOfWeek <= 5 && onVacation == false) {
		        return "07:00";
		    } else if ((dayOfWeek == 0 || dayOfWeek == 6) && onVacation == true) {
		        return "OFF";
		    } else {
		        return "10:00";
		    }
		}
		public static void main(String[] args) {
			System.out.println(ringAlarm(0, true));;
		}
}


