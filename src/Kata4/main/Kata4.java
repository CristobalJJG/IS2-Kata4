package Kata4.main;

import Kata4.model.Histogram;
import Kata4.model.Mail;
import Kata4.view.HistogramDisplay;
import Kata4.view.MailHistogramBuilder;
import Kata4.view.MailListReader;
import java.util.List;

public class Kata4 {
    public static void main(String[] args){
        String fileName = "email.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        new HistogramDisplay(histogram).execute();
    }
}
