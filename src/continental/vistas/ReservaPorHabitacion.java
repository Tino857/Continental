package continental.vistas;

import continental.accesoADatos.ValidarData;
import continental.entidades.Habitacion;
import continental.entidades.Reserva;
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
public class ReservaPorHabitacion extends javax.swing.JInternalFrame {

    private final DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {

            return false;
        }
    };

    public ReservaPorHabitacion() {

        initComponents();
        armarTabla();
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
        jBSalir = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTFNro = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLPCabecera = new javax.swing.JLayeredPane();
        jLMargen = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jLLogo = new javax.swing.JLabel();
        jBEliminar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(550, 500));

        jBSalir.setBackground(new java.awt.Color(45, 54, 60));
        jBSalir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/salir-w.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setIconTextGap(10);
        jBSalir.setPreferredSize(new java.awt.Dimension(110, 32));
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el numero de habitacion:");

        jTFNro.setBackground(new java.awt.Color(85, 94, 100));
        jTFNro.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTFNro.setForeground(new java.awt.Color(255, 255, 255));

        jBBuscar.setBackground(new java.awt.Color(45, 54, 60));
        jBBuscar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/buscar-w.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.setIconTextGap(10);
        jBBuscar.setPreferredSize(new java.awt.Dimension(110, 32));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLMargen.setPreferredSize(new java.awt.Dimension(63, 64));

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("RESERVA POR HABITACIÓN");

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

        jBEliminar.setBackground(new java.awt.Color(45, 54, 60));
        jBEliminar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/eliminar-w.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setIconTextGap(10);
        jBEliminar.setPreferredSize(new java.awt.Dimension(110, 32));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBackgroundLayout = new javax.swing.GroupLayout(jPBackground);
        jPBackground.setLayout(jPBackgroundLayout);
        jPBackgroundLayout.setHorizontalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addComponent(jLPCabecera)
                    .addGroup(jPBackgroundLayout.createSequentialGroup()
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPBackgroundLayout.setVerticalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addComponent(jLPCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    //BOTON BUSCAR
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        //Se controla que el campo numero no se encuentre vacio
        if (jTFNro.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "La casilla numero no puede estar vacía.", "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //Se controla que el campo numero no contenga caracteres especiales
        if (ValidarData.caracteresEspecialesNum(jTFNro.getText())) {

            JOptionPane.showMessageDialog(this, "La casilla numero no puede contener caracteres especiales.", "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {

            //Se intenta parsear el numero de habitacion
            int nro = Integer.parseInt(jTFNro.getText());

            //Se recupera la habitacion que posee ese número en la DB
            Habitacion hab = Vista.getHabD().buscarHabitacionPorNumero(nro);

            //Si la habitacion tiene valor nulo significa que no se encuentra en la DB
            //Se muestra el mensaje al usuario y se finaliza la ejecucion
            if (hab == null) {

                JOptionPane.showMessageDialog(this, "No existe la habitacion.", "", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Se llama al metodo encargado de cargar los datos en la tabla
            cargarDatos(hab);
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "La casilla DNI solo puede contener números.", "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "No existe la habitacion", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    //BOTON LIMPIAR
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed

        limpiarTabla();
        jTFNro.setText("");
    }//GEN-LAST:event_jBLimpiarActionPerformed

    //BOTON ELIMINAR
    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        try {

            //Se recupera de la tambla el numero de fila seleccionada
            int filaSelec = jTable1.getSelectedRow();

            //Si en la tabla hay solo una fila, se setea la fila seleccionada a 0
            if (jTable1.getRowCount() == 1) {

                filaSelec = 0;
            }
            
            //Si el valor de la fila seleccionada es -1, significa que no se seleccionó ninguna fila de la tabla
            if (filaSelec == -1) {

                JOptionPane.showMessageDialog(this, "Seleccione una reserva.", "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
                return;
            }

            //Se recupera la habitacion y la reserva de la DB
            
            Reserva res = Vista.getRD().buscarReservaPorId(Integer.parseInt((String) modelo.getValueAt(filaSelec, 0)));
            
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea eliminar la siguiente reserva?"
             + " \nTitular: " + res.getHuesped().getApellido() + ", " + res.getHuesped().getNombre()
                + " \nDNI: " + res.getHuesped().getDni()
                + " \nFecha de ingreso: " + res.getFi()
                + " \nFecha de salida: " + res.getFf()
                + " \nCantidad de personas: " + res.getCantDePersonas()
                + " \nNº de Habitación: " + res.getHabitacion().getNro() + " - Piso: " + res.getHabitacion().getPiso()
                + " \nTipo de habitacion: " + res.getHabitacion().getCategoria().getTipoCategoria()
                + " \nPrecio por noche: " + res.getHabitacion().getCategoria().getPrecio()
                + " \nCantidad de dias: " + res.getDias()
                + " \nTOTAL A PAGAR: " + res.getMonto(), "CONFIRMAR", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                
                int registro = Vista.getRD().eliminarReserva(res.getIdReserva());
                if (registro > 0) {
                    
                    JOptionPane.showMessageDialog(this, "Se eliminó la reserva.");
                    Habitacion hab=res.getHabitacion();
                    hab.setEstado(true);
                    Vista.getHabD().editarHabitacion(hab);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar la reserva.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
                        
            //Se llama al metodo encargado de cargar la tabla
            cargarDatos(res.getHabitacion());
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(this, "Ingrese datos validos.", "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "Ingrese datos validos.",  "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLMargen;
    private javax.swing.JLayeredPane jLPCabecera;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNro;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void armarTabla() {

        //Se agregan las columnas con su nombre correspondiente al modelo de tabla creado anteriormente
        modelo.addColumn("ID");
        modelo.addColumn("Nº de Hab");
        modelo.addColumn("Apellido");
        modelo.addColumn("Inicio");
        modelo.addColumn("Fin");
        modelo.addColumn("Dias");
        modelo.addColumn("Precio");
        modelo.addColumn("Estado");

        //Se setea el modelo de tabla a la tabla de reservas
        jTable1.setModel(modelo);

        //Se recupera el modelo de columnas
        TableColumnModel columnas = jTable1.getColumnModel();

        //Se llama al metodo que se encarga de setear el ancho de las columnas
        anchoColumna(columnas, 0, 40);
        anchoColumna(columnas, 1, 70);
        anchoColumna(columnas, 5, 50);
        anchoColumna(columnas, 7, 70);
    }

    //Este metodo setea el ancho de las columnas deseadas
    private void anchoColumna(TableColumnModel modeloTabla, int indice, int ancho) {

        modeloTabla.getColumn(indice).setWidth(ancho);
        modeloTabla.getColumn(indice).setMaxWidth(ancho + 30);
        modeloTabla.getColumn(indice).setMinWidth(ancho - 10);
        modeloTabla.getColumn(indice).setPreferredWidth(ancho);
    }

    //Este metodo se encarga de limpiar los datos de la tabla
    private void limpiarTabla() {

        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {

            modelo.removeRow(i);
        }
    }

    //Este metodo recibe una reserva y desglosa su informacion para agregarla a una fila de la tabla
    private void cargarTabla(Reserva res) {

        String estado = "Inactiva";
        if (res.isEstado()) {

            estado = "Activa";
        }

        modelo.addRow(new Object[]{
            
            Integer.toString(res.getIdReserva()),
            Integer.toString(res.getHabitacion().getNro()),
            res.getHuesped().getApellido(),
            res.getFi().toString(),
            res.getFf().toString(),
            Integer.toString(res.getDias()),
            Double.toString(res.getMonto()),
            estado
        });
    }

    //Este metodo recibe una habitacion y se encarga de cargar los datos de la tabla
    private void cargarDatos(Habitacion hab) {
        
        limpiarTabla();
        ArrayList<Reserva> reservas = Vista.getRD().listarReservas();
        for (Reserva reserva : reservas) {

            if (reserva.getHabitacion().getNro() == hab.getNro()) {

                cargarTabla(reserva);
            }
        }
    }
}
