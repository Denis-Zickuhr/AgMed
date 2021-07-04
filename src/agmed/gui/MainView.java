package agmed.gui;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
        gerenciarTelas();

    }
    private static final List telaCounter = new ArrayList();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbMenuBar = new javax.swing.JMenuBar();
        meAgenda = new javax.swing.JMenu();
        miVizAgnedas = new javax.swing.JMenuItem();
        miAgendasArquivadas = new javax.swing.JMenuItem();
        miCriarAgenda = new javax.swing.JMenuItem();
        meCadastro = new javax.swing.JMenu();
        miNvCliente = new javax.swing.JMenuItem();
        miNvMedico = new javax.swing.JMenuItem();
        miGerenCadastros = new javax.swing.JMenuItem();
        meUser = new javax.swing.JMenu();
        miNvSecretario = new javax.swing.JMenuItem();
        miLogOut = new javax.swing.JMenuItem();
        meConsulta = new javax.swing.JMenu();
        miCadastrarConsulta = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
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

        miCriarAgenda.setText("Criar agenda");
        miCriarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCriarAgendaActionPerformed(evt);
            }
        });
        meAgenda.add(miCriarAgenda);

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
        miGerenCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGerenCadastrosActionPerformed(evt);
            }
        });
        meCadastro.add(miGerenCadastros);

        mbMenuBar.add(meCadastro);

        meUser.setText("User");

        miNvSecretario.setText("Novo Secretário");
        miNvSecretario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNvSecretarioActionPerformed(evt);
            }
        });
        meUser.add(miNvSecretario);

        miLogOut.setText("LogOut");
        miLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLogOutActionPerformed(evt);
            }
        });
        meUser.add(miLogOut);

        mbMenuBar.add(meUser);

        meConsulta.setText("Consultas");

        miCadastrarConsulta.setSelected(true);
        miCadastrarConsulta.setText("Criar consulta");
        meConsulta.add(miCadastrarConsulta);

        mbMenuBar.add(meConsulta);

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
        CadastrarClientesView cadastrarClientes = new CadastrarClientesView();
        cadastrarClientes.setVisible(true);
    }//GEN-LAST:event_miNvClienteActionPerformed

    private void miNvMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNvMedicoActionPerformed
        CadastrarMedicosView cadastrarMedicos = new CadastrarMedicosView();
        cadastrarMedicos.setVisible(true);
    }//GEN-LAST:event_miNvMedicoActionPerformed

    private void miGerenCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGerenCadastrosActionPerformed
        for (Object a: telaCounter) {
            if(a instanceof GerenciarCadastrosView){
                GerenciarCadastrosView b = (GerenciarCadastrosView)a;
                b.setVisible(true);
            }
        }
    }//GEN-LAST:event_miGerenCadastrosActionPerformed

    private void miLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLogOutActionPerformed
        LoginScreenView tela = new LoginScreenView();
        tela.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_miLogOutActionPerformed

    private void miNvSecretarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNvSecretarioActionPerformed
        CadastrarSecretarioView cadastrarSecretarioView = new CadastrarSecretarioView();
        cadastrarSecretarioView.setVisible(true);
    }//GEN-LAST:event_miNvSecretarioActionPerformed

    private void miCriarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCriarAgendaActionPerformed
        for (Object a: telaCounter) {
            if(a instanceof CriarAgendasView){
                CriarAgendasView b = (CriarAgendasView)a;
                b.setVisible(true);
            }
        }
    }//GEN-LAST:event_miCriarAgendaActionPerformed
    
    public static void gerenciarTelas(){
        if(telaCounter.isEmpty()){
            CriarAgendasView criarAgendas = new CriarAgendasView();
            GerenciarCadastrosView gerirCadastros = new GerenciarCadastrosView();
            telaCounter.add(criarAgendas);
            telaCounter.add(gerirCadastros);
        }      
    }
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar mbMenuBar;
    private javax.swing.JMenu meAgenda;
    private javax.swing.JMenu meCadastro;
    private javax.swing.JMenu meConsulta;
    private javax.swing.JMenu meUser;
    private javax.swing.JMenuItem miAgendasArquivadas;
    private javax.swing.JCheckBoxMenuItem miCadastrarConsulta;
    private javax.swing.JMenuItem miCriarAgenda;
    private javax.swing.JMenuItem miGerenCadastros;
    private javax.swing.JMenuItem miLogOut;
    private javax.swing.JMenuItem miNvCliente;
    private javax.swing.JMenuItem miNvMedico;
    private javax.swing.JMenuItem miNvSecretario;
    private javax.swing.JMenuItem miVizAgnedas;
    // End of variables declaration//GEN-END:variables
}
