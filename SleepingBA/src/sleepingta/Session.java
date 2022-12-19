/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleepingta;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mahmo
 */
public class Session extends javax.swing.JFrame {

    /**
     * Creates new form Session
     */
    
    private boolean[] Busy, waiting;
    private final int MaxSleep = 5;
    private final int MaxBusy = 5;
    private final int Waiting = 6;
    private static int noOfBAs, noOfCustomers, noOfChairs;
    public Session(int noOfBAs, int noOfCustomer, int noOfChairs) {
        initComponents();
        this.noOfBAs = noOfBAs;
        this.noOfCustomers = noOfCustomer;
        this.noOfChairs = noOfChairs;
        Busy = new boolean[this.noOfBAs];
        waiting = new boolean[this.noOfChairs];
        
        for (int i = this.noOfBAs; i < (MaxSleep + MaxBusy); i++) {
            BAPanel.getComponent(i).setVisible(false);
        }
        
        for (int i = 0; i < Waiting; i++) {
            WaitPanel.getComponent(i).setVisible(false);
        }
        
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BAText = new javax.swing.JLabel();
        WaitingText = new javax.swing.JLabel();
        BAPanel = new javax.swing.JPanel();
        sleepBA1 = new javax.swing.JLabel();
        sleepBA = new javax.swing.JLabel();
        sleepBA3 = new javax.swing.JLabel();
        sleepBA4 = new javax.swing.JLabel();
        sleepBA5 = new javax.swing.JLabel();
        Busy1 = new javax.swing.JLabel();
        Busy2 = new javax.swing.JLabel();
        Busy3 = new javax.swing.JLabel();
        Busy4 = new javax.swing.JLabel();
        Busy5 = new javax.swing.JLabel();
        WaitPanel = new javax.swing.JPanel();
        waiting1 = new javax.swing.JLabel();
        waiting2 = new javax.swing.JLabel();
        waiting3 = new javax.swing.JLabel();
        waiting4 = new javax.swing.JLabel();
        waiting5 = new javax.swing.JLabel();
        waiting6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BAText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BAText.setText("All Barbers are sleeping");
        getContentPane().add(BAText);
        BAText.setBounds(60, 210, 550, 80);

        WaitingText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WaitingText.setText("waiting chairs are available");
        getContentPane().add(WaitingText);
        WaitingText.setBounds(100, 420, 430, 50);

        BAPanel.setLayout(null);

        sleepBA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/sleep.jpg"))); // NOI18N
        sleepBA1.setText("jLabel5");
        BAPanel.add(sleepBA1);
        sleepBA1.setBounds(0, 0, 170, 150);

        sleepBA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/sleep.jpg"))); // NOI18N
        sleepBA.setText("jLabel5");
        BAPanel.add(sleepBA);
        sleepBA.setBounds(170, 0, 170, 150);

        sleepBA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/sleep.jpg"))); // NOI18N
        sleepBA3.setText("jLabel5");
        BAPanel.add(sleepBA3);
        sleepBA3.setBounds(340, 0, 170, 150);

        sleepBA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/sleep.jpg"))); // NOI18N
        sleepBA4.setText("jLabel5");
        BAPanel.add(sleepBA4);
        sleepBA4.setBounds(510, 0, 170, 150);

        sleepBA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/sleep.jpg"))); // NOI18N
        sleepBA5.setText("jLabel5");
        BAPanel.add(sleepBA5);
        sleepBA5.setBounds(680, 0, 75, 193);

        Busy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/Ask.jpg"))); // NOI18N
        Busy1.setText("jLabel2");
        BAPanel.add(Busy1);
        Busy1.setBounds(0, 0, 170, 150);

        Busy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/Ask.jpg"))); // NOI18N
        Busy2.setText("jLabel2");
        BAPanel.add(Busy2);
        Busy2.setBounds(170, 0, 170, 150);

        Busy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/Ask.jpg"))); // NOI18N
        Busy3.setText("jLabel2");
        BAPanel.add(Busy3);
        Busy3.setBounds(340, 0, 170, 150);

        Busy4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/Ask.jpg"))); // NOI18N
        Busy4.setText("jLabel2");
        BAPanel.add(Busy4);
        Busy4.setBounds(510, 0, 170, 150);

        Busy5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/Ask.jpg"))); // NOI18N
        Busy5.setText("jLabel2");
        BAPanel.add(Busy5);
        Busy5.setBounds(680, 0, 170, 150);

        getContentPane().add(BAPanel);
        BAPanel.setBounds(10, 30, 850, 150);

        WaitPanel.setLayout(null);

        waiting1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/wait.jpg"))); // NOI18N
        waiting1.setText("jLabel2");
        WaitPanel.add(waiting1);
        waiting1.setBounds(0, 0, 140, 110);

        waiting2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/wait.jpg"))); // NOI18N
        waiting2.setText("jLabel2");
        WaitPanel.add(waiting2);
        waiting2.setBounds(140, 0, 140, 110);

        waiting3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/wait.jpg"))); // NOI18N
        waiting3.setText("jLabel2");
        WaitPanel.add(waiting3);
        waiting3.setBounds(280, 0, 140, 110);

        waiting4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/wait.jpg"))); // NOI18N
        waiting4.setText("jLabel2");
        WaitPanel.add(waiting4);
        waiting4.setBounds(420, 0, 140, 110);

        waiting5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/wait.jpg"))); // NOI18N
        waiting5.setText("jLabel2");
        WaitPanel.add(waiting5);
        waiting5.setBounds(560, 0, 140, 110);

        waiting6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/wait.jpg"))); // NOI18N
        waiting6.setText("jLabel2");
        WaitPanel.add(waiting6);
        waiting6.setBounds(700, 0, 170, 110);

        getContentPane().add(WaitPanel);
        WaitPanel.setBounds(10, 290, 840, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/Back.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel2.setPreferredSize(new java.awt.Dimension(1500, 1000));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, -100, 2500, 600);
        jLabel2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
//       Session form = new Session(noOfBAs, noOfCustomers, noOfChairs);
//       SleepingTA s = new SleepingTA(noOfCustomers, noOfChairs, noOfBAs);
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
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Session(noOfBAs, noOfCustomers, noOfChairs).setVisible(true);
//                
//        }    
//        });
        
        
        
        
    }
    
