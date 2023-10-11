/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continental.vistas;

import continental.accesoADatos.ValidarData;
import continental.entidades.Categoria;
import continental.entidades.Habitacion;
import continental.entidades.Huesped;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author valen
 */
public class RemodelacionDeHabitacion extends javax.swing.JInternalFrame {
 private  Map<Integer,Categoria> listaDeHab=new HashMap();
    private final DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {

            return false;
        }
    };
    public RemodelacionDeHabitacion() {
       initComponents();
        armarTabla();
        cargarDatos();
        cargarCB();
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
        JBEditar = new javax.swing.JButton();
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
        jTFCodigo = new javax.swing.JTextField();
        jTFNumero = new javax.swing.JTextField();
        jTFPiso = new javax.swing.JTextField();
        jLID = new javax.swing.JLabel();
        jLNumero = new javax.swing.JLabel();
        jLPsio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCBCategorias = new javax.swing.JComboBox<>();

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
        JTFBuscador.setText("Ingrese el Numero de Habitacion para filtrar la tabla...");
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

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(235, 235, 235));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("REMODELACION DE HABIACIONES");

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

        jTFCodigo.setEditable(false);
        jTFCodigo.setBackground(new java.awt.Color(102, 102, 102));
        jTFCodigo.setForeground(new java.awt.Color(255, 255, 255));

        jTFNumero.setBackground(new java.awt.Color(102, 102, 102));
        jTFNumero.setForeground(new java.awt.Color(255, 255, 255));

        jTFPiso.setBackground(new java.awt.Color(102, 102, 102));
        jTFPiso.setForeground(new java.awt.Color(255, 255, 255));

        jLID.setForeground(new java.awt.Color(235, 235, 235));
        jLID.setText("Codigo");

        jLNumero.setForeground(new java.awt.Color(235, 235, 235));
        jLNumero.setText("Numero");

        jLPsio.setForeground(new java.awt.Color(235, 235, 235));
        jLPsio.setText("Piso");

        jLabel6.setForeground(new java.awt.Color(235, 235, 235));
        jLabel6.setText("Categoria");

        jCBCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCategoriasActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jTFCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFPiso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLPsio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jCBCategorias, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLID)
                    .addComponent(jLNumero)
                    .addComponent(jLPsio)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNumero)
                            .addComponent(jTFPiso)
                            .addComponent(jTFCodigo))
                        .addGap(23, 23, 23))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jCBCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPsio)
                    .addComponent(jTFPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPBackgroundLayout = new javax.swing.GroupLayout(jPBackground);
        jPBackground.setLayout(jPBackgroundLayout);
        jPBackgroundLayout.setHorizontalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPCabecera)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed

        //Se controla que no hayan campos vacios
        if (jTFPiso.getText().isEmpty() || jTFNumero.getText().isEmpty() || jTFCodigo.getText().isEmpty()||jCBCategorias.getSelectedIndex()==0 ) {

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
            int numero=Integer.parseInt(jTFNumero.getText());
            int piso = Integer.parseInt(jTFPiso.getText());
            if (ValidarData.validarNumero(numero)) {

                JOptionPane.showMessageDialog(this, "En la casilla numero debe ir un dato valido");
                return;
            }
            if (ValidarData.validarPiso(piso)) {

                JOptionPane.showMessageDialog(this, "En la casilla piso debe ir un dato valido");
                return;
            }

           
          

          
           
               Habitacion hab = Vista.getHabD().buscarHabitacionPorNumero(Integer.parseInt((String) modelo.getValueAt(filaSelec, 1)));

                //Seteamos a la habitacioncon la informacion nueva
                hab.setNro(numero);
                hab.setPiso(piso);
                hab.setCategoria((Categoria)jCBCategorias.getSelectedItem());
               

                //Se crea una variable tipo entero y se usa para almacenar el registro de la ejecucion del metodo editarAlumno
                int registro = Vista.getHabD().editarHabitacion(hab);

                //Dependiendo del valor que tome la variable registro se muestra un mensaje al usuario
                if (registro > 0) {

                    JOptionPane.showMessageDialog(this, "Datos actualizados");
                } else {

                    JOptionPane.showMessageDialog(this, "No se pudo actualizar los datos. \nEl numero está en uso", "", JOptionPane.ERROR_MESSAGE);
                }

                //Se limpia la tabla y se vuelven a cargar los datos de los alumnos
                limpiarTabla();
                cargarDatos();
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(this, "En la casilla de numero o piso solo deben ir numeros", "", JOptionPane.WARNING_MESSAGE);
            }
            //Se limpian los textfields
            limpiarInfo();
    }//GEN-LAST:event_JBEditarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed

        //Cierra la ventana
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        //Se captura el evento de click en una fila de la tabla y se recupera el indice de la misma
        int filaSelec = jTable1.getSelectedRow();

        mostrarInfo(filaSelec);
    }//GEN-LAST:event_jTable1MouseClicked

    private void JTFBuscadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFBuscadorFocusGained

        if (JTFBuscador.getText().equals("Ingrese el Numero de Habitacion para filtrar la tabla...")) {

            JTFBuscador.setText("");
        }
        JTFBuscador.setForeground(Color.WHITE);
    }//GEN-LAST:event_JTFBuscadorFocusGained

    private void JTFBuscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFBuscadorFocusLost

        if (JTFBuscador.getText().equals("")) {

            JTFBuscador.setText("Ingrese el Numero de Habitacion para filtrar la tabla...");
        }
        JTFBuscador.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_JTFBuscadorFocusLost

    private void JTFBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFBuscadorKeyReleased

        limpiarTabla();
        ArrayList<Habitacion> ListaDeHabitaciones=Vista.getHabD().listarHabitaciones();
        
        for (Habitacion h : ListaDeHabitaciones) {

            if ((h.getNro()+ "").startsWith(JTFBuscador.getText())) {

                cargarTabla(h);
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

    private void jCBCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCategoriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEditar;
    private javax.swing.JTextField JTFBuscador;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Categoria> jCBCategorias;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLMargen;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLayeredPane jLPCabecera;
    private javax.swing.JLabel jLPsio;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPBackground;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFPiso;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
 //Este metodo permite setear un modelo de tabla personalizado
    private void armarTabla() {

        //Se agregan las columnas con su nombre correspondiente al modelo de tabla creado anteriormente
        modelo.addColumn("ID");
        modelo.addColumn("Numero");
        modelo.addColumn("Piso");
        modelo.addColumn("Categoria");

        //Se setea el modelo de tabla a la tabla de alumnos
        jTable1.setModel(modelo);

        //Se recupera el modelo de columnas
        TableColumnModel columnas = jTable1.getColumnModel();

        //Se llama al metodo que se encarga de setear el ancho de las columnas
        anchoColumna(columnas, 0, 40);
        anchoColumna(columnas, 1, 80);
    }
 private void anchoColumna(TableColumnModel modeloTabla, int indice, int ancho) {

        modeloTabla.getColumn(indice).setWidth(ancho);
        modeloTabla.getColumn(indice).setMaxWidth(ancho + 30);
        modeloTabla.getColumn(indice).setMinWidth(ancho - 10);
        modeloTabla.getColumn(indice).setPreferredWidth(ancho);
    }
 private void cargarDatos() {
 
            //Se recupera una lista de alumnos
            ArrayList<Habitacion> ListaDeHabitaciones = Vista.getHabD().listarHabitaciones();
            for (Habitacion next : ListaDeHabitaciones) {
                cargarTabla(next);
            }
        

}
 
 private void cargarTabla(Habitacion hab) {

        modelo.addRow(new Object[]{
             Integer.toString(hab.getIdHabitacion()),
            Integer.toString(hab.getNro()),
            Integer.toString(hab.getPiso()),
           hab.getCategoria().getTipoCategoria()
           
        });
    }
   private void mostrarInfo(int filaSelec){
        //Se obtienen los datos del alumno almacenado en la fila seleccionada
        int numero = Integer.parseInt(modelo.getValueAt(filaSelec, 1).toString());
        Habitacion hab = Vista.getHabD().buscarHabitacionPorNumero(numero);
       jTFCodigo.setText(hab.getIdHabitacion()+"");
        jTFNumero.setText(numero+"");
        jTFPiso.setText(hab.getPiso()+"");
       for (Map.Entry<Integer, Categoria> entry : listaDeHab.entrySet()) {
                Integer key = entry.getKey();
                Categoria value = entry.getValue();
                       if (hab.getCategoria().getIdCategoria()==value.getIdCategoria()) {
                           jCBCategorias.setSelectedIndex(key);
                       }
            } 
        
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
       int i=0;
        for (Categoria categoria : Lista) {
            listaDeHab.put(i+1, categoria);
            i++;
        }
        //Se recorre la lista y cada alumno se agrega al CB
        for (Categoria cat : Lista) {
            jCBCategorias.addItem(cat);
        }
    }
     //Este metodo elimina todas las filas de la tabla
    private void limpiarTabla() {

        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            
            modelo.removeRow(i);
        }
    }
 private void limpiarInfo() {
        jTFCodigo.setText("");
        jTFNumero.setText("");
        jTFPiso.setText("");
        jCBCategorias.setSelectedIndex(0);
    }
}
