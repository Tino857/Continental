package continental.vistas;

import continental.entidades.Habitacion;
import continental.entidades.Reserva;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Grupo 61
 */
public class ReservaPorFecha extends javax.swing.JInternalFrame {

    //Se crea el modelo que usaremos en la tabla, y se impide que se puedan modificar los valores de las celdas
    private final DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {

            return false;
        }
    };

    public ReservaPorFecha() {

        initComponents();
        armarTabla();
        jRBActivas.setSelected(true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLPCabecera = new javax.swing.JLayeredPane();
        jLMargen = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jLLogo = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jDCInicio = new com.toedter.calendar.JDateChooser();
        jDCFin = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBEliminar = new javax.swing.JButton();
        jRBActivas = new javax.swing.JRadioButton();
        jRBInactivas = new javax.swing.JRadioButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(550, 500));

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

        jLMargen.setPreferredSize(new java.awt.Dimension(63, 64));

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("RESERVA POR FECHA");

        jLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continental/imagenes/LogoSmall-w.png"))); // NOI18N

        jLPCabecera.setLayer(jLMargen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCabecera.setLayer(jLTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCabecera.setLayer(jLLogo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLPCabeceraLayout = new javax.swing.GroupLayout(jLPCabecera);
        jLPCabecera.setLayout(jLPCabeceraLayout);
        jLPCabeceraLayout.setHorizontalGroup(
            jLPCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMargen, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLLogo)
                .addContainerGap())
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

        jDCInicio.setBackground(new java.awt.Color(85, 94, 100));

        jDCFin.setBackground(new java.awt.Color(85, 94, 100));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese la fecha de inicio");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese la fecha de fin");

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

        buttonGroup1.add(jRBActivas);
        jRBActivas.setText("Activas");
        jRBActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBActivasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBInactivas);
        jRBInactivas.setText("Inactivas");
        jRBInactivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBInactivasActionPerformed(evt);
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
                        .addGap(180, 180, 180)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))
                    .addComponent(jLPCabecera)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBackgroundLayout.createSequentialGroup()
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPBackgroundLayout.createSequentialGroup()
                                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(jPBackgroundLayout.createSequentialGroup()
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRBActivas)
                            .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jDCInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDCFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRBInactivas)))))
        );
        jPBackgroundLayout.setVerticalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addComponent(jLPCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBActivas)
                    .addComponent(jRBInactivas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDCInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDCFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    //BOTON ELIMINAR
    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        try {
            //Se recupera de la tabla el numero de fila seleccionada
            int filaSelec = jTable1.getSelectedRow();
            //Si en la tabla hay solo una fila, se setea la fila seleccionada a 0
            if (jTable1.getRowCount() == 1) {

                filaSelec = 0;
            }
            //Si no hay ninguna fila seleccionada se termina con la ejecucion
            if (filaSelec == -1) {

                JOptionPane.showMessageDialog(this, "Seleccione una reserva", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                return;
            }

            //Se convierten las fechas a LocalDate y se recupera la reserva de la DB
            LocalDate fi = jDCInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate ff = jDCFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            Reserva res = Vista.getRD().buscarReservaPorId(Integer.parseInt((String) modelo.getValueAt(filaSelec, 0)));

            //Se crea una variable para almacenar la respuesta y se pide confirmacion al usuario
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
                    //Luego de eliminar la reserva la habitacion pasa a estar libre 
                    Habitacion hab = res.getHabitacion();
                    hab.setEstado(true);
                    Vista.getHabD().editarHabitacion(hab);
                } else {

                    JOptionPane.showMessageDialog(this, "No se pudo eliminar la reserva.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }

            //Se llama al metodo encargado de cargar la tabla
            cargarReservas(fi, ff);
        } catch (NumberFormatException | NullPointerException e) {

            JOptionPane.showMessageDialog(this, "Ingrese datos validos.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    //BOTON BUSCAR
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        //Se garantiza que ninguna de las fechas sea nula
        if (jDCInicio == null || jDCFin == null) {

            JOptionPane.showMessageDialog(this, "La casilla de las fechas debe recibir un dato valido.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            LocalDate fi = jDCInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate ff = jDCFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            //Se controla que la fecha de fin sea posterior a la fecha de inicio
            if (fi.isAfter(ff)) {

                JOptionPane.showMessageDialog(this, "La fecha de inicio debe ser anterior a la fecha de final", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                return;
            }
            //Se cargan las reservas
            cargarReservas(fi, ff);
        } catch (NumberFormatException | NullPointerException e) {

            JOptionPane.showMessageDialog(this, "Error de fecha", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    //BOTON LIMPIAR
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed

        //Llama al metodo encargado de limpiar la tabla, luego resetea los date chooser 
        limpiarTabla();
        jDCInicio.setDate(null);
        jDCFin.setDate(null);
    }//GEN-LAST:event_jBLimpiarActionPerformed

    //BOTON SALIR
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed

        //Cierra la ventana
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    //RADIO BUTTON ACTIVAS
    private void jRBActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBActivasActionPerformed

        //Llama al metodo que habilita el boton de eliminar, limpia la tabla y busca reservas
        mostrarBoton(true);
        limpiarTabla();
        buscar();
    }//GEN-LAST:event_jRBActivasActionPerformed

    //RADIO BUTTON INACTIVAS
    private void jRBInactivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBInactivasActionPerformed

        //Llama al metodo que habilita el boton de eliminar, en este caso para ocultarlo, limpia la tabla y busca reservas
        mostrarBoton(false);
        limpiarTabla();
        buscar();
    }//GEN-LAST:event_jRBInactivasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDCFin;
    private com.toedter.calendar.JDateChooser jDCInicio;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLMargen;
    private javax.swing.JLayeredPane jLPCabecera;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPBackground;
    private javax.swing.JRadioButton jRBActivas;
    private javax.swing.JRadioButton jRBInactivas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    //Este metodo permite setear un modelo de tabla personalizado
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

    //Este metodo se usa para setear el ancho de una columna
    //Recibe por parametro el modelo de columna de la tabla, el indice de la columna a modificar y el ancho deseado
    private void anchoColumna(TableColumnModel modeloTabla, int indice, int ancho) {

        modeloTabla.getColumn(indice).setWidth(ancho);
        modeloTabla.getColumn(indice).setMaxWidth(ancho + 30);
        modeloTabla.getColumn(indice).setMinWidth(ancho - 10);
        modeloTabla.getColumn(indice).setPreferredWidth(ancho);
    }

    //Este metodo se encarga de recibir una reserva y desglosar su informacion en una fila para agregarla a la tabla de reservas
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

    //Este metodo se encarga de limpiar los datos de la tabla
    private void limpiarTabla() {

        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {

            modelo.removeRow(i);
        }
    }

    //Este metodo recibe una fecha de inicio y de fin, y se encarga de cargar en la tabla las reservas que coincidan con ese periodo de tiempo
    private void cargarReservas(LocalDate fi, LocalDate ff) {

        limpiarTabla();
        if (jRBActivas.isSelected()) {

            ArrayList<Reserva> reservas = Vista.getRD().listarReservas();
            for (Reserva reserva : reservas) {

                if ((reserva.getFi().equals(fi) || reserva.getFi().isAfter(fi)) && (reserva.getFf().equals(ff) || reserva.getFf().isBefore(ff))) {

                    cargarTabla(reserva);
                }
            }
        } else if (jRBInactivas.isSelected()) {

            ArrayList<Reserva> reservas = Vista.getRD().listarReservasInactivas();
            for (Reserva reserva : reservas) {

                if ((reserva.getFi().equals(fi) || reserva.getFi().isAfter(fi)) && (reserva.getFf().equals(ff) || reserva.getFf().isBefore(ff))) {

                    cargarTabla(reserva);
                }
            }
        }
    }

    //Este metodo recibe un booleano y habilita o deshabilita el boton de eliminar, dependiendo del valor que reciba
    private void mostrarBoton(boolean valor) {

        jBEliminar.setEnabled(valor);
        jBEliminar.setVisible(valor);
    }

    private void buscar() {

        if (jDCInicio == null || jDCFin == null) {

            JOptionPane.showMessageDialog(this, "La casilla de las fechas debe recibir un dato valido.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            LocalDate fi = jDCInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate ff = jDCFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (fi.isAfter(ff)) {

                return;
            }
            cargarReservas(fi, ff);
        } catch (NumberFormatException | NullPointerException e) {
        }
    }
}
