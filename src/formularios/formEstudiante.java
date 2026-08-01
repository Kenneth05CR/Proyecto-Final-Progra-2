package formularios;

// Importaciones para que el estudiante pueda ver sus datos y cambiar su clave
import datos.UsuarioDato;
import modelo.Usuario;
import javax.swing.JOptionPane;

public class formEstudiante extends javax.swing.JFrame {

    // Variable global para almacenar al estudiante logueado
    private Usuario usuarioActual;

    // // Constructor vacío otra vez por si acaso.
    public formEstudiante() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // recibe al Usuario que viene del login
    public formEstudiante(Usuario usuarioLogueado) {
        initComponents();
        this.setLocationRelativeTo(null);

        // Guarda los datos del estudiante
        this.usuarioActual = usuarioLogueado;
        labelNombre.setText(usuarioActual.getNombre());
        labelRol.setText(usuarioActual.getRol());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelnfo = new javax.swing.JPanel();
        labelEsdustream = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelRol = new javax.swing.JLabel();
        botonNotas = new javax.swing.JButton();
        botonCambiarContrasena = new javax.swing.JButton();
        botonFinalSesion = new javax.swing.JButton();
        panelContenedor = new javax.swing.JPanel();
        panelContrasena = new javax.swing.JPanel();
        labelPrimeraContrasena = new javax.swing.JLabel();
        textFieldNuevaContrasena = new javax.swing.JPasswordField();
        botonConfirmarContrasena = new javax.swing.JButton();
        labelConfirmeContrasena = new javax.swing.JLabel();
        textFieldContrasenaNueva = new javax.swing.JPasswordField();
        panelNotas = new javax.swing.JPanel();
        tablaInfoMateria = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelnfo.setBackground(new java.awt.Color(153, 153, 153));

        labelEsdustream.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelEsdustream.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEsdustream.setText("EduStream");

        labelNombre.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("ZXCVBNMAS ZXCVBNMASDFGHJK");

        labelRol.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        labelRol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRol.setText("ESTUDIANTE");

        javax.swing.GroupLayout panelnfoLayout = new javax.swing.GroupLayout(panelnfo);
        panelnfo.setLayout(panelnfoLayout);
        panelnfoLayout.setHorizontalGroup(
            panelnfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEsdustream)
                .addGroup(panelnfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelnfoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelnfoLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(labelRol, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelnfoLayout.setVerticalGroup(
            panelnfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnfoLayout.createSequentialGroup()
                .addGroup(panelnfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelnfoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(labelEsdustream))
                    .addGroup(panelnfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelRol)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        botonNotas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botonNotas.setText("Mis Notas");
        botonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNotasActionPerformed(evt);
            }
        });

        botonCambiarContrasena.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botonCambiarContrasena.setText("Cambiar Contraseña");
        botonCambiarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarContrasenaActionPerformed(evt);
            }
        });

        botonFinalSesion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botonFinalSesion.setText("Finalizar Sesion");
        botonFinalSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalSesionActionPerformed(evt);
            }
        });

        labelPrimeraContrasena.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        labelPrimeraContrasena.setText("Nueva Contraseña");

        textFieldNuevaContrasena.setText("jPasswordField1");
        textFieldNuevaContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNuevaContrasenaActionPerformed(evt);
            }
        });

        botonConfirmarContrasena.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        botonConfirmarContrasena.setText("Confirmar Cambios");
        botonConfirmarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarContrasenaActionPerformed(evt);
            }
        });

        labelConfirmeContrasena.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        labelConfirmeContrasena.setText("Confirme Contraseña");

        textFieldContrasenaNueva.setText("jPasswordField1");
        textFieldContrasenaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldContrasenaNuevaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContrasenaLayout = new javax.swing.GroupLayout(panelContrasena);
        panelContrasena.setLayout(panelContrasenaLayout);
        panelContrasenaLayout.setHorizontalGroup(
            panelContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContrasenaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNuevaContrasena, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldContrasenaNueva))
                .addContainerGap())
            .addGroup(panelContrasenaLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(labelPrimeraContrasena)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContrasenaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContrasenaLayout.createSequentialGroup()
                        .addComponent(labelConfirmeContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContrasenaLayout.createSequentialGroup()
                        .addComponent(botonConfirmarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))))
        );
        panelContrasenaLayout.setVerticalGroup(
            panelContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContrasenaLayout.createSequentialGroup()
                .addComponent(labelPrimeraContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(textFieldNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(labelConfirmeContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldContrasenaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botonConfirmarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "CURSO", "NOTA", "ESTADO", "PROFESOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNotasLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(tablaInfoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelNotasLayout.setVerticalGroup(
            panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNotasLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(tablaInfoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(panelContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(9, 9, 9)))
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addComponent(panelNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(panelContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelnfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCambiarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonFinalSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelnfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(botonCambiarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(botonFinalSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonFinalSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalSesionActionPerformed
        // cerrar sesion
        int opcion = JOptionPane.showConfirmDialog(this, "¿Deseas salir del programa?", "", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            formLogin login = new formLogin();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_botonFinalSesionActionPerformed

    private void botonNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNotasActionPerformed
        panelNotas.setVisible(true);
        panelContrasena.setVisible(false);
    }//GEN-LAST:event_botonNotasActionPerformed

    private void botonCambiarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarContrasenaActionPerformed
        panelNotas.setVisible(false);
        panelContrasena.setVisible(true);
    }//GEN-LAST:event_botonCambiarContrasenaActionPerformed

    private void botonConfirmarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        
        String contrasenaVieja = new String(textFieldNuevaContrasena.getPassword()).trim();
        String contrasenaNueva = new String(textFieldContrasenaNueva.getPassword()).trim();

        // aqui revisa que ningun campo esté vacío
        if (contrasenaVieja.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No ingresaste tu contraseña actual.");
            return;
        }

        if (contrasenaNueva.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No ingresaste tu nueva contraseña.");
            return;
        }

        if (!contrasenaVieja.equals(usuarioActual.getPassword())) {
            JOptionPane.showMessageDialog(this, "La contraseña actual no es correcta.");
            return;
        }


        // Antes esta parte nunca se ejecutaba; el botón validaba pero no guardaba nada.
        UsuarioDato estudiante = new UsuarioDato();
        boolean exito = estudiante.actualizarPassword(usuarioActual.getIdUsuario(), contrasenaNueva);

        if (exito) {
            usuarioActual.setPassword(contrasenaNueva);
            JOptionPane.showMessageDialog(this, "Contraseña actualizada correctamente.");
            textFieldNuevaContrasena.setText("");
            textFieldContrasenaNueva.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar la contraseña. Intenta de nuevo.");
        }
    }                                                        

    private void textFieldNuevaContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNuevaContrasenaActionPerformed
    }//GEN-LAST:event_textFieldNuevaContrasenaActionPerformed

    private void textFieldContrasenaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldContrasenaNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldContrasenaNuevaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCambiarContrasena;
    private javax.swing.JButton botonConfirmarContrasena;
    private javax.swing.JButton botonFinalSesion;
    private javax.swing.JButton botonNotas;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelConfirmeContrasena;
    private javax.swing.JLabel labelEsdustream;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPrimeraContrasena;
    private javax.swing.JLabel labelRol;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelContrasena;
    private javax.swing.JPanel panelNotas;
    private javax.swing.JPanel panelnfo;
    private javax.swing.JScrollPane tablaInfoMateria;
    private javax.swing.JPasswordField textFieldContrasenaNueva;
    private javax.swing.JPasswordField textFieldNuevaContrasena;
    // End of variables declaration//GEN-END:variables
}
