package continental.vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import continental.accesoADatos.ValidarData;
import continental.entidades.Huesped;

/**
 *
 * @author Grupo 61
 */
public class EdiciondeHuesped extends javax.swing.JInternalFrame {

    //Se crea el modelo que usaremos en la tabla, y se impide que se puedan modificar los valores de las celdas
    private final DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {

            return false;
        }
    };

    public EdiciondeHuesped() {

        initComponents();
        armarTabla();
        jRBA.setSelected(true);
        cargarDatos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ImageIcon icon = new ImageIcon(getClass().getResource("/continental/imagenes/WindowBackground.png"));
        Image image = icon.getImage();
        jPBackground = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        JBEditar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        JTFBuscador = new javax.swing.JTextField();
        jRBIn = new javax.swing.JRadioButton();
        jRBA = new javax.swing.JRadioButton();
        jLPCabecera = new javax.swing.JLayeredPane();
        jLMargen = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jLLogo = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTFDni = new javax.swing.JTextField();
        jTFApellido = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jTFDomicilio = new javax.swing.JTextField();
        jTFCorreo = new javax.swing.JTextField();
        jTFCelular = new javax.swing.JTextField();
        jLDocumento = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLCelular = new javax.swing.JLabel();
        jRBEstado = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(500, 600));

        jPBackground.setBackground(new java.awt.Color(51, 51, 51));

        JBEditar.setBackground(new java.awt.Color(51, 51, 51));
        JBEditar.setForeground(new java.awt.Color(235, 235, 235));
        JBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/editar-w.png"))); // NOI18N
        JBEditar.setText("Editar");
        JBEditar.setIconTextGap(10);
        JBEditar.setPreferredSize(new java.awt.Dimension(100, 32));
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 24));

        JTFBuscador.setBackground(new java.awt.Color(102, 102, 102));
        JTFBuscador.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        JTFBuscador.setForeground(new java.awt.Color(153, 153, 153));
        JTFBuscador.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTFBuscador.setText("Ingrese un DNI para filtrar la tabla...");
        JTFBuscador.setBorder(null);
        JTFBuscador.setMargin(new java.awt.Insets(0, 10, 0, 10));
        JTFBuscador.setMinimumSize(new java.awt.Dimension(0, 24));
        JTFBuscador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFBuscadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFBuscadorFocusLost(evt);
            }
        });
        JTFBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFBuscadorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JTFBuscador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTFBuscador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        buttonGroup1.add(jRBIn);
        jRBIn.setForeground(new java.awt.Color(255, 255, 255));
        jRBIn.setText("Inactivos");
        jRBIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBInActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBA);
        jRBA.setForeground(new java.awt.Color(255, 255, 255));
        jRBA.setText("Activos");
        jRBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBAActionPerformed(evt);
            }
        });

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(235, 235, 235));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("EDICIÓN DE HUESPED");

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

        jTFDni.setBackground(new java.awt.Color(102, 102, 102));
        jTFDni.setForeground(new java.awt.Color(255, 255, 255));

        jTFApellido.setBackground(new java.awt.Color(102, 102, 102));
        jTFApellido.setForeground(new java.awt.Color(255, 255, 255));

        jTFNombre.setBackground(new java.awt.Color(102, 102, 102));
        jTFNombre.setForeground(new java.awt.Color(255, 255, 255));

        jTFDomicilio.setBackground(new java.awt.Color(102, 102, 102));
        jTFDomicilio.setForeground(new java.awt.Color(255, 255, 255));

        jTFCorreo.setBackground(new java.awt.Color(102, 102, 102));
        jTFCorreo.setForeground(new java.awt.Color(255, 255, 255));

        jTFCelular.setBackground(new java.awt.Color(102, 102, 102));
        jTFCelular.setForeground(new java.awt.Color(255, 255, 255));

        jLDocumento.setForeground(new java.awt.Color(235, 235, 235));
        jLDocumento.setText("DNI:");

        jLApellido.setForeground(new java.awt.Color(235, 235, 235));
        jLApellido.setText("Apellido:");

        jLNombre.setForeground(new java.awt.Color(235, 235, 235));
        jLNombre.setText("Nombre:");

        jLabel6.setForeground(new java.awt.Color(235, 235, 235));
        jLabel6.setText("Domicilio:");

        jLabel5.setForeground(new java.awt.Color(235, 235, 235));
        jLabel5.setText("Correo:");

        jLCelular.setForeground(new java.awt.Color(235, 235, 235));
        jLCelular.setText("Celular:");

        jLabel1.setText("Estado:");

        jLayeredPane1.setLayer(jTFDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFDomicilio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFCorreo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLDocumento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRBEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLDocumento)
                    .addComponent(jLApellido)
                    .addComponent(jLNombre)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLCelular)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jRBEstado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFDomicilio)
                            .addComponent(jTFCorreo)
                            .addComponent(jTFCelular)
                            .addComponent(jTFApellido)
                            .addComponent(jTFNombre)
                            .addComponent(jTFDni))
                        .addGap(23, 23, 23))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDocumento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRBEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPBackgroundLayout = new javax.swing.GroupLayout(jPBackground);
        jPBackground.setLayout(jPBackgroundLayout);
        jPBackgroundLayout.setHorizontalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRBA)
                .addGap(84, 84, 84)
                .addComponent(jRBIn)
                .addGap(141, 141, 141))
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPCabecera)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1)
                    .addGroup(jPBackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );
        jPBackgroundLayout.setVerticalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addComponent(jLPCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBIn)
                    .addComponent(jRBA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    //ACCION CLICK EN TABLA
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        //Se captura el evento de click en una fila de la tabla y se recupera el indice de la misma
        int filaSelec = jTable1.getSelectedRow();

        mostrarInfo(filaSelec);
    }//GEN-LAST:event_jTable1MouseClicked

    //BOTON EDITAR
    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed

        //Se controla que no hayan campos vacios
        if (jTFNombre.getText().isEmpty() || jTFApellido.getText().isEmpty() || jTFDni.getText().isEmpty() || jTFCelular.getText().isEmpty() || jTFDomicilio.getText().isEmpty() || jTFCorreo.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Ningun casillero debe estar vacio.");
            return;
        }

        //Se controla que un huesped de la tabla esté seleccionado
        if (jTable1.getSelectedRow() == -1 && jTable1.getRowCount() > 1) {

            JOptionPane.showMessageDialog(this, "Seleccione un huesped de la lista.", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {

            //Se recupera la fila seleccionada
            int filaSelec = jTable1.getSelectedRow();
            if (jTable1.getRowCount() == 1) {

                filaSelec = 0;
            }

            //Se intenta parsear el nuevo dni a guardar en el huesped y se realiza su validacion
            int dni = Integer.parseInt(jTFDni.getText());
            if (ValidarData.validarDNI(dni)) {

                JOptionPane.showMessageDialog(this, "En casilla DNI debe ir un dato valido.", "", JOptionPane.WARNING_MESSAGE);
                return;
            }

            //Se valida si los campos de nombre y apellido no contienen caracteres especiales
            String nombre = jTFNombre.getText();
            String apellido = jTFApellido.getText();
            String correo = jTFCorreo.getText();
            String domicilio = jTFDomicilio.getText();
            if (ValidarData.caracteresEspeciales(nombre) || ValidarData.caracteresEspeciales(apellido) || ValidarData.largoCadena(domicilio)) {

                JOptionPane.showMessageDialog(this, "No se permiten caracteres especiales o numeros");
                return;
            }

            //Se valida si los campos de nombre y apellido cumplen con un largo determinado
            if (ValidarData.caracteresEspeciales(nombre) || ValidarData.caracteresEspeciales(apellido) || ValidarData.largoCadena(domicilio)) {

                JOptionPane.showMessageDialog(this, "No se permiten caracteres especiales o numeros");
                return;
            }
            //Deberiamos poner una validacion para el correo (por ejemplo que termine con ".com" y que tenga un arroba no mas.

            int celular = Integer.parseInt(jTFCelular.getText());//Con esto validamos que en la casilla celular solo haya numeros

            //Llegado el punto en que todos los valores son correctos, se crea un huesped
            //En este huesped guardamos el resultado de la busqueda por medio del dni que figura en la tabla
            Huesped h = Vista.getHD().buscarHuespedPorDni(Integer.parseInt((String) modelo.getValueAt(filaSelec, 1)));

            //Seteamos al huesped con la informacion nueva
            h.setDni(dni);
            h.setApellido(apellido);
            h.setNombre(nombre);
            h.setCorreo(correo);
            h.setCelular(jTFCelular.getText());
            h.setDomicilio(domicilio);
            h.setEstado(jRBEstado.isSelected());

            //Se crea una variable tipo entero y se usa para almacenar el registro de la ejecucion del metodo editarAlumno
            int registro = Vista.getHD().editarHuesped(h);

            //Dependiendo del valor que tome la variable registro se muestra un mensaje al usuario
            if (registro > 0) {

                JOptionPane.showMessageDialog(this, "Datos actualizados");
            } else {

                JOptionPane.showMessageDialog(this, "No se pudo actualizar los datos. \nEl dni está en uso", "", JOptionPane.ERROR_MESSAGE);
            }

            //Se limpia la tabla y se vuelven a cargar los datos de los alumnos
            limpiarTabla();
            cargarDatos();
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "En la casilla de Dni solo deben ir numeros", "", JOptionPane.WARNING_MESSAGE);
        }
        //Se limpian los textfields
        limpiarInfo();
    }//GEN-LAST:event_JBEditarActionPerformed

    //Este metodo setea el texto y propiedades del textField de busqueda al entrar al mismo
    private void JTFBuscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFBuscadorFocusLost

        if (JTFBuscador.getText().equals("")) {

            JTFBuscador.setText("Ingrese un DNI para filtrar la tabla...");
        }
        JTFBuscador.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_JTFBuscadorFocusLost

    //Este metodo setea el texto y propiedades del textField de busqueda al salir del mismo
    private void JTFBuscadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFBuscadorFocusGained

        if (JTFBuscador.getText().equals("Ingrese un DNI para filtrar la tabla...")) {

            JTFBuscador.setText("");
        }
        JTFBuscador.setForeground(Color.WHITE);
    }//GEN-LAST:event_JTFBuscadorFocusGained

    //Este metodo permite filtrar los alumnos de la tabla al escribir un dni en el textField de busqueda
    private void JTFBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFBuscadorKeyReleased

        limpiarTabla();
        ArrayList<Huesped> ListaDeHuespedes;
        if (jRBA.isSelected()) {
            ListaDeHuespedes = Vista.getHD().listarHuespedAct();
        } else {
            ListaDeHuespedes = Vista.getHD().listarHuespedIn();
        }
        for (Huesped huesped : ListaDeHuespedes) {

            if ((huesped.getDni() + "").startsWith(JTFBuscador.getText())) {

                cargarTabla(huesped);
            }
        }

        if (jTable1.getRowCount() == 1) {

            //Si solo quedo un alumno al filtrar, se setean los valores recuperados del alumno en los campos correspondientes
            mostrarInfo(0);
        } else {

            //Si se borra la busqueda y aparece mas de un resultado, se limpian los campos
            limpiarInfo();
        }
    }//GEN-LAST:event_JTFBuscadorKeyReleased

    private void jRBInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBInActionPerformed
        limpiarInfo();
        limpiarTabla();
        cargarDatos();
    }//GEN-LAST:event_jRBInActionPerformed

    private void jRBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAActionPerformed
        limpiarInfo();
        limpiarTabla();
        cargarDatos();
    }//GEN-LAST:event_jRBAActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEditar;
    private javax.swing.JTextField JTFBuscador;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLDocumento;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLMargen;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLayeredPane jLPCabecera;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPBackground;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBA;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JRadioButton jRBIn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFCelular;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTextField jTFDomicilio;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    //Este metodo permite setear un modelo de tabla personalizado
    private void armarTabla() {

        //Se agregan las columnas con su nombre correspondiente al modelo de tabla creado anteriormente
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Correo");
        modelo.addColumn("Celular");
        modelo.addColumn("Estado");

        //Se setea el modelo de tabla a la tabla de alumnos
        jTable1.setModel(modelo);

        //Se recupera el modelo de columnas
        TableColumnModel columnas = jTable1.getColumnModel();

        //Se llama al metodo que se encarga de setear el ancho de las columnas
        anchoColumna(columnas, 0, 40);
        anchoColumna(columnas, 1, 80);
        anchoColumna(columnas, 7, 60);
    }

    //Este metodo se usa para setear el ancho de una columna
    //Recibe por parametro el modelo de columna de la tabla, el indice de la columna a modificar y el ancho deseado
    private void anchoColumna(TableColumnModel modeloTabla, int indice, int ancho) {

        modeloTabla.getColumn(indice).setWidth(ancho);
        modeloTabla.getColumn(indice).setMaxWidth(ancho + 30);
        modeloTabla.getColumn(indice).setMinWidth(ancho - 10);
        modeloTabla.getColumn(indice).setPreferredWidth(ancho);
    }

    //Se cargan las filas en la tabla
    private void cargarDatos() {
        if (jRBA.isSelected()) {
            //Se recupera una lista de alumnos
            ArrayList<Huesped> ListaDeHuespedes = Vista.getHD().listarHuespedAct();

            //Se recorre la lista y por cada alumno, se llama al metodo correspondiente para agregar la fila, enviando por parametro dicho alumno
            for (Huesped next : ListaDeHuespedes) {
                cargarTabla(next);
            }
        } else {
            ArrayList<Huesped> ListaDeHuespedes = Vista.getHD().listarHuespedIn();

            //Se recorre la lista y por cada alumno, se llama al metodo correspondiente para agregar la fila, enviando por parametro dicho alumno
            for (Huesped next : ListaDeHuespedes) {
                cargarTabla(next);
            }
        }

    }

    //Este metodo se encarga de recibir un alumno y desglosar su informacion en una fila para agregarla a la tabla de alumnos
    private void cargarTabla(Huesped h) {

        modelo.addRow(new Object[]{
            h.getIdHuesped(),
            Integer.toString(h.getDni()),
            h.getApellido(),
            h.getNombre(),
            h.getDomicilio(),
            h.getCorreo(),
            h.getCelular(),
            h.isEstado()
        });
    }

    //Este metodo limpia los textfields y resetea los campos de estado y fecha
    private void limpiarInfo() {

        jTFDni.setText("");
        jTFApellido.setText("");
        jTFNombre.setText("");
        jTFDomicilio.setText("");
        jTFCorreo.setText("");
        jTFCelular.setText("");
        jRBEstado.setSelected(false);
    }

    //Este metodo elimina todas las filas de la tabla
    private void limpiarTabla() {

        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void mostrarInfo(int filaSelec){
        //Se obtienen los datos del alumno almacenado en la fila seleccionada
        String dni = (String) modelo.getValueAt(filaSelec, 1);
        String apellido = (String) modelo.getValueAt(filaSelec, 2);
        String nombre = (String) modelo.getValueAt(filaSelec, 3);
        String domicilio = (String) modelo.getValueAt(filaSelec, 4);
        String correo = (String) modelo.getValueAt(filaSelec, 5);
        String celular = (String) modelo.getValueAt(filaSelec, 6);
        boolean estado = (boolean) modelo.getValueAt(filaSelec, 7);

        //Se setean los valores recuperados anteriormente en los campos correspondientes
        jTFDni.setText(dni);
        jTFApellido.setText(apellido);
        jTFNombre.setText(nombre);
        jTFDomicilio.setText(domicilio);
        jTFCorreo.setText(correo);
        jTFCelular.setText(celular);
        jRBEstado.setSelected(estado);
    }
}
