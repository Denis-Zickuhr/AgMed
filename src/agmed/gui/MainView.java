package agmed.gui;
import agmed.Cliente;
import agmed.Medico;
import java.util.ArrayList;
import java.util.List;

public class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
        gerenciarTelas();
        loadPreset();

    }
    private static final List telaCounter = new ArrayList();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbMenuBar = new javax.swing.JMenuBar();
        meAgenda = new javax.swing.JMenu();
        miVizAgnedas = new javax.swing.JMenuItem();
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

    private void miVizAgnedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVizAgnedasActionPerformed
         for (Object a: telaCounter) {
            if(a instanceof VizualizarAgendas){
                VizualizarAgendas b = (VizualizarAgendas)a;
                b.setVisible(true);
            }
        }
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
    
    public static void gerenciarTelas(){
        if(telaCounter.isEmpty()){
            VizualizarAgendas va = new VizualizarAgendas();

            GerenciarCadastrosView gc = new GerenciarCadastrosView();

            telaCounter.add(gc);
            telaCounter.add(va);
        }      
    }
    
    public void loadPreset(){
        
        String[] nomes = new String[]{"João", "Marcos", "Dino", "Samuel", "Kaio",
                                        "Ketrin" , "Jorge", "Luis", "Gabriel", "Bruno"};
        String[] cpfs = new String[]{"48184848", "515418181", "188118446", "51848118481", "188181848",
                                        "415184815" , "155481551", "2548484212", "5844881", "8499984848"
        };
        
        String[] enderecos = new String[]{"Rua 1", "Rua 2", "Rua 3", "Rua 4", "Rua das flores",
                                        "Rua da pipa" , "rua 2", "Rua 1", "Rua 1", "pavilhão"
        };
        
        String[] contatos = new String[]{"João@gmail.com", "Marcos@gmail.com", "Dino@gmail.com", 
                                        "Samuel@gmail.com", "Kaio@gmail.com", "Ketrin@gmail.com",
                                        "Jorge@gmail.com", "Luis@gmail.com", "Gabriel@gmail.com",
                                        "Bruno@gmail.com"
        };
        String[] crms = new String[]{
            "13125", "84111", "48481", "84811", "77741"
        };
        String[] espcs = new String[]{
            "Clinico geral", "Psiquiatra", "Ortopedista", "Cirurgiao", "Ginecologista"
        };
        String[] funs = new String[]{
            "Clinico geral", "Psiquiatra e Zelador", "Ortopedista", "Cirurgiao", "Ginecologista"
        };
                
        for(int i = 0; i < 5; i++){
            Medico m = new Medico(nomes[i], cpfs[i], enderecos[i], contatos[i], crms[i], espcs[i], funs[i]);
            CadastrarMedicosView.putMedicosInCB(m);
        }
        
        for(int i = 5; i < 10; i++){
            Cliente c = new Cliente(nomes[i], cpfs[i], enderecos[i], contatos[i]);
            CadastrarClientesView.putClientesInCB(c);
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
    private javax.swing.JCheckBoxMenuItem miCadastrarConsulta;
    private javax.swing.JMenuItem miGerenCadastros;
    private javax.swing.JMenuItem miLogOut;
    private javax.swing.JMenuItem miNvCliente;
    private javax.swing.JMenuItem miNvMedico;
    private javax.swing.JMenuItem miNvSecretario;
    private javax.swing.JMenuItem miVizAgnedas;
    // End of variables declaration//GEN-END:variables
}
