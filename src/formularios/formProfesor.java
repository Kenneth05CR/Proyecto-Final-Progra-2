package formularios;

import datos.UsuarioDato;
import datos.CursoDato;
import modelo.Usuario;
import modelo.Curso;
import javax.swing.JOptionPane;

public class formProfesor extends javax.swing.JFrame {

    private Usuario usuarioActual;

    // Constructor que recibe el usuario del login
    public formProfesor(Usuario usuarioLogueado) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuarioActual = usuarioLogueado;
        
        // esto pone los datos reales en el header en vez de las letras locas
        labelNombre.setText(usuarioActual.getNombre());
        labelRol.setText(usuarioActual.getRol());
    }

    // Constructor vacío por si acaso NetBeans lo pide.
    public formProfesor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInfo = new javax.swing.JPanel();
        labelEsdustream = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelRol = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        botonNotas = new javax.swing.JButton();
        botonCambiarContrasena = new javax.swing.JButton();
        botonInscribirUsuario = new javax.swing.JButton();
        botonFinalizarSesion = new javax.swing.JButton();
        panelContenedor = new javax.swing.JPanel();
        panelNotas = new javax.swing.JPanel();
        tablaInfoMateria = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelInfo.setBackground(new java.awt.Color(153, 153, 153));
        panelInfo.setPreferredSize(new java.awt.Dimension(887, 126));

        labelEsdustream.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelEsdustream.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEsdustream.setText("EduStream");

        labelNombre.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("ZXCVBNMAS ZXCVBNMASDFGHJK");

        labelRol.setFont(new java.awt.Font("Segoe UI", 3, 32)); // NOI18N
        labelRol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRol.setText("Profesor");

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEsdustream)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                        .addComponent(labelRol, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(labelEsdustream))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelRol)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        botonNotas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonNotas.setText("Cursos");
        botonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNotasActionPerformed(evt);
            }
        });

        botonCambiarContrasena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonCambiarContrasena.setText("Cambiar Contraseña");
        botonCambiarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarContrasenaActionPerformed(evt);
            }
        });

        botonInscribirUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonInscribirUsuario.setText("Inscribir usuario");
        botonInscribirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInscribirUsuarioActionPerformed(evt);
            }
        });

        botonFinalizarSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonFinalizarSesion.setText("Finalizar Sesion");
        botonFinalizarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCambiarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonInscribirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonFinalizarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(botonNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonInscribirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCambiarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonFinalizarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "CURSO", "ESTADO", "PROFESOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInfoMateria.setViewportView(jTable1);

        javax.swing.GroupLayout panelNotasLayout = new javax.swing.GroupLayout(panelNotas);
        panelNotas.setLayout(panelNotasLayout);
        panelNotasLayout.setHorizontalGroup(
            panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tablaInfoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNotasLayout.setVerticalGroup(
            panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablaInfoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNotasActionPerformed
        // TODO: mostrar cursos
        panelNotas.setVisible(true);
    }//GEN-LAST:event_botonNotasActionPerformed

    private void botonCambiarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarContrasenaActionPerformed
        // Pendiente de implementar
    }//GEN-LAST:event_botonCambiarContrasenaActionPerformed

    private void botonInscribirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInscribirUsuarioActionPerformed
        // TODO: ver si lo hacemos con modal o ventana nueva
    }//GEN-LAST:event_botonInscribirUsuarioActionPerformed

    private void botonFinalizarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarSesionActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres salir?", "Salir", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            formLogin login = new formLogin();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_botonFinalizarSesionActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCambiarContrasena;
    private javax.swing.JButton botonFinalizarSesion;
    private javax.swing.JButton botonInscribirUsuario;
    private javax.swing.JButton botonNotas;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelEsdustream;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRol;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelNotas;
    private javax.swing.JScrollPane tablaInfoMateria;
    // End of variables declaration//GEN-END:variables
}