/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.teacher.views;

import java.awt.*;
import quiz.teacher.*;
import javax.swing.*;

/**
 *
 * @author Byron Keyko Gabriel
 */
public class TeacherCRUD extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    public TeacherCRUD() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("portafolioIcon.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t5 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jt4 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jr5 = new javax.swing.JRadioButton();
        jr6 = new javax.swing.JRadioButton();
        jp = new javax.swing.JPanel();
        jc1 = new javax.swing.JCheckBox();
        jc2 = new javax.swing.JCheckBox();
        jc3 = new javax.swing.JCheckBox();
        jc4 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        f1 = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Profesores");

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setText("Id:");

        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setText("Nombres:");

        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel4.setText("Apellidos:");

        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel5.setText("Registro:");

        jt4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        jt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel6.setText("Genero:");

        t5.add(jr5);
        jr5.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jr5.setText("Hombre");

        t5.add(jr6);
        jr6.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jr6.setText("Mujer");

        jp.setBorder(javax.swing.BorderFactory.createTitledBorder("Idiomas"));

        jc1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jc1.setText("Ingles");

        jc2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jc2.setText("Frances");

        jc3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jc3.setText("Italiano");

        jc4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jc4.setText("Mandarin");

        javax.swing.GroupLayout jpLayout = new javax.swing.GroupLayout(jp);
        jp.setLayout(jpLayout);
        jpLayout.setHorizontalGroup(
            jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jc1)
                    .addComponent(jc3))
                .addGap(22, 22, 22)
                .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jc2)
                    .addComponent(jc4))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jpLayout.setVerticalGroup(
            jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc1)
                    .addComponent(jc2))
                .addGap(18, 18, 18)
                .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc3)
                    .addComponent(jc4))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel7.setText("Edad:");

        f1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                f1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t1)
                            .addComponent(t2)
                            .addComponent(t3)
                            .addComponent(jt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jr5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jr6))
                            .addComponent(f1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jr5)
                    .addComponent(jr6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );

        btnagregar.setBackground(new java.awt.Color(0, 0, 0));
        btnagregar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Listar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(0, 0, 0));
        btneliminar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel1.setText("Registro De Profesores 2020");

        jMenu1.setText("Ayuda");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Acerca de...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btneliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnagregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(jButton2)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btneliminar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        if (!validVacios()) {
            int id = Integer.parseInt(t1.getText());
            String Nombres = t2.getText();
            String Apellidos = t3.getText();
            int edad = Integer.parseInt(f1.getText());
            int registro = jt4.getSelectedIndex();
            String genero;
            String dis = "";
            if (jr5.isSelected()) {
                genero = "Masculino";
            } else {
                genero = "Femenino";
            }
            if (jc1.isSelected()) {
                dis += jc1.getText() + ",";
            }
            if (jc2.isSelected()) {
                dis += jc2.getText() + ",";
            }
            if (jc3.isSelected()) {
                dis += jc3.getText() + ",";
            }
            if (jc4.isSelected()) {
                dis += jc4.getText() + ",";
            }
            Datos DtoTeac = new Datos(id, Nombres, Apellidos, edad, registro, genero, dis);
            Crud_Teacher d = new Crud_Teacher();
            String mensaje = d.GuardarNuevo(DtoTeac);
            JOptionPane.showMessageDialog(this, mensaje);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Datos incompletos");
            limpiar();
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Listado op = new Listado();
        Crud_Teacher ip = new Crud_Teacher();
        op.cargardatos(ip.getLista());
        op.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID:"));
        try {
            limpiar();
            Crud_Teacher crudPer = new Crud_Teacher();
            Datos p = crudPer.BuscarxCodigo(id);
            if (p.getNombres() == null) {
                JOptionPane.showMessageDialog(this, "Registro no encontrado....");
                return;
            }
            t1.setText(String.valueOf(p.getId()));
            t2.setText(p.getNombres());
            t3.setText(p.getApellidos());
            f1.setText(String.valueOf(p.getEdad()));
            jt4.setSelectedIndex(p.getRegistro());

            if (p.getGenero().equals("Masculino")) {
                jr5.setSelected(true);
            } else {
                jr6.setSelected(true);
            }

            String tipo[] = p.getIdioma().split(",");
            for (int i = 0; i < tipo.length; i++) {
                System.out.println(tipo[i]);
                if (tipo[i].equals("Ingles")) {
                    jc1.setSelected(true);
                }
                if (tipo[i].equals("Frances")) {
                    jc2.setSelected(true);
                }
                if (tipo[i].equals("Italiano")) {
                    jc3.setSelected(true);
                }
                if (tipo[i].equals("Mandarin")) {
                    jc4.setSelected(true);
                }
            }
            btnActualizar.setEnabled(true);
            JOptionPane.showMessageDialog(this, "Ya puede modificar el registro que busco");
            t1.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Registro no encontrado....");
            limpiar();
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (!validVacios()) {
            int id = Integer.parseInt(t1.getText());
            String Nombres = t2.getText();
            String Apellidos = t3.getText();
            int edad = Integer.parseInt(f1.getText());
            int registro = jt4.getSelectedIndex();
            String genero;
            String dis = "";

            if (jr5.isSelected()) {
                genero = "Masculino";
            } else {
                genero = "Femenino";
            }

            if (jc1.isSelected()) {
                dis += jc1.getText() + ",";
            }
            if (jc2.isSelected()) {
                dis += jc2.getText() + ",";
            }
            if (jc3.isSelected()) {
                dis += jc3.getText() + ",";
            }
            if (jc4.isSelected()) {
                dis += jc4.getText() + ",";
            }
            Datos DtoTeac = new Datos(id, Nombres, Apellidos, edad, registro, genero, dis);
            Crud_Teacher d = new Crud_Teacher();
            String mensaje = d.Actualizar(DtoTeac);
            btnActualizar.setEnabled(false);
            JOptionPane.showMessageDialog(this, mensaje);
            JOptionPane.showMessageDialog(this, "Si desea actualizar otro registro debe buscarlo primero.");
            t1.setEnabled(true);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Datos incompletos");
            limpiar();
        }
        

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt4ActionPerformed

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyTyped
        char validar = evt.getKeyChar();
        int c = evt.getKeyChar();
        if (Character.isDigit(validar) && (!((c > 65 && c <= 98) || (c >= 97 && c <= 22)))) {
            getToolkit().beep();
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras");
        }
        System.out.println(c);
    }//GEN-LAST:event_t2KeyTyped

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyTyped
        char validar = evt.getKeyChar();
        int c = evt.getKeyChar();
        if (Character.isDigit(validar) && (!((c > 65 && c <= 98) || (c >= 97 && c <= 22)))) {
            getToolkit().beep();
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras");
        }
        System.out.println(c);
    }//GEN-LAST:event_t3KeyTyped

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_t1KeyTyped

    private void f1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f1KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_f1KeyTyped

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        Crud_Teacher crudPer = new Crud_Teacher();
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el ID del registro a eliminar."));
        int confirm = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar el registro?");
        if (confirm == 0) {
            JOptionPane.showMessageDialog(this, crudPer.Eliminarxcodigo(codigo));
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(this, "Este es una aplicacion para hacer \n"
                + "el registro de profesor y guardar\n"
                + "sus datos en una base de datos");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    void limpiar() {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        f1.setText("");
        jt4.setSelectedIndex(0);
        jr5.setSelected(false);
        jr6.setSelected(false);
        jc1.setSelected(false);
        jc2.setSelected(false);
        jc3.setSelected(false);
        jc4.setSelected(false);

    }
    private boolean validVacios() {
        boolean vacios = false;
        if (t1.getText().equals("")) {
            vacios = true;
        } else if (t2.getText().equals("")) {
            vacios = true;
        } else if (t3.getText().equals("")) {
            vacios = true;
        } else if (jt4.getSelectedIndex() == 0) {
            vacios = true;
        } else if (!jr5.isSelected() && !jr6.isSelected()) {
            vacios = true;
        } else if (!jc1.isSelected() && !jc2.isSelected() && !jc3.isSelected() && !jc4.isSelected()) {
            vacios = true;
        }        
        return vacios;
    }
    private boolean validaVacios1() {
        boolean vacio = false;
        if (t1.getText().isEmpty()) {
            vacio = true;
        } else if (t2.getText().isEmpty()) {
            vacio = true;
        } else if (t3.getText().isEmpty()) {
            vacio = true;
        } else if (t5.equals(0)) {
            vacio = true;
        } else if (jt4.getSelectedIndex() == 0) {
            vacio = true;
        }
        return vacio;
    }

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
            java.util.logging.Logger.getLogger(TeacherCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JTextField f1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jc1;
    private javax.swing.JCheckBox jc2;
    private javax.swing.JCheckBox jc3;
    private javax.swing.JCheckBox jc4;
    private javax.swing.JPanel jp;
    private javax.swing.JRadioButton jr5;
    private javax.swing.JRadioButton jr6;
    private javax.swing.JComboBox<String> jt4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.ButtonGroup t5;
    // End of variables declaration//GEN-END:variables
}
