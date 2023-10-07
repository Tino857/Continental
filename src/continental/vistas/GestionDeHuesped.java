package continental.vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import continental.accesoADatos.ValidarData;
import continental.entidades.Huesped;

/**
 *
 * @author Grupo 61
 */
public class GestionDeHuesped extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionDeAlumnos
     */
    public GestionDeHuesped() {

        initComponents();
         jRBEstado.setEnabled(false);
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

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(500, 450));

        jPBackground.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setForeground(new java.awt.Color(235, 235, 235));
        jLabel2.setText("Documento:");

        jLabel6.setForeground(new java.awt.Color(235, 235, 235));
        jLabel6.setText("Nombre:");

        jBBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jBBuscar.setForeground(new java.awt.Color(235, 235, 235));
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/buscar-w.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.setIconTextGap(10);
        jBBuscar.setPreferredSize(new java.awt.Dimension(100, 32));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        JTFDni.setBackground(new java.awt.Color(102, 102, 102));
        JTFDni.setForeground(new java.awt.Color(255, 255, 255));

        jTFApellido.setBackground(new java.awt.Color(102, 102, 102));
        jTFApellido.setForeground(new java.awt.Color(255, 255, 255));

        jTFNombre.setBackground(new java.awt.Color(102, 102, 102));
        jTFNombre.setForeground(new java.awt.Color(255, 255, 255));

        jBLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        jBLimpiar.setForeground(new java.awt.Color(235, 235, 235));
        jBLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/limpiar-w.png"))); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setIconTextGap(10);
        jBLimpiar.setPreferredSize(new java.awt.Dimension(100, 32));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(51, 51, 51));
        jBEliminar.setForeground(new java.awt.Color(235, 235, 235));
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/eliminar-w.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setIconTextGap(10);
        jBEliminar.setPreferredSize(new java.awt.Dimension(105, 32));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(51, 51, 51));
        jBGuardar.setForeground(new java.awt.Color(235, 235, 235));
        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/guardar-w.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setIconTextGap(10);
        jBGuardar.setPreferredSize(new java.awt.Dimension(105, 32));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(51, 51, 51));
        jBSalir.setForeground(new java.awt.Color(235, 235, 235));
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/salir-w.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setIconTextGap(10);
        jBSalir.setPreferredSize(new java.awt.Dimension(100, 32));
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(235, 235, 235));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("GESTION DE HUESPED");

        jLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/LogoULP3-w.png"))); // NOI18N

        jLPCabecera.setLayer(jLMargen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCabecera.setLayer(jLTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCabecera.setLayer(jLLogo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLPCabeceraLayout = new javax.swing.GroupLayout(jLPCabecera);
        jLPCabecera.setLayout(jLPCabeceraLayout);
        jLPCabeceraLayout.setHorizontalGroup(
            jLPCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPCabeceraLayout.createSequentialGroup()
                .addComponent(jLMargen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLLogo))
        );
        jLPCabeceraLayout.setVerticalGroup(
            jLPCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLPCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLPCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLMargen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTFDomicilio.setBackground(new java.awt.Color(102, 102, 102));

        jTFCorreo.setBackground(new java.awt.Color(102, 102, 102));
        jTFCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCorreoActionPerformed(evt);
            }
        });

        jTFCelular.setBackground(new java.awt.Color(102, 102, 102));

        jRBEstado.setBackground(new java.awt.Color(102, 102, 102));
        jRBEstado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jRBEstado.setForeground(new java.awt.Color(255, 255, 255));
        jRBEstado.setAlignmentY(0.0F);
        jRBEstado.setBorderPainted(true);

        jLCelular1.setForeground(new java.awt.Color(235, 235, 235));
        jLCelular1.setText("Estado:");

        jLabel7.setForeground(new java.awt.Color(235, 235, 235));
        jLabel7.setText("Apellido:");

        jLabel8.setForeground(new java.awt.Color(235, 235, 235));
        jLabel8.setText("Domicilio:");

        jLabel9.setForeground(new java.awt.Color(235, 235, 235));
        jLabel9.setText("Correo:");

        jLabel10.setForeground(new java.awt.Color(235, 235, 235));
        jLabel10.setText("Celular:");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPBackgroundLayout.createSequentialGroup()
                                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFDni)
                                    .addComponent(jTFCorreo)
                                    .addComponent(jTFCelular, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFDomicilio, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPBackgroundLayout.createSequentialGroup()
                                .addComponent(jRBEstado)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPBackgroundLayout.createSequentialGroup()
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRBEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLCelular1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if (jTFNombre.getText().isEmpty() || jTFApellido.getText().isEmpty() || JTFDni.getText().isEmpty() || jTFCelular.getText().isEmpty()||jTFDomicilio.getText().isEmpty()||jTFCorreo.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Ningun casillero debe estar vacio.");
            return;
        }
        
        try {
            
            //Se intenta parsear el dni y se realiza su validacion
            int dni = Integer.parseInt(JTFDni.getText());
            if (ValidarData.validarDNI(dni)) {
                
                JOptionPane.showMessageDialog(this, "En casilla DNI debe ir un dato valido.");
                return;
            }
            
            //Se valida si los campos de nombre, apellido  y domicilio no contienen caracteres especiales
            String nombre = jTFNombre.getText();
            String apellido = jTFApellido.getText();
            String correo=jTFCorreo.getText();
            String domicilio=jTFDomicilio.getText();
           
            if (ValidarData.caracteresEspeciales(nombre) || ValidarData.caracteresEspeciales(apellido)|| ValidarData.largoCadena(domicilio)) {
                
                JOptionPane.showMessageDialog(this, "No se permiten caracteres especiales o numeros");
                return;
            }

            //Deberiamos poner una validacion para el correo (por ejemplo que termine con ".com" y que tenga un arroba no mas.
           
          int celular = Integer.parseInt(jTFCelular.getText());//Con esto validamos que en la casilla celular solo haya numeros
            
            //Se valida si los campos de nombre, apellido, correo y domicilio  cumplen con un largo determinado
            if (ValidarData.largoCadena(nombre) || ValidarData.largoCadena(apellido)||ValidarData.largoCadena(correo)|| ValidarData.largoCadena(domicilio)) {
                
                JOptionPane.showMessageDialog(this, "El nombre, apellido, correo o domicilio son incorrectos");
                return;
            }
            
            
            //Llegado el punto en que todos los valores son correctos, se crea un alumno
            Huesped h = new Huesped(nombre, apellido, domicilio, correo, jTFCelular.getText(), dni, true);
            
            //Se crea una variable tipo entero y se usa para almacenar el registro de la ejecucion del metodo guardarAlumno
            int registro = Vista.getHD().guardarHuesped(h);
            
            //Dependiendo del valor que tome la variable registro se muestra un mensaje al usuario
            if (registro > 0) {

                JOptionPane.showMessageDialog(this, "El Huesped ha sido agregado.");
            } else {

                JOptionPane.showMessageDialog(this, "No se pudo agregar al Huesped, el DNI ya existe.");
            }
            
            //Se limpian los campos
            limpiar();
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "En la casilla DNI o en la de Celular debe ir solo numeros.");
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "Ningun casillero debe estar vacio.");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    //BOTON ELIMINAR
    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        //Se controla que el campo que contiene el dni no esté vacío
        if (JTFDni.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "La casilla DNI no debe estar vacia si desea eliminar al alumno.");
            return;
        }

        try {
            
            //Se intenta parsear el valor del campo dni
            int dni = Integer.parseInt(JTFDni.getText());
            
            //Se crea un alumno y se busca en la base de datos para confirmar que el alumno existe
            //En caso que el alumno no se encuentre en la base de datos, se muestra un mensaje al usuario y se finaliza la ejecucion
            Huesped h = Vista.getHD().buscarHuespedPorDni(dni);
           
            if (h == null) {
                
                JOptionPane.showMessageDialog(this, "No existe el huesped");
                return;
            }
            
            //Si el alumno se encontraba en la base de datos, se recupera su estado para confirmar que no haya sido eliminado anteriormente
            if (!h.isEstado()) {

                JOptionPane.showMessageDialog(this, "El huesped ya ha sido borrado");
                return;
            }
       
            //Habiendo confirmado que el dni del alumno es correcto, que el alumno existe en la DB y que su estado es activo
           
            int resp = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar este huesped?", "", JOptionPane.YES_OPTION);
            int registro;
            if (resp == 0) {
                registro = Vista.getHD().eliminarHuesped(h.getDni());
                
                if (registro == 1) {
                
                    JOptionPane.showMessageDialog(this, "El huesped ha sido borrado");
                } else {
                
                    JOptionPane.showMessageDialog(this, "No se pudo borrar al huesped");
                }
            }

        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(this, "El DNI es incorrecto.");
        } catch (NullPointerException e) {
            
            JOptionPane.showMessageDialog(this, "No existe el alumno ");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    //BOTON LIMPIAR
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed

        //Resetea todos los textfield
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    //BOTON BUSCAR
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        
        //Se controla que el campo dni no este vacio
        if (JTFDni.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "La casilla DNI no debe estar vacia si desea buscar al huesped.");
            return;
        }

        try {
            
            //Se intenta parsear el dni
            int dni = Integer.parseInt(JTFDni.getText());
            
            //Se recupera el alumno que posee el dni en la DB
            Huesped h = Vista.getHD().buscarHuespedPorDni(dni);
            
            //Si el alumno recibido tiene valor nulo significa que no se encuentra en la DB
            //Se muestra el mensaje al usuario y se finaliza la ejecucion
            if (h == null) {
                
                JOptionPane.showMessageDialog(this, "No existe el huesped");
                return;
            }
            
            //Si el alumno se encontraba en la DB, se setean los campos correspondientes con los valores obtenidos del alumno
            jTFNombre.setText(h.getNombre());
            jTFApellido.setText(h.getApellido());
            JTFDni.setText(Integer.toString(dni));
            jTFDomicilio.setText(h.getDomicilio());
            jTFCorreo.setText(h.getCorreo());
            jTFCelular.setText(h.getCelular());
            jRBEstado.setSelected(h.isEstado());
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "En la casilla DNI debe ir solo numeros.");
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "No existe el alumno");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTFCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCorreoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFDni;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
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

    //Este metodo limpia los textfields y resetea los campos de estado y fecha
    private void limpiar() {
        
        JTFDni.setText("");
        jTFApellido.setText("");
        jTFNombre.setText("");
       jTFDomicilio.setText("");
       jTFCorreo.setText("");
       jTFCelular.setText("");
    }
}
