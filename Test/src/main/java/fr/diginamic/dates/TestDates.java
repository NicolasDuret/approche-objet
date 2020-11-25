package fr.diginamic.dates;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    SimpleDateFormat date;

    public TestDates(SimpleDateFormat date) {
        this.date = date;
    }

    public static void main(String[] args) {
        Date dadju = new Date();
        DateFormat dateDuJour = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateDuJour.format(dadju));
    }

    @Override
    public String toString() {
        return "TestDates{" +
                "date=" + date +
                '}';
    }


}