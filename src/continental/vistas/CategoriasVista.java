package continental.vistas;

import continental.accesoADatos.ValidarData;
import continental.entidades.Categoria;
import continental.entidades.TipoCama;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Grupo 61
 */
public class CategoriasVista extends javax.swing.JInternalFrame {

    //Se crea el modelo que usaremos en la tabla, y se impide que se puedan modificar los valores de las celdas
    private final DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {

            return false;
        }
    };

    /**
     * Creates new form CategoriasVista
     */
    public CategoriasVista() {
        initComponents();
        armarTabla();
        cargarDatos();
        cargarCB();
        jTFID.setEditable(false);
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
        JBAgregar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        JTFBuscador = new javax.swing.JTextField();
        jLPCabecera = new javax.swing.JLayeredPane();
        jLMargen = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jLLogo = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTFNombre = new javax.swing.JTextField();
        jTFPersonas = new javax.swing.JTextField();
        jTFCantCamas = new javax.swing.JTextField();
        jTFPrecio = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jLPersonas = new javax.swing.JLabel();
        jLCantCamas = new javax.swing.JLabel();
        jLTipoCama = new javax.swing.JLabel();
        jLPrecio = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCBCamas = new javax.swing.JComboBox<>();
        JBEditar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(550, 550));

        jPBackground.setBackground(new java.awt.Color(51, 51, 51));

        JBAgregar.setBackground(new java.awt.Color(45, 54, 60));
        JBAgregar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        JBAgregar.setForeground(new java.awt.Color(235, 235, 235));
        JBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/guardar-w.png"))); // NOI18N
        JBAgregar.setText("Agregar");
        JBAgregar.setIconTextGap(10);
        JBAgregar.setPreferredSize(new java.awt.Dimension(110, 32));
        JBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarActionPerformed(evt);
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

        jTable1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
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

        jPanel1.setBackground(new java.awt.Color(85, 94, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 24));

        JTFBuscador.setBackground(new java.awt.Color(85, 94, 100));
        JTFBuscador.setFont(new java.awt.Font("Dialog", 2, 13)); // NOI18N
        JTFBuscador.setForeground(new java.awt.Color(190, 190, 190));
        JTFBuscador.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTFBuscador.setText("Ingrese el nombre de la categoría para filtrar la tabla...");
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

        jLMargen.setPreferredSize(new java.awt.Dimension(63, 64));

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(235, 235, 235));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("CATEGORIAS");

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
                    .addComponent(jLLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLMargen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTFNombre.setBackground(new java.awt.Color(85, 94, 100));
        jTFNombre.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTFNombre.setForeground(new java.awt.Color(255, 255, 255));

        jTFPersonas.setBackground(new java.awt.Color(85, 94, 100));
        jTFPersonas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTFPersonas.setForeground(new java.awt.Color(255, 255, 255));

        jTFCantCamas.setBackground(new java.awt.Color(85, 94, 100));
        jTFCantCamas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTFCantCamas.setForeground(new java.awt.Color(255, 255, 255));

        jTFPrecio.setBackground(new java.awt.Color(85, 94, 100));
        jTFPrecio.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTFPrecio.setForeground(new java.awt.Color(255, 255, 255));

        jLNombre.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(235, 235, 235));
        jLNombre.setText("Nombre:");

        jLPersonas.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLPersonas.setForeground(new java.awt.Color(235, 235, 235));
        jLPersonas.setText("Cant. Personas");

        jLCantCamas.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLCantCamas.setForeground(new java.awt.Color(235, 235, 235));
        jLCantCamas.setText("Cant. Camas:");

        jLTipoCama.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLTipoCama.setForeground(new java.awt.Color(235, 235, 235));
        jLTipoCama.setText("Tipo de Camas:");

        jLPrecio.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLPrecio.setForeground(new java.awt.Color(235, 235, 235));
        jLPrecio.setText("Precio:");

        jTFID.setBackground(new java.awt.Color(85, 94, 100));
        jTFID.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTFID.setForeground(new java.awt.Color(190, 190, 190));
        jTFID.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");

        jCBCamas.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        jLayeredPane1.setLayer(jTFNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFPersonas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFCantCamas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFPrecio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLPersonas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLCantCamas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLTipoCama, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLPrecio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jCBCamas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLNombre)
                        .addComponent(jLPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLCantCamas)
                        .addComponent(jLPrecio)
                        .addComponent(jLTipoCama))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFID)
                    .addComponent(jTFNombre)
                    .addComponent(jTFPrecio)
                    .addComponent(jTFPersonas)
                    .addComponent(jTFCantCamas)
                    .addComponent(jCBCamas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPersonas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCantCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCantCamas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTipoCama)
                    .addComponent(jCBCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPrecio))
                .addGap(0, 0, 0))
        );

        JBEditar.setBackground(new java.awt.Color(45, 54, 60));
        JBEditar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        JBEditar.setForeground(new java.awt.Color(235, 235, 235));
        JBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/editar-w.png"))); // NOI18N
        JBEditar.setText("Editar");
        JBEditar.setIconTextGap(10);
        JBEditar.setPreferredSize(new java.awt.Dimension(110, 32));
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        jBLimpiar.setBackground(new java.awt.Color(45, 54, 60));
        jBLimpiar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/limpiar-w.png"))); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setIconTextGap(10);
        jBLimpiar.setPreferredSize(new java.awt.Dimension(110, 32));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBackgroundLayout = new javax.swing.GroupLayout(jPBackground);
        jPBackground.setLayout(jPBackgroundLayout);
        jPBackgroundLayout.setHorizontalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPCabecera)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBackgroundLayout.createSequentialGroup()
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPBackgroundLayout.createSequentialGroup()
                                .addComponent(JBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPBackgroundLayout.createSequentialGroup()
                                .addComponent(jLayeredPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPBackgroundLayout.setVerticalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addComponent(jLPCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
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

    //BOTON AGREGAR
    private void JBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarActionPerformed

        //Controla que no hayan campos vacios
        if (jTFNombre.getText().isEmpty() || jTFCantCamas.getText().isEmpty() || jTFPersonas.getText().isEmpty() || jTFPrecio.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "No puede haber campos vacíos.", "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {

            //Se intentan parsear los valores numericos y se realiza su validacion
            int cantidadPersonas = Integer.parseInt(jTFPersonas.getText());
            int cantidadCamas = Integer.parseInt(jTFCantCamas.getText());
            double precio = Double.parseDouble(jTFPrecio.getText());
            TipoCama tipoCamas = (TipoCama) jCBCamas.getSelectedItem();
            String nombre = jTFNombre.getText();

            //VALIDAR DATOS
            if (!validarDatos()) {
                return;
            }

            //Llegado el punto en que todos los valores son correctos, se crea una categoria y se le seten los valores recibidos
            Categoria cat = new Categoria(cantidadPersonas, cantidadCamas, tipoCamas, precio, nombre);

            //Se crea una variable tipo entero y se usa para almacenar el registro de la ejecucion del metodo guardarCategoria
            int registro = Vista.getCD().guardarCategoria(cat);

            //Dependiendo del valor que tome la variable registro se muestra un mensaje al usuario
            if (registro > 0) {

                JOptionPane.showMessageDialog(this, "La categoria ha sido agregada.");
            } else {

                JOptionPane.showMessageDialog(this, "No se pudo agregar la categoria.\nYa existe una categoria con ese nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            //Se limpian los campos, la tabla y se carga nuevamente
            limpiarInfo();
            limpiarTabla();
            cargarDatos();
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Algun campo numerico tiene un valor incorrecto", "Advertencia!", JOptionPane.WARNING_MESSAGE);
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "No puede haber campos vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBAgregarActionPerformed

    //BOTON SALIR
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed

        //Cierra la ventana
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    //CLICK EN TABLA
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        //Se captura el evento de click en una fila de la tabla y se recupera el indice de la misma
        int filaSelec = jTable1.getSelectedRow();
        //Se muestra la informacion de la fila seleccionada
        mostrarInfo(filaSelec);
    }//GEN-LAST:event_jTable1MouseClicked

    //Este metodo setea el texto y propiedades del textField de busqueda al entrar al mismo
    private void JTFBuscadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFBuscadorFocusGained

        if (JTFBuscador.getText().equals("Ingrese el nombre de la categoría para filtrar la tabla...")) {

            JTFBuscador.setText("");
        }
        JTFBuscador.setForeground(Color.WHITE);
    }//GEN-LAST:event_JTFBuscadorFocusGained

    //Este metodo setea el texto y propiedades del textField de busqueda al salir del mismo
    private void JTFBuscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFBuscadorFocusLost

        if (JTFBuscador.getText().equals("")) {

            JTFBuscador.setText("Ingrese el nombre de la categoría para filtrar la tabla...");
        }
        JTFBuscador.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_JTFBuscadorFocusLost

    //Este metodo permite filtrar las categorias de la tabla al escribir un nombre en el textField de busqueda
    private void JTFBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFBuscadorKeyReleased

        limpiarTabla();
        ArrayList<Categoria> ListaDeCategorias;
        ListaDeCategorias = Vista.getCD().listarCategorias();
        for (Categoria cat : ListaDeCategorias) {

            if ((cat.getTipoCategoria()).startsWith(JTFBuscador.getText())) {

                cargarTabla(cat);
            }
        }

        if (jTable1.getRowCount() == 1) {

            //Si solo quedo una categoria al filtrar, se setean los valores recuperados de la categoria en los campos correspondientes
            mostrarInfo(0);
        } else {

            //Si se borra la busqueda y aparece mas de un resultado, se limpian los campos
            limpiarInfo();
        }
    }//GEN-LAST:event_JTFBuscadorKeyReleased

    //BOTON EDITAR
    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed

        //Se controla que no hayan campos vacios
        if (jTFCantCamas.getText().isEmpty() || jTFPersonas.getText().isEmpty() || jTFNombre.getText().isEmpty() || jTFPrecio.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Ningun casillero debe estar vacio.", "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //Se controla que la categoria posea una ID
        if (jTFID.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "No se puede editar una categoria inexistente.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Se controla que una categoria de la tabla esté seleccionada
        if (jTable1.getSelectedRow() == -1 && jTable1.getRowCount() > 1) {

            JOptionPane.showMessageDialog(this, "Seleccione una categoria de la lista.", "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {

            //Se recupera la fila seleccionada
            int filaSelec = jTable1.getSelectedRow();
            if (jTable1.getRowCount() == 1) {

                filaSelec = 0;
            }

            //Se intentan parsear los valores obtenidos de los campos de texto
            int cantidadPersonas = Integer.parseInt(jTFPersonas.getText());
            int cantidadCamas = Integer.parseInt(jTFCantCamas.getText());
            double precio = Double.parseDouble(jTFPrecio.getText());
            TipoCama tipoCamas = (TipoCama) jCBCamas.getSelectedItem();
            String nombre = jTFNombre.getText();

            //Validar datos
            if (!validarDatos()) {
                return;
            }

            //Llegado el punto en que todos los valores son correctos, se crea una categoria
            //En este categoria guardamos el resultado de la busqueda por medio del id que figura en la tabla
            Categoria cat = obtenerCategoria(filaSelec);

            //Seteamos el objeto categoria con la informacion nueva
            cat.setTipoCategoria(nombre);
            cat.setCantDePersonas(cantidadPersonas);
            cat.setCantDeCamas(cantidadCamas);
            cat.setTipoDeCamas(tipoCamas);
            cat.setPrecio(precio);

            //Se crea una variable tipo entero y se usa para almacenar el registro de la ejecucion del metodo editarCategoria
            int registro = Vista.getCD().editarCategoria(cat);

            //Dependiendo del valor que tome la variable registro se muestra un mensaje al usuario
            if (registro > 0) {

                JOptionPane.showMessageDialog(this, "Datos actualizados.");
            } else {

                JOptionPane.showMessageDialog(this, "No se pudo actualizar los datos.\nYa existe una categoria con ese nombre", "", JOptionPane.ERROR_MESSAGE);
            }

            //Se limpia la tabla y se vuelven a cargar los datos de las categorias
            limpiarTabla();
            cargarDatos();
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Algun campo numerico tiene un valor incorrecto", "", JOptionPane.WARNING_MESSAGE);
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "No puede haber campos vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        //Se limpian los textfields
        limpiarInfo();
    }//GEN-LAST:event_JBEditarActionPerformed

    //BOTON LIMPIAR
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed

        limpiarInfo();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAgregar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JTextField JTFBuscador;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<TipoCama> jCBCamas;
    private javax.swing.JLabel jLCantCamas;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLMargen;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLayeredPane jLPCabecera;
    private javax.swing.JLabel jLPersonas;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLTipoCama;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPBackground;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCantCamas;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFPersonas;
    private javax.swing.JTextField jTFPrecio;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    //Este metodo permite setear un modelo de tabla personalizado
    private void armarTabla() {

        //Se agregan las columnas con su nombre correspondiente al modelo de tabla creado anteriormente
        modelo.addColumn("ID");
        modelo.addColumn("Tipo de Hab");
        modelo.addColumn("Cant Personas");
        modelo.addColumn("Cant Camas");
        modelo.addColumn("Tipo de Camas");
        modelo.addColumn("Precio");

        //Se setea el modelo de tabla a la tabla de categoria
        jTable1.setModel(modelo);

        //Se recupera el modelo de columnas
        TableColumnModel columnas = jTable1.getColumnModel();

        //Se llama al metodo que se encarga de setear el ancho de las columnas
        anchoColumna(columnas, 0, 40);
        anchoColumna(columnas, 5, 70);
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

        //Se recupera una lista de categorias
        ArrayList<Categoria> ListaDeCategorias = Vista.getCD().listarCategorias();
        //Se recorre la lista y por cada categoria, se llama al metodo correspondiente para agregar la fila, enviando por parametro dicha categoria
        for (Categoria next : ListaDeCategorias) {

            cargarTabla(next);
        }
    }

    //Este metodo se encarga de recibir un categoria y desglosar su informacion en una fila para agregarla a la tabla de categorias
    private void cargarTabla(Categoria cat) {

        modelo.addRow(new Object[]{
            cat.getIdCategoria(),
            cat.getTipoCategoria(),
            cat.getCantDePersonas(),
            cat.getCantDeCamas(),
            cat.getTipoDeCamas(),
            cat.getPrecio()
        });
    }

    //Este metodo limpia los textfields y resetea los campos de estado y fecha
    private void limpiarInfo() {

        jTFID.setText("");
        jTFNombre.setText("");
        jTFPersonas.setText("");
        jCBCamas.setSelectedIndex(0);
        jTFCantCamas.setText("");
        jTFPrecio.setText("");
    }

    //Este metodo elimina todas las filas de la tabla
    private void limpiarTabla() {

        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {

            modelo.removeRow(i);
        }
    }

    //Este metodo muestra la informacion de una categoria
    private void mostrarInfo(int filaSelec) {

        //Recibe por parametro el numero de fila en la tabla, de este se obtiene el numero de id
        Categoria cat = obtenerCategoria(filaSelec);
        jTFID.setText(cat.getIdCategoria() + "");
        jTFNombre.setText(cat.getTipoCategoria());
        jTFPersonas.setText(cat.getCantDePersonas() + "");
        jCBCamas.setSelectedItem(cat.getTipoDeCamas());
        jTFCantCamas.setText(cat.getCantDeCamas() + "");
        jTFPrecio.setText(cat.getPrecio() + "");
    }

    //Este metodo carga el CB con los tipos de camas
    private void cargarCB() {

        int largo = TipoCama.values().length;
        for (int i = 1; i <= largo; i++) {
            jCBCamas.addItem(ValidarData.nombreCama(i));
        }
    }

    //Este metodo recibe un numero de fila y recupera una categoria de la base de datos
    private Categoria obtenerCategoria(int filaSelec) {

        int idC = (Integer) modelo.getValueAt(filaSelec, 0);
        Categoria cat = Vista.getCD().buscarCategoriaPorId(idC);
        return cat;
    }

    //Este metodo controla que los datos ingresados sean correctos
    private boolean validarDatos() {
        try {

            int cantidadPersonas = Integer.parseInt(jTFPersonas.getText());
            int cantidadCamas = Integer.parseInt(jTFCantCamas.getText());
            double precio = Double.parseDouble(jTFPrecio.getText());

            String nombre = jTFNombre.getText();

            //VALIDACION DE DATOS!
            //Se valida si el de nombre de la categoria no contiene caracteres especiales
            if (ValidarData.caracteresEspeciales(nombre)) {

                JOptionPane.showMessageDialog(this, "No se permiten caracteres especiales o números", "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
                return false;
            }

            //Se valida si el nombre de la categoria cumple con un largo determinado
            if (ValidarData.largoCadena(nombre)) {

                JOptionPane.showMessageDialog(this, "El nombre es incorrecto", "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
                return false;
            }

            //Se valida si la cantidad de personas es correcta
            if (cantidadPersonas < 1 || cantidadPersonas > 4) {

                JOptionPane.showMessageDialog(this, "La cantidad de personas debe ser entre 1 y 4", "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
                return false;
            }

            //Se valida si la cantidad de camas es correcta
            if (cantidadCamas < 1 || cantidadCamas > 4) {

                JOptionPane.showMessageDialog(this, "La cantidad de camas debe ser entre 1 y 4", "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
                return false;
            }

            //Se valida que el precio sea correcto
            if (precio <= 0) {

                JOptionPane.showMessageDialog(this, "El precio es incorrecto", "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
