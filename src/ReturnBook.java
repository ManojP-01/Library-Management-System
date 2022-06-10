
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;


public class ReturnBook extends javax.swing.JFrame {

       public ReturnBook() throws SQLException {
        initComponents();
       
    }
     Connection conn ;
     PreparedStatement pst ;
     ResultSet  rs;
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtstudentid = new javax.swing.JTextField();
        txtbookid = new javax.swing.JTextField();
        txtbookname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtauthor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtedition = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtdoi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtfine = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RETURN BOOK");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("STUDENT ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("BOOK NAME");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("BOOK ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("D.O.R.");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtauthorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("AUTHOR");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("EDITION");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setText("D.O.I");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setText("FINE");

        txtfine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfineActionPerformed(evt);
            }
        });
        txtfine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfineKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbookname, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(txtbookid, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfine, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtdoi, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .addComponent(txtedition))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)))
                .addGap(0, 57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbookid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtbookname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtedition, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdoi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtfine, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String Studentid = txtstudentid.getText();
     String bookname= txtbookname.getText();
     String bookid= txtbookid.getText();
      String author= txtauthor.getText();
       String edition= txtedition.getText();
       
        
       String doi= txtdoi.getText();
        txtdate.setDateFormatString("dd/MM/yyyy");
      SimpleDateFormat Date_Format=new SimpleDateFormat("dd-MM-yyyy");
         String dor= Date_Format.format(txtdate.getDate());
    
      String fine   = txtfine.getText(); 
    
    
    
         Connection conn =null;
     
     PreparedStatement insert = null ;
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
         conn=(Connection) DriverManager.getConnection("jdbc:mysql:///library","root","");
          insert=conn.prepareStatement("update records set RETURNDATE=?,FINE=?where STUDENTID= ? and BOOKID=? ");
         insert.setString(1,dor);
           insert.setString(2,fine);
        insert.setString(3,Studentid);
         insert.setString(4,bookid);
                   int i=insert.executeUpdate();
         
         JOptionPane.showMessageDialog(null,"BOOK RETURNED");
          bookadd();
        
     }
     catch(HeadlessException | ClassNotFoundException | SQLException e)
     {
         JOptionPane.showMessageDialog(null,e);
     }  
    }//GEN-LAST:event_jButton1ActionPerformed
public void bookadd()
{
    String bookid = txtbookid.getText();
     String bookname= txtbookname.getText();
     String author= txtauthor.getText();
     String edition = txtedition.getText();
     Connection conn =null;
     PreparedStatement pst  = null;
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
         conn=(Connection) DriverManager.getConnection("jdbc:mysql:///library","root","");
         pst=conn.prepareStatement("insert into addbook values(?,?,?,?)");
         pst.setString(1,bookid);
         pst.setString(2,bookname);
         pst.setString(3,author);
         pst.setString(4,edition);
         int i=pst.executeUpdate();
         if(i>0) 
         {
         
         }
         else
         {
             JOptionPane.showMessageDialog(null,"data is not inserted");
             
         }
         
         
     }
     catch(HeadlessException | ClassNotFoundException | SQLException e)
     {
         JOptionPane.showMessageDialog(null,e);
     }
      
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.setVisible(false);
           Librarianwork librarianwork = new Librarianwork();
        librarianwork.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
  String Studentid = txtstudentid.getText();
  String Bookid = txtbookid.getText();
     
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
         conn=(Connection) DriverManager.getConnection("jdbc:mysql:///library","root","");
         pst=conn.prepareStatement("select* from issuedbook where Studentid = ? and Bookid = ? ");
         pst.setString(1,Studentid);
         pst.setString(2,Bookid);
         
         rs= pst.executeQuery();
         while(rs.next())
         {
           txtbookname.setText(rs.getString("BOOK NAME"));
           txtauthor.setText(rs.getString("AUTHOR"));
           txtedition.setText(rs.getString("EDITION"));
           txtdoi.setText( rs.getString("D.O.I"));
           
         
         }
     }
         
        catch(HeadlessException | ClassNotFoundException | SQLException e)
     {
         JOptionPane.showMessageDialog(null,e);
     }        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtdateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdateKeyReleased
         String doi= txtdoi.getText();
        txtdate.setDateFormatString("dd/MM/yyyy");
      SimpleDateFormat Date_Format=new SimpleDateFormat("dd-MM-yyyy");
         String dor= Date_Format.format(txtdate.getDate());
          DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
    LocalDate date1 = LocalDate.parse(doi,formatter);
     LocalDate date2= LocalDate.parse(dor,formatter);
    long i; 
        i = ChronoUnit.DAYS.between(date1,date2);
        if (i> 15)
        {
            txtfine.setText("i*10");
        }
        else
        {
            txtfine.setText("0");
        }
    }//GEN-LAST:event_txtdateKeyReleased

    private void txtauthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtauthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtauthorActionPerformed

    private void txtfineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfineActionPerformed

    private void txtdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdateKeyPressed
        // TODO add your handling code here:
        String doi= txtdoi.getText();
        txtdate.setDateFormatString("dd/MM/yyyy");
      SimpleDateFormat Date_Format=new SimpleDateFormat("dd-MM-yyyy");
         String dor= Date_Format.format(txtdate.getDate());
          DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
    LocalDate date1 = LocalDate.parse(doi,formatter);
     LocalDate date2= LocalDate.parse(dor,formatter);
    long i; 
        i = ChronoUnit.DAYS.between(date1,date2);
        if (i> 15)
        {
            txtfine.setText("i*10");
        }
        else
        {
            txtfine.setText("0");
        }
    }//GEN-LAST:event_txtdateKeyPressed

    private void txtfineKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfineKeyTyped
        // TODO add your handling code here:
         String doi= txtdoi.getText();
        txtdate.setDateFormatString("dd/MM/yyyy");
      SimpleDateFormat Date_Format=new SimpleDateFormat("dd-MM-yyyy");
         String dor= Date_Format.format(txtdate.getDate());
          DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
    LocalDate date1 = LocalDate.parse(doi,formatter);
     LocalDate date2= LocalDate.parse(dor,formatter);
    long i,c; 
    String  d;
        i = ChronoUnit.DAYS.between(date1,date2);
        if (i> 15)
        {
            c=i-15;

            double b;
                         b = c*20;

             d = Double.toString(b);
            
            txtfine.setText(d);
        }
        else
        {
            txtfine.setText("0");
        }
    }//GEN-LAST:event_txtfineKeyTyped

    public static void main(String args[]) {
           try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
             java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new ReturnBook().setVisible(true);
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtdoi;
    private javax.swing.JTextField txtedition;
    private javax.swing.JTextField txtfine;
    private javax.swing.JTextField txtstudentid;
    // End of variables declaration//GEN-END:variables
}
