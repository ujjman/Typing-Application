/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TypingApplication;

import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author ujjwa
 */
public class Helper extends TimerTask{
    public static int sec=1,min=0,hr=0;
    JLabel jjl;
    public Helper(){
        
    }
    public Helper(JLabel l){
        jjl=l;
    }
    @Override
    public void run(){
        if(sec==60)
        {
            sec=0;
            min++;
        }
        if(min==60)
        {
            min=0;
            hr++;
        }
        jjl.setText("Time Elapsed : "+hr+":"+min+":"+sec);
        sec++;
        
    }
    
}
