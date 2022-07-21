package Visual;

import Datos.UserAndPass;
import Datos.VariablesImportantes;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TareasPendientes extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();

    public TareasPendientes() {
        initComponents();
        TablaPendientes.setModel(modelo);
        modelo.addColumn("Tarea");
        modelo.addColumn("Encargado");
        modelo.addColumn("Fecha");
    }

    public void cargarDatos() {
        modelo.setRowCount(0);
        for (int i = 0; i < UserAndPass.Libro.get(VariablesImportantes.getIndice()).getTareasPendientes().size(); i++) {
            String tarea = UserAndPass.Libro.get(VariablesImportantes.getIndice()).getTareasPendientes().get(i);
            StringTokenizer st = new StringTokenizer(tarea, "+");
            String fecha = st.nextToken();
            String task = st.nextToken();
            String encargado = st.nextToken();
            modelo.addRow(new Object[]{
                task, encargado, fecha});
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPendientes = new javax.swing.JTable();
        btnCompletar = new javax.swing.JButton();

        TablaPendientes.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        TablaPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaPendientes);

        btnCompletar.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        btnCompletar.setText("Completar");
        btnCompletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCompletar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCompletar)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletarActionPerformed
        int filaSeleccionada = TablaPendientes.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String tarea = UserAndPass.Libro.get(VariablesImportantes.getIndice()).getTareasPendientes().get(filaSeleccionada);
            UserAndPass.Libro.get(VariablesImportantes.getIndice()).getTareasCompletas().add(tarea);
            UserAndPass.Libro.get(VariablesImportantes.getIndice()).getTareasPendientes().remove(filaSeleccionada);
            cargarDatos();

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Tarea");
        }
    }//GEN-LAST:event_btnCompletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPendientes;
    private javax.swing.JButton btnCompletar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
