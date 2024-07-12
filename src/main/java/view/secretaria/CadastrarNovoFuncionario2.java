package view.secretaria;
import dao.FuncionarioDao;
import dao.JPA;
import data.Funcionario;
import data.ContatoFunc;
import data.EnderecoFunc;
import data.FiliacaoFunc;
import jakarta.persistence.EntityManager;
import javax.swing.JOptionPane;
/**
 *
 * @author bryan
 */
public class CadastrarNovoFuncionario2 extends javax.swing.JFrame {
    CadastrarNovoFuncionario cadFunc;
    Funcionario funcRecebido;
    
    public CadastrarNovoFuncionario2() {
        initComponents();
        setLocationRelativeTo(null);
        
        cbEditar.setEnabled(false);
    }
    
    public CadastrarNovoFuncionario2(CadastrarNovoFuncionario cadFunc){
        this();
        this.cadFunc = cadFunc;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        lblAlunos1 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        lblFuncionario1 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        btnCadastrarFuncionario1 = new javax.swing.JButton();
        btnPesquisaFuncionario1 = new javax.swing.JButton();
        btnCadastrarAluno1 = new javax.swing.JButton();
        btnPesquisaAluno1 = new javax.swing.JButton();
        btnMenu1 = new javax.swing.JButton();
        btnSair1 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        lblDadosContato = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblFiliacao = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPai = new javax.swing.JLabel();
        txtPai = new javax.swing.JTextField();
        lblMae = new javax.swing.JLabel();
        txtMae = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        btnAnexarFoto = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        cbEditar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("LOGO");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel9)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        lblAlunos1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAlunos1.setText("Alunos");

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        lblFuncionario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFuncionario1.setText("Funcionários");

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        btnCadastrarFuncionario1.setBackground(new java.awt.Color(51, 51, 51));
        btnCadastrarFuncionario1.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarFuncionario1.setText("Cadastrar novo funcionário");

        btnPesquisaFuncionario1.setText("Pesquisa de funcionário");
        btnPesquisaFuncionario1.setEnabled(false);

        btnCadastrarAluno1.setText("Cadastrar novo aluno");
        btnCadastrarAluno1.setEnabled(false);

        btnPesquisaAluno1.setText("Pesquisa de aluno");
        btnPesquisaAluno1.setEnabled(false);

        btnMenu1.setText("Menu");
        btnMenu1.setEnabled(false);

