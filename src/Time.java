public class Time {
    public int hour;
    public int minutes;
    public int seconds;

    public Time(int hour, int minutes, int seconds) {
        if (isCheck()) {
            this.hour = hour;
            this.minutes = minutes;
            this.seconds = seconds;
        }
    }

    public Time(int hour, int minutes) {
        if (isCheck()) {
            this.hour = hour;
            this.minutes = minutes;
        }
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public boolean isCheck() {
        if (hour > 24 || hour < 0) {
            return false;
        } else if (minutes < 0 || minutes > 60) {
            return false;
        } else if (seconds > 60 || seconds < 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (isCheck()) {
            return "Time{" +
                    "hour=" + hour +
                    ", minutes=" + minutes +
                    ", seconds=" + seconds +
                    '}';
        }
        return " There is invalid statement ";
    }
}
