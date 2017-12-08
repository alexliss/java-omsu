package october.finance;

import exceptions.WrongValueException;

public class Payment {

    private String name = "";
    private int day;
    private int month;
    private int year;
    private int payment;

    private boolean checkYear(int year) {
        return year > 0;
    }

    private boolean checkMonth(int month) {
        return ((month > 0)&&(month < 13));
    }

    private boolean checkDay(int day, int month, int year) {
        int[] maxDay = new int[12];
        maxDay[1] = maxDay[3] = maxDay[5] = maxDay[8] = maxDay[10] = maxDay[12] = 31;
        maxDay[2] = 28;
        maxDay[4] = maxDay[6] = maxDay[7] = maxDay[9] = maxDay[11] = 30;
        if ((year % 4 == 0) && ((year%100 != 0) || (year%400 == 0))) maxDay[2] = 29;
        return ((day > 0) && (day <= maxDay[month]));
    }

    private boolean checkPayment(int payment) {
        return payment > 0;
    }

    public Payment(String name, int day, int month, int year, int payment) throws WrongValueException {
        if (!checkYear(year)) throw new WrongValueException("Wrong year");
        if (!checkMonth(month)) throw new WrongValueException("Wrong month");
        if (!checkDay(day, month, year)) throw new WrongValueException("Wrong day");
        if (!checkPayment(payment)) throw new WrongValueException("Wrong payment");
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "name='" + name + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", payment=" + payment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment1 = (Payment) o;

        if (day != payment1.day) return false;
        if (month != payment1.month) return false;
        if (year != payment1.year) return false;
        if (payment != payment1.payment) return false;
        return name != null ? name.equals(payment1.name) : payment1.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + day;
        result = 31 * result + month;
        result = 31 * result + year;
        result = 31 * result + payment;
        return result;
    }
}
