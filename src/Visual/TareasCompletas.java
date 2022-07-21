package Visual;

import Datos.UserAndPass;
import Datos.VariablesImportantes;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;

public class TareasCompletas extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();

    public TareasCompletas() {
        initComponents();
        TablaCompletas.setModel(modelo);
        modelo.addColumn("Tarea");
        modelo.addColumn("Encargado");
        modelo.addColumn("Fecha");
    }

    public void cargarDatos() {
        modelo.setRowCount(0);
        for (int i = 0; i < UserAndPass.Libro.get(VariablesImportantes.getIndice()).getTareasCompletas().size(); i++) {
            String tarea = UserAndPass.Libro.get(VariablesImportantes.getIndice()).getTareasCompletas().get(i);
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
        TablaCompletas = new javax.swing.JTable();

        TablaCompletas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaCompletas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCompletas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
