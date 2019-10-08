/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.presentacion.edicion;

import java.util.Observable;
import java.util.Observer;
import javafx.scene.paint.Color;
import javax.swing.DefaultComboBoxModel;
import personas.logica.Persona;
import personas.presentacion.listado.Estado;

/**
 *
 * @author Escinf
 */
public class View extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form View
     */
    public View() {
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

        sexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        consultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sexoFemenino = new javax.swing.JRadioButton();
        sexoMasculino = new javax.swing.JRadioButton();
        agregar = new javax.swing.JButton();
        JModificarButton = new javax.swing.JButton();
        jEstadoComboBox = new javax.swing.JComboBox<>();
        EstadoCivilLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edicion");
        setBackground(new java.awt.Color(0, 255, 0));
        setMinimumSize(new java.awt.Dimension(361, 215));

        jLabel1.setText("Id");

        jLabel2.setText("Nombre");

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        jLabel3.setText("Sexo");

        sexo.add(sexoFemenino);
        sexoFemenino.setText("Femenino");

        sexo.add(sexoMasculino);
        sexoMasculino.setSelected(true);
        sexoMasculino.setText("Masculino");

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        JModificarButton.setText("Modificar");
        JModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JModificarButtonActionPerformed(evt);
            }
        });

        jEstadoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEstadoComboBoxActionPerformed(evt);
            }
        });

        EstadoCivilLabel.setText("Estado Civil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(sexoFemenino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexoMasculino))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EstadoCivilLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jEstadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(consultar)
                        .addGap(18, 18, 18)
                        .addComponent(agregar)))
                .addGap(18, 18, 18)
                .addComponent(JModificarButton)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sexoFemenino)
                    .addComponent(sexoMasculino))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEstadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EstadoCivilLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JModificarButton)
                    .addComponent(agregar)
                    .addComponent(consultar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        controller.consultar(id.getText());
    }//GEN-LAST:event_consultarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        Persona p = new Persona();
        p.setId(id.getText());
        p.setNombre(nombre.getText());
        p.setSexo(this.sexoMasculino.isSelected()? 'M': 'F');
        controller.agregar(p);
    }//GEN-LAST:event_agregarActionPerformed

    private void JModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JModificarButtonActionPerformed
        controller.modificar(this.toPersona());
    }//GEN-LAST:event_JModificarButtonActionPerformed

    private void jEstadoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEstadoComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jEstadoComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EstadoCivilLabel;
    private javax.swing.JButton JModificarButton;
    private javax.swing.JButton agregar;
    private javax.swing.JButton consultar;
    private javax.swing.JTextField id;
    private javax.swing.JComboBox<Estado> jEstadoComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombre;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JRadioButton sexoFemenino;
    private javax.swing.JRadioButton sexoMasculino;
    // End of variables declaration//GEN-END:variables

    private Persona toPersona(){
        Persona p= new Persona();
        p.setId(id.getText());
        p.setNombre(nombre.getText());
        p.setSexo(this.sexoMasculino.isSelected()? 'M':'F');
        return p;
    }
    @Override
    public void update(Observable o, Object arg) {
        renderPersona(model.getPersona());
    }
    
    public void renderPersona(Persona p){
        id.setText(p.getId());
        nombre.setText(p.getNombre());
        switch(p.getSexo()){
            case 'F': {
                this.sexoFemenino.setSelected(true);
                this.getContentPane().setBackground(java.awt.Color.pink);
                break;
            }
            case 'M': {
                this.sexoMasculino.setSelected(true);
                this.getContentPane().setBackground(java.awt.Color.cyan);
                break;            
            }
            default:{
                this.sexo.clearSelection();
            }
        }
        this.jEstadoComboBox.setModel(new DefaultComboBoxModel<Estado>(
                model.estados.toArray(new Estado[0])));
        this.jEstadoComboBox.setSelectedItem(p.getEstado());
    }
    
    Model model;
    Controller controller;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
        model.addObserver(this);
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
    
    
}














