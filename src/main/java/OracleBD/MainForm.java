/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OracleBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.TitledBorder;

/**
 *
 * @author alumno
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
	initComponents();
	crearConexionBD();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTab = new javax.swing.JTabbedPane();
        tabPrincipal = new javax.swing.JPanel();
        panelGestionDiaria = new javax.swing.JPanel();
        botonGesDepart = new javax.swing.JButton();
        botonGesEmple = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JPanel();
        LabelMainHead = new javax.swing.JLabel();
        tabDepartamentos = new javax.swing.JPanel();
        etiquetaSeccion = new javax.swing.JLabel();
        panelInfo = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelLocDept = new javax.swing.JLabel();
        TFLocDept = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        labelNomDept = new javax.swing.JLabel();
        TFNomDept = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        labelIdDept = new javax.swing.JLabel();
        TFIdDept = new javax.swing.JTextField();
        panelControles = new javax.swing.JPanel();
        bAnterior = new javax.swing.JButton();
        bSiguiente = new javax.swing.JButton();
        bUltimo = new javax.swing.JButton();
        bPrimero = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        bInsertar = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        tabEmpleados = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTab.setPreferredSize(new java.awt.Dimension(611, 362));

        panelGestionDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()), "Gestion Diaria", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        botonGesDepart.setText("Gestion de departamentos");
        botonGesDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGesDepartActionPerformed(evt);
            }
        });

        botonGesEmple.setText("Gestion de empleados");
        botonGesEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGesEmpleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGestionDiariaLayout = new javax.swing.GroupLayout(panelGestionDiaria);
        panelGestionDiaria.setLayout(panelGestionDiariaLayout);
        panelGestionDiariaLayout.setHorizontalGroup(
            panelGestionDiariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionDiariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGestionDiariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonGesEmple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonGesDepart, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGestionDiariaLayout.setVerticalGroup(
            panelGestionDiariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionDiariaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(botonGesDepart)
                .addGap(45, 45, 45)
                .addComponent(botonGesEmple)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        panelMantenimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()), "Mantenimiento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panelMantenimiento.setPreferredSize(new java.awt.Dimension(284, 297));

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        LabelMainHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMainHead.setText("Aplicación Gestíon Acceso a Datos");

        javax.swing.GroupLayout tabPrincipalLayout = new javax.swing.GroupLayout(tabPrincipal);
        tabPrincipal.setLayout(tabPrincipalLayout);
        tabPrincipalLayout.setHorizontalGroup(
            tabPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelMainHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabPrincipalLayout.createSequentialGroup()
                        .addComponent(panelGestionDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabPrincipalLayout.setVerticalGroup(
            tabPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabPrincipalLayout.createSequentialGroup()
                .addComponent(LabelMainHead, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGestionDiaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelTab.addTab("Principal", tabPrincipal);
        tabPrincipal.getAccessibleContext().setAccessibleName("");

        tabDepartamentos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tabDepartamentosComponentShown(evt);
            }
        });

        etiquetaSeccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaSeccion.setText("Gestion de Departamentos");

        panelInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()), "", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", 0, 12))); // NOI18N

        jPanel3.setPreferredSize(new java.awt.Dimension(112, 33));

        labelLocDept.setText("Localidad Departamento:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLocDept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TFLocDept, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelLocDept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TFLocDept, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setPreferredSize(new java.awt.Dimension(113, 33));

        labelNomDept.setText("Nombre Departamento:");

        TFNomDept.setPreferredSize(new java.awt.Dimension(250, 19));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNomDept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TFNomDept, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelNomDept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TFNomDept, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        labelIdDept.setText("ID Departamento:");
        labelIdDept.setMaximumSize(null);

        TFIdDept.setPreferredSize(new java.awt.Dimension(250, 19));
        TFIdDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFIdDeptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIdDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TFIdDept, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelIdDept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TFIdDept, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelControles.setPreferredSize(new java.awt.Dimension(405, 41));

        bAnterior.setText("<");
        bAnterior.setPreferredSize(new java.awt.Dimension(48, 25));
        bAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnteriorActionPerformed(evt);
            }
        });

        bSiguiente.setText(">");
        bSiguiente.setPreferredSize(new java.awt.Dimension(48, 25));
        bSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSiguienteActionPerformed(evt);
            }
        });

        bUltimo.setText(">|");
        bUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUltimoActionPerformed(evt);
            }
        });

        bPrimero.setText("|<");
        bPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrimeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelControlesLayout = new javax.swing.GroupLayout(panelControles);
        panelControles.setLayout(panelControlesLayout);
        panelControlesLayout.setHorizontalGroup(
            panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlesLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(bPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bUltimo)
                .addGap(51, 51, 51))
        );
        panelControlesLayout.setVerticalGroup(
            panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlesLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(bAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        bInsertar.setText("Insertar");
        bInsertar.setPreferredSize(new java.awt.Dimension(94, 51));

        bModificar.setText("Modificar");

        bEliminar.setText("Eliminar");
        bEliminar.setPreferredSize(new java.awt.Dimension(99, 25));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(bInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(bModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout tabDepartamentosLayout = new javax.swing.GroupLayout(tabDepartamentos);
        tabDepartamentos.setLayout(tabDepartamentosLayout);
        tabDepartamentosLayout.setHorizontalGroup(
            tabDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDepartamentosLayout.createSequentialGroup()
                .addGroup(tabDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabDepartamentosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tabDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(tabDepartamentosLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(panelControles, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tabDepartamentosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabDepartamentosLayout.setVerticalGroup(
            tabDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDepartamentosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(etiquetaSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelControles, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelTab.addTab("Departamentos", tabDepartamentos);

        javax.swing.GroupLayout tabEmpleadosLayout = new javax.swing.GroupLayout(tabEmpleados);
        tabEmpleados.setLayout(tabEmpleadosLayout);
        tabEmpleadosLayout.setHorizontalGroup(
            tabEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        tabEmpleadosLayout.setVerticalGroup(
            tabEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        panelTab.addTab("Empleados", tabEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("tab1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGesDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGesDepartActionPerformed
        panelTab.setSelectedComponent(this.tabDepartamentos);
    }//GEN-LAST:event_botonGesDepartActionPerformed

    private void botonGesEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGesEmpleActionPerformed
        panelTab.setSelectedComponent(this.tabEmpleados);
    }//GEN-LAST:event_botonGesEmpleActionPerformed

    private void bPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrimeroActionPerformed
	try {
	    resultCompartido.first();
	} catch (SQLException ex) {
	    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
	}
	mostrarCamposDepartamentos();
    }//GEN-LAST:event_bPrimeroActionPerformed

    private void TFIdDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFIdDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFIdDeptActionPerformed

    private void tabDepartamentosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tabDepartamentosComponentShown
	try {
	    Statement sentencia = conexion.createStatement();
	    String sql = "SELECT * FROM departamentos";
	    resultCompartido = sentencia.executeQuery(sql);
	    resultCompartido.last();
	    maxTamResultSet = resultCompartido.getRow();
	    resultCompartido.first();
	    mostrarCamposDepartamentos();
	    
	} catch (SQLException ex) {
	    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
	}
    }//GEN-LAST:event_tabDepartamentosComponentShown

    private void bAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnteriorActionPerformed
	try {
	    resultCompartido.previous();
	} catch (SQLException ex) {
	    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
	}
	mostrarCamposDepartamentos();
    }//GEN-LAST:event_bAnteriorActionPerformed

    private void bSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSiguienteActionPerformed
	try {
	    resultCompartido.next();
	} catch (SQLException ex) {
	    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
	}
	mostrarCamposDepartamentos();
    }//GEN-LAST:event_bSiguienteActionPerformed

    private void bUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUltimoActionPerformed
        try {
	    resultCompartido.last();
	} catch (SQLException ex) {
	    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
	}
	mostrarCamposDepartamentos();
    }//GEN-LAST:event_bUltimoActionPerformed
    private void mostrarCamposDepartamentos(){
	try {
	    ((TitledBorder)panelInfo.getBorder()).setTitle(
                    String.valueOf(resultCompartido.getRow())
                            +"/"+String.valueOf(maxTamResultSet));
            panelInfo.repaint();
	    TFIdDept.setText(String.valueOf(resultCompartido.getInt("dept_no")));
	    TFNomDept.setText(resultCompartido.getString("dnombre"));
	    TFLocDept.setText(resultCompartido.getString("loc"));
	} catch (SQLException ex) {
	    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
    
    private void crearConexionBD(){
	try {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    conexion = DriverManager.getConnection("jdbc:mysql://localhost/MySQLDB.db?useSSL=false", "root", "sephir0th");
	    
	} catch (ClassNotFoundException | SQLException ex) {
	    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
	}
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
	    java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new MainForm().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMainHead;
    private javax.swing.JTextField TFIdDept;
    private javax.swing.JTextField TFLocDept;
    private javax.swing.JTextField TFNomDept;
    private javax.swing.JButton bAnterior;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bInsertar;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bPrimero;
    private javax.swing.JButton bSiguiente;
    private javax.swing.JButton bUltimo;
    private javax.swing.JButton botonGesDepart;
    private javax.swing.JButton botonGesEmple;
    private javax.swing.JLabel etiquetaSeccion;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelIdDept;
    private javax.swing.JLabel labelLocDept;
    private javax.swing.JLabel labelNomDept;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelGestionDiaria;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelMantenimiento;
    private javax.swing.JTabbedPane panelTab;
    private javax.swing.JPanel tabDepartamentos;
    private javax.swing.JPanel tabEmpleados;
    private javax.swing.JPanel tabPrincipal;
    // End of variables declaration//GEN-END:variables
    
    // Mis atributos
    private Connection conexion;
    private ResultSet resultCompartido;
    private int maxTamResultSet;
}
