/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import static javax.swing.UIManager.get;

/**
 *
 * @author jared
 */
public class AplicacionCuestionario extends javax.swing.JFrame {

    /**
     * Creates new form AplicacionCuestionario
     */
    public AplicacionCuestionario() {
        initComponents();
        nuestroMetodo();
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
        jLabel1 = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        botonRespuesta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("BIEVENIDO AL TEST E GEPOGRAFOA");

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaTitulo.setText("1.-CAPITAL DE FINLANDIA");

        panelOpciones.setBackground(new java.awt.Color(51, 204, 255));
        panelOpciones.setLayout(new java.awt.GridLayout(4, 1));

        botonRespuesta.setText("Checar Respuesta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botonRespuesta)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonRespuesta))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AplicacionCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicacionCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicacionCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicacionCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AplicacionCuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRespuesta;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelOpciones;
    // End of variables declaration//GEN-END:variables

    private void nuestroMetodo() {
        //generamos los rasdosos button
        JRadioButton r1=new JRadioButton("opcion 1");
        JRadioButton r2=new JRadioButton("opcion 2");
        JRadioButton r3=new JRadioButton("opcion 3");
        JRadioButton r4=new JRadioButton("opcion 4");
//creamos un agrupador de botones
        ButtonGroup grupo =new ButtonGroup();
        grupo.add(r1);
        grupo.add(r2);
        grupo.add(r3);
        grupo.add(r4);

//los agregamos al panel
    panelOpciones.add(r1);
    panelOpciones.add(r2);
    panelOpciones.add(r3);
    panelOpciones.add(r4);
    
    //vamosa indicarle que ponga la primera pregunta y sus
    //respectivas opciones
    
    ArrayList<Pregunta> preguntas=new GenerarCuestionario().generar();
    //del arraylist que se llama pregutna obtenemos el titulo de la primera pregunta
   
    //para que se genere los radios butons que uno desee 
    //ArrayList<JRadioButton> radios=new ArrayList<>();
    //JRadioButton[]radios2=new JRadioButton[preguntas.get(0).getOpcion().size()];
    
   // //etiquetaTitulo.setText (preguntas.get(0).getTitulo());
   // int indice=0;  
    
   // for(JRadioButton radio: radios2){
           //grupo.add(radio);
          // radio.setText(preguntas.get(0).getOpcion().get(indice).getTitulo());
          // panelOpciones.add(radio);
          // indice ++;
       //}
       r1.setText(preguntas.get(0).getOpcion().get(0).getTitulo());
       
       r2.setText(preguntas.get(0).getOpcion().get(1).getTitulo());
       
       r3.setText(preguntas.get(0).getOpcion().get(2).getTitulo());
     
       r4.setText(preguntas.get(0).getOpcion().get(3).getTitulo());
       
       //aAqui vamos a programar el evento del boton con
       //programacion funcional
       //vamo+s a buscar la correcta
       
        
       botonRespuesta.addActionListener(evento->{
           
           JOptionPane.showConfirmDialog(this, "probando esto");
       
       
       });
       };
       
       
    
    }


