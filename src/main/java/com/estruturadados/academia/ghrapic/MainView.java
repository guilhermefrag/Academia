/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.estruturadados.academia.ghrapic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author lab008r2
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {        
        initComponents();  
        definirTeclasAtalho();
    }
    
    private void definirTeclasAtalho(){
        //grupo de menu Sistema    
        jMenuSistema.setMnemonic(KeyEvent.VK_M);
        jMenuItemUsuarios.setMnemonic(KeyEvent.VK_R);
        jMenuItemSair.setMnemonic(KeyEvent.VK_S);
        
        //grupo de menu
        jMenuCadastro.setMnemonic(KeyEvent.VK_C);
        jMenuItemAluno.setMnemonic(KeyEvent.VK_A);
        jMenuItemCidades.setMnemonic(KeyEvent.VK_D);
        jMenuItemModalidade.setMnemonic(KeyEvent.VK_M);
        jMenuItemGraduacao.setMnemonic(KeyEvent.VK_G);
        jMenuItemPlano.setMnemonic(KeyEvent.VK_P);
        
        //grupo de menu financeiro
        jMenuFinanceiro.setMnemonic(KeyEvent.VK_F);
        jMenuItemMatricula.setMnemonic(KeyEvent.VK_M);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPanelTelaPrincipal = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.setColor(Color.WHITE);
            }
        };
        jMenuBarTelaPrincipal = new javax.swing.JMenuBar();
        jMenuSistema = new javax.swing.JMenu();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemAluno = new javax.swing.JMenuItem();
        jMenuItemCidades = new javax.swing.JMenuItem();
        jMenuItemModalidade = new javax.swing.JMenuItem();
        jMenuItemGraduacao = new javax.swing.JMenuItem();
        jMenuItemPlano = new javax.swing.JMenuItem();
        jMenuFinanceiro = new javax.swing.JMenu();
        jMenuItemMatricula = new javax.swing.JMenuItem();
        jMenuProcessos = new javax.swing.JMenu();
        jMenuItemFatura = new javax.swing.JMenuItem();
        jMenuUtilitarios = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktopPanelTelaPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPanelTelaPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jDesktopPanelTelaPrincipal.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jDesktopPanelTelaPrincipalLayout = new javax.swing.GroupLayout(jDesktopPanelTelaPrincipal);
        jDesktopPanelTelaPrincipal.setLayout(jDesktopPanelTelaPrincipalLayout);
        jDesktopPanelTelaPrincipalLayout.setHorizontalGroup(
            jDesktopPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 902, Short.MAX_VALUE)
        );
        jDesktopPanelTelaPrincipalLayout.setVerticalGroup(
            jDesktopPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );

        jMenuSistema.setText("Sistema");

        jMenuItemUsuarios.setText("Usuários");
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuItemUsuarios);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuItemSair);

        jMenuBarTelaPrincipal.add(jMenuSistema);

        jMenuCadastro.setText("Cadastro");

        jMenuItemAluno.setText("Aluno");
        jMenuCadastro.add(jMenuItemAluno);

        jMenuItemCidades.setText("Cidades");
        jMenuCadastro.add(jMenuItemCidades);

        jMenuItemModalidade.setText("Modalidade");
        jMenuCadastro.add(jMenuItemModalidade);

        jMenuItemGraduacao.setText("Graduação");
        jMenuCadastro.add(jMenuItemGraduacao);

        jMenuItemPlano.setText("Plano");
        jMenuCadastro.add(jMenuItemPlano);

        jMenuBarTelaPrincipal.add(jMenuCadastro);

        jMenuFinanceiro.setText("Financeiro");

        jMenuItemMatricula.setText("Matrícula");
        jMenuFinanceiro.add(jMenuItemMatricula);

        jMenuProcessos.setText("Processos");

        jMenuItemFatura.setText("Fatura");
        jMenuProcessos.add(jMenuItemFatura);

        jMenuFinanceiro.add(jMenuProcessos);

        jMenuBarTelaPrincipal.add(jMenuFinanceiro);

        jMenuUtilitarios.setText("Utilitários");
        jMenuBarTelaPrincipal.add(jMenuUtilitarios);

        setJMenuBar(jMenuBarTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanelTelaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanelTelaPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "teste");
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        // retorno 0 = SIM, retorno 1 = NÃO
        int simOuNao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do sistema?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(simOuNao == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemSairActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPanelTelaPrincipal;
    private javax.swing.JMenuBar jMenuBarTelaPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFinanceiro;
    private javax.swing.JMenuItem jMenuItemAluno;
    private javax.swing.JMenuItem jMenuItemCidades;
    private javax.swing.JMenuItem jMenuItemFatura;
    private javax.swing.JMenuItem jMenuItemGraduacao;
    private javax.swing.JMenuItem jMenuItemMatricula;
    private javax.swing.JMenuItem jMenuItemModalidade;
    private javax.swing.JMenuItem jMenuItemPlano;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenu jMenuProcessos;
    private javax.swing.JMenu jMenuSistema;
    private javax.swing.JMenu jMenuUtilitarios;
    // End of variables declaration//GEN-END:variables
}
