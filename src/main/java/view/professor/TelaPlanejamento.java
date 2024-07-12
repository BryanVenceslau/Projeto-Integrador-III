package view.professor;
import dao.JPA;
import dao.PlanejamentoDao;
import data.Planejamento;
import jakarta.persistence.EntityManager;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author bryan
 */
public class TelaPlanejamento extends javax.swing.JFrame {
    public TelaPlanejamento() {
        initComponents();
        setLocationRelativeTo(null);
        
        cbEditar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtDataInicial = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDataFinal = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtConteudo = new javax.swing.JTextField();
        cbTipoConteudo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbTurma = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cbDisciplina = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnConcluir = new javax.swing.JButton();
        cbEditar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Adicionar Planejamento");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Período:");

        txtDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel3.setText("-");

        txtDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Conteúdo:");

        cbTipoConteudo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Expositiva", "Prática" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de conteúdo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Turma(s):");

        cbTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turma 1", "Turma 2", "Turma 3" }));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Disciplina(s):");

        cbDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matemática", "Português", "Inglês" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Descrição:");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(102, 102, 102));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnConcluir.setBackground(new java.awt.Color(51, 51, 51));
        btnConcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnConcluir.setText("Concluir");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        cbEditar.setText("Editar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(cbTipoConteudo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(cbTurma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtConteudo))
                                .addGap(62, 62, 62)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7)
                                            .addComponent(cbDisciplina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTipoConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(cbEditar))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnConcluir)
                    .addComponent(btnLimpar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtDataInicial.setText("");
        txtDataFinal.setText("");
        txtConteudo.setText("");
        cbTipoConteudo.setSelectedIndex(0);
        cbDisciplina.setSelectedIndex(0);
        txtDescricao.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        try {
            Planejamento plan = getPlanejamento();
            
            String erro = validacao(plan);
            if (erro != null){
                JOptionPane.showMessageDialog(null, erro);
            }else{
                if (cbEditar.isSelected()){
                    plan = getPlanRecebido();
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    
                    String dataInicial = txtDataInicial.getText().trim();
                    java.util.Date inicialDate = formato.parse(dataInicial);
                    java.sql.Date inicialSql = new java.sql.Date(inicialDate.getTime());
                    plan.setDataInicial(inicialSql);

                    String dataFinal = txtDataFinal.getText().trim();
                    java.util.Date finalDate = formato.parse(dataFinal);
                    java.sql.Date finalSql = new java.sql.Date(finalDate.getTime());
                    plan.setDataFinal(finalSql);
                    
                    plan.setConteudo(txtConteudo.getText());
                    plan.setTipoConteudo(cbTipoConteudo.getSelectedItem().toString());
                    plan.setTurma(cbTurma.getSelectedItem().toString());
                    plan.setDisciplina(cbDisciplina.getSelectedItem().toString());
                    plan.setDescricao(txtDescricao.getText());
                    
                    atualizaPlanBancoDados(plan);
                    JOptionPane.showMessageDialog(null, "Planejamento editado com sucesso");
                }else{
                    PlanejamentoDao dao = new PlanejamentoDao();
                    dao.inserirPlan(plan);

                    JOptionPane.showMessageDialog(null, "Planejamento criado com sucesso");
                }
                
                this.dispose();
            }
        } catch (ParseException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnConcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPlanejamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPlanejamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPlanejamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPlanejamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPlanejamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbDisciplina;
    private javax.swing.JCheckBox cbEditar;
    private javax.swing.JComboBox<String> cbTipoConteudo;
    private javax.swing.JComboBox<String> cbTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtConteudo;
    private javax.swing.JFormattedTextField txtDataFinal;
    private javax.swing.JFormattedTextField txtDataInicial;
    private javax.swing.JTextArea txtDescricao;
    // End of variables declaration//GEN-END:variables
    public Planejamento getPlanejamento() throws ParseException{
        String dataInicial = txtDataInicial.getText().trim();
        if (dataInicial.isEmpty()){
            throw new NullPointerException("Preencha corretamente o campo 'DATA INICIAL' no formato 'dd/MM/yyyy'");
        }
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date utilDate = formato.parse(dataInicial);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        
        String dataIFinal = txtDataFinal.getText().trim();
        if (dataIFinal.isEmpty()){
            throw new NullPointerException("Preencha corretamente o campo 'DATA FINAL' no formato 'dd/MM/yyyy'");
        }
        java.util.Date utilDate1 = formato.parse(dataIFinal);
        java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime());
        
        String conteudo = txtConteudo.getText();
        String tipoConteudo = cbTipoConteudo.getSelectedItem().toString();
        String turma = cbTurma.getSelectedItem().toString();
        String discplina = cbDisciplina.getSelectedItem().toString();
        String descricao = txtDescricao.getText();
        
        Planejamento plan =  new Planejamento();
        plan.setDataInicial(sqlDate);
        plan.setDataFinal(sqlDate1);
        plan.setConteudo(conteudo);
        plan.setTipoConteudo(tipoConteudo);
        plan.setTurma(turma);
        plan.setDisciplina(discplina);
        plan.setDescricao(descricao);
        
        return plan;
    }
    
    public String validacao(Planejamento plan){
        if(plan.getConteudo().isEmpty()){
            return "Preencha o campo 'CONTEÚDO'";
        }
        if (plan.getDescricao().isEmpty()){
            return "Preencha o campo 'DESCRIÇÃO'";
        }
        return null;
    }
    
    Planejamento planRecebido;
    public void receberPlan(Planejamento plan){
        planRecebido = plan;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        Date dataInicialBD = plan.getDataInicial();
        String dataInicial = formato.format(dataInicialBD);
        txtDataInicial.setText(dataInicial);
        
        Date dataFinalBD = plan.getDataFinal();
        String dataFinal = formato.format(dataFinalBD);
        txtDataFinal.setText(dataFinal);
        
        txtConteudo.setText(plan.getConteudo());
        if (plan.getTipoConteudo().equals("Expositiva")){
            cbTipoConteudo.setSelectedIndex(0);
        }else{
            cbTipoConteudo.setSelectedIndex(1);
        }
        switch (plan.getTurma()) {
            case "Turma 1" -> cbTurma.setSelectedIndex(0);
            case "Turma 2" -> cbTurma.setSelectedIndex(1);
            default -> cbTurma.setSelectedIndex(2);
        }
        switch (plan.getDisciplina()) {
            case "Matemática" -> cbDisciplina.setSelectedIndex(0);
            case "Português" -> cbDisciplina.setSelectedIndex(1);
            default -> cbDisciplina.setSelectedIndex(2);
        }
        txtDescricao.setText(plan.getDescricao());
    }
    
    public Planejamento getPlanRecebido(){
        return planRecebido;
    }
    
    public void atualizaPlanBancoDados(Planejamento plan){
        EntityManager em = JPA.getEntityManager();
        Planejamento planExistente = em.find(Planejamento.class, planRecebido.getId());
        
        planExistente.setDataInicial(plan.getDataInicial());
        planExistente.setDataFinal(plan.getDataFinal());
        planExistente.setConteudo(plan.getConteudo());
        planExistente.setTipoConteudo(plan.getTipoConteudo());
        planExistente.setTurma(plan.getTurma());
        planExistente.setDisciplina(plan.getDisciplina());
        planExistente.setDescricao(plan.getDescricao());
        
        em.getTransaction().begin();
        em.merge(planExistente);
        em.getTransaction().commit();
        
        em.close();
    }
    
    public void limitarAcesso(){
        cbEditar.setSelected(true);   
    }
}