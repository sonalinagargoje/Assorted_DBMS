/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author mihir
 */
public class InsertRecordDynamic extends javax.swing.JFrame {

    /**
     * Creates new form InsertRecordDynamic
     */
    public InsertRecordDynamic() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    Statement stmt = null;
    Statement stmt3 = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    ResultSet rs3 = null;
    Connection con;
    Connection con3;
    //ResultSet rsmt = null;
    
    int x = 0;
    int x2 = 0;
    String semiquery = "";
    String tablename = "";
    public static String tablename1 = "";
    int i = 1;
    int c = 0;
    int anotherflag = 0;
    int negcount = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jList1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jList1.setModel(new DefaultListModel());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Select a Table :");

        jButton4.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton4.setText("EXIT ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Column Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Data Type :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("(Column name will appear here)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("(Data type will appear here)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Enter Data :");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Insert Record");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("I N S E R T   R E C O R D S");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel6)
                                        .addGap(34, 34, 34)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jButton2))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(503, 503, 503)
                        .addComponent(jLabel7)))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(54, 54, 54)
                        .addComponent(jButton2)))
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        
        
        DefaultListModel dModel = (DefaultListModel) jList1.getModel();
        dModel.clear();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/"+DatabaseAndTable.DATABASENAME+"","root","12345");
            stmt = con.createStatement();
            String SQL = "show tables;";
            rs = stmt.executeQuery(SQL);
            
             while (rs.next()) 
             {
                String a = rs.getString("Tables_In_"+DatabaseAndTable.DATABASENAME+"");
                dModel.addElement(a);
             
             }
            
             jList1.setModel(dModel);
            
             con.close();
            }
        
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }        
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

        tablename =  (String)jList1.getSelectedValue();
        tablename1 = tablename;
        String newquery = "desc "+tablename+";";
        String mihirquery = "select * from "+tablename+";";
        
        
        jButton2.setEnabled(false);
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/"+DatabaseAndTable.DATABASENAME+"","root","12345");
            con3 = DriverManager.getConnection("jdbc:mysql://localhost/"+DatabaseAndTable.DATABASENAME+"","root","12345");
            stmt = con.createStatement();
            stmt3 = con3.createStatement();
            
            rs = stmt.executeQuery(newquery);
            rs3 = stmt3.executeQuery(mihirquery);
            
            
         ResultSetMetaData rsmt = rs3.getMetaData(); 
         int c = rsmt.getColumnCount();
         x = 0;   
            
         
              if(x<c)
              {
                 rs.next();
                 String a = rs.getString("Field");
                 jLabel4.setText(a);
                 x++;
              }
                               
            
            //con.close();
            } 
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
            
        }
        
        
        
         try {
             Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/"+DatabaseAndTable.DATABASENAME+"","root","12345");
            con3 = DriverManager.getConnection("jdbc:mysql://localhost/"+DatabaseAndTable.DATABASENAME+"","root","12345");
            stmt = con.createStatement();
            stmt3 = con3.createStatement();
            rs2 = stmt.executeQuery(newquery);
            
            rs3 = stmt3.executeQuery(mihirquery);
            
            
         ResultSetMetaData rsmt = rs3.getMetaData(); 
         int c = rsmt.getColumnCount();
         x2 = 0;  
            
         
              if(x2<c){
              rs2.next();
              String a = rs2.getString("Type");
              jLabel5.setText(a);
              x2++;
              }
                               
            
            //con.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
            
        }
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new HomeScreen().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //String tablename =  (String)jList1.getSelectedValue();

        String newquery = "desc "+tablename+";";

        int count = 0;

      if(negcount==1)
      {
          
          jButton2.setEnabled(true);
          JOptionPane.showMessageDialog(this,"Last Column Reached !");
          
      }  
        
      try {
            
            
         ResultSetMetaData rsmt = rs3.getMetaData(); 
         int c = rsmt.getColumnCount();
         count = c;
         
         if(anotherflag==0)
         {
             anotherflag = 1;
             negcount = c;
         }
            //System.out.println(c);
            
         if(negcount==1){con.close();con3.close();}   
         
              if(x<c){
              rs.next();
              String a = rs.getString("Field");
              jLabel4.setText(a);
              x++;
              }
              
             
            
         
              if(x2<c){
              rs2.next();
              String a = rs2.getString("Type");
              jLabel5.setText(a);
              x2++;
              }
              
                //if(x==c){System.out.println("LCR");
              //  JOptionPane.showMessageDialog(null,"LCR");
               // }
            
            
            } 
        
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(this,"Last Column Reached !");
            
        }
        
        
        
        
        semiquery +='"';
        semiquery += jTextField1.getText();
        semiquery +='"';
        if(i<count)
        {
            //System.out.println(count);
            //System.out.println(i);
            System.out.println(negcount);
            i++;
            negcount--;
            semiquery += " ,";
        }
        
        
        jTextField1.setText("");
        
       
            
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String finalquery = "insert into ";
finalquery += tablename1;
finalquery += " values ( ";
finalquery += semiquery;
finalquery += " );";

        System.out.println(finalquery);

        
        
        try {
           Class.forName("com.mysql.jdbc.Driver");
            Connection con =
            DriverManager.getConnection("jdbc:mysql://localhost/"+DatabaseAndTable.DATABASENAME+"","root","12345");
            Statement stmt = null;
            ResultSet rs = null;
            
            
            stmt = con.createStatement();
            
        int x = stmt.executeUpdate(finalquery);
        


           }
       
       catch(Exception e ){
       JOptionPane.showMessageDialog(null,e.getMessage());
                          }
        
        
        JOptionPane.showMessageDialog(null,"You have successfully inserted a record !");
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
             Connection con =
             DriverManager.getConnection("jdbc:mysql://localhost/assorted_DB","root","12345");
             Statement stmt5= null;
             ResultSet rs5=null;
        //tablename =  (String)jList1.getSelectedValue();
        //tablename1 = tablename;

             //String s=tablename1;
             stmt5=con.createStatement();
             java.util.Date date=new java.util.Date();
			
            java.sql.Date sqlDate=new java.sql.Date(date.getTime());
            java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
            PreparedStatement ps=con.prepareStatement("insert into Records (rec_time,rec_date,tb_id) values(?,?,?);");
                          //ResultSet tableKeys = ps.getGeneratedKeys();

          String qury="Select tb_id from tb_names where table_name like '"+tablename1+"';";
          rs5 = stmt5.executeQuery(qury);
          
          String aaa = "";
          
           while (rs5.next()) {
               aaa = rs5.getString("tb_id");            
                               }
          
          
           // ps.setInt(1,0);
          //  ps.setString(1,DATABASENAME);
            ps.setDate(2,sqlDate);
			ps.setTimestamp(1,sqlTime);
                        ps.setString(3,aaa);
			ps.executeUpdate();			
			         System.out.println(ps);
			ps.close();

                  }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
       
        }
              //JOptionPane.showMessageDialog(null,"Database Saved.");
              
              
              jLabel4.setText("(Column name will appear here)");
              jLabel5.setText("(Data type will appear here)");
              jTextField1.setText("");
              semiquery = "";
              finalquery = "";
              
              i = 1;
              c = 0;
              anotherflag = 0;
              negcount = 0;
              
        
        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(InsertRecordDynamic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertRecordDynamic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertRecordDynamic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertRecordDynamic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertRecordDynamic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