    public void BusyBA(int BA_ID){
        try {
           
            Thread.sleep(500);
            Busy[BA_ID - 1] = true;
            BAPanel.getComponent( BA_ID - 1 ).setVisible(false);
            BAPanel.getComponent( BA_ID + MaxSleep - 1 ).setVisible(true);
            int c = getBusyBA();
            if (c == noOfBAs) {
                BAText.setText("All Barbers are Busy");
            }
            else if (c == 0){
                BAText.setText("All Barbers are available");
            }
            else{
                BAText.setText(c + " Barbers are Busy, " +(noOfBAs - c)
                        +" Barbers are avaliable");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SleepBA(int BA_ID){
        
        try {
            Thread.sleep(500);
            Busy[BA_ID - 1] = false;
            BAPanel.getComponent( BA_ID - 1 ).setVisible(true);
            BAPanel.getComponent( BA_ID + MaxSleep - 1 ).setVisible(false);
            int c = getBusyBA();
            if (c == noOfBAs) {
                BAText.setText("All Barbers are Busy");
            }
            else if (c == 0){
                BAText.setText("All Barbers are available");
            }
            else{
                BAText.setText(c + " Barbers are Busy, " +(noOfBAs - c)
                        +" Barbers are avaliable");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void TakeChair() throws InterruptedException{
        
        for (int i = 0; i < noOfChairs; i++) {
            if (!waiting[i]) {
                waiting[i] = true;
                Thread.sleep(500);
                WaitPanel.getComponent(i).setVisible(true);
                int c = getWaitingChairs();
                if (c == noOfChairs) {
                WaitingText.setText("There is no Chair available");
            }
            else if(c == 0){
                WaitingText.setText("All Chairs are available");
            }
            else{
                WaitingText.setText(c + " Chairs are Taken, " +(noOfChairs - c)
                        +" Chairs are available");
            }
            }
        }
    }
    
    public void ReturnChair(int BA_ID) throws InterruptedException{
        
        for (int i = 0; i < noOfChairs; i++) {
            if (waiting[i]) {
                waiting[i] = false;
                Thread.sleep(500);
                WaitPanel.getComponent(i).setVisible(false);
                int c = getWaitingChairs();
                if (c == noOfChairs) {
                WaitingText.setText("There is no Chair available");
            }
            else if(c == 0){
                WaitingText.setText("All Chairs are available");
            }
            else{
                WaitingText.setText(c + " Chairs are Taken, " +(noOfChairs - c)
                        +" Chairs are available");
            }
            }
        }
    }
    
    
    public int getBusyBA(){
        int c = 0;
        for (int i = 0; i < noOfBAs; i++) {
            if (Busy[i]) {
                c++;
            }
            
        }
        return c;
    }
    
    public int getWaitingChairs(){
        int c = 0;
        for (int i = 0; i < noOfChairs; i++) {
            if (waiting[i]) {
                c++;
            }
           
        }
        return c;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BAPanel;
    private javax.swing.JLabel BAText;
    private javax.swing.JLabel Busy1;
    private javax.swing.JLabel Busy2;
    private javax.swing.JLabel Busy3;
    private javax.swing.JLabel Busy4;
    private javax.swing.JLabel Busy5;
    private javax.swing.JPanel WaitPanel;
    private javax.swing.JLabel WaitingText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel sleepBA;
    private javax.swing.JLabel sleepBA1;
    private javax.swing.JLabel sleepBA3;
    private javax.swing.JLabel sleepBA4;
    private javax.swing.JLabel sleepBA5;
    public javax.swing.JLabel waiting1;
    private javax.swing.JLabel waiting2;
    private javax.swing.JLabel waiting3;
    private javax.swing.JLabel waiting4;
    private javax.swing.JLabel waiting5;
    private javax.swing.JLabel waiting6;
    // End of variables declaration//GEN-END:variables
}