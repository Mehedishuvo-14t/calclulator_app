/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

/**
 *
 * @author pc
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    double NumEnter1;
    double NumEnter2;
    double Result;
    String op;
    public Calculator() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jtxtResult = new javax.swing.JTextField();
        jbtnBS = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnCE = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtndigit5 = new javax.swing.JButton();
        jbtnminus = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jbtndigit4 = new javax.swing.JButton();
        jbtndigit6 = new javax.swing.JButton();
        jbtndigit2 = new javax.swing.JButton();
        jbtnmulti = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jbtndigit1 = new javax.swing.JButton();
        jbtndigit3 = new javax.swing.JButton();
        jbtndot = new javax.swing.JButton();
        jbtndiv = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jbtndigit0 = new javax.swing.JButton();
        jbntequal = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, 50));

        jbtnBS.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnBS.setText("<-");
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 40));

        jbtnPM.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnPM.setText("±");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 80, 40));

        jbtnCE.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, 40));

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, 40));

        jbtnC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 80, 40));

        jbtnDigit8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 80, 40));

        jbtnPlus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnPlus.setText("+");
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 80, 40));

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 80, 40));

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 80, 40));

        jbtnDigit7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, 40));

        jbtnDigit9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 80, 40));

        jbtndigit5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtndigit5.setText("5");
        jbtndigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtndigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 80, 40));

        jbtnminus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnminus.setText("-");
        jbtnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnminusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 80, 40));

        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 80, 40));

        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 80, 40));

        jbtndigit4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtndigit4.setText("4");
        jbtndigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtndigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 80, 40));

        jbtndigit6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtndigit6.setText("6");
        jbtndigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtndigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 80, 40));

        jbtndigit2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtndigit2.setText("2");
        jbtndigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtndigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 80, 40));

        jbtnmulti.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnmulti.setText("*");
        jbtnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmultiActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnmulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 80, 40));

        jButton23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 80, 40));

        jButton24.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 80, 40));

        jbtndigit1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtndigit1.setText("1");
        jbtndigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtndigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 80, 40));

        jbtndigit3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtndigit3.setText("3");
        jbtndigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtndigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 80, 40));

        jbtndot.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtndot.setText(".");
        jbtndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndotActionPerformed(evt);
            }
        });
        getContentPane().add(jbtndot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 80, 40));

        jbtndiv.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtndiv.setText("/");
        jbtndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndivActionPerformed(evt);
            }
        });
        getContentPane().add(jbtndiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 80, 40));

        jButton29.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 80, 40));

        jButton30.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 80, 40));

        jbtndigit0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtndigit0.setText("0");
        jbtndigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtndigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 80, 40));

        jbntequal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbntequal.setText("=");
        jbntequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntequalActionPerformed(evt);
            }
        });
        getContentPane().add(jbntequal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 80, 40));

        jButton33.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void EnterNumbers(String q){
    String Nums=jtxtResult.getText()+q;
    jtxtResult.setText(Nums);
}
    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
     double nums=Double.parseDouble(String.valueOf(jtxtResult.getText()));
     nums=nums*(-1);
jtxtResult.setText(String.valueOf(nums));// TODO add your handling code here:
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        jtxtResult.setText(" "); // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
         NumEnter1=Double.parseDouble(jtxtResult.getText());
     jtxtResult.setText(" ");
op="+";  // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
EnterNumbers("7");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
       EnterNumbers("9"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnminusActionPerformed
           NumEnter1=Double.parseDouble(jtxtResult.getText());
     jtxtResult.setText(" ");
op="-";// TODO add your handling code here:
    }//GEN-LAST:event_jbtnminusActionPerformed

    private void jbtndigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit4ActionPerformed
         EnterNumbers("4");// TODO add your handling code here:
    }//GEN-LAST:event_jbtndigit4ActionPerformed

    private void jbtndigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit6ActionPerformed
       EnterNumbers("6"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtndigit6ActionPerformed

    private void jbtnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmultiActionPerformed
         NumEnter1=Double.parseDouble(jtxtResult.getText());
     jtxtResult.setText(" ");
op="*"; // TODO add your handling code here:
    }//GEN-LAST:event_jbtnmultiActionPerformed

    private void jbtndigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit1ActionPerformed
       EnterNumbers("1"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtndigit1ActionPerformed

    private void jbtndigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit3ActionPerformed
    EnterNumbers("3");    // TODO add your handling code here:
    }//GEN-LAST:event_jbtndigit3ActionPerformed

    private void jbtndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndivActionPerformed
     NumEnter1=Double.parseDouble(jtxtResult.getText());
     jtxtResult.setText(" ");
op="/";// TODO add your handling code here:
    }//GEN-LAST:event_jbtndivActionPerformed

    private void jbtndigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit0ActionPerformed
       EnterNumbers("0");  // TODO add your handling code here:
    }//GEN-LAST:event_jbtndigit0ActionPerformed

    private void jbntequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntequalActionPerformed
      NumEnter2=Double.parseDouble((jtxtResult.getText()));
      if(op=="+"){
          Result=NumEnter1 + NumEnter2;
          jtxtResult.setText(String.valueOf(Result));
      }
      else if(op=="-"){
            Result=NumEnter1 - NumEnter2;
          jtxtResult.setText(String.valueOf(Result));
      }
      else if(op=="*"){
            Result=NumEnter1 * NumEnter2;
          jtxtResult.setText(String.valueOf(Result));
      }
      else if(op=="/"){
            Result=NumEnter1 / NumEnter2;
          jtxtResult.setText(String.valueOf(Result));
      }
    }//GEN-LAST:event_jbntequalActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
      jtxtResult.setText(" ");
      String Fn,Sn;
Fn=String.valueOf(NumEnter1);
Sn=String.valueOf(NumEnter2);
Fn="";
Sn="";// TODO add your handling code here:
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
       String backsp=null;
       if(jtxtResult.getText().length()>0){
           StringBuilder sb=new StringBuilder (jtxtResult.getText());
           sb.deleteCharAt(jtxtResult.getText().length()-1);
           backsp=sb.toString();
           jtxtResult.setText(backsp);
           
       }
    }//GEN-LAST:event_jbtnBSActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
EnterNumbers("8");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtndigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit5ActionPerformed
EnterNumbers("5");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtndigit5ActionPerformed

    private void jbtndigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit2ActionPerformed
EnterNumbers("2");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtndigit2ActionPerformed

    private void jbtndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndotActionPerformed
       if(!jtxtResult.getText().contains(".")){
           jtxtResult.setText(jtxtResult.getText()+jbtndot.getText());
       }
    }//GEN-LAST:event_jbtndotActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton jbntequal;
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtndigit0;
    private javax.swing.JButton jbtndigit1;
    private javax.swing.JButton jbtndigit2;
    private javax.swing.JButton jbtndigit3;
    private javax.swing.JButton jbtndigit4;
    private javax.swing.JButton jbtndigit5;
    private javax.swing.JButton jbtndigit6;
    private javax.swing.JButton jbtndiv;
    private javax.swing.JButton jbtndot;
    private javax.swing.JButton jbtnminus;
    private javax.swing.JButton jbtnmulti;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
