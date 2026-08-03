package formularios;

import dao.UsuarioDAO;
import dao.CursoDAO;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;
import modelo.Curso;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formProfesor extends javax.swing.JFrame {

    private Usuario usuarioActual;

    public formProfesor(Usuario usuarioLogueado) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuarioActual = usuarioLogueado;
        
        labelNombre.setText(usuarioActual.getNombre());
        labelRol.setText(usuarioActual.getRol());
    }

    public formProfesor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelInfo = new javax.swing.JPanel();
        labelEsdustream = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelRol = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        botonMaterias = new javax.swing.JButton();
        botonCambiarContrasena = new javax.swing.JButton();
        botonInscribirEstudiante = new javax.swing.JButton();
        botonFinalizarSesion = new javax.swing.JButton();
        botonInscribirProfesor = new javax.swing.JButton();
        panelContenedor = new javax.swing.JPanel();
        panelMaterias = new javax.swing.JPanel();
        scrolInfoMateria = new javax.swing.JScrollPane();
        tablaInfoMateria = new javax.swing.JTable();
        Panel_InscribirEstudiante = new javax.swing.JPanel();
        scrolInscribirEstudiante = new javax.swing.JScrollPane();
        tablaInscribirEstudiante = new javax.swing.JTable();
        panel_InscribirProfesor = new javax.swing.JPanel();
        scroll_InscribirProfesor = new javax.swing.JScrollPane();
        tablaInscribirProfesor = new javax.swing.JTable();
        panelCambiarContrasena = new javax.swing.JPanel();
        labelPrimeraContrasena = new javax.swing.JLabel();
        textFieldNuevaContrasena = new javax.swing.JPasswordField();
        textFieldContrasenaNueva = new javax.swing.JPasswordField();
        labelConfirmeContrasena = new javax.swing.JLabel();
        botonConfirmarContrasena = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        Confirmar1 = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        botonMaterias.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botonMaterias.setText("Materias");
        botonMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMateriasActionPerformed(evt);
            }
        });

        botonCambiarContrasena.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botonCambiarContrasena.setText("Cambiar Contraseña");
        botonCambiarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarContrasenaActionPerformed(evt);
            }
        });

        botonInscribirEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botonInscribirEstudiante.setText("Inscribir Estudiante");
        botonInscribirEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInscribirEstudianteActionPerformed(evt);
            }
        });

        botonFinalizarSesion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botonFinalizarSesion.setText("Finalizar Sesion");
        botonFinalizarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarSesionActionPerformed(evt);
            }
        });

        botonInscribirProfesor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botonInscribirProfesor.setText("Inscribir Profesor");
        botonInscribirProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInscribirProfesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(botonInscribirEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(botonMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonFinalizarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCambiarContrasena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonInscribirProfesor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonInscribirEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonInscribirProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCambiarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonFinalizarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tablaInfoMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "CURSO", "PROFESOR"
            }
        ));
        scrolInfoMateria.setViewportView(tablaInfoMateria);

        javax.swing.GroupLayout panelMateriasLayout = new javax.swing.GroupLayout(panelMaterias);
        panelMaterias.setLayout(panelMateriasLayout);
        panelMateriasLayout.setHorizontalGroup(
            panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMateriasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrolInfoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMateriasLayout.setVerticalGroup(
            panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrolInfoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tablaInscribirEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Estudiante", "Correo", "Materia", "Fecha Inscripción"
            }
        ));
        scrolInscribirEstudiante.setViewportView(tablaInscribirEstudiante);

        javax.swing.GroupLayout Panel_InscribirEstudianteLayout = new javax.swing.GroupLayout(Panel_InscribirEstudiante);
        Panel_InscribirEstudiante.setLayout(Panel_InscribirEstudianteLayout);
        Panel_InscribirEstudianteLayout.setHorizontalGroup(
            Panel_InscribirEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InscribirEstudianteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(scrolInscribirEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        Panel_InscribirEstudianteLayout.setVerticalGroup(
            Panel_InscribirEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InscribirEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrolInscribirEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tablaInscribirProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre Profesor", "Correo", "Fecha Inscripción"
            }
        ));
        scroll_InscribirProfesor.setViewportView(tablaInscribirProfesor);

        javax.swing.GroupLayout panel_InscribirProfesorLayout = new javax.swing.GroupLayout(panel_InscribirProfesor);
        panel_InscribirProfesor.setLayout(panel_InscribirProfesorLayout);
        panel_InscribirProfesorLayout.setHorizontalGroup(
            panel_InscribirProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InscribirProfesorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(scroll_InscribirProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panel_InscribirProfesorLayout.setVerticalGroup(
            panel_InscribirProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InscribirProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_InscribirProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        labelPrimeraContrasena.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        labelPrimeraContrasena.setText("Nueva Contraseña");

        labelConfirmeContrasena.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        labelConfirmeContrasena.setText("Confirme Contraseña");

        botonConfirmarContrasena.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        botonConfirmarContrasena.setText("Confirmar Cambios");
        botonConfirmarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarContrasenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCambiarContrasenaLayout = new javax.swing.GroupLayout(panelCambiarContrasena);
        panelCambiarContrasena.setLayout(panelCambiarContrasenaLayout);
        panelCambiarContrasenaLayout.setHorizontalGroup(
            panelCambiarContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambiarContrasenaLayout.createSequentialGroup()
                .addGroup(panelCambiarContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCambiarContrasenaLayout.createSequentialGroup()
                        .addGroup(panelCambiarContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCambiarContrasenaLayout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(labelPrimeraContrasena))
                            .addGroup(panelCambiarContrasenaLayout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(labelConfirmeContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCambiarContrasenaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCambiarContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNuevaContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                            .addComponent(textFieldContrasenaNueva))))
                .addContainerGap())
            .addGroup(panelCambiarContrasenaLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(botonConfirmarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCambiarContrasenaLayout.setVerticalGroup(
            panelCambiarContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambiarContrasenaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPrimeraContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(labelConfirmeContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldContrasenaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonConfirmarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_InscribirEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_InscribirProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCambiarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_InscribirEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_InscribirProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelCambiarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(75, Short.MAX_VALUE)))
        );

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        Confirmar1.setText("Confirmar");
        Confirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirmar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addGap(73, 73, 73)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(264, 264, 264)
                    .addComponent(Confirmar1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addGap(483, 483, 483)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelContenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(521, Short.MAX_VALUE)
                    .addComponent(Confirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)))
        );

        pack();
    }// </editor-fold>                        

    private void botonCambiarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {                                                      
       panelMaterias.setVisible(false);
       Panel_InscribirEstudiante.setVisible(false);
       panel_InscribirProfesor.setVisible(false);
       panelCambiarContrasena.setVisible(true);
    }                                                     

    private void botonInscribirEstudianteActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        panelMaterias.setVisible(false);
        Panel_InscribirEstudiante.setVisible(true);
        panel_InscribirProfesor.setVisible(false);
        panelCambiarContrasena.setVisible(false);
        cargarTablaEstudiantes();
    }                                                        
    
    private void botonFinalizarSesionActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        formLogin lg = new formLogin();
        lg.setVisible(true);
        this.dispose();
    }                                                  

    private void botonMateriasActionPerformed(java.awt.event.ActionEvent evt) {                                              
        panelMaterias.setVisible(true);
        Panel_InscribirEstudiante.setVisible(false);
        panel_InscribirProfesor.setVisible(false);
        panelCambiarContrasena.setVisible(false);
    }                                             

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        textFieldNuevaContrasena.setText("");
        textFieldContrasenaNueva.setText("");
        JOptionPane.showMessageDialog(this, "Acción cancelada");
    }                                        

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        DefaultTableModel modelo = (DefaultTableModel) tablaInscribirProfesor.getModel();
        modelo.addRow(new Object[]{null, "", ""});
    }                                       

    private void Confirmar1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (tablaInscribirProfesor.isEditing()) {
            tablaInscribirProfesor.getCellEditor().stopCellEditing();
        }

        UsuarioDAO dao = new UsuarioDAO();
        DefaultTableModel modelo = (DefaultTableModel) tablaInscribirProfesor.getModel();

        boolean huboError = false;

        for (int i = 0; i < modelo.getRowCount(); i++) {
            Object idObj = modelo.getValueAt(i, 0);
            String nombre = (String) modelo.getValueAt(i, 1);
            String email = (String) modelo.getValueAt(i, 2); 

            if (nombre == null || nombre.trim().isEmpty()) {
                continue;
            }

            if (idObj == null) {
                Usuario u = new Usuario();
                u.setNombre(nombre);
                u.setEmail(email); 
                u.setPassword("12345");
                u.setRol("PROFESOR");
                boolean exito = dao.registrarProfesor(u);
                if (!exito) {
                    huboError = true;
                }
            } else {
                int id = Integer.parseInt(idObj.toString());
                Usuario u = new Usuario();
                u.setIdUsuario(id);
                u.setNombre(nombre);
                u.setEmail(email);
                u.setPassword("1234");
                u.setRol("PROFESOR");
                boolean exito = dao.modificarEstudiante(u);
                if (!exito) {
                    huboError = true;
                }
            }
        }

        
        if (huboError) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al guardar uno o más registros.");
        } else {
            JOptionPane.showMessageDialog(this, "Guardado con éxito");
        }
        cargarTablaProfesores();
    }            

    private void botonInscribirProfesorActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        panelMaterias.setVisible(false);
        Panel_InscribirEstudiante.setVisible(false);
        panel_InscribirProfesor.setVisible(true);
        panelCambiarContrasena.setVisible(false);
        cargarTablaProfesores();
    }                                                      

    private void cargarTablaProfesores() { // aqui imrpime los datos de los profesores
        UsuarioDAO dao = new UsuarioDAO();
        List<Usuario> lista = dao.listarProfesores();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre Profesor");
        modelo.addColumn("Correo");
        
        for (int i = 0; i < lista.size(); i++) {
            Usuario u = lista.get(i);
            modelo.addRow(new Object[]{u.getIdUsuario(), u.getNombre(), u.getEmail()});
        }
        tablaInscribirProfesor.setModel(modelo);
    }

    private void botonConfirmarContrasenaActionPerformed(java.awt.event.ActionEvent evt){      
        String contrasenaVieja = new String(textFieldNuevaContrasena.getPassword()).trim();
        String contrasenaNueva = new String(textFieldContrasenaNueva.getPassword()).trim();

        // aqui revisa que ningun campo esté vacío
        if (contrasenaVieja.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Porfavor no dejar espacios vacios");
            return;
        }

        if (contrasenaNueva.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Porfavor no dejar espacios vacios");
            return;
        }

        if (!contrasenaVieja.equals(usuarioActual.getPassword())) {
            JOptionPane.showMessageDialog(this, "La contraseña actual no es correcta.");
            return;
        }


        // Antes esta parte nunca se ejecutaba; el botón validaba pero no guardaba nada.
        UsuarioDAO profesor = new UsuarioDAO();
        boolean exito = profesor.actualizarPassword(usuarioActual.getIdUsuario(), contrasenaNueva);

        if (exito) {
            usuarioActual.setPassword(contrasenaNueva);
            JOptionPane.showMessageDialog(this, "Contraseña actualizada correctamente.");
            textFieldNuevaContrasena.setText("");
            textFieldContrasenaNueva.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar la contraseña. Intenta de nuevo.");
        }
    }                                                      

    private void cargarTablaEstudiantes() {
        UsuarioDAO dao = new UsuarioDAO();
        java.util.List<Usuario> lista = dao.listarEstudiantes();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Correo");
        
        for (int i = 0; i < lista.size(); i++) {
            Usuario u = lista.get(i);
            modelo.addRow(new Object[]{u.getIdUsuario(), u.getNombre(), u.getEmail(), u.getRol()});
        }
        tablaInscribirEstudiante.setModel(modelo);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(formProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Confirmar1;
    private javax.swing.JPanel Panel_InscribirEstudiante;
    private javax.swing.JButton agregar;
    private javax.swing.JButton botonCambiarContrasena;
    private javax.swing.JButton botonConfirmarContrasena;
    private javax.swing.JButton botonFinalizarSesion;
    private javax.swing.JButton botonInscribirEstudiante;
    private javax.swing.JButton botonInscribirProfesor;
    private javax.swing.JButton botonMaterias;
    private javax.swing.JLabel labelConfirmeContrasena;
    private javax.swing.JLabel labelEsdustream;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPrimeraContrasena;
    private javax.swing.JLabel labelRol;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCambiarContrasena;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelMaterias;
    private javax.swing.JPanel panel_InscribirProfesor;
    private javax.swing.JScrollPane scrolInfoMateria;
    private javax.swing.JScrollPane scrolInscribirEstudiante;
    private javax.swing.JScrollPane scroll_InscribirProfesor;
    private javax.swing.JTable tablaInfoMateria;
    private javax.swing.JTable tablaInscribirEstudiante;
    private javax.swing.JTable tablaInscribirProfesor;
    private javax.swing.JPasswordField textFieldContrasenaNueva;
    private javax.swing.JPasswordField textFieldNuevaContrasena;
    // End of variables declaration                   
}
