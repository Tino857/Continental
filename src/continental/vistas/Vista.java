package continental.vistas;

import continental.accesoADatos.CategoriaData;
import continental.accesoADatos.HabitacionData;
import continental.accesoADatos.HuespedData;
import continental.accesoADatos.ReservaData;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author Grupo 61
 */
public class Vista extends javax.swing.JFrame {

    private static HuespedData HD;
    private static HabitacionData HabD;
    private static ReservaData RD;
    private static CategoriaData CD;

  
    
    public Vista() {
        
        initComponents();
        HD = new HuespedData();
        HabD = new HabitacionData();
        RD = new ReservaData();
        CD=new CategoriaData();
    }

    public static HuespedData getHD() {
        return HD;
    }

    public static HabitacionData getHabD() {
        return HabD;
    }

    public static ReservaData getRD() {
        return RD;
    }

  public static CategoriaData getCD() {
        return CD;
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/continental/imagenes/Background.png"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        logo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAlumnos = new javax.swing.JMenu();
        jMIFormularioDeAlumno = new javax.swing.JMenuItem();
        jMIEdicionDeAlumno = new javax.swing.JMenuItem();
        jMMaterias = new javax.swing.JMenu();
        jMIFormularioDeMateria = new javax.swing.JMenuItem();
        jMIEdicionDeMateria = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                escritorioComponentResized(evt);
            }
        });

        escritorio.setLayer(logo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(794, Short.MAX_VALUE)
                .addComponent(logo)
                .addContainerGap())
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(571, Short.MAX_VALUE)
                .addComponent(logo)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMAlumnos.setText("Huesped");

        jMIFormularioDeAlumno.setText("Gestion de Huesped");
        jMIFormularioDeAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFormularioDeAlumnoActionPerformed(evt);
            }
        });
        jMAlumnos.add(jMIFormularioDeAlumno);

        jMIEdicionDeAlumno.setText("Edicion de Huesped");
        jMIEdicionDeAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEdicionDeAlumnoActionPerformed(evt);
            }
        });
        jMAlumnos.add(jMIEdicionDeAlumno);

        jMenuBar1.add(jMAlumnos);

        jMMaterias.setText("Habitacion");

        jMIFormularioDeMateria.setText("Gestion de Habitacion");
        jMIFormularioDeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFormularioDeMateriaActionPerformed(evt);
            }
        });
        jMMaterias.add(jMIFormularioDeMateria);

        jMIEdicionDeMateria.setText("Remodelacion de Habitaciones");
        jMIEdicionDeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEdicionDeMateriaActionPerformed(evt);
            }
        });
        jMMaterias.add(jMIEdicionDeMateria);

        jMenuBar1.add(jMMaterias);

        jMSalir.setText("Salir");
        jMSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIFormularioDeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFormularioDeMateriaActionPerformed
        
//        GestionDeHabitacion GDH = new GestionDeHabitacion();
//        abrirVentana(GDH);
    }//GEN-LAST:event_jMIFormularioDeMateriaActionPerformed

    private void jMIEdicionDeAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEdicionDeAlumnoActionPerformed

        EdiciondeHuesped EDA = new EdiciondeHuesped();
        abrirVentana(EDA);
    }//GEN-LAST:event_jMIEdicionDeAlumnoActionPerformed

    private void jMIEdicionDeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEdicionDeMateriaActionPerformed

//        RemodelacionDeHabitacion EDH = new RemodelacionDeHabitacion();
//        abrirVentana(EDH);
    }//GEN-LAST:event_jMIEdicionDeMateriaActionPerformed

    private void jMIFormularioDeAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFormularioDeAlumnoActionPerformed

        GestionDeHuesped GDH = new GestionDeHuesped();
        abrirVentana(GDH);
    }//GEN-LAST:event_jMIFormularioDeAlumnoActionPerformed

    private void jMSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMSalirMouseClicked

        SalirView exit = new SalirView();
        abrirVentana(exit);
    }//GEN-LAST:event_jMSalirMouseClicked

    private void escritorioComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_escritorioComponentResized
        
        //Captura el evento de redimension de la ventana, quita el logo y lo vuelve a colocar en la esquina inferior izquierda
        escritorio.remove(logo);
        escritorio.repaint();
        colocarLogo();
    }//GEN-LAST:event_escritorioComponentResized

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMAlumnos;
    private javax.swing.JMenuItem jMIEdicionDeAlumno;
    private javax.swing.JMenuItem jMIEdicionDeMateria;
    private javax.swing.JMenuItem jMIFormularioDeAlumno;
    private javax.swing.JMenuItem jMIFormularioDeMateria;
    private javax.swing.JMenu jMMaterias;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables

    //Recibe un componente por parametro y realiza las tareas de remover las ventanas activas, repintar el fondo y colocar la ventana nueva
    private void abrirVentana(Component cpm){
        
        escritorio.removeAll();
        escritorio.repaint();
        cpm.setVisible(true);
        escritorio.add(cpm);
        colocarLogo();
        escritorio.moveToFront(cpm);
    }

    //Crea un label y coloca el logo de la ULP, y lo posiciona en la esquina inferior izquierda
    private void colocarLogo(){
        
        Icon icono = new ImageIcon(new ImageIcon(getClass().getResource("/continental/imagenes/LogoULP-w.png")).getImage());
        logo.setText("");
        logo.setSize(200,81);
        logo.setLocation(escritorio.getWidth()-220,escritorio.getHeight()-100);
        logo.setIcon(icono);
        escritorio.add(logo);
        escritorio.moveToFront(logo);
    }
}