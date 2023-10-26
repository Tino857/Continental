/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continental.vistas;

import continental.accesoADatos.ValidarData;
import continental.entidades.Categoria;
import continental.entidades.Habitacion;
import continental.entidades.Reserva;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author valen
 */
public class GestionDeHabitacion extends javax.swing.JInternalFrame {

    private Map<Integer, Categoria> listaDeHab = new HashMap();

    public GestionDeHabitacion() {

        initComponents();
        cargarCB();
        jCBCategorias.setSelectedIndex(0);
        jRBHabilitada.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/continental/imagenes/WindowBackground.png"));
        Image image = icon.getImage();
        jPBackground = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jTFCodigo = new javax.swing.JTextField();
        jTFPiso = new javax.swing.JTextField();
        jTFNumero = new javax.swing.JTextField();
        jBLimpiar = new javax.swing.JButton();
        jBHabilitar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jCBCategorias = new javax.swing.JComboBox<>();
        jRBHabilitada = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jBDeshabilitar1 = new javax.swing.JButton();
        jLPCabecera1 = new javax.swing.JLayeredPane();
        jLMargen1 = new javax.swing.JLabel();
        jLTitulo1 = new javax.swing.JLabel();
        jLLogo1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(550, 400));

        jPBackground.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Piso:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Num de Habitacion:");

