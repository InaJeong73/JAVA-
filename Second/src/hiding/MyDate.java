package hiding;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	public String isValid() {
		if(isDateValid()) {
			return "유효한 날짜입니다.";					
		}else {
			return "유효하지 않은 날짜입니다.";
		}
	}
	public boolean isDateValid() {
		if(day<1||day>31||month<1||month>12||year<1) {
			return false;
		}
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return day<=31;
		case 4:
		case 6:
		case 9:
		case 11:
			return day<=30;
		case 2:
			if(isLeapYear()) {
				return day<=29;
			}else {
				return day<=28;
			}
		default: return false;
		}
	}
	
	private boolean isLeapYear() {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
	
	public void setDay(int day) {
		this.day=day;
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
}
