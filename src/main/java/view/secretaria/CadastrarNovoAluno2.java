package view.secretaria;
import dao.AlunoDao;
import dao.JPA;
import data.Aluno;
import data.EnderecoAluno;
import data.Responsavel;
import jakarta.persistence.EntityManager;
import javax.swing.JOptionPane;
/**
 *
 * @author bryan
 */
public class CadastrarNovoAluno2 extends javax.swing.JFrame {
    CadastrarNovoAluno cadAluno; 
    Aluno alunoRecebido;
    
    public CadastrarNovoAluno2(){
        initComponents();
        setLocationRelativeTo(null);
        
        cbEditar.setEnabled(false);
    }
    
    public CadastrarNovoAluno2(CadastrarNovoAluno cadAluno) {
        this();
        this.cadAluno = cadAluno;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnSexoPai = new javax.swing.ButtonGroup();
        btnSexoMae = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblAlunos = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblFuncionario = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnCadastrarFuncionario = new javax.swing.JButton();
        btnPesquisaFuncionario = new javax.swing.JButton();
        btnCadastrarAluno = new javax.swing.JButton();
        btnPesquisaAluno = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        lblDadosResponsaveis = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNomePai = new javax.swing.JLabel();
        txtNomePai = new javax.swing.JTextField();
        lblSexoPai = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        rbOutros = new javax.swing.JRadioButton();
        lblCPFPai = new javax.swing.JLabel();
        txtCpfPai = new javax.swing.JTextField();
        lblDataNascimentoPai = new javax.swing.JLabel();
        txtDataNascimentoPai = new javax.swing.JTextField();
        lblContatoPai = new javax.swing.JLabel();
        txtContatoPai = new javax.swing.JTextField();
        lblEmailPai = new javax.swing.JLabel();
        txtEmailPai = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtNomeMae = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        rbOutros1 = new javax.swing.JRadioButton();
        rbFeminino1 = new javax.swing.JRadioButton();
        rbMasculino1 = new javax.swing.JRadioButton();
        lblSexoMae = new javax.swing.JLabel();
        txtContatoMae = new javax.swing.JTextField();
        lblContatoPai1 = new javax.swing.JLabel();
        txtCpfMae = new javax.swing.JTextField();
        lblCPFMae = new javax.swing.JLabel();
        txtEmailMae = new javax.swing.JTextField();
        lblEmailMae = new javax.swing.JLabel();
        txtDataNascimentoMae = new javax.swing.JTextField();
        lblDataNascimentoMae = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        cbEditar = new javax.swing.JCheckBox();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("LOGO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        lblAlunos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAlunos.setText("Alunos");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        lblFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFuncionario.setText("Funcionários");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        btnCadastrarFuncionario.setText("Cadastrar novo funcionário");
        btnCadastrarFuncionario.setEnabled(false);

        btnPesquisaFuncionario.setText("Pesquisa de funcionário");
        btnPesquisaFuncionario.setEnabled(false);

        btnCadastrarAluno.setBackground(new java.awt.Color(51, 51, 51));
        btnCadastrarAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarAluno.setText("Cadastrar novo aluno");

        btnPesquisaAluno.setText("Pesquisa de aluno");
        btnPesquisaAluno.setEnabled(false);

        btnMenu.setText("Menu");
        btnMenu.setEnabled(false);

        btnSair.setText("Sair");
        btnSair.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFuncionario))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblAlunos)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisaAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisaFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        lblDadosResponsaveis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDadosResponsaveis.setText(">Dados dos Responsáveis");

        jLabel2.setText("--------------------------------------------------------------------------------------------------------------");

        lblNomePai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomePai.setText("Nome do pai");

        lblSexoPai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSexoPai.setText("Sexo");

        btnSexoPai.add(rbMasculino);
        rbMasculino.setText("Masculino");

        btnSexoPai.add(rbFeminino);
        rbFeminino.setText("Feminino");

        btnSexoPai.add(rbOutros);
        rbOutros.setText("Outros");

        lblCPFPai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCPFPai.setText("CPF do pai");

        lblDataNascimentoPai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataNascimentoPai.setText("Data de nascimento");

        lblContatoPai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContatoPai.setText("Contato do pai");

        lblEmailPai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmailPai.setText("E-mail do pai");

        lblCEP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCEP.setText("Nome da mãe");

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

        btnSexoMae.add(rbOutros1);
        rbOutros1.setText("Outros");

        btnSexoMae.add(rbFeminino1);
        rbFeminino1.setText("Feminino");

        btnSexoMae.add(rbMasculino1);
        rbMasculino1.setText("Masculino");

        lblSexoMae.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSexoMae.setText("Sexo");

        lblContatoPai1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContatoPai1.setText("Contato da mãe");

        lblCPFMae.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCPFMae.setText("CPF do mãe");

        lblEmailMae.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmailMae.setText("E-mail do mãe");

        lblDataNascimentoMae.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataNascimentoMae.setText("Data de nascimento");

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDadosResponsaveis)
                    .addComponent(rbFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomePai)
                                    .addComponent(txtNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSexoPai, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCEP)
                                    .addComponent(rbFeminino1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbMasculino1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbOutros1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSexoMae, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtContatoPai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(txtCpfPai, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(lblContatoPai)
                                    .addComponent(lblCPFPai))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDataNascimentoPai)
                                    .addComponent(txtEmailPai, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtDataNascimentoPai)
                                    .addComponent(lblEmailPai)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpfMae, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCPFMae)
                                    .addComponent(txtContatoMae, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblContatoPai1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailMae, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmailMae)
                                    .addComponent(lblDataNascimentoMae)
                                    .addComponent(txtDataNascimentoMae, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(213, 213, 213))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDadosResponsaveis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomePai)
                    .addComponent(lblCPFPai)
                    .addComponent(lblDataNascimentoPai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNascimentoPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexoPai)
                    .addComponent(lblContatoPai)
                    .addComponent(lblEmailPai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMasculino)
                    .addComponent(txtContatoPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFeminino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbOutros)
                        .addGap(19, 19, 19)
                        .addComponent(lblCEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSexoMae)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMasculino1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFeminino1))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(lblCPFMae)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpfMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(lblDataNascimentoMae)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataNascimentoMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContatoPai1)
                            .addComponent(lblEmailMae))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContatoMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOutros1)
                .addGap(16, 16, 16)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnEnviar)
                    .addComponent(btnVoltar)
                    .addComponent(cbEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        cadAluno.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try {
            Responsavel pai = getResponsavel("pai");
            Responsavel mae = getResponsavel("mae");
            Aluno aluno = cadAluno.getAlunoMetodo();
            EnderecoAluno endereco = cadAluno.getEnderecoMetodo();

            String erroPai = validarResponsavel(pai);
            if (erroPai != null) {
                JOptionPane.showMessageDialog(null, erroPai);
                return;
            }
            
            String erroMae = validarResponsavel(mae);
            if (erroMae != null) {
                JOptionPane.showMessageDialog(null, erroMae);
                return;
            }
            
            if (cbEditar.isSelected()){
                atualizarResponsavel(aluno.getIdResponsavel1(), pai);
                atualizarResponsavel(aluno.getIdResponsavel2(), mae);
                atualizarAlunoBancoDados(aluno);
                
                JOptionPane.showMessageDialog(null, "Aluno editado com sucesso!");
            }else{
                AlunoDao alunoDao = new AlunoDao();
                alunoDao.inserirEnderecoAluno(endereco);
                alunoDao.inserirResponsavel(pai);
                alunoDao.inserirResponsavel(mae);
                alunoDao.inserirId(endereco, pai, mae, aluno);
                alunoDao.inserirAluno(aluno);
                
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
            }
            
            limparCampos();
            this.dispose();
            cadAluno.setVisible(true);
            cadAluno.limparCampos();
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
            java.util.logging.Logger.getLogger(CadastrarNovoAluno2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarNovoAluno2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarNovoAluno2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarNovoAluno2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarNovoAluno2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAluno;
    private javax.swing.JButton btnCadastrarFuncionario;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnPesquisaAluno;
    private javax.swing.JButton btnPesquisaFuncionario;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup btnSexoMae;
    private javax.swing.ButtonGroup btnSexoPai;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox cbEditar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAlunos;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPFMae;
    private javax.swing.JLabel lblCPFPai;
    private javax.swing.JLabel lblContatoPai;
    private javax.swing.JLabel lblContatoPai1;
    private javax.swing.JLabel lblDadosResponsaveis;
    private javax.swing.JLabel lblDataNascimentoMae;
    private javax.swing.JLabel lblDataNascimentoPai;
    private javax.swing.JLabel lblEmailMae;
    private javax.swing.JLabel lblEmailPai;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblNomePai;
    private javax.swing.JLabel lblSexoMae;
    private javax.swing.JLabel lblSexoPai;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbFeminino1;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbMasculino1;
    private javax.swing.JRadioButton rbOutros;
    private javax.swing.JRadioButton rbOutros1;
    private javax.swing.JTextField txtContatoMae;
    private javax.swing.JTextField txtContatoPai;
    private javax.swing.JTextField txtCpfMae;
    private javax.swing.JTextField txtCpfPai;
    private javax.swing.JTextField txtDataNascimentoMae;
    private javax.swing.JTextField txtDataNascimentoPai;
    private javax.swing.JTextField txtEmailMae;
    private javax.swing.JTextField txtEmailPai;
    private javax.swing.JTextField txtNomeMae;
    private javax.swing.JTextField txtNomePai;
    // End of variables declaration//GEN-END:variables
    private String validarResponsavel(Responsavel resp) throws NullPointerException{
        boolean valDataNasc = resp.getDataNasc().matches("[0-3][0-9][/][0-1][0-9][/][1-2][0-9]{3}");
        boolean valCpf = resp.getCpf().matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");
        boolean valContato = resp.getContato().matches("[(][0-9]{2,3}[)][0-9]{5}[-][0-9]{4}");

        if (resp.getNome().isEmpty() && !valCpf && !valDataNasc && resp.getSexo() == null && !valContato && resp.getEmail().isEmpty()) {
            throw new NullPointerException();
        }
        if (resp.getNome().isEmpty()){
            return "Preencha o campo 'Nome'";
        }
        if (!valCpf){
            return "Preencha o campo 'CPF' no formato xxx.xxx.xxx-xx";
        }
        if (!valDataNasc){
            return "Preencha o campo 'Data de Nascimento' no formato dd/mm/aaaa";
        }
        if (resp.getSexo().toString().isEmpty()){
            return "Preencha o campo 'Sexo'";
        }
        if (!valContato){
            return "Preencha o campo 'Contato' no formato (xx)xxxxx-xxxx";
        }
        if (resp.getEmail().isEmpty()){
            return "Preencha o campo 'Email'";
        }
        return null;
    }
    
    private Responsavel getResponsavel(String tipo){
        String nome = tipo.equals("pai") ? txtNomePai.getText() : txtNomeMae.getText();
        String cpf = tipo.equals("pai") ? txtCpfPai.getText() : txtCpfMae.getText();
        String dataNasc = tipo.equals("pai") ? txtDataNascimentoPai.getText() : txtDataNascimentoMae.getText();
        String contato = tipo.equals("pai") ? txtContatoPai.getText() : txtContatoMae.getText();
        String email = tipo.equals("pai") ? txtEmailPai.getText() : txtEmailMae.getText();
        
        Responsavel responsavel = new Responsavel();
        responsavel.setNome(nome);
        responsavel.setCpf(cpf);
        responsavel.setDataNasc(dataNasc);
        responsavel.setContato(contato);
        responsavel.setEmail(email);
        
        if (tipo.equals("pai")) {
            if (rbMasculino.isSelected()) {
                responsavel.setSexo(Responsavel.Sexo.M);
            } else if (rbFeminino.isSelected()) {
                responsavel.setSexo(Responsavel.Sexo.F);
            } else if (rbOutros.isSelected()) {
                responsavel.setSexo(Responsavel.Sexo.O);
            }
        } else {
            if (rbMasculino1.isSelected()) {
                responsavel.setSexo(Responsavel.Sexo.M);
            } else if (rbFeminino1.isSelected()) {
                responsavel.setSexo(Responsavel.Sexo.F);
            } else if (rbOutros1.isSelected()) {
                responsavel.setSexo(Responsavel.Sexo.O);
            }
        }
        
        return responsavel;
    }
    
    private void atualizarResponsavel(Responsavel respExistente, Responsavel respNovo) {
        respExistente.setNome(respNovo.getNome());
        respExistente.setCpf(respNovo.getCpf());
        respExistente.setDataNasc(respNovo.getDataNasc());
        respExistente.setContato(respNovo.getContato());
        respExistente.setEmail(respNovo.getEmail());
        respExistente.setSexo(respNovo.getSexo());
    }
    
    
    public void receberAluno(Aluno aluno){
        alunoRecebido = aluno;
        
        limitarAcesso();
        preencherCampos(aluno);
    }
    
    public void preencherCampos(Aluno aluno){
        Responsavel pai = aluno.getIdResponsavel1();
        Responsavel mae = aluno.getIdResponsavel2();

        txtNomePai.setText(pai.getNome());
        txtCpfPai.setText(pai.getCpf());
        txtDataNascimentoPai.setText(pai.getDataNasc());
        switch (pai.getSexo()) {
            case M -> rbMasculino.setSelected(true);
            case F -> rbFeminino.setSelected(true);
            case O -> rbOutros.setSelected(true);
        }
        txtContatoPai.setText(pai.getContato());
        txtEmailPai.setText(pai.getEmail());

        txtNomeMae.setText(mae.getNome());
        txtCpfMae.setText(mae.getCpf());
        txtDataNascimentoMae.setText(mae.getDataNasc());
        switch (mae.getSexo()) {
            case M -> rbMasculino1.setSelected(true);
            case F -> rbFeminino1.setSelected(true);
            case O -> rbOutros1.setSelected(true);
        }
        txtContatoMae.setText(mae.getContato());
        txtEmailMae.setText(mae.getEmail());
    }
    
    public void limitarAcesso(){
        cbEditar.setSelected(true);   
    }
    
    
    public void atualizarAlunoBancoDados(Aluno aluno){
        EntityManager em = JPA.getEntityManager();
        try {
            em.getTransaction().begin();

            Aluno alunoExistente = em.find(Aluno.class, alunoRecebido.getId());
            if (alunoExistente != null) {
                atualizarDadosAluno(alunoExistente, aluno);
                em.merge(alunoExistente);
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
    
    private void atualizarDadosAluno(Aluno alunoExistente, Aluno alunoNovo) {
        alunoExistente.setNome(alunoNovo.getNome());
        alunoExistente.setCpf(alunoNovo.getCpf());
        alunoExistente.setMatricula(alunoNovo.getMatricula());
        alunoExistente.setDataNasc(alunoNovo.getDataNasc());
        alunoExistente.setSexo(alunoNovo.getSexo());
        alunoExistente.setPcd(alunoNovo.isPcd());
        alunoExistente.setPcdTexto(alunoNovo.getPcdTexto());

        EnderecoAluno enderecoExistente = alunoExistente.getIdEndereco();
        EnderecoAluno enderecoNovo = alunoNovo.getIdEndereco();
        enderecoExistente.setCep(enderecoNovo.getCep());
        enderecoExistente.setBairro(enderecoNovo.getBairro());
        enderecoExistente.setEndereco(enderecoNovo.getEndereco());
        enderecoExistente.setCidade(enderecoNovo.getCidade());
        enderecoExistente.setNumero(enderecoNovo.getNumero());
        enderecoExistente.setUf(enderecoNovo.getUf());

        atualizarResponsavel(alunoExistente.getIdResponsavel1(), alunoNovo.getIdResponsavel1());
        atualizarResponsavel(alunoExistente.getIdResponsavel2(), alunoNovo.getIdResponsavel2());
    }
    
    public void limparCampos(){
        txtNomePai.setText("");
        txtCpfPai.setText("");
        txtDataNascimentoPai.setText("");
        btnSexoPai.clearSelection();
        txtContatoPai.setText("");
        txtEmailPai.setText("");
        txtNomeMae.setText("");
        txtCpfMae.setText("");
        txtDataNascimentoMae.setText("");
        btnSexoMae.clearSelection();
        txtContatoMae.setText("");
        txtEmailMae.setText("");
    }
}