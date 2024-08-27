
package Fronts;

import Entidades.Alumno;
import static Fronts.Colegio.agregarAlumno;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafa
 */
public class FormularioAlumnos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioAlumnos
     */
    
    
    public FormularioAlumnos() {
        initComponents();
        
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tbLegajo = new javax.swing.JTextField();
        tbApellido = new javax.swing.JTextField();
        tbNombre = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Formulario de Alumnos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Legajo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Apellido:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        tbLegajo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tbLegajo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tbApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPNG/icono-agregarAlumnoLegajo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tbLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbNombre)
                                    .addComponent(tbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btGuardar, btNuevo, btSalir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2)))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btNuevo)
                    .addComponent(btSalir))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btGuardar, btNuevo, btSalir});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        
        if (tbLegajo.getText().isEmpty() || tbApellido.getText().isEmpty() || tbNombre.getText().isEmpty() ){
        
            JOptionPane.showMessageDialog(null, "Complete todos los datos del Alumno");
        
        }else{    //  Si los campos tienen datos, continuamos
           
            int respuesta = JOptionPane.showConfirmDialog(null,"¿Está Seguro?","Grabar", JOptionPane.YES_NO_OPTION);
            
            
            if (respuesta == JOptionPane.YES_OPTION) {
            
                try {
                    //el usuario confirmó grabar
                    //controlar que los datos ingresados tienen el formato correcto
                    //Convertirmos el txLegajo en INT, ya que es un String, debemos capturar las expeciones por si esta conversion falla.
                    int legajo = Integer.parseInt(tbLegajo.getText());
                     //generar la instancia de la clase alumnos
                    Alumno nuevo = new Alumno(legajo,tbApellido.getText().toUpperCase(), tbNombre.getText().toUpperCase());

                    //Agregamos el alumno al ArrayList
                    Colegio.agregarAlumno(nuevo); 
                    JOptionPane.showMessageDialog(null, "Se ha guardado el alumno...");
                    dispose();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese los Datos Correctamente", "Error", JOptionPane.ERROR_MESSAGE);
                }
  

            }
        }
        

    }//GEN-LAST:event_btGuardarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        dispose(); 
        
    }//GEN-LAST:event_btSalirActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        //Ponemos todos los campos en blanco
        tbLegajo.setText("");
        tbApellido.setText("");
        tbNombre.setText("");
    }//GEN-LAST:event_btNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSalir;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tbApellido;
    private javax.swing.JTextField tbLegajo;
    private javax.swing.JTextField tbNombre;
    // End of variables declaration//GEN-END:variables
}
