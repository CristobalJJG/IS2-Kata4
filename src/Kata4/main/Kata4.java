package Kata4.main;

import Kata4.model.Histogram;
import Kata4.model.Mail;
import Kata4.view.HistogramDisplay;
import Kata4.view.MailHistogramBuilder;
import Kata4.view.MailListReader;
import java.util.List;

public class Kata4 {
    public static void main(String[] args){
        execute();
    }
    
    private static void execute(){
        String fileName = "C:/Users/Cristóbal J/OneDrive/Escritorio/IS2/Kata4/IS2-Kata4/src/Kata4/main/email.txt";
        List<Mail> mailList = MailListReader.input(fileName);
        Histogram<String> histogram = MailHistogramBuilder.controller(mailList);
        HistogramDisplay.output(histogram);
    }

}
