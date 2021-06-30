package agmed.gui;
import agmed.*;

public class overView extends javax.swing.JFrame {

    public overView() {
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbMenuBar = new javax.swing.JMenuBar();
        meAgenda = new javax.swing.JMenu();
        miVizAgnedas = new javax.swing.JMenuItem();
        miAgendasArquivadas = new javax.swing.JMenuItem();
        meCadastro = new javax.swing.JMenu();
        miNvCliente = new javax.swing.JMenuItem();
        miNvMedico = new javax.swing.JMenuItem();
        miGerenCadastros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        meAgenda.setText("Agenda");

        miVizAgnedas.setText("Vizualizar agendas");
        miVizAgnedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVizAgnedasActionPerformed(evt);
            }
        });
        meAgenda.add(miVizAgnedas);

        miAgendasArquivadas.setText("Agendas Arquivadas");
        miAgendasArquivadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgendasArquivadasActionPerformed(evt);
            }
        });
        meAgenda.add(miAgendasArquivadas);

        mbMenuBar.add(meAgenda);

        meCadastro.setText("Cadastros");
        meCadastro.setToolTipText("");

        miNvCliente.setText("Novo cliente");
        miNvCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNvClienteActionPerformed(evt);
            }
        });
        meCadastro.add(miNvCliente);

        miNvMedico.setText("Novo médico");
        miNvMedico.setToolTipText("");
        miNvMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNvMedicoActionPerformed(evt);
            }
        });
        meCadastro.add(miNvMedico);

        miGerenCadastros.setText("Gerenciar cadastros");
        miGerenCadastros.setToolTipText("");
        meCadastro.add(miGerenCadastros);

        mbMenuBar.add(meCadastro);

        setJMenuBar(mbMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAgendasArquivadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgendasArquivadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miAgendasArquivadasActionPerformed

    private void miVizAgnedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVizAgnedasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miVizAgnedasActionPerformed
        
    private void miNvClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNvClienteActionPerformed
        cadastrarClientesView cadastrarClientes = new cadastrarClientesView();
        cadastrarClientes.setVisible(true);
    }//GEN-LAST:event_miNvClienteActionPerformed

    private void miNvMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNvMedicoActionPerformed
        cadastrarMedicosView cadastrarMedicos = new cadastrarMedicosView();
        cadastrarMedicos.setVisible(true);
    }//GEN-LAST:event_miNvMedicoActionPerformed
    
    public static void main(String args[]) {
        
        
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar mbMenuBar;
    private javax.swing.JMenu meAgenda;
    private javax.swing.JMenu meCadastro;
    private javax.swing.JMenuItem miAgendasArquivadas;
    private javax.swing.JMenuItem miGerenCadastros;
    private javax.swing.JMenuItem miNvCliente;
    private javax.swing.JMenuItem miNvMedico;
    private javax.swing.JMenuItem miVizAgnedas;
    // End of variables declaration//GEN-END:variables
}
