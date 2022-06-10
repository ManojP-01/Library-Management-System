
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Issuebook extends javax.swing.JFrame {

       public Issuebook() throws SQLException {
        initComponents();
      
        
         
        
        
    }
    PreparedStatement pst;
    Connection  conn ;
    ResultSet  rs;

    
  
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
        jButton3 = new javax.swing.JButton();
        txtedition = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtauthor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ISSUE BOOK");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("STUDENT ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("BOOK NAME");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("D.O.I");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("BOOK ID");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("EDITION");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("AUTHOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbookname, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtbookid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                            .addComponent(txtstudentid, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtedition, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(32, 32, 32)
                                        .addComponent(jButton3))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbookid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton3))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtbookname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtedition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
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

     String studentid = txtstudentid.getText();
     String bookname= txtbookname.getText();
     String bookid= txtbookid.getText();
     String author=  txtauthor.getText();
     String edition= txtedition.getText();
     Connection conn = null;
        txtdate.setDateFormatString("dd/MM/yyyy");
      SimpleDateFormat Date_Format=new SimpleDateFormat("dd-MM-yyyy");
         String doi= Date_Format.format(txtdate.getDate());

     PreparedStatement pst = null ;
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
         conn=(Connection) DriverManager.getConnection("jdbc:mysql:///library","root","");
         pst=conn.prepareStatement("insert into issuedbook values(?,?,?,?,?,?)");

         pst.setString(1,studentid);
         pst.setString(2,bookid);
          pst.setString(3,bookname);
           pst.setString(4,author);
           pst.setString(5,edition);
            pst.setString(6,doi);
         
         
         int i=pst.executeUpdate();
         if(i>0) 
         {JOptionPane.showMessageDialog(null,"BOOK ISSUED");
          
         
         bookdelete();
         records();
          
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
      
     
  
   
     
     
     
    }//GEN-LAST:event_jButton1ActionPerformed

    public void bookdelete()
{
    String bookid = txtbookid.getText();
     Connection conn =null;
     PreparedStatement pst  = null;
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
         conn=(Connection) DriverManager.getConnection("jdbc:mysql:///library","root","");
         pst=conn.prepareStatement("delete from addbook where bookid = ?");
         pst.setString(1,bookid);
         int i=pst.executeUpdate();
         if(i>0) 
         {
          
         
         }
         else
         {
             JOptionPane.showMessageDialog(null,"The userid does not belong here");
             
         }
         
         
     }
     catch(HeadlessException | ClassNotFoundException | SQLException e)
     {
         JOptionPane.showMessageDialog(null,e);
     }
}
    public void records()
    {
     String studentid = txtstudentid.getText();
     String bookname= txtbookname.getText();
     String bookid= txtbookid.getText();
     String author=  txtauthor.getText();
     String edition= txtedition.getText();
     Connection conn = null;
        txtdate.setDateFormatString("dd/MM/yyyy");
      SimpleDateFormat Date_Format=new SimpleDateFormat("dd-MM-yyyy");
         String doi= Date_Format.format(txtdate.getDate());

     PreparedStatement pst = null ;
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
         conn=(Connection) DriverManager.getConnection("jdbc:mysql:///library","root","");
         pst=conn.prepareStatement("insert into records(STUDENTID,BOOKID,BOOKNAME,AUTHOR,EDITION,ISSUEDATE,RETURNDATE,FINE) values(?,?,?,?,?,?,?,?)");

         pst.setString(1,studentid);
         pst.setString(2,bookid);
          pst.setString(3,bookname);
           pst.setString(4,author);
           pst.setString(5,edition);
            pst.setString(6,doi);
             pst.setString(7,"");
              pst.setString(8,"");
         
         
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
     String BOOKID = txtbookid.getText();
     
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
         conn=(Connection) DriverManager.getConnection("jdbc:mysql:///library","root","");
         pst=conn.prepareStatement("select* from addbook where BOOKID = ? ");
         pst.setString(1,BOOKID);
        
         rs= pst.executeQuery();
         while(rs.next())
         {
           txtbookname.setText(rs.getString("BOOK NAME"));
           txtauthor.setText(rs.getString("AUTHOR"));
           txtedition.setText(rs.getString("EDITION"));
         
         
         }
     }
         
        catch(HeadlessException | ClassNotFoundException | SQLException e)
     {
         JOptionPane.showMessageDialog(null,e);
     }
      /*
           Connection conn;
               conn = new Connection() {
                  @Override
                  public java.sql.Statement createStatement() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public PreparedStatement prepareStatement(String string) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public CallableStatement prepareCall(String string) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public String nativeSQL(String string) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void setAutoCommit(boolean bln) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public boolean getAutoCommit() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void commit() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void rollback() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void close() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public boolean isClosed() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public DatabaseMetaData getMetaData() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void setReadOnly(boolean bln) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public boolean isReadOnly() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void setCatalog(String string) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public String getCatalog() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void setTransactionIsolation(int i) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public int getTransactionIsolation() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public SQLWarning getWarnings() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void clearWarnings() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public java.sql.Statement createStatement(int i, int i1) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public PreparedStatement prepareStatement(String string, int i, int i1) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public CallableStatement prepareCall(String string, int i, int i1) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public Map<String, Class<?>> getTypeMap() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void setHoldability(int i) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public int getHoldability() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public Savepoint setSavepoint() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public Savepoint setSavepoint(String string) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void rollback(Savepoint svpnt) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void releaseSavepoint(Savepoint svpnt) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public java.sql.Statement createStatement(int i, int i1, int i2) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public PreparedStatement prepareStatement(String string, int i, int i1, int i2) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public CallableStatement prepareCall(String string, int i, int i1, int i2) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public PreparedStatement prepareStatement(String string, int i) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public PreparedStatement prepareStatement(String string, int[] ints) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public PreparedStatement prepareStatement(String string, String[] strings) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public Clob createClob() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public Blob createBlob() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public NClob createNClob() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public SQLXML createSQLXML() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public boolean isValid(int i) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void setClientInfo(String string, String string1) throws SQLClientInfoException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void setClientInfo(Properties prprts) throws SQLClientInfoException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public String getClientInfo(String string) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public Properties getClientInfo() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public Array createArrayOf(String string, Object[] os) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public Struct createStruct(String string, Object[] os) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void setSchema(String string) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public String getSchema() throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void abort(Executor exctr) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }

                  @Override
                  public void setNetworkTimeout(Executor exctr, int i) throws SQLException {
                      throw new UnsupportedOperationException("Not supported yet.");*/ //To change body of generated methods, choose Tools | Temp
    }//GEN-LAST:event_jButton3ActionPerformed
 
 public static Connection connect()  throws ClassNotFoundException, SQLException
 {  Statement s;
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn =DriverManager.getConnection("jdbc:mysql:///library","root","");
         s = (Statement) conn.createStatement();
         return conn;
     }
     catch(ClassNotFoundException | SQLException ex)
     {
     }
     return null;
 }
        public static void main(String args[]) {
           try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Issuebook().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Issuebook.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtedition;
    private javax.swing.JTextField txtstudentid;
    // End of variables declaration//GEN-END:variables

}
