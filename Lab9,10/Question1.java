package assignmentjdbc;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
public class Question1 extends JFrame
{

	public static void main(String[] args) {
		  Question1 ques=new Question1();
		

	}
	JLabel jlabel;
     Question1(){
    	  this.setSize(800,200);
    	  this.setTitle("Digital Clock");
    	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	   jlabel=new JLabel();
           jlabel.setFont(new Font("MV Boli",Font.PLAIN,20));//set font of the text
    	   jlabel.setLayout(new GridLayout());
    	   Timer timer=new Timer();
    	   timer.scheduleAtFixedRate(updateDateTime(), 0, 1000);  	   
    	  add(jlabel);
    	
         
    	  this.setVisible(true);
    
    	  
     }
     private TimerTask updateDateTime() {
         return new TimerTask() {
             @Override
             public void run() {
                 
                 LocalDateTime currentDate = LocalDateTime.now();
                 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                 LocalDateTime currentTime = LocalDateTime.now();
                 DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(" HH:mm:ss");
                 String formattedDateTime ="date:"+ currentDate.format(formatter)+" \nTime: "+currentDate.format(formatter1);
               
                 
                  jlabel.setText(formattedDateTime);
                
                
             }
         };
     }
}
