public class TimePeriod {
	private int hours;
	private int minutes;

	public TimePeriod() {
		super();
		hours = 0;
		minutes = 0;
	}

	public void addHours(int hoursToAdd) {
		if (hoursToAdd > 0 &&hoursToAdd <=99 && hours < 99) {
			hours += hoursToAdd;
		}

	}

	public void addMinutes(int minutesToAdd) {
		if (minutesToAdd > 0 && minutesToAdd < 60) {
			if (minutes + minutesToAdd > 59 && hours >= 99) {
				minutes = minutes;
			} else {
				minutes += minutesToAdd;
			}
		} else if (minutesToAdd > 59) {
			minutes = minutes;
		}

	}

	public String toString() {
		if (minutes >= 60) {
			return (hours + 1) + " h " + (minutes - 60) + " min";
		}

		else {
			return hours + " h " + minutes + " min";
		}
	}

}
