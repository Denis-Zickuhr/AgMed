
package agmed.gui;
import agmed.*;
import static agmed.gui.GerenciarCadastrosView.cbMedicoList;
import java.util.ArrayList;
import java.util.List;

public class CadastrarMedicosView extends javax.swing.JFrame {

    final static List<Medico> medicoList = new ArrayList();
    private final static List<Medico> auxList = new ArrayList();
    
    public CadastrarMedicosView() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nome = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        Contato = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfCPF = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfContato = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        tfCRM = new javax.swing.JTextField();
        tfEsp = new javax.swing.JTextField();
        tfFun = new javax.swing.JTextField();
        CRM = new javax.swing.JLabel();
        Esp = new javax.swing.JLabel();
        Fun = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Nome.setText("Nome:");

        CPF.setText("CPF:");

        Endereco.setText("Endereço:");

        Contato.setText("Contato:");

        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNomeKeyReleased(evt);
            }
        });

        tfCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCPFKeyReleased(evt);
            }
        });

        tfEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfEnderecoKeyReleased(evt);
            }
        });

        tfContato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfContatoKeyReleased(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.setEnabled(false);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        tfCRM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCRMKeyReleased(evt);
            }
        });

        tfEsp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfEspKeyReleased(evt);
            }
        });

        tfFun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFunKeyReleased(evt);
            }
        });

        CRM.setText("CRM:");

        Esp.setText("Especificação:");

        Fun.setText("Função:");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Esp)
                                .addComponent(CRM, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Contato, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(Endereco)
                            .addComponent(CPF)
                            .addComponent(Nome)
                            .addComponent(Fun))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfContato, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFun, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCadastrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPF)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Endereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CRM, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Esp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Medico medico = new Medico(tfNome.getText(),tfCPF.getText(),
                tfEndereco.getText(),tfContato.getText(), tfCRM.getText(),
                tfEsp.getText(), tfFun.getText());
        medicoList.add(medico);
        putMedicosInCB();
        this.dispose();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyReleased
        disableButton();
    }//GEN-LAST:event_tfNomeKeyReleased

    private void tfCPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCPFKeyReleased
        disableButton();
    }//GEN-LAST:event_tfCPFKeyReleased

    private void tfEnderecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEnderecoKeyReleased
        disableButton();
    }//GEN-LAST:event_tfEnderecoKeyReleased

    private void tfContatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfContatoKeyReleased
        disableButton();
    }//GEN-LAST:event_tfContatoKeyReleased

    private void tfCRMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCRMKeyReleased
        disableButton();
    }//GEN-LAST:event_tfCRMKeyReleased

    private void tfEspKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEspKeyReleased
        disableButton();
    }//GEN-LAST:event_tfEspKeyReleased

    private void tfFunKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFunKeyReleased
        disableButton();
    }//GEN-LAST:event_tfFunKeyReleased

    public static List<Medico> getMedicoList(){
        return medicoList;
    }

    public static void alteracaoFeita(Medico m){

        for(int i = 0; i < medicoList.size(); i++){
            
            Medico medico = medicoList.get(i);
            
            if(medico.getCRM().equals(m.getCRM())){
                auxList.add(medico);
                auxList.add(m);
            }
        }
        
        validacaoDeAlteracao(auxList.get(0), auxList.get(1));
    }
         
    public static void validacaoDeAlteracao(Medico medico, Medico m){
        int index = medicoList.indexOf(medico);
        medicoList.remove(medico);
        medicoList.add(index, m);
        putMedicosInCB();
        auxList.clear();
    }
    
    public static void putMedicosInCB(){
 
        CriarAgendasView.cbMedicoList.removeAllItems();
        cbMedicoList.removeAllItems();
         
         for (Medico pes : CadastrarMedicosView.getMedicoList()) {
            CriarAgendasView.addItems(pes);
            GerenciarCadastrosView.addItems(pes);
            GerenciarCadastrosView.clearInvestigados();
        }
         
        System.out.println(medicoList);
     }
    
    public static void disableButton(){
        if(!(tfNome.getText().equals("") | tfCPF.getText().equals("")
                | tfEndereco.getText().equals("")
                | tfContato.getText().equals("") 
                | tfCRM.getText().equals("") 
                | tfEsp.getText().equals("")
                | tfFun.getText().equals(""))){
            btCadastrar.setEnabled(true);
        }else{
            btCadastrar.setEnabled(false);
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarMedicosView().setVisible(true);
            }
            
        });
    }
    
        public static void putMedicosInCB(Medico m){

            CriarAgendasView.addItems(m);
            GerenciarCadastrosView.addItems(m);
            medicoList.add(m);
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel CRM;
    private javax.swing.JLabel Contato;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Esp;
    private javax.swing.JLabel Fun;
    private javax.swing.JLabel Nome;
    private static javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private static javax.swing.JTextField tfCPF;
    private static javax.swing.JTextField tfCRM;
    private static javax.swing.JTextField tfContato;
    private static javax.swing.JTextField tfEndereco;
    private static javax.swing.JTextField tfEsp;
    private static javax.swing.JTextField tfFun;
    private static javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
