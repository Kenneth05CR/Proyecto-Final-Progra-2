// los botones asignados estaban vacios, asi que se agregaron algunas acciones y validaciones importantes.
//para validar el login y el usuario, si es estudiante o profesor.

package formularios;

// Importaciones necesarias para el Login
import datos.UsuarioDato; // unica clase autorizada para hablar con la bd
import modelo.Usuario;
import javax.swing.JOptionPane;

public class formLogin extends javax.swing.JFrame {

    //esto es solo para evitar errores, por favor, no borrar
    public formLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        edustreamLabel = new javax.swing.JLabel();
        inicioSesionLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        iniciarSesionButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        edustreamLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        edustreamLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edustreamLabel.setText("EDUSTREAM");

        inicioSesionLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        inicioSesionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicioSesionLabel.setText("--------INICIO DE SESION--------");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("Email");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        passwordLabel.setText("Password");

        emailTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        passwordTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        iniciarSesionButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        iniciarSesionButton.setText("Iniciar Sesion");
        iniciarSesionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionButtonActionPerformed(evt);
            }
        });

        salirButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        salirButton.setText("Salir"); // NOI18N
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(edustreamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(inicioSesionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(iniciarSesionButton)
                                                                .addGap(103, 103, 103)
                                                                .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(edustreamLabel)
                                .addGap(18, 18, 18)
                                .addComponent(inicioSesionLabel)
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailLabel)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordTextField))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(iniciarSesionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Asegurandonos que el usuario efectivamente desea salir del programa
        int opcion = JOptionPane.showConfirmDialog(this, "¿Deseas salir del programa?", "", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void iniciarSesionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String emailTexto = emailTextField.getText().trim();
        String passwordTexto = new String(passwordTextField.getPassword()).trim();

        // Validaciones básicas de campos vacíos
        if (emailTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No ingresaste texto en el campo de usuario");
            return;
        } else if (passwordTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No ingresaste texto en el campo de la contraseña");
            return;
        }

        
        // llamada a la clase datos.
        UsuarioDato user = new UsuarioDato();
        Usuario usuarioLogueado = user.validarAcceso(emailTexto, passwordTexto);

        // evaluamos la respuesta de datos
        if (usuarioLogueado != null) {
            JOptionPane.showMessageDialog(this, "¡Bienvenido, " + usuarioLogueado.getNombre() + "!");

            // Redireccionamos según el rol del usuario (Si es profesor o estudiante)
            if (usuarioLogueado.getRol().equalsIgnoreCase("ESTUDIANTE")) {
                formEstudiante ventanaEstudiante = new formEstudiante(usuarioLogueado);
                ventanaEstudiante.setVisible(true);
            } else if (usuarioLogueado.getRol().equalsIgnoreCase("PROFESOR")) {
                formProfesor ventanaProfesor = new formProfesor(usuarioLogueado);
                ventanaProfesor.setVisible(true);
            }

            // Cerramos la ventana de login actual
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos.");
        }
    }//GEN-LAST:event_iniciarSesionButtonActionPerformed

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
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel edustreamLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton iniciarSesionButton;
    private javax.swing.JLabel inicioSesionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables
}