        btnSair1.setText("Sair");
        btnSair1.setEnabled(false);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadastrarFuncionario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisaFuncionario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisaAluno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarAluno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFuncionario1))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(lblAlunos1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu1))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAlunos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarAluno1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisaAluno1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuncionario1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarFuncionario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisaFuncionario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair1))
                .addContainerGap())
        );

        lblDadosContato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDadosContato.setText(">Dados de Contato");

        jLabel2.setText("--------------------------------------------------------------------------------------------------------------");

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTelefone.setText("Telefone");

        lblCelular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCelular.setText("Celular");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("E-mail");

        lblFiliacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFiliacao.setText(">Filiação");

        jLabel11.setText("--------------------------------------------------------------------------------------------------------------");

        lblPai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPai.setText("Pai");

        lblMae.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMae.setText("Mãe");

        btnLimpar.setBackground(new java.awt.Color(153, 153, 153));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(51, 51, 51));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        btnAnexarFoto.setBackground(new java.awt.Color(51, 51, 51));
        btnAnexarFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnAnexarFoto.setText("Anexar foto");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAnexarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(0, 170, Short.MAX_VALUE)
                .addComponent(btnAnexarFoto))
        );

        btnEnviar.setBackground(new java.awt.Color(51, 51, 51));
        btnEnviar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        cbEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEditar.setText("Editar");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDadosContato, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFiliacao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefone)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPai)
                                        .addComponent(txtPai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(lblCelular)
                                                .addGap(128, 128, 128)))
                                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEmail)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblMae, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMae, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDadosContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(lblCelular)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFiliacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(lblMae)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar)
                    .addComponent(btnEnviar)
                    .addComponent(cbEditar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        txtPai.setText("");
        txtMae.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        cadFunc.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try {
            ContatoFunc contato = getContato();
            FiliacaoFunc filiacao = getFiliacao();
            Funcionario func = cadFunc.getFuncMetodo();
            EnderecoFunc endereco = cadFunc.getEnderecoMetodo();

            String erro = validacao(contato, filiacao);
            if (erro != null){
                JOptionPane.showMessageDialog(null, erro);
                return;
            }
                
            if (cbEditar.isSelected()){
                atualizarContato(func.getIdContato(), contato);
                atualizarFiliacao(func.getIdFiliacao(), filiacao);
                atualizarFuncBancoDados(func);
                
                JOptionPane.showMessageDialog(null, "Funcionario editado com sucesso!");
            }else{
                FuncionarioDao funcDao = new FuncionarioDao();
                funcDao.inserirEnderecoFunc(endereco);
                funcDao.inserirContatoFunc(contato);
                funcDao.inserirResponsavel(filiacao);
                funcDao.definirRelacionamento(endereco, contato, filiacao, func);
                funcDao.inserirFuncionario(func);

                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
            }
            btnLimpar.doClick();
            this.dispose();
            cadFunc.setVisible(true);
            cadFunc.limparCampos();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos! ");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEnviarActionPerformed
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
            java.util.logging.Logger.getLogger(CadastrarNovoFuncionario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarNovoFuncionario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarNovoFuncionario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarNovoFuncionario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarNovoFuncionario2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnexarFoto;
    private javax.swing.JButton btnCadastrarAluno1;
    private javax.swing.JButton btnCadastrarFuncionario1;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JButton btnPesquisaAluno1;
    private javax.swing.JButton btnPesquisaFuncionario1;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox cbEditar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JLabel lblAlunos1;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDadosContato;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFiliacao;
    private javax.swing.JLabel lblFuncionario1;
    private javax.swing.JLabel lblMae;
    private javax.swing.JLabel lblPai;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMae;
    private javax.swing.JTextField txtPai;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    protected String validacao(ContatoFunc contato, FiliacaoFunc filiacao){
        if (!contato.getTelefone().matches("[(][0-9]{2,3}[)][0-9]{4}[-][0-9]{4}")) {
            return "Preencha o campo 'Telefone' no formato (xx)xxxx-xxxx";
        }
        if (!contato.getCelular().matches("[(][0-9]{2,3}[)][0-9]{5}[-][0-9]{4}")) {
            return "Preencha o campo 'Celular' no formato (xx)xxxxx-xxxx";
        }
        if (contato.getEmail().isEmpty()) {
            return "Preencha o campo 'Email'";
        }
        if (filiacao.getNomePai().isEmpty()) {
            return "Preencha o campo 'Pai'";
        }
        if (filiacao.getNomeMae().isEmpty()) {
            return "Preencha o campo 'Mãe'";
        }
        return null;
    }
    
    protected ContatoFunc getContato(){
        String telefone = txtTelefone.getText().trim();
        String celular = txtCelular.getText().trim();
        String email = txtEmail.getText().trim();
        
        ContatoFunc contato = new ContatoFunc();
        contato.setTelefone(telefone);
        contato.setCelular(celular);
        contato.setEmail(email);
        
        return contato;
    }
    
    protected FiliacaoFunc getFiliacao(){
        String nomePai = txtPai.getText().trim();
        String nomeMae = txtMae.getText().trim();
        
        FiliacaoFunc filiacao = new FiliacaoFunc();
        filiacao.setNomePai(nomePai);
        filiacao.setNomeMae(nomeMae);
        
        return filiacao;
    }
    
    public void receberFunc(Funcionario func){
        funcRecebido = func;
        
        limitarAcesso();
        preencherCampos(func);
    }
    
    public void limitarAcesso(){
        cbEditar.setSelected(true);   
    }
    
    public void preencherCampos(Funcionario func){
        txtTelefone.setText(func.getIdContato().getTelefone());
        txtCelular.setText(func.getIdContato().getCelular());
        txtEmail.setText(func.getIdContato().getEmail());
        
        txtPai.setText(func.getIdFiliacao().getNomePai());
        txtMae.setText(func.getIdFiliacao().getNomeMae());
    }
    
    private void atualizarContato(ContatoFunc existente, ContatoFunc novo) {
        existente.setCelular(novo.getCelular());
        existente.setEmail(novo.getEmail());
        existente.setTelefone(novo.getTelefone());
    }
    
    private void atualizarFiliacao(FiliacaoFunc existente, FiliacaoFunc novo){
        existente.setNomeMae(novo.getNomeMae());
        existente.setNomePai(novo.getNomePai());
    }
    
    public void atualizarFuncBancoDados(Funcionario func){
        EntityManager em = JPA.getEntityManager();
        try {
            em.getTransaction().begin();

            Funcionario funcExistente = em.find(Funcionario.class, funcRecebido.getId());
            if (funcExistente != null) {
                atualizarDadosFunc(funcExistente, func);
                em.merge(funcExistente);
            }

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }
    
    private void atualizarDadosFunc(Funcionario funcExistente, Funcionario funcNovo) {
        funcExistente.setCargo(funcNovo.getCargo());
        funcExistente.setCpf(funcNovo.getCpf());
        funcExistente.setDataNasc(funcNovo.getDataNasc());
        funcExistente.setEstadoCivil(funcNovo.getEstadoCivil());
        funcExistente.setFormacao(funcNovo.getFormacao());
        funcExistente.setNaturalidade(funcNovo.getNaturalidade());
        funcExistente.setNome(funcNovo.getNome());
        funcExistente.setPcd(funcNovo.isPcd());
        funcExistente.setPcdTexto(funcNovo.getPcdTexto());
        funcExistente.setSexo(funcNovo.getSexo());
        
        FiliacaoFunc filiacaoExistente = funcExistente.getIdFiliacao();
        FiliacaoFunc filiacaoNovo = funcNovo.getIdFiliacao();
        filiacaoExistente.setNomeMae(filiacaoNovo.getNomeMae());
        filiacaoExistente.setNomePai(filiacaoNovo.getNomePai());
        
        EnderecoFunc enderecoExistente = funcExistente.getIdEndereco();
        EnderecoFunc enderecoNovo = funcNovo.getIdEndereco();
        enderecoExistente.setBairro(enderecoNovo.getBairro());
        enderecoExistente.setCep(enderecoNovo.getCep());
        enderecoExistente.setCidade(enderecoNovo.getCidade());
        enderecoExistente.setEndereco(enderecoNovo.getEndereco());
        enderecoExistente.setNumero(enderecoNovo.getNumero());
        enderecoExistente.setUf(enderecoNovo.getUf());
        
        ContatoFunc contatoExistente = funcExistente.getIdContato();
        ContatoFunc contatoNovo = funcNovo.getIdContato();
        contatoExistente.setCelular(contatoNovo.getCelular());
        contatoExistente.setEmail(contatoNovo.getEmail());
        contatoExistente.setTelefone(contatoNovo.getTelefone());
    }
}
