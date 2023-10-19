/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continental.vistas;

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
 * @author valen
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

        jBEliminar = new javax.swing.JButton();
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
        jBEliminar2 = new javax.swing.JButton();

        jBEliminar.setText("Eliminar");

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(550, 500));

        jBSalir.setBackground(new java.awt.Color(51, 51, 51));
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setText("Limpiar");
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

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el numero de habitacion");

        jTFNro.setBackground(new java.awt.Color(102, 102, 102));

        jBBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(235, 235, 235));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("RESERVA POR HABITACION");

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

        jBEliminar2.setText("Eliminar");
        jBEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBackgroundLayout = new javax.swing.GroupLayout(jPBackground);
        jPBackground.setLayout(jPBackgroundLayout);
        jPBackgroundLayout.setHorizontalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addComponent(jLPCabecera)
                    .addGroup(jPBackgroundLayout.createSequentialGroup()
                        .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTFNro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscar))
                            .addGroup(jPBackgroundLayout.createSequentialGroup()
                                .addComponent(jBLimpiar)
                                .addGap(131, 131, 131)
                                .addComponent(jBEliminar2)
                                .addGap(158, 158, 158)
                                .addComponent(jBSalir)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPBackgroundLayout.setVerticalGroup(
            jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackgroundLayout.createSequentialGroup()
                .addComponent(jLPCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addGroup(jPBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar)
                    .addComponent(jBSalir)
                    .addComponent(jBEliminar2))
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

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        if (jTFNro.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "La casilla numero no debe estar vacia si desea buscar las reservas.");
            return;
        }

        try {

            //Se intenta parsear el dni
            int nro = Integer.parseInt(jTFNro.getText());

            //Se recupera el alumno que posee el dni en la DB
            Habitacion hab = Vista.getHabD().buscarHabitacionPorNumero(nro);

            //Si el alumno recibido tiene valor nulo significa que no se encuentra en la DB
            //Se muestra el mensaje al usuario y se finaliza la ejecucion
            if (hab == null) {

                JOptionPane.showMessageDialog(this, "No existe el huesped");
                return;
            }
            ArrayList<Reserva> reservas=Vista.getRD().listarReservas();
            for (Reserva reserva : reservas) {
                if (reserva.getHabitacion().getNro()==hab.getNro()) {
                    cargarTabla(reserva);
                }
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "En la casilla DNI debe ir solo numeros.");
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "No existe el alumno");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
      limpiarTabla();
      jTFNro.setText("");
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminar2ActionPerformed
        try{
            int filaSelec = jTable1.getSelectedRow();
            if (filaSelec==-1) {
                JOptionPane.showMessageDialog(this, "Seleccione una reserva");
                return;
            }
            if (jTable1.getRowCount() == 1) {

                filaSelec = 0;
            }
            //Se intenta parsear el dni
            int nro= Integer.parseInt(jTFNro.getText());

            //Se recupera el alumno que posee el dni en la DB
            Habitacion hab = Vista.getHabD().buscarHabitacionPorNumero(nro);
            Reserva res = Vista.getRD().buscarReservaPorId(Integer.parseInt((String) modelo.getValueAt(filaSelec, 0)));
            Vista.getRD().eliminarReserva(res.getIdReserva());
            limpiarTabla();
            ArrayList<Reserva> reservas=Vista.getRD().listarReservas();
            for (Reserva reserva : reservas) {

                if (reserva.getHabitacion().getNro()==hab.getNro()) {
                    cargarTabla(reserva);

                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingrese datos validos");
        }catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "Ingrese datos validos");
        }

    }//GEN-LAST:event_jBEliminar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBEliminar2;
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
        modelo.addColumn("Numero de Hab");
        modelo.addColumn("Apellido");
        modelo.addColumn("Fecha de Inicio");
        modelo.addColumn("Fecha de Fin");
        modelo.addColumn("Dias");
        modelo.addColumn("Precio Final");
         modelo.addColumn("Estado");

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

    

    private void limpiarTabla() {

        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {

            modelo.removeRow(i);
        }
    }

    private void cargarTabla(Reserva res) {
 String estado="Inactiva";
        if (res.isEstado()) {
            estado="Activa";
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
    }} 

