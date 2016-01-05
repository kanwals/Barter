/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Gurkanwal
 */
class distribution {
    String resource;
    String price;
}

public class australia extends javax.swing.JFrame {
    Thread t;
    client obj;
    DataOutputStream dos;
    DataInputStream dis;
    int count;
    TableModel tm1 = new TableModel();
    ArrayList<distribution> res= new ArrayList<>();
    String[] resources = {"land", "technology", "chemical", "machinery", "oil", "electricity", "plastic", "metal", "labour"};
  
    /**
     * Creates new form India
     */
    public australia() {
        initComponents();
        setTitle("AUSTRALIA");

        connectbutton.setEnabled(false);
        refreshbutton.setEnabled(false);
        submitbutton.setEnabled(false);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        txtserver = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        connectbutton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txttechnology = new javax.swing.JTextField();
        txtelectricity = new javax.swing.JTextField();
        txtoil = new javax.swing.JTextField();
        txtmachinery = new javax.swing.JTextField();
        txtlabour = new javax.swing.JTextField();
        txtplastic = new javax.swing.JTextField();
        txtchemical = new javax.swing.JTextField();
        txtmetal = new javax.swing.JTextField();
        txtland = new javax.swing.JTextField();
        submitbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        refreshbutton = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        loginbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtserverActionPerformed(evt);
            }
        });

        jLabel1.setText("SERVER IP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setText("land");

        jLabel4.setText("technology");

        jLabel5.setText("chemical");

        jLabel6.setText("machinery");

        connectbutton.setText("connect");
        connectbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectbuttonActionPerformed(evt);
            }
        });

        jLabel7.setText("electricity");

        jLabel8.setText("oil");

        jLabel9.setText("plastic");

        jLabel10.setText("metal");

        jLabel11.setText("labour");

        txttechnology.setText("0");

        txtelectricity.setText("0");
        txtelectricity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtelectricityActionPerformed(evt);
            }
        });

        txtoil.setText("0");

        txtmachinery.setText("0");
        txtmachinery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmachineryActionPerformed(evt);
            }
        });

        txtlabour.setText("0");

        txtplastic.setText("0");

        txtchemical.setText("0");

        txtmetal.setText("0");
        txtmetal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmetalActionPerformed(evt);
            }
        });

        txtland.setText("0");

        submitbutton.setText("Submit");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });

        jTable1.setModel(tm1);
        jScrollPane1.setViewportView(jTable1);

        jLabel12.setText("RESOURCE PRICE DISTRIBUTION");

        refreshbutton.setText("REFRESH PRICES");
        refreshbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbuttonActionPerformed(evt);
            }
        });

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        jLabel13.setText("username");

        jLabel14.setText("password");

        loginbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginbutton.setText("LOGIN");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtlabour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttechnology, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtchemical, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmachinery, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtoil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtelectricity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtplastic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmetal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtland, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(93, 93, 93))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(refreshbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(112, 112, 112))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(loginbutton)
                                            .addComponent(txtusername, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                            .addComponent(txtpassword))))
                                .addGap(41, 41, 41))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(submitbutton))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtserver, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(connectbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtserver, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(connectbutton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(18, 18, 18)
                .addComponent(loginbutton)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtlabour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addGap(63, 63, 63))
                                    .addComponent(refreshbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtland, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txttechnology, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtchemical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtmachinery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtoil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtelectricity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtplastic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtmetal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addComponent(submitbutton)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>                        

    private void txtserverActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txtmachineryActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void txtelectricityActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void txtmetalActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void connectbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        try {
            obj = new australia.client();
            obj.server_ip = txtserver.getText();
            t = new Thread(obj);
            t.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }                                             

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        try {
            dos.writeBytes("AUSTRALIA\r\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "NOT CONNECTED. RESTART APPLICATION AND CONNECT AGAIN.");
        }
    }                                            

    private void refreshbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        try {
            res.clear();
            dos.writeBytes("AUSTRALIA DISTRIBUTION\r\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "NOT CONNECTED. RESTART APPLICATION AND CONNECT AGAIN.");
        }
    }                                             

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        String user=txtusername.getText();
        String pass=txtpassword.getText();
        if(user.equals("australia")&&pass.equals("edcaustralia123")){
            JOptionPane.showMessageDialog(rootPane,"SUCCESSFULLY LOGGED IN");
            connectbutton.setEnabled(true);
            refreshbutton.setEnabled(true);
            submitbutton.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"INCORRECT USER ID/PASSWORD. TRY AGAIN.");
        }
    }                                           

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
            java.util.logging.Logger.getLogger(australia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(australia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(australia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(australia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new australia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton connectbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton loginbutton;
    private javax.swing.JButton refreshbutton;
    private javax.swing.JButton submitbutton;
    private javax.swing.JTextField txtchemical;
    private javax.swing.JTextField txtelectricity;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlabour;
    private javax.swing.JTextField txtland;
    private javax.swing.JTextField txtmachinery;
    private javax.swing.JTextField txtmetal;
    private javax.swing.JTextField txtoil;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtplastic;
    private javax.swing.JTextField txtserver;
    private javax.swing.JTextField txttechnology;
    private javax.swing.JTextField txtusername;
    // End of variables declaration                   
    public class TableModel extends AbstractTableModel {

        String title[] = {"S.No.", "RESOURCE", "PRICE"};

        public String getColumnName(int a) {
            return title[a];
        }

        public int getRowCount() {
            int n = res.size();
            return n;
        }

        public int getColumnCount() {
            return 3;
        }
        
        public Object getValueAt(int i, int j) {
            distribution temp = res.get(i);
            if (j == 0) {
                return i + 1;
            }
            if (j == 1) {
                return temp.resource;
            }
            if (j == 2) {
                return temp.price;
            }
            return 0;
        }

    }

    public class client implements Runnable {

        Socket s;
        String server_ip;
        String[] resources = {"land", "technology", "chemical", "machinery", "oil", "electricity", "plastic", "metal", "labour"};

        client() throws IOException {
            for (int i = 0; i < 9; i++) {
            distribution heo = new distribution();
            heo.resource = resources[i];
            heo.price = 0+"";
                res.add(heo);
            }
            tm1.fireTableDataChanged();
        }

        public void run() {
            try {

                boolean connected_flag = false;
                try {

                    s = new Socket(server_ip, 9001);
                    dis = new DataInputStream(s.getInputStream());
                    dos = new DataOutputStream(s.getOutputStream());
                    connected_flag = true;
                } catch (Exception ex) {
                    ex.printStackTrace();
                    connected_flag = false;
                    JOptionPane.showMessageDialog(australia.this, "Either: \n1)INVALID IP\n2)SERVER NOT RUNNING\n3)INTERNET DISCONNECTED", "ERROR", JOptionPane.OK_OPTION);
                    connectbutton.setEnabled(true);
                }
                if (connected_flag == true) {
                    JOptionPane.showMessageDialog(australia.this, "Connected to server! :)");
                    setTitle("AUSTRALIA's IP: " + s.getLocalAddress().getHostAddress());
                    connectbutton.setEnabled(false);
                    dos.writeBytes("AUSTRALIA\r\n");//for server's table
                }
                while (true) {
                    String ack = dis.readLine();
                    System.out.println(s);
                    if (ack.equals("OKA")) {
                        dos.writeBytes(txtid.getText() + "\r\n");
                        dos.writeBytes(txtland.getText() + "\r\n");
                        dos.writeBytes(txttechnology.getText() + "\r\n");
                        dos.writeBytes(txtchemical.getText() + "\r\n");
                        dos.writeBytes(txtmachinery.getText() + "\r\n");
                        dos.writeBytes(txtoil.getText() + "\r\n");
                        dos.writeBytes(txtelectricity.getText() + "\r\n");
                        dos.writeBytes(txtplastic.getText() + "\r\n");
                        dos.writeBytes(txtmetal.getText() + "\r\n");
                        dos.writeBytes(txtlabour.getText() + "\r\n");
                        String confirmation = dis.readLine();
                        System.out.println(confirmation);
                        if (confirmation.equals("FORMAT")) {
                            JOptionPane.showMessageDialog(rootPane, "WRONG INPUT. either:\n1. Text entered in numeric field.\n2. Any field left blank.\nTRY AGAIN.");
                        }
                        if (confirmation.equals("IID")) {
                            JOptionPane.showMessageDialog(rootPane, "INVALID ID. TRY AGAIN");
                        }
                        if (confirmation.equals("FUNDS")) {
                            JOptionPane.showMessageDialog(rootPane, "Insufficient money. transaction failed.");
                        }
                        if (confirmation.equals("ERROR")) {
                            JOptionPane.showMessageDialog(rootPane, "Something's wrong. try again.");
                        }
                        if (confirmation.equals("AC")) {
                            txtid.setText("");
                            txtland.setText("0");
                            txttechnology.setText("0");
                            txtchemical.setText("0");
                            txtmachinery.setText("0");
                            txtoil.setText("0");
                            txtelectricity.setText("0");
                            txtplastic.setText("0");
                            txtmetal.setText("0");
                            txtlabour.setText("0");
                            JOptionPane.showMessageDialog(rootPane, "successfully done.");
                        }

                    }
                    if (ack.equals("AUSTRALIA GRANTED")) {
                        for (int i = 0; i < resources.length; i++) {
                            distribution obj = new distribution();
                            obj.resource = resources[i];
                            obj.price = dis.readLine();
                            res.add(obj);
                        }
                        tm1.fireTableDataChanged();
                        String reply = dis.readLine();
                        if (reply.equals("done")) {
                            JOptionPane.showMessageDialog(rootPane, "prices successfully refreshed");
                        }
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
