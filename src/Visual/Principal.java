package Visual;

import Datos.UserAndPass;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        int indice = Ingreso.getIndice();
        txtBienvenido.setText("Bienvenido " + UserAndPass.Libro.get(indice).getNombre()
                + " " + UserAndPass.Libro.get(indice).getApellido());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevaTarea = new javax.swing.JButton();
        btnTareasPendientes = new javax.swing.JButton();
        PanelPrincipal = new javax.swing.JPanel();
        btnTareasCompletas = new javax.swing.JButton();
        txtBienvenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNuevaTarea.setText("Nueva Tarea");
        btnNuevaTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaTareaActionPerformed(evt);
            }
        });

        btnTareasPendientes.setText("Tareas Pendientes");
        btnTareasPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTareasPendientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );

        btnTareasCompletas.setText("Tareas Completas");
        btnTareasCompletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTareasCompletasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevaTarea)
                        .addGap(18, 18, 18)
                        .addComponent(btnTareasPendientes)
                        .addGap(18, 18, 18)
                        .addComponent(btnTareasCompletas)
                        .addGap(61, 61, 61)
                        .addComponent(txtBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevaTarea)
                    .addComponent(btnTareasPendientes)
                    .addComponent(btnTareasCompletas)
                    .addComponent(txtBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaTareaActionPerformed
        NuevaTarea nuevaTarea = new NuevaTarea();
        ShowPanel(nuevaTarea);
    }//GEN-LAST:event_btnNuevaTareaActionPerformed

    private void btnTareasPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTareasPendientesActionPerformed
        TareasPendientes tareasPendientes = new TareasPendientes();
        ShowPanel(tareasPendientes);
    }//GEN-LAST:event_btnTareasPendientesActionPerformed

    private void btnTareasCompletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTareasCompletasActionPerformed
        TareasCompletas tareasCompletas = new TareasCompletas();
        ShowPanel(tareasCompletas);
    }//GEN-LAST:event_btnTareasCompletasActionPerformed

    private void ShowPanel(JPanel p) {
        //raul. Metodo para mostrar paneles ------------
        p.setSize(1000, 1000);
        p.setLocation(0, 0);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(p, BorderLayout.CENTER);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnNuevaTarea;
    private javax.swing.JButton btnTareasCompletas;
    private javax.swing.JButton btnTareasPendientes;
    private javax.swing.JLabel txtBienvenido;
    // End of variables declaration//GEN-END:variables
}
