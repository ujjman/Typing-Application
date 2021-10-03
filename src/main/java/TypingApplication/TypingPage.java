/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TypingApplication;

import java.awt.Dialog;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author ujjwa
 */
public class TypingPage extends javax.swing.JFrame {
int charPos=0,lengthooftext=0,correct=0,wrong=0,total=0,checkforwrong1=0,checkforwrong2=0;
Timer timer = new Timer();
TimerTask task = new Helper(this.time);
boolean correctchararray[];
    /**
     * Creates new form TypingPage
     */
    public TypingPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        start = new javax.swing.JButton();
        practiseText = new javax.swing.JTextField();
        text = new javax.swing.JLabel();
        typeBox = new javax.swing.JTextField();
        wronglabel = new javax.swing.JLabel();
        correctlabel = new javax.swing.JLabel();
        totallabel = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        start.setBackground(new java.awt.Color(204, 255, 204));
        start.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        start.setForeground(new java.awt.Color(255, 51, 51));
        start.setText("Start");
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
        });

        practiseText.setBackground(new java.awt.Color(255, 204, 255));
        practiseText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        practiseText.setForeground(new java.awt.Color(0, 51, 255));
        practiseText.setText("hello");
        practiseText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        text.setBackground(new java.awt.Color(204, 255, 255));
        text.setFont(new java.awt.Font("Tahoma", 0, 200)); // NOI18N
        text.setText("k");

        typeBox.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        typeBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                typeBoxKeyPressed(evt);
            }
        });

        wronglabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        wronglabel.setText("Wrong : ");

        correctlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        correctlabel.setText("Correct : ");

        totallabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totallabel.setText("Total :");

        time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        time.setText("Time Elapsed :");

        reset.setBackground(new java.awt.Color(204, 255, 204));
        reset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 51, 51));
        reset.setText("RESET");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(typeBox))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(practiseText, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(wronglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totallabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(1086, Short.MAX_VALUE)
                    .addComponent(correctlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(practiseText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addGap(143, 143, 143)
                        .addComponent(wronglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totallabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(353, 353, 353)
                    .addComponent(correctlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(462, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseClicked
        // TODO add your handling code here:
        
        correct=0;
        wrong=0;
        total=0;
        charPos=0;
        typeBox.setText("");
        try{
        text.setText(practiseText.getText());
        lengthooftext=practiseText.getText().length();
        correctchararray=new boolean[lengthooftext];
        }catch(Exception e)
        {
            Error er=new Error();
            er.setVisible(e.toString());
        }
        String s="<html>"+"<span><font color=green>hello</font></span>"+"<span><font color=red>ujjman</font></span>"+"</html>";
        text.setText(practiseText.getText());
        
        
    }//GEN-LAST:event_startMouseClicked

    private void typeBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeBoxKeyPressed
        
// Since Java-8
        
        if(evt.getKeyCode()==8)
        {
            if(charPos==0)
                return;
            charPos--;
            return;
        }
        if(evt.getKeyChar()==' ')
            typeBox.setText("");
        if(charPos==(lengthooftext)){
            total++;
            if(checkforwrong1==checkforwrong2)
                correct++;
            else{
                wrong++;
                checkforwrong1=checkforwrong2;
            }
            correctlabel.setText("Correct : "+correct+"");
            wronglabel.setText("Wrong : "+wrong+"");
            totallabel.setText("Total : "+total+"");
            charPos=0;
            typeBox.setText("");
            correctchararray=new boolean[lengthooftext];
        }
        boolean correctchar=false;
        if(evt.getKeyChar()== practiseText.getText().charAt(charPos))
        {
           correctchar=true;
        }
        if(correctchar)
            correctchararray[charPos]=true;
        
        char ch=practiseText.getText().charAt(charPos);
//        String first=practiseText.getText().substring(0, charPos);
        String toshow="<html>";
        for(int i=0;i<=charPos;i++)
        {
            if(correctchararray[i])
            {
                toshow=toshow.concat("<span><font color=green>"+practiseText.getText().charAt(i)+"</font></span>");
            }
            else{
                toshow=toshow.concat("<span><font color=red>"+practiseText.getText().charAt(i)+"</font></span>");
                checkforwrong2++;
            }
        }
        
        
//        if(charPos==0)
//            first="";
        String second=practiseText.getText().substring(charPos+1, lengthooftext);
        toshow=toshow.concat("<span>"+second+"</span");
        toshow=toshow.concat("</html>");
//        if(charPos==lengthooftext-1)
//        second="";
//        String setText="";
//        if(correctchar){
//        setText= "<html><span>"+first+"</span>"+
//  "<span><font color=green>"+ch+"</font></span><span>"+second+"</span></html>";
//        }
//        else
//        {
//        setText= "<html><span>"+first+"</span>"+
//  "<span><font color=red>"+ch+"</font></span><span>"+second+"</span></html>";
//        checkforwrong2++;
//        }
        text.setText(toshow);
        
        charPos++;
        // TODO add your handling code here:
    }//GEN-LAST:event_typeBoxKeyPressed

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
try{
        timer.cancel();}catch(Exception e){}
        timer=new Timer();
        task = new Helper(this.time);
        Helper.hr=0;
        Helper.min=0;
        Helper.sec=0;
        timer.schedule(task, 0, 1000);        // TODO add your handling code here:
    }//GEN-LAST:event_resetMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TypingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TypingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TypingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TypingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TypingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel correctlabel;
    private javax.swing.JTextField practiseText;
    private javax.swing.JButton reset;
    private javax.swing.JButton start;
    private javax.swing.JLabel text;
    private javax.swing.JLabel time;
    private javax.swing.JLabel totallabel;
    private javax.swing.JTextField typeBox;
    private javax.swing.JLabel wronglabel;
    // End of variables declaration//GEN-END:variables
}