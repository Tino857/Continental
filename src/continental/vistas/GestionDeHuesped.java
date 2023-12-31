package continental.vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import continental.accesoADatos.ValidarData;
import continental.entidades.Habitacion;
import continental.entidades.Huesped;
import continental.entidades.Reserva;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author Grupo 61
 */
public class GestionDeHuesped extends javax.swing.JInternalFrame {

    private LocalDate fI, fF;
    private Habitacion hab;
    private int cantidadPersonas, dias;
    private double monto;

    public GestionDeHuesped() {

        initComponents();
        jRBEstado.setEnabled(false);
    }

    public GestionDeHuesped(LocalDate fI, LocalDate fF, Habitacion hab, int cantidadPersonas) {
        
        initComponents();
        this.fI = fI;
        this.fF = fF;
        this.hab = hab;
        this.cantidadPersonas = cantidadPersonas;
        this.dias = (int) ChronoUnit.DAYS.between(fI, fF);
        this.monto = hab.getCategoria().getPrecio() * dias;
        jBBuscar.setVisible(false);
        jBHabilitar.setVisible(false);
        jBEliminar.setVisible(false);
        jBSalir.setText("Atras");
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
        jLabel6 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        JTFDni = new javax.swing.JTextField();
        jTFApellido = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jBLimpiar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLPCabecera = new javax.swing.JLayeredPane();
        jLMargen = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jLLogo = new javax.swing.JLabel();
        jTFDomicilio = new javax.swing.JTextField();
        jTFCorreo = new javax.swing.JTextField();
        jTFCelular = new javax.swing.JTextField();
        jRBEstado = new javax.swing.JRadioButton();
        jLCelular1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jBHabilitar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(550, 450));

        jPBackground.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Documento:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre:");

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

        JTFDni.setBackground(new java.awt.Color(85, 94, 100));
        JTFDni.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        JTFDni.setForeground(new java.awt.Color(255, 255, 255));

        jTFApellido.setBackground(new java.awt.Color(85, 94, 100));
        jTFApellido.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTFApellido.setForeground(new java.awt.Color(255, 255, 255));

        jTFNombre.setBackground(new java.awt.Color(85, 94, 100));
        jTFNombre.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTFNombre.setForeground(new java.awt.Color(255, 255, 255));

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

        jBEliminar.setBackground(new java.awt.Color(45, 54, 60));
        jBEliminar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(235, 235, 235));
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/cancelar-c.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setIconTextGap(10);
        jBEliminar.setPreferredSize(new java.awt.Dimension(110, 32));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
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

        jLMargen.setPreferredSize(new java.awt.Dimension(63, 64));

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(235, 235, 235));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("GESTIÓN DE HUESPED");

        jLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/LogoSmall-w.png"))); // NOI18N

        jLPCabecera.setLayer(jLMargen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCabecera.setLayer(jLTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCabecera.setLayer(jLLogo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLPCabeceraLayout = new javax.swing.GroupLayout(jLPCabecera);
        jLPCabecera.setLayout(jLPCabeceraLayout);
        jLPCabeceraLayout.setHorizontalGroup(
            jLPCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPCabeceraLayout.createSequentialGroup()
                .addComponent(jLMargen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLLogo))
        );
        jLPCabeceraLayout.setVerticalGroup(
            jLPCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLPCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLPCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLMargen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTFDomicilio.setBackground(new java.awt.Color(85, 94, 100));
        jTFDomicilio.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTFDomicilio.setForeground(new java.awt.Color(255, 255, 255));

        jTFCorreo.setBackground(new java.awt.Color(85, 94, 100));
        jTFCorreo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTFCorreo.setForeground(new java.awt.Color(255, 255, 255));

        jTFCelular.setBackground(new java.awt.Color(85, 94, 100));
        jTFCelular.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTFCelular.setForeground(new java.awt.Color(255, 255, 255));

        jRBEstado.setBackground(new java.awt.Color(102, 102, 102));
        jRBEstado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jRBEstado.setForeground(new java.awt.Color(255, 255, 255));
        jRBEstado.setAlignmentY(0.0F);
        jRBEstado.setBorderPainted(true);
        jRBEstado.setEnabled(false);

        jLCelular1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLCelular1.setForeground(new java.awt.Color(255, 255, 255));
        jLCelular1.setText("Estado:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Domicilio:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Celular:");

        jBHabilitar.setBackground(new java.awt.Color(45, 54, 60));
        jBHabilitar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBHabilitar.setForeground(new java.awt.Color(235, 235, 235));
        jBHabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/aceptar-c.png"))); // NOI18N
        jBHabilitar.setText("Habilitar");
        jBHabilitar.setPreferredSize(new java.awt.Dimension(110, 32));
        jBHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHabilitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBackgroundLayout = new javax.swing.GroupLayout(jPBackground);
        jPBackground.setLayout(jPBackgroundLayout);
        jPBackgroundLayout.setHorizontalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBackgroundLayout.createSequentialGroup()
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLCelular1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPBackgroundLayout.createSequentialGroup()
                                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFCelular, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFDomicilio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFDni, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPBackgroundLayout.createSequentialGroup()
                                .addComponent(jRBEstado)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPBackgroundLayout.createSequentialGroup()
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLPCabecera))
                .addGap(20, 20, 20))
        );
        jPBackgroundLayout.setVerticalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addComponent(jLPCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBackgroundLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRBEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLCelular1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTON SALIR
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed

        //Cierra la ventana
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    //BOTON GUARDAR
    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        //Controla que no hayan campos vacios
        if (jTFNombre.getText().isEmpty() || jTFApellido.getText().isEmpty() || JTFDni.getText().isEmpty() || jTFCelular.getText().isEmpty() || jTFDomicilio.getText().isEmpty() || jTFCorreo.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Ningun casillero debe estar vacio.");
            return;
        }

        try {

            //Se intenta parsear el dni y se realiza su validacion
            int dni = Integer.parseInt(JTFDni.getText());
            if (ValidarData.validarDNI(dni)) {

                JOptionPane.showMessageDialog(this, "En casilla DNI debe ir un dato valido.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                return;
            }

            //Se valida si los campos de nombre, apellido  y domicilio no contienen caracteres especiales
            String nombre = jTFNombre.getText();
            String apellido = jTFApellido.getText();
            String correo = jTFCorreo.getText();
            String domicilio = jTFDomicilio.getText();

            //Se valida si los campos de nombre, apellido y domicilio no contengan caracteres especiales
            if (ValidarData.caracteresEspeciales(nombre) || ValidarData.caracteresEspeciales(apellido)) {

                JOptionPane.showMessageDialog(this, "No se permiten caracteres especiales o números.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                return;
            }

            //Se valida que el domicilio sea correcto
            if (ValidarData.caracteresEspecialesDomicilio(domicilio)) {

                JOptionPane.showMessageDialog(this, "El domicilio contiene caracteres especiales.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                return;
            }

            //Se valida que el mail no contenga caracteres especiales
            if (ValidarData.caracteresEspecialesMail(correo)) {

                JOptionPane.showMessageDialog(this, "El correo electronico es incorrecto", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                return;
            }

            //Se valida que el nobre, apellido, domicilio y correo contengan un largo adecuado
            if (ValidarData.largoCadena(nombre) || ValidarData.largoCadena(apellido) || ValidarData.largoCadena(domicilio) || ValidarData.largoCadena(correo)) {

                JOptionPane.showMessageDialog(this, "El dato ingresado es incorrecto.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                return;
            }

            //Se valida que en la casilla celular solo haya numeros
            String celular = jTFCelular.getText();
            if (ValidarData.validarCelular(celular)) {

                JOptionPane.showMessageDialog(this, "El teléfono contiene caracteres incorrectos.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                return;
            }

            //Se valida que el numero de telefono tenga un largo adecuado
            if (ValidarData.validarLargoCelular(celular)) {
                JOptionPane.showMessageDialog(this, "El teléfono es incorrecto.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                return;
            }

            //Llegado el punto en que todos los valores son correctos, se crea un Huesped
            Huesped h = new Huesped(nombre, apellido, domicilio, correo, jTFCelular.getText(), dni, true);
            Huesped huesped = Vista.getHD().buscarHuespedPorCel(celular);
            if (huesped != null) {

                JOptionPane.showMessageDialog(this, "No se puede agregar este huesped debido a que tiene el mismo celular que otro.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Se crea una variable tipo entero y se usa para almacenar el registro de la ejecucion del metodo guardarHuesped
            int registro = Vista.getHD().guardarHuesped(h);

            //Dependiendo del valor que tome la variable registro se muestra un mensaje al usuario
            if (registro > 0) {

                JOptionPane.showMessageDialog(this, "El Huesped ha sido agregado.");
            } else {

                JOptionPane.showMessageDialog(this, "No se pudo agregar al Huesped, el DNI ya existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            //Se limpian los campos
            limpiar();
            
            //Si al llamar a la vista de gestion de huesped, se recibio una habitacion, se procede a finalizar la reserva
            if (hab != null) {

                continuarReserva(h);
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El DNI y/o Celular solo pueden contener numeros.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "No puede haber campos vacios.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    //BOTON ELIMINAR
    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        try {

            //Se validan datos
            if (!validacion("eliminar")) {

                return;
            }

            //Habiendo validado el dni, se busca un huesped con ese numero
            Huesped h = Vista.getHD().buscarHuespedPorDni(Integer.parseInt(JTFDni.getText()));

            //Se recupera el estado del huesped para confirmar que no haya sido eliminado anteriormente
            if (!h.isEstado()) {

                JOptionPane.showMessageDialog(this, "El huesped ya ha sido borrado.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                return;
            }

            //Se controla que el huesped no tenga reservas activas
            ArrayList<Reserva> reservas = Vista.getRD().listarReservas();
            for (Reserva reserva : reservas) {
                if (h.getIdHuesped() == reserva.getHuesped().getIdHuesped()) {
                    JOptionPane.showMessageDialog(this, "El Huesped que desea eliminar tiene reservas asociadas."
                            + "\n Primero elimine todas las reservas asociadas a este huesped", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            //Habiendo confirmado que el dni del huesped es correcto, que el huesped existe en la DB, que su estado es activo y que no posee reservas activas se procede con la eliminacion
            int resp = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar este huesped?", "CONFIRMAR", JOptionPane.YES_OPTION);
            int registro;
            if (resp == 0) {

                registro = Vista.getHD().eliminarHuesped(h.getDni());
                if (registro == 1) {

                    JOptionPane.showMessageDialog(this, "El huesped ha sido borrado.");
                    jRBEstado.setSelected(false);
                } else {

                    JOptionPane.showMessageDialog(this, "No se pudo borrar al huesped.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El DNI es incorrecto.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "No existe el huesped.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    //BOTON LIMPIAR
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed

        //Resetea todos los textfield
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    //BOTON BUSCAR
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        try {

            //Se validan datos
            if (!validacion("buscar")) {

                return;
            }

            //Habiendo validado el dni, se busca un huesped con ese numero
            int dni = Integer.parseInt(JTFDni.getText());
            Huesped h = Vista.getHD().buscarHuespedPorDni(dni);
            //Si el huesped se encuentra en la DB, se setean los campos correspondientes con los valores obtenidos del huesped
            jTFNombre.setText(h.getNombre());
            jTFApellido.setText(h.getApellido());
            JTFDni.setText(Integer.toString(dni));
            jTFDomicilio.setText(h.getDomicilio());
            jTFCorreo.setText(h.getCorreo());
            jTFCelular.setText(h.getCelular());
            jRBEstado.setSelected(h.isEstado());
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El DNI es incorrecto.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "No existe el huesped.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    //BOTON HABILITAR
    private void jBHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHabilitarActionPerformed

        try {

            //Se validan datos
            if (!validacion("habilitar")) {

                return;
            }

            //Habiendo validado el dni, se busca un huesped con ese numero
            Huesped h = Vista.getHD().buscarHuespedPorDni(Integer.parseInt(JTFDni.getText()));

            //Se recupera el estado del huesped para confirmar que no haya sido habilitado anteriormente
            if (h.isEstado()) {

                JOptionPane.showMessageDialog(this, "El huesped ya se encunetra habilitado");
                return;
            }

            //Habiendo confirmado que el dni del huesped es correcto, que el huesped existe en la DB y que su estado es inactivo
            int resp = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea habilitar este huesped?", "CONFIRMAR", JOptionPane.YES_OPTION);
            int registro;
            if (resp == 0) {
                registro = Vista.getHD().habilitarHuesped(h.getDni());

                if (registro == 1) {

                    JOptionPane.showMessageDialog(this, "El huesped ha sido habilitado.");
                    jRBEstado.setSelected(true);
                } else {

                    JOptionPane.showMessageDialog(this, "No se pudo habilitar al huesped.","ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El DNI es incorrecto.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "No existe el huesped.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBHabilitarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFDni;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBHabilitar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLCelular1;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLMargen;
    private javax.swing.JLayeredPane jLPCabecera;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPBackground;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFCelular;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFDomicilio;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables

    //Este metodo permite continuar con una reserva
    private void continuarReserva(Huesped huesped) {

        //Se crea una variable para almacenar el valor de la respuesta y se pide una confirmacion al usuario
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea confirmar la reserva?"
                + " \nTitular: " + huesped.getApellido() + ", " + huesped.getNombre()
                + " \nDNI: " + huesped.getDni()
                + " \nFecha de ingreso: " + fI
                + " \nFecha de salida: " + fF
                + " \nCantidad de personas: " + cantidadPersonas
                + " \nNumero de Habitacion: " + hab.getNro() + " - Piso: " + hab.getPiso()
                + " \nTipo de habitacion: " + hab.getCategoria().getTipoCategoria()
                + " \nPrecio por noche: " + hab.getCategoria().getPrecio()
                + " \nCantidad de dias: " + dias
                + " \nTOTAL A PAGAR: " + monto,
                "CONFIRMAR!", JOptionPane.YES_NO_OPTION
        );
        if (respuesta == 0) {

            Reserva reserva = new Reserva(huesped, hab, fI, fF, dias, cantidadPersonas, monto, true);
            int registro = Vista.getRD().guardarReserva(reserva);
            if (registro > 0) {

                JOptionPane.showMessageDialog(this, "La reserva se realizo correctamente");
                dispose();
            } else {

                JOptionPane.showMessageDialog(this, "No se pudo realizar la reserva.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            
            dispose();
        }
    }

    //Este metodo limpia los textfields y resetea los campos de estado y fecha
    private void limpiar() {

        JTFDni.setText("");
        jTFApellido.setText("");
        jTFNombre.setText("");
        jTFDomicilio.setText("");
        jTFCorreo.setText("");
        jTFCelular.setText("");
        jRBEstado.setSelected(false);
    }

    //Este metodo permite realizar validaciones
    private boolean validacion(String mensaje) {

        try {

            //Se controla que el campo que contiene el dni no esté vacío
            if (JTFDni.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Ingrese un DNI para " + mensaje + " un huesped.");
                return false;
            }
            //Se intenta parsear el valor del campo dni
            int dni = Integer.parseInt(JTFDni.getText());

            //Se crea un huesped y se busca en la base de datos para confirmar que el huesped existe
            //En caso que el huesped no se encuentre en la base de datos, se muestra un mensaje al usuario y se finaliza la ejecucion
            Huesped h = Vista.getHD().buscarHuespedPorDni(dni);

            if (h == null) {

                JOptionPane.showMessageDialog(this, "No existe el huesped.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El DNI es incorrecto.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            return false;
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "No existe el huesped.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
