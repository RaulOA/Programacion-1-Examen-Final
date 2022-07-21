package Visual;

import Datos.UserAndPass;
import Datos.VariablesImportantes;

public class NuevaTarea extends javax.swing.JPanel {

    public NuevaTarea() {
        initComponents();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spMes = new javax.swing.JSpinner();
        spDia = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spYear = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtNombreTarea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEncargadoTarea = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        jLabel1.setText("Fecha de la Tarea (MM/DD/YYYY)");

        jLabel2.setText("/");

        spMes.setFont(new java.awt.Font("Ebrima", 0, 13)); // NOI18N
        spMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        spDia.setFont(new java.awt.Font("Ebrima", 0, 13)); // NOI18N
        spDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        jLabel3.setText("/");

        spYear.setFont(new java.awt.Font("Ebrima", 0, 13)); // NOI18N
        spYear.setModel(new javax.swing.SpinnerNumberModel(2022, 2022, null, 1));

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        jLabel4.setText("Nombre de la Tarea:");

        txtNombreTarea.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        txtNombreTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTareaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        jLabel5.setText("Encargado de la Tarea:");

        txtEncargadoTarea.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addComponent(spMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEncargadoTarea))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtNombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(spMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(spYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEncargadoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTareaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String stringTarea = spMes.getValue().toString() + "/"
                + spDia.getValue().toString() + "/"
                + spYear.getValue().toString() + "+"
                + txtNombreTarea.getText() + "+"
                + txtEncargadoTarea.getText();
        UserAndPass.Libro.get(VariablesImportantes.getIndice()).getTareasPendientes().add(stringTarea);
        txtEncargadoTarea.setText(null);
        txtNombreTarea.setText(null);
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner spDia;
    private javax.swing.JSpinner spMes;
    private javax.swing.JSpinner spYear;
    private javax.swing.JTextField txtEncargadoTarea;
    private javax.swing.JTextField txtNombreTarea;
    // End of variables declaration//GEN-END:variables
}
