
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp_menutabla_menu = new javax.swing.JPopupMenu();
        mi_clearTabla_pp = new javax.swing.JMenuItem();
        pp_tree_menu = new javax.swing.JPopupMenu();
        mi_loadFile_pp = new javax.swing.JMenuItem();
        mi_Refresh_pp = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        tf_comando_menu = new javax.swing.JTextField();
        bt_validcomando_menu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jm_clear_menu = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mi_products_menu = new javax.swing.JMenuItem();
        mi_commands_menu = new javax.swing.JMenuItem();

        mi_clearTabla_pp.setText("Clear tabla");
        mi_clearTabla_pp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_clearTabla_ppActionPerformed(evt);
            }
        });
        pp_menutabla_menu.add(mi_clearTabla_pp);

        mi_loadFile_pp.setText("Load File");
        pp_tree_menu.add(mi_loadFile_pp);

        mi_Refresh_pp.setText("Refresh Trees");
        mi_Refresh_pp.setToolTipText("");
        pp_tree_menu.add(mi_Refresh_pp);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(tf_comando_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 40));

        bt_validcomando_menu.setText("Enter");
        bt_validcomando_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_validcomando_menuMouseClicked(evt);
            }
        });
        jPanel1.add(bt_validcomando_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 13, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "bin", "aisle", "name", "categoria", "price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 470, 420));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("CSVs");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, 400));

        jMenu1.setText("File");

        jMenuItem2.setText("New file");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Import");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Window");

        jm_clear_menu.setText("Clear");

        jMenuItem4.setText("Clear command Line");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jm_clear_menu.add(jMenuItem4);

        jMenuItem5.setText("Clear tree");
        jm_clear_menu.add(jMenuItem5);

        jMenu2.add(jm_clear_menu);

        jMenuItem1.setText("Refresh Tree");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        mi_products_menu.setText("Product");
        mi_products_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_products_menuActionPerformed(evt);
            }
        });
        jMenu3.add(mi_products_menu);

        mi_commands_menu.setText("Commands");
        mi_commands_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_commands_menuActionPerformed(evt);
            }
        });
        jMenu3.add(mi_commands_menu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_validcomando_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_validcomando_menuMouseClicked
        String comando = tf_comando_menu.getText();
        String [] tokens = comando.split(" ");
        
        if(!(tf_comando_menu.getText().isEmpty())){
                if (tokens[0].equals("./create") && tokens[2].equals("-single")){
                    if(tokens[1].contains(".txt")){
                        try {
                            crearArchivo(tokens[1]);
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Formato de archivo no valido");
                    }
                }
                else if(tokens[0].equals("./load")){
                    if(tokens[1].contains(".txt")){
                        try {
                            loadTabla(tokens[1]);
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Formato de archivo no valido");
                    }
                }
                else if(tokens[0].equals("./clear")){
                    cleartabla();
                }
                    
                
                else{
                    JOptionPane.showMessageDialog(this, "El formato del comando es incorrecto");
                }
        }
        
    }//GEN-LAST:event_bt_validcomando_menuMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String comando = tf_comando_menu.getText();
        String [] tokens = comando.split(" ");
        
        if(!(tf_comando_menu.getText().isEmpty())){
                if (tokens[0].equals("./create") && tokens[2].equals("-single")){
                    if(tokens[1].contains(".txt")){
                        try {
                            crearArchivo(tokens[1]);
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Formato de archivo no valido");
                    }
                }
        }        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String comando = tf_comando_menu.getText();
        String [] tokens = comando.split(" ");
        
        if(!(tf_comando_menu.getText().isEmpty())){
                if (tokens[0].equals("./load")){
                    if(tokens[1].contains(".txt")){
                        try {
                            loadTabla(tokens[1]);
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Formato de archivo no valido");
                    }
                }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getButton() == MouseEvent.BUTTON3){
            pp_menutabla_menu.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void mi_clearTabla_ppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_clearTabla_ppActionPerformed
        cleartabla();
    }//GEN-LAST:event_mi_clearTabla_ppActionPerformed

    private void mi_commands_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_commands_menuActionPerformed
        JOptionPane.showMessageDialog(this, "1. ./reload [nombrearchivo.txt] actualiza la tabla con el archivo\n2. ./create [nombrearchivo.txt] -single crea un archivo con los datos de la tabla\n3. ./clear [nombrearchivo.txt] elimina todos los datos de la tabla \n4. ./refresh [nombrearchivo] hace refresh de todo el arbol");
    }//GEN-LAST:event_mi_commands_menuActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        tf_comando_menu.setText("");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mi_products_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_products_menuActionPerformed
        JOptionPane.showMessageDialog(this, "El producto tiene: \n id que es la identificacion del producto \n bin un numero \naisle numero del pasillo donde se guarda el producto del 1 al 3 \nname que es el nombre del producto \ncategoria que es la categoria en la que esta el producto \nprice que es el valor del producto");
    }//GEN-LAST:event_mi_products_menuActionPerformed

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        if(evt.getButton() == MouseEvent.BUTTON3){
            pp_tree_menu.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTree1MouseClicked

    
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
        
        
    }

    public void refreshTree(){
        DefaultTreeModel model = (DefaultTreeModel)jTree1.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        archivo = new File("./Productos");
        try {
            for(File temp: archivo.listFiles()){
                if(temp.isFile()){
                    DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(temp.getName());
                    model.add(nodo);
                }
            }
            model.reload();
            jTree1.setModel(model);
        } catch (Exception e) {
        }
    }
    
    public void crearArchivo(String comand) throws IOException{     
        archivo = new File(comand);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        FileWriter fw = new FileWriter("./Productos/" + comand);
        BufferedWriter bw = new BufferedWriter(fw);
        

        
        for (int cont = 0; cont < model.getRowCount(); cont++) {
            if(!(model.getValueAt(cont, 0) == null)){
                bw.write(model.getValueAt(cont, 0) + ",");
                bw.write(model.getValueAt(cont, 1) + ",");
                bw.write(model.getValueAt(cont, 2) + ",");
                bw.write(model.getValueAt(cont, 3) + ",");
                bw.write(model.getValueAt(cont, 4) + ",");
                bw.write(model.getValueAt(cont, 5) + ",");
                bw.write("\n");
            }
            
        }
        
        DefaultTreeModel modelT = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) modelT.getRoot();
        root.add(new DefaultMutableTreeNode(archivo));
        
        bw.flush();
        bw.close();
        fw.close();
        
        jTree1.setModel(modelT);
        modelT.reload();
        
    }
    
    
    public void cleartabla(){
        Object [] row = {null,null,null,null,null,null};
        DefaultTableModel model = new DefaultTableModel();
        model.addRow(row);
        model.addRow(row);
        model.addRow(row);
        model.addRow(row);
        jTable1.setModel(model);
    }
    
    public void loadTabla(String name) throws FileNotFoundException, IOException{
        archivo = new File("./Productos/" + name);
        Scanner sc = null;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        if(archivo.exists()){
            try {
                sc = new Scanner(archivo);
                while (sc.hasNextLine()) {
                    String linea = sc.nextLine();
                    Object[] producto = linea.split(",");
                    model.addRow(producto);
                }
                jTable1.setModel(model);  
            } catch (Exception e) {
            }                 
                sc.close();
            }     
    }
    
    public void refresh(){
        
    }
    
    ArrayList<Producto> productos = new ArrayList();
    File archivo = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_validcomando_menu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenu jm_clear_menu;
    private javax.swing.JMenuItem mi_Refresh_pp;
    private javax.swing.JMenuItem mi_clearTabla_pp;
    private javax.swing.JMenuItem mi_commands_menu;
    private javax.swing.JMenuItem mi_loadFile_pp;
    private javax.swing.JMenuItem mi_products_menu;
    private javax.swing.JPopupMenu pp_menutabla_menu;
    private javax.swing.JPopupMenu pp_tree_menu;
    private javax.swing.JTextField tf_comando_menu;
    // End of variables declaration//GEN-END:variables
}
