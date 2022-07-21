package Visual;

import Datos.UserAndPass;
import Datos.VariablesImportantes;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        txtBienvenido.setText("Bienvenido " + UserAndPass.Libro.get(VariablesImportantes.getIndice()).getNombre()
                + " " + UserAndPass.Libro.get(VariablesImportantes.getIndice()).getApellido());

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevaTarea = new javax.swing.JButton();
        btnTareasPendientes = new javax.swing.JButton();
        PanelPrincipal = new javax.swing.JPanel();
        btnTareasCompletas = new javax.swing.JButton();
        txtBienvenido = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNuevaTarea.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        btnNuevaTarea.setText("Nueva Tarea");
        btnNuevaTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaTareaActionPerformed(evt);
            }
        });

        btnTareasPendientes.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnTareasCompletas.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        btnTareasCompletas.setText("Tareas Completas");
        btnTareasCompletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTareasCompletasActionPerformed(evt);
            }
        });

        txtBienvenido.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N

        btnCerrar.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        btnImprimir.setText("Imprimir Datos");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevaTarea)
                        .addGap(18, 18, 18)
                        .addComponent(btnTareasPendientes)
                        .addGap(18, 18, 18)
                        .addComponent(btnTareasCompletas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnImprimir)
                        .addGap(26, 26, 26)
                        .addComponent(txtBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBienvenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevaTarea)
                        .addComponent(btnTareasPendientes)
                        .addComponent(btnTareasCompletas)
                        .addComponent(btnImprimir)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(btnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        tareasPendientes.cargarDatos();


    }//GEN-LAST:event_btnTareasPendientesActionPerformed

    private void btnTareasCompletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTareasCompletasActionPerformed
        TareasCompletas tareasCompletas = new TareasCompletas();
        ShowPanel(tareasCompletas);
        tareasCompletas.cargarDatos();
    }//GEN-LAST:event_btnTareasCompletasActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        System.out.println("Tamaño del Arreglo Principal: " + UserAndPass.Libro.size());
        System.out.println("Indice Actual: " + VariablesImportantes.getIndice());
        System.out.println("Nombre del Usuario Actual: " + UserAndPass.Libro.get(VariablesImportantes.getIndice()).getNombre() + " " + UserAndPass.Libro.get(VariablesImportantes.getIndice()).getApellido());
        System.out.println("Tamaño de la Lista Actual de Completadas: " + UserAndPass.Libro.get(VariablesImportantes.getIndice()).getTareasPendientes().size());
        System.out.println("Tareas Guardadas:");
        UserAndPass.Libro.get(VariablesImportantes.getIndice()).getTareasPendientes().forEach(System.out::println);
        System.out.println("------------------------------");
    }//GEN-LAST:event_btnImprimirActionPerformed

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
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNuevaTarea;
    private javax.swing.JButton btnTareasCompletas;
    private javax.swing.JButton btnTareasPendientes;
    private javax.swing.JLabel txtBienvenido;
    // End of variables declaration//GEN-END:variables
}
