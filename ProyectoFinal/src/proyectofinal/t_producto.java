
package proyectofinal;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;

public class t_producto extends javax.swing.JFrame {

    ConexionDB con = new ConexionDB();
    Connection cn = (Connection)con.ConexionDB();
    
    public t_producto() {
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

        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        tipo = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        valor = new javax.swing.JTextField();
        registrar_producto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TIPO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        verProductos = new javax.swing.JButton();
        eliminarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TABLA PRODUCTOS");

        registrar_producto.setText("REGISTRAR");
        registrar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_productoActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE");

        TIPO.setText("TIPO");

        jLabel3.setText("CANTIDAD");

        jLabel4.setText("VALOR UNITARIO");

        verProductos.setText("VER PRODUCTOS");
        verProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verProductosActionPerformed(evt);
            }
        });

        eliminarProducto.setText("ELIMINAR");
        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TIPO)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nombre)
                    .addComponent(tipo)
                    .addComponent(cantidad)
                    .addComponent(valor, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(verProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registrar_producto)
                .addGap(48, 48, 48)
                .addComponent(eliminarProducto)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TIPO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar_producto)
                    .addComponent(verProductos)
                    .addComponent(eliminarProducto))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_productoActionPerformed

        
        String registrar = "INSERT INTO t_producto (id, nombre, tipo, cantidad, valor) values (id,?,?,?,?)";
        if (nombre.getText().equals("") || tipo.getText().equals("") || cantidad.getText().equals("") || valor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe diligenciar todos los campos");
        }else{
            try{
                
                PreparedStatement pst = (PreparedStatement) cn.prepareStatement(registrar);
                pst.setString(1, (nombre.getText()));
                pst.setString(2, (tipo.getText()));
                pst.setInt(3, Integer.parseInt(cantidad.getText()));
                pst.setDouble(4, Double.parseDouble(valor.getText()));
                pst.execute();
                JOptionPane.showMessageDialog(null, "Producto Insertado");
                borrar();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }     
        }
    }//GEN-LAST:event_registrar_productoActionPerformed

    private void verProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verProductosActionPerformed
        
        try{
            Statement ver = con.createStatement();
            ResultSet rs = ver.executeQuery("SELECT * FROM t_producto");
            rs.next();
            while(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("nombre"));
                System.out.println(rs.getString("tipo"));
                System.out.println(rs.getInt("cantidad"));
                System.out.println(rs.getDouble("valor"));                
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_verProductosActionPerformed

    private void eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoActionPerformed
        
        String eliminar = "DELETE FROM t_producto WHERE tipo = ?";
        String opc = JOptionPane.showInputDialog("??Cual desea eliminar?: ");
        if (opc.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Opcion invalida ");
        } else if (Integer.parseInt(opc) >= 0){
            JOptionPane.showMessageDialog(null, "Digite el tipo que desea eliminar " + "A, AA, AAA");
        }else{
            try{
                PreparedStatement pst = (PreparedStatement) cn.prepareStatement(eliminar);
                pst.setString(1, opc);
                JOptionPane.showMessageDialog(null, "Producto Borrado");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }     
           
        }
    }//GEN-LAST:event_eliminarProductoActionPerformed
    
    public void borrar(){
        nombre.setText("");
        tipo.setText("");
        cantidad.setText("");
        valor.setText("");
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
            java.util.logging.Logger.getLogger(t_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(t_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(t_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(t_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new t_producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TIPO;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton eliminarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton registrar_producto;
    private javax.swing.JTextField tipo;
    private javax.swing.JTextField valor;
    private javax.swing.JButton verProductos;
    // End of variables declaration//GEN-END:variables
}
