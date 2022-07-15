/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package transport;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ventana2 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana2
     */
    public Ventana2() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home_72.png"))); // NOI18N
        boton1.setText("Casa");
        boton1.setContentAreaFilled(false);
        boton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home_72.png"))); // NOI18N
        boton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home_96.png"))); // NOI18N
        boton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        jPanel1.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 140, 122));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Poratada1.2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 360, 620));

        boton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus_64px.png"))); // NOI18N
        boton2.setText("Ruta 7");
        boton2.setActionCommand("Ruta 7");
        boton2.setContentAreaFilled(false);
        boton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus_64px.png"))); // NOI18N
        boton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus_90px.png"))); // NOI18N
        boton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        jPanel1.add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 191, 122));

        boton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus_64px.png"))); // NOI18N
        boton3.setText("Ruta 1");
        boton3.setContentAreaFilled(false);
        boton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus_64px.png"))); // NOI18N
        boton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus_90px.png"))); // NOI18N
        boton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        jPanel1.add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 191, 122));

        boton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus_64px.png"))); // NOI18N
        boton4.setText("Ruta 6");
        boton4.setContentAreaFilled(false);
        boton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus_64px.png"))); // NOI18N
        boton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus_90px.png"))); // NOI18N
        boton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        jPanel1.add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 191, 122));

        boton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus_64px.png"))); // NOI18N
        boton5.setText("Ruta 10");
        boton5.setContentAreaFilled(false);
        boton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus_64px.png"))); // NOI18N
        boton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus_90px.png"))); // NOI18N
        boton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        jPanel1.add(boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 191, 122));

        btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/next_64.png"))); // NOI18N
        btn2.setText("Siguiente");
        btn2.setContentAreaFilled(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/next_64.png"))); // NOI18N
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/next_96.png"))); // NOI18N
        btn2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 140, 120));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡Hola, elige el numero del autobus \n");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 380, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("del que quieres informarte!");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 370, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        botones_dinamicos newframe = new botones_dinamicos();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        Ruta_7 newframe = new Ruta_7();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        Ruta_1 newframe = new Ruta_1();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        Ruta_6 newframe = new Ruta_6();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        Ruta_10 newframe = new Ruta_10();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton5ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        VentanaSiguiente newframe = new VentanaSiguiente();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton btn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
