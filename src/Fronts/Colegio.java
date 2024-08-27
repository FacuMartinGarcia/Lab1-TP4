/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Fronts;

import Entidades.Alumno;
import Entidades.Materia;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Colegio extends javax.swing.JFrame {

     public static HashSet<Alumno> alumnos  = new HashSet<>();;
     public static HashSet<Materia> materias= new HashSet<>();;


    public Colegio() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registro de Colegio");
        
        
    
    }

    // Agregar un alumno: lo ponemos como método estático para que podamos acceder desde otras clases
    // Recordar que tenemos que importar 
    
    public static void agregarAlumno(Alumno alumno) {
           
            alumnos.add(alumno);
     
    }
    
    // Mostrar la lista de alumnos que vamos ingresando
    public static void obtenerAlumnos(){
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: "+ alumno.getApellido());
        }
        
    }
    
    public static void agregarMateria(Materia materia){
        
        materias.add(materia);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuAlumnos = new javax.swing.JMenuItem();
        jMenuMaterias = new javax.swing.JMenuItem();
        jMenuInscripcion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        jMenu1.setText("Menú Principal");

        jMenuAlumnos.setText("Alumnos");
        jMenuAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAlumnos);

        jMenuMaterias.setText("Materias");
        jMenuMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMateriasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuMaterias);

        jMenuInscripcion.setText("Inscripción");
        jMenuInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInscripcionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuInscripcion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //Aciones de los botones.
    
    private void jMenuMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMateriasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMaterias fma= new FormularioMaterias();
        fma.setVisible(true);
        escritorio.add(fma);
        escritorio.moveToFront(fma);
    }//GEN-LAST:event_jMenuMateriasActionPerformed

    private void jMenuAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlumnosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioAlumnos fa= new FormularioAlumnos();
        fa.setVisible(true);
        escritorio.add(fa);
        escritorio.moveToFront(fa);
    }//GEN-LAST:event_jMenuAlumnosActionPerformed

    private void jMenuInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInscripcionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioInscripcion fo = new FormularioInscripcion();
        fo.setVisible(true);
        escritorio.add(fo);
        escritorio.moveToFront(fo);
     
        
    }//GEN-LAST:event_jMenuInscripcionActionPerformed

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
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colegio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuAlumnos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuInscripcion;
    private javax.swing.JMenuItem jMenuMaterias;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    // End of variables declaration//GEN-END:variables
}