        jBBuscar.setBackground(new java.awt.Color(45, 54, 60));
        jBBuscar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(235, 235, 235));
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/buscar-w.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.setIconTextGap(10);
        jBBuscar.setPreferredSize(new java.awt.Dimension(110, 32));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTFCodigo.setEditable(false);
        jTFCodigo.setBackground(new java.awt.Color(85, 94, 100));
        jTFCodigo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTFCodigo.setForeground(new java.awt.Color(190, 190, 190));

        jTFPiso.setBackground(new java.awt.Color(85, 94, 100));
        jTFPiso.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTFPiso.setForeground(new java.awt.Color(255, 255, 255));

        jTFNumero.setBackground(new java.awt.Color(85, 94, 100));
        jTFNumero.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTFNumero.setForeground(new java.awt.Color(255, 255, 255));

        jBLimpiar.setBackground(new java.awt.Color(45, 54, 60));
        jBLimpiar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(235, 235, 235));
        jBLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/limpiar-w.png"))); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setIconTextGap(10);
        jBLimpiar.setPreferredSize(new java.awt.Dimension(110, 32));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBHabilitar.setBackground(new java.awt.Color(45, 54, 60));
        jBHabilitar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBHabilitar.setForeground(new java.awt.Color(235, 235, 235));
        jBHabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/aceptar-c.png"))); // NOI18N
        jBHabilitar.setText("Habilitar");
        jBHabilitar.setIconTextGap(10);
        jBHabilitar.setPreferredSize(new java.awt.Dimension(110, 32));
        jBHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHabilitarActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(45, 54, 60));
        jBGuardar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(235, 235, 235));
        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/guardar-w.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setIconTextGap(10);
        jBGuardar.setPreferredSize(new java.awt.Dimension(110, 32));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(45, 54, 60));
        jBSalir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(235, 235, 235));
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/salir-w.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setIconTextGap(10);
        jBSalir.setPreferredSize(new java.awt.Dimension(110, 32));
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Categoría:");

        jCBCategorias.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        jRBHabilitada.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Habilitada:");

        jBDeshabilitar1.setBackground(new java.awt.Color(45, 54, 60));
        jBDeshabilitar1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBDeshabilitar1.setForeground(new java.awt.Color(235, 235, 235));
        jBDeshabilitar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/cancelar-c.png"))); // NOI18N
        jBDeshabilitar1.setText("Deshabilitar");
        jBDeshabilitar1.setIconTextGap(10);
        jBDeshabilitar1.setPreferredSize(new java.awt.Dimension(110, 32));
        jBDeshabilitar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeshabilitar1ActionPerformed(evt);
            }
        });

        jLMargen1.setPreferredSize(new java.awt.Dimension(63, 64));

        jLTitulo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo1.setText("GESTIÓN DE HABITACIÓN");

        jLLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/LogoSmall-w.png"))); // NOI18N

        jLPCabecera1.setLayer(jLMargen1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCabecera1.setLayer(jLTitulo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCabecera1.setLayer(jLLogo1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLPCabecera1Layout = new javax.swing.GroupLayout(jLPCabecera1);
        jLPCabecera1.setLayout(jLPCabecera1Layout);
        jLPCabecera1Layout.setHorizontalGroup(
            jLPCabecera1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPCabecera1Layout.createSequentialGroup()
                .addComponent(jLMargen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLLogo1))
        );
        jLPCabecera1Layout.setVerticalGroup(
            jLPCabecera1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLPCabecera1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLPCabecera1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLLogo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLMargen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPBackgroundLayout = new javax.swing.GroupLayout(jPBackground);
        jPBackground.setLayout(jPBackgroundLayout);
        jPBackgroundLayout.setHorizontalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLPCabecera1)
                    .addGroup(jPBackgroundLayout.createSequentialGroup()
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPBackgroundLayout.createSequentialGroup()
                                .addComponent(jRBHabilitada)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBackgroundLayout.createSequentialGroup()
                                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBCategorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFCodigo)
                                    .addComponent(jTFPiso)
                                    .addComponent(jTFNumero, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPBackgroundLayout.createSequentialGroup()
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBDeshabilitar1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPBackgroundLayout.setVerticalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addComponent(jLPCabecera1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRBHabilitada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDeshabilitar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        if (jTFNumero.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Ingrese el numero de la habitacion.");
            return;
        }
        try {

            int nDH = Integer.parseInt(jTFNumero.getText());
            if (ValidarData.validarNumero(nDH)) {
                JOptionPane.showMessageDialog(this, "El numero de habitacion debe estar entre 1 y 200");
                return;
            }
            //Se busca la materia en la base de datos y se guarda
            Habitacion hab = Vista.getHabD().buscarHabitacionPorNumero(nDH);

            //Si la materia recibida tiene valor nulo significa que no se encuentra en la DB
            //Se muestra el mensaje al usuario y se finaliza la ejecucion
            if (hab == null) {
                JOptionPane.showMessageDialog(this, "No existe la habitacion");
                return;
            }

            //Si la materia se encontraba en la DB, se setean los campos correspondientes con los valores obtenidos de la materia
            jTFCodigo.setText(hab.getIdHabitacion() + "");
            jTFNumero.setText(hab.getNro() + "");
            jTFPiso.setText(hab.getPiso() + "");
            for (Map.Entry<Integer, Categoria> entry : listaDeHab.entrySet()) {
                Integer key = entry.getKey();
                Categoria value = entry.getValue();
                if (hab.getCategoria().getIdCategoria() == value.getIdCategoria()) {
                    jCBCategorias.setSelectedIndex(key);
                }
            }
            jRBHabilitada.setSelected(hab.isHabilitada());

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El numero de la habitacion es incorrecto.");
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "No existe la habitacion");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed

        //Resetea todos los textfield
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHabilitarActionPerformed
//Se controla que el campo de numero no se encuentre vacio
        if (jTFNumero.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "La casilla numero no debe estar vacia.");
            return;
        }
        try {

            int numero = Integer.parseInt(jTFNumero.getText());
 if (ValidarData.validarNumero(numero)) {
                JOptionPane.showMessageDialog(this, "El numero de habitacion debe estar entre 1 y 200");
                return;
            }
            //Se crea una habitacion y se busca en la base de datos para confirmar que la habitacion existe
            //En caso que la habitacion no se encuentre en la base de datos, se muestra un mensaje al usuario y se finaliza la ejecucion
            Habitacion hab = Vista.getHabD().buscarHabitacionPorNumero(numero);
            if (hab == null) {

                JOptionPane.showMessageDialog(this, "No existe la habitacion");
                return;
            }
            if (hab.isHabilitada()) {
                JOptionPane.showMessageDialog(this, "La habitacion ya se encunetra habilitada");
                return;
            }

            //Habiendo confirmado que el numero de la habitacion es correcto, que la habitacion existe en la DB y que no este habilitada
            int resp = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea habilitar esta habitacion?", "", JOptionPane.YES_OPTION);
            int registro;
            if (resp == 0) {
                registro = Vista.getHabD().habilitarHabitacion(hab.getNro());

                if (registro == 1) {

                    JOptionPane.showMessageDialog(this, "La habitacion ha sido habilitada");
                    jRBHabilitada.setSelected(true);
                } else {

                    JOptionPane.showMessageDialog(this, "No se pudo habilitar la habitacion");
                }
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El numero de la habitacion es incorrecto.");
    }//GEN-LAST:event_jBHabilitarActionPerformed
    }
    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        //Controla que no hayan campos vacios
        if (jTFNumero.getText().isEmpty() || jTFPiso.getText().isEmpty() || jCBCategorias.getSelectedIndex() == 0) {

            JOptionPane.showMessageDialog(this, "Ningun casillero debe estar vacio");
            return;
        }

        try {

            //Se intenta parsear el numero y el piso de la habitacion
            int numero = Integer.parseInt(jTFNumero.getText());
            int piso = Integer.parseInt(jTFPiso.getText());
            if (ValidarData.validarNumero(numero)) {

                JOptionPane.showMessageDialog(this, "En la casilla numero debe ir un dato valido");
                return;
            }
            if (ValidarData.validarPiso(piso)) {

                JOptionPane.showMessageDialog(this, "En la casilla piso debe ir un dato valido");
                return;
            }

            //Llegado el punto en que todos los valores son correctos, se crea una materia
            Habitacion hab = new Habitacion(piso, numero, (Categoria) jCBCategorias.getSelectedItem(), true);

            //Se crea una variable tipo entero y se usa para almacenar el registro de la ejecucion del metodo guardarMateria
            int registro = Vista.getHabD().guardarHabitacion(hab);

            //Dependiendo del valor que tome la variable registro se muestra un mensaje al usuario
            if (registro > 0) {

                JOptionPane.showMessageDialog(this, "La habitacion ha sido guardada");
            } else {

                JOptionPane.showMessageDialog(this, "No se pudo agregar la habitacion, el numero ya existe");
            }

            //Se limpian los campos
            limpiar();
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "En la casilla numero y piso deben ir solo numeros.");
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "Ningun casillero debe estar vacio");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed

        //Cierra la ventana
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBDeshabilitar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeshabilitar1ActionPerformed
        //Se controla que el campo de numero no se encuentre vacio
        if (jTFNumero.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "La casilla numero no debe estar vacia.");
            return;
        }
        try {

            int numero = Integer.parseInt(jTFNumero.getText());

            //Se crea una habitacion y se busca en la base de datos para confirmar que la habitacion existe
            //En caso que la habitacion no se encuentre en la base de datos, se muestra un mensaje al usuario y se finaliza la ejecucion
            Habitacion hab = Vista.getHabD().buscarHabitacionPorNumero(numero);
            if (hab == null) {

                JOptionPane.showMessageDialog(this, "No existe la habitacion");
                return;
            }
            if (!hab.isHabilitada()) {
                JOptionPane.showMessageDialog(this, "La habitacion ya se encunetra deshabilitada");
                return;
            }

            ArrayList<Reserva> reservas = Vista.getRD().listarReservas();
            for (Reserva reserva : reservas) {
                if (hab.getIdHabitacion() == reserva.getHabitacion().getIdHabitacion()) {
                    JOptionPane.showMessageDialog(this, "La habitacion que desea eliminar tiene reservas asociadas."
                            + "\n Primero elimine todas las reservas asociadas a esta habiatacion");
                    return;
                }
            }

            //Habiendo confirmado que el numero de la habitacion es correcto, que la habitacion existe en la DB y que su no tiene reservas asociadas
            int resp = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea deshabilitar esta habitacion?", "", JOptionPane.YES_OPTION);
            int registro;
            if (resp == 0) {
                registro = Vista.getHabD().eliminarHabitacion(hab.getNro());

                if (registro == 1) {

                    JOptionPane.showMessageDialog(this, "La habitacion ha sido deshabilitada");
                    jRBHabilitada.setSelected(false);
                } else {

                    JOptionPane.showMessageDialog(this, "No se pudo deshabilitar la habitacion");
                }
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El numero de la habitacion es incorrecto.");
        }
    }//GEN-LAST:event_jBDeshabilitar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBDeshabilitar1;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBHabilitar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Categoria> jCBCategorias;
    private javax.swing.JLabel jLLogo1;
    private javax.swing.JLabel jLMargen1;
    private javax.swing.JLayeredPane jLPCabecera1;
    private javax.swing.JLabel jLTitulo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPBackground;
    private javax.swing.JRadioButton jRBHabilitada;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFPiso;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        jTFCodigo.setText("");
        jTFNumero.setText("");
        jTFPiso.setText("");
        jCBCategorias.setSelectedIndex(0);
        jRBHabilitada.setSelected(false);

    }

    private void cargarCB() {

        //Agregamos en el primer lugar un alumno vacio
        Categoria vacio = new Categoria() {
            @Override
            public String toString() {
                return "Seleccione una categoria...";
            }
        };
        jCBCategorias.addItem(vacio);

        //Se recupera una lista de alumnos
        ArrayList<Categoria> Lista = Vista.getCD().listarCategorias();
        int i = 0;
        for (Categoria categoria : Lista) {
            listaDeHab.put(i + 1, categoria);
            i++;
        }
        //Se recorre la lista y cada alumno se agrega al CB
        for (Categoria cat : Lista) {
            jCBCategorias.addItem(cat);
        }
    }
}
