package view.secretaria;
import dao.AcessoDao;
import dao.FuncionarioDao;
import data.Acesso;
import data.Funcionario;
import data.EnderecoFunc;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import view.TelaLogin;
import view.administrador.MenuAdministrador;
/**
 *
 * @author bryan
 */
public class CadastrarNovoFuncionario extends javax.swing.JFrame {
    Acesso acesso;
    short i = 0;
    CadastrarNovoFuncionario2 cadFunc2;
    Funcionario funcRecebido;
    Funcionario funcMetodo;
    EnderecoFunc enderecoMetodo;
    
    public CadastrarNovoFuncionario() {
        initComponents();
        setLocationRelativeTo(null);
        
        verificarTela();
        cbEditar.setEnabled(false);
        btnVoltar.setVisible(false);
    }
    
    public CadastrarNovoFuncionario(CadastrarNovoFuncionario2 cadFuncDois){
        this();
        this.cadFunc2 = cadFuncDois;
        
        i++;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btnSexo = new javax.swing.ButtonGroup();
        btnPcd = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lblAlunos1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lblFuncionario1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        btnCadastrarFuncionario1 = new javax.swing.JButton();
        btnPesquisaFuncionario1 = new javax.swing.JButton();
        btnCadastrarAluno1 = new javax.swing.JButton();
        btnPesquisaAluno1 = new javax.swing.JButton();
        btnMenu1 = new javax.swing.JButton();
        btnSair1 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        lblDadosIdentificacao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        rbOutros = new javax.swing.JRadioButton();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblDataNascimento = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        lblPCD = new javax.swing.JLabel();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();
        txtPcd = new javax.swing.JTextField();
        lblDadosEndereco = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblNaturalidade = new javax.swing.JLabel();
        txtNaturalidade = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        txtEstadoCivil = new javax.swing.JTextField();
        lblEstadoCivil = new javax.swing.JLabel();
        lblFormacao = new javax.swing.JLabel();
        txtFormacao = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JButton();
        cbEditar = new javax.swing.JCheckBox();

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

        btnPesquisaFuncionario.setText("Pesquisa de funcionário");

        btnCadastrarAluno.setBackground(new java.awt.Color(51, 51, 51));
        btnCadastrarAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarAluno.setText("Cadastrar novo aluno");

        btnPesquisaAluno.setText("Pesquisa de aluno");

        btnMenu.setText("Menu");

        btnSair.setText("Sair");

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("LOGO");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel4)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        lblAlunos1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAlunos1.setText("Alunos");

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        lblFuncionario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFuncionario1.setText("Funcionários");

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        btnCadastrarFuncionario1.setBackground(new java.awt.Color(51, 51, 51));
        btnCadastrarFuncionario1.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarFuncionario1.setText("Cadastrar novo funcionário");

        btnPesquisaFuncionario1.setText("Pesquisa de funcionário");
        btnPesquisaFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaFuncionario1ActionPerformed(evt);
            }
        });

        btnCadastrarAluno1.setText("Cadastrar novo aluno");
        btnCadastrarAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAluno1ActionPerformed(evt);
            }
        });

        btnPesquisaAluno1.setText("Pesquisa de aluno");
        btnPesquisaAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaAluno1ActionPerformed(evt);
            }
        });

        btnMenu1.setText("Menu");
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });

        btnSair1.setText("Sair");
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadastrarFuncionario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisaFuncionario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisaAluno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarAluno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFuncionario1))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(lblAlunos1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu1))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAlunos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarAluno1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisaAluno1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuncionario1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarFuncionario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisaFuncionario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair1))
                .addContainerGap())
        );

        lblDadosIdentificacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDadosIdentificacao.setText(">Dados de Identificação");

        jLabel2.setText("--------------------------------------------------------------------------------------------------------------");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setText("Nome do funcionário");

        lblSexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSexo.setText("Sexo");

        btnSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        btnSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");

        btnSexo.add(rbOutros);
        rbOutros.setText("Outros");

        lblCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCpf.setText("CPF");

        lblDataNascimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataNascimento.setText("Data de nascimento");

        lblCargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCargo.setText("Cargo");

        lblPCD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPCD.setText("PCD");

        btnPcd.add(rbSim);
        rbSim.setText("Sim");

        btnPcd.add(rbNao);
        rbNao.setText("Não");

        lblDadosEndereco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDadosEndereco.setText(">Dados de Endereço");

        jLabel11.setText("--------------------------------------------------------------------------------------------------------------");

        lblNaturalidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNaturalidade.setText("Naturalidade");

        lblCEP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCEP.setText("CEP");

        lblNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumero.setText("Número");

        lblUF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUF.setText("UF");

        lblBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBairro.setText("Bairro");

        lblCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCidade.setText("Cidade");

        btnLimpar.setBackground(new java.awt.Color(153, 153, 153));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnContinuar.setBackground(new java.awt.Color(51, 51, 51));
        btnContinuar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        lblEstadoCivil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstadoCivil.setText("Estado civil");

        lblFormacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFormacao.setText("Formação");

        lblEndereco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEndereco.setText("Endereço");

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um cargo", "Administrador", "Setor Financeiro", "Suporte", "Professor", "Secretária" }));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        cbEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEditar.setText("Editar");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(cbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnContinuar)
                        .addGap(37, 37, 37)
                        .addComponent(btnVoltar))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNaturalidade)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(txtNaturalidade)
                        .addGap(374, 374, 374))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDadosIdentificacao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbFeminino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbOutros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDadosEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNome)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rbMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCidade)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCEP)
                                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(cmbCargo, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                                                        .addComponent(lblCargo, javax.swing.GroupLayout.Alignment.LEADING))
                                                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblEstadoCivil, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                                        .addGap(16, 16, 16)
                                                        .addComponent(lblFormacao))
                                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtFormacao))))
                                            .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtBairro)
                                                    .addComponent(lblNumero)
                                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtEndereco)
                                                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblEndereco)
                                                    .addComponent(lblUF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addComponent(lblCpf)
                                                .addGap(142, 142, 142)
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(lblPCD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblDataNascimento)
                                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                                        .addComponent(rbSim)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(rbNao)
                                                        .addGap(10, 10, 10))
                                                    .addComponent(txtPcd))))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDadosIdentificacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblCpf)
                    .addComponent(lblDataNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(lblCargo)
                    .addComponent(lblPCD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMasculino)
                    .addComponent(rbSim)
                    .addComponent(rbNao)
                    .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFeminino)
                    .addComponent(txtPcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOutros)
                .addGap(12, 12, 12)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNaturalidade)
                    .addComponent(lblEstadoCivil)
                    .addComponent(lblFormacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDadosEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(lblEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(lblBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(lblUF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnContinuar)
                    .addComponent(btnVoltar)
                    .addComponent(cbEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        this.dispose();
        
        MenuSecretaria menu = new MenuSecretaria();
        menu.setVisible(true);
    }//GEN-LAST:event_btnMenu1ActionPerformed

    private void btnCadastrarAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAluno1ActionPerformed
        this.dispose();
        
        CadastrarNovoAluno cad = new CadastrarNovoAluno();
        cad.setVisible(true);
    }//GEN-LAST:event_btnCadastrarAluno1ActionPerformed

    private void btnPesquisaAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaAluno1ActionPerformed
        this.dispose();
        
        PesquisaAluno pesq = new PesquisaAluno();
        pesq.setVisible(true);
    }//GEN-LAST:event_btnPesquisaAluno1ActionPerformed

    private void btnPesquisaFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaFuncionario1ActionPerformed
        this.dispose();
        
        PesquisaFuncionario pesq = new PesquisaFuncionario();
        pesq.setVisible(true);
    }//GEN-LAST:event_btnPesquisaFuncionario1ActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        this.dispose();
        
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        try {
            Funcionario func = getFuncionario();
            EnderecoFunc endereco = getEndereco();
            String erro = validacao(func, endereco);
            if (erro != null){
                JOptionPane.showMessageDialog(null, erro);
            }else{
                if (cbEditar.isSelected()){
                    func = atualizarFunc(funcRecebido);
                }
                this.setVisible(false);
                cadFunc2.setVisible(true);
                
                FuncionarioDao dao = new FuncionarioDao();
                dao.definirRelAcesso(acesso, func);
                
                funcMetodo = func;
                enderecoMetodo = endereco;
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Preencha o campo '" + e.getMessage() + "' corretamente!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        
        MenuAdministrador menu = new MenuAdministrador();
        menu.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarNovoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarNovoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarNovoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarNovoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarNovoFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAluno;
    private javax.swing.JButton btnCadastrarAluno1;
    private javax.swing.JButton btnCadastrarFuncionario;
    private javax.swing.JButton btnCadastrarFuncionario1;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenu1;
    private javax.swing.ButtonGroup btnPcd;
    private javax.swing.JButton btnPesquisaAluno;
    private javax.swing.JButton btnPesquisaAluno1;
    private javax.swing.JButton btnPesquisaFuncionario;
    private javax.swing.JButton btnPesquisaFuncionario1;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSair1;
    private javax.swing.ButtonGroup btnSexo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox cbEditar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblAlunos;
    private javax.swing.JLabel lblAlunos1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDadosEndereco;
    private javax.swing.JLabel lblDadosIdentificacao;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblFormacao;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblFuncionario1;
    private javax.swing.JLabel lblNaturalidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPCD;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblUF;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbOutros;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtFormacao;
    private javax.swing.JTextField txtNaturalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPcd;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
    protected Funcionario getFuncionario(){
        ButtonModel m = null;
        
        String nome = txtNome.getText().trim();
        String cpf = txtCpf.getText();
        String dataNasc = txtDataNascimento.getText();
        String cargo = "";
        if (cmbCargo.getSelectedIndex() == 0){
            throw new NullPointerException("Cargo");
        }else{
            cargo = cmbCargo.getSelectedItem().toString();
        }
        
        boolean pcd = btnPcd.isSelected(m);
        String pcdTexto = txtPcd.getText();
        String naturalidade = txtNaturalidade.getText();
        String estadoCivil = txtEstadoCivil.getText();
        String formacao = txtFormacao.getText();
        
        Funcionario func = new Funcionario();
        if(rbMasculino.isSelected()) {
            func.setSexo(Funcionario.Sexo.Masculino);
        } else if(rbFeminino.isSelected()) {
            func.setSexo(Funcionario.Sexo.F);
        } else if(rbOutros.isSelected()) {
            func.setSexo(Funcionario.Sexo.O);
        }
        
        func.setNome(nome);
        func.setCpf(cpf);
        func.setDataNasc(dataNasc);
        func.setCargo(cargo);
        func.setPcd(pcd);
        func.setPcdTexto(pcdTexto);
        func.setNaturalidade(naturalidade);
        func.setEstadoCivil(estadoCivil);
        func.setFormacao(formacao);
        
        return func;
    }
    protected EnderecoFunc getEndereco(){
        String cep = txtCep.getText();
        String bairro = txtBairro.getText();
        String endereco = txtEndereco.getText();
        String cidade = txtCidade.getText();
        String numeroString = txtNumero.getText();
        
        if (!numeroString.matches("[0-9]+")){
            throw new NullPointerException("Número");
        }
        long numero = Long.parseLong(numeroString);
        String uf = txtUf.getText();
        
        EnderecoFunc ender = new EnderecoFunc();
        ender.setCep(cep);
        ender.setBairro(bairro);
        ender.setEndereco(endereco);
        ender.setCidade(cidade);
        ender.setNumero(numero);
        ender.setUf(uf);
        
        return ender;
    }
    
    protected String validacao(Funcionario func, EnderecoFunc endereco) throws NullPointerException{
        if (!func.getDataNasc().matches("[0-3][0-9][/][0-1][0-9][/][1-2][0-9]{3}")){
            return "Preencha o campo 'Data de Nascimento' no formato dd/mm/aaaa";
        }
        if (!func.getCpf().matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}")){ 
            return "Preencha o campo 'CPF' no formato xxx.xxx.xxx-xx";
        }
        if (func.getNome().isEmpty()){
            return "Preencha o campo 'Nome'";
        }
        if (func.getSexo() == null){
            return "Preencha o campo 'Sexo'";
        }
        if (func.getNaturalidade().isEmpty()){
            return "Preencha o campo 'Naturalidade'";
        }
        if (func.getEstadoCivil().isEmpty()){
            return "Preencha o campo 'Estado civil'";
        }
        if (func.getFormacao().isEmpty()){
            return "Preencha o campo 'Formação'";
        }
        if (endereco.getCep().isEmpty()){
            return "Preencha o campo 'CEP'";
        }
        if (endereco.getBairro().isEmpty()){
            return "Preencha o campo 'Bairro'";
        }
        if (endereco.getEndereco().isEmpty()){
            return "Preencha o campo 'Endereço'";
        }
        if (endereco.getCidade().isEmpty()){
            return "Preencha o campo 'Cidade'";
        }
        if (endereco.getUf().isEmpty()){
            return "Preencha o campo 'UF'";
        }
        return null;
    }
    
    protected Funcionario getFuncMetodo(){
        return funcMetodo;
    }

    protected EnderecoFunc getEnderecoMetodo(){
        return enderecoMetodo;
    }
    
    public final void verificarTela(){
        if (i == 0){
            cadFunc2 = new CadastrarNovoFuncionario2(this);
            i++;
        }
    }
    
    public void limparCampos(){
        txtNome.setText("");
        txtCpf.setText("");
        txtDataNascimento.setText("");
        btnSexo.clearSelection();
        cmbCargo.setSelectedIndex(0);
        btnPcd.clearSelection();
        txtPcd.setText("");
        txtNaturalidade.setText("");
        txtEstadoCivil.setText("");
        txtFormacao.setText("");
        txtCep.setText("");
        txtBairro.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        txtNumero.setText("");
        txtUf.setText("");
    }
    
    public void getAcessoAdm(){
        AcessoDao dao = new AcessoDao();
        this.acesso = dao.getAcesso(1);
    }
    
    public void getAcessoSecre(){
        AcessoDao dao = new AcessoDao();
        this.acesso = dao.getAcesso(5);
    }
    
    public String receberAcesso(){
        btnVoltar.setVisible(true);
        return "adm";
    }
    
    public void limitarAcesso(){
        btnMenu1.setEnabled(false);
        btnPesquisaFuncionario1.setEnabled(false);
        btnCadastrarAluno1.setEnabled(false);
        btnPesquisaAluno1.setEnabled(false);
        btnSair1.setEnabled(false);
        
        cbEditar.setEnabled(false);
        cbEditar.setSelected(true);
    }
    
    public Funcionario receberFunc(Funcionario func){
        funcRecebido = func;
        
        txtNome.setText(func.getNome());
        txtCpf.setText(func.getCpf());
        txtDataNascimento.setText(func.getDataNasc());
        switch (func.getSexo()) {
            case Masculino -> rbMasculino.setSelected(true);
            case F -> rbFeminino.setSelected(true);
            case O -> rbOutros.setSelected(true);
        }
        if (func.getCargo().equals("Administrador")){
            cmbCargo.setSelectedIndex(1);
        }
        if (func.getCargo().equals("Setor Financeiro")){
            cmbCargo.setSelectedIndex(2);
        }
        if (func.getCargo().equals("Suporte")){
            cmbCargo.setSelectedIndex(3);
        }
        if (func.getCargo().equals("Professor")){
            cmbCargo.setSelectedIndex(4);
        }
        if (func.getCargo().equals("Secretária")){
            cmbCargo.setSelectedIndex(5);
        }
        if (func.isPcd()){
            rbSim.setSelected(true);
        }else{
            rbNao.setSelected(true);
        }
        txtNaturalidade.setText(func.getNaturalidade());
        txtEstadoCivil.setText(func.getEstadoCivil());
        txtFormacao.setText(func.getFormacao());
        
        txtCep.setText(func.getIdEndereco().getCep());
        txtBairro.setText(func.getIdEndereco().getBairro());
        txtEndereco.setText(func.getIdEndereco().getEndereco());
        txtCidade.setText(func.getIdEndereco().getCidade());
        txtNumero.setText(String.valueOf(func.getIdEndereco().getNumero()));
        txtUf.setText(func.getIdEndereco().getUf());
            
        return func;
    }
    
    public Funcionario atualizarFunc(Funcionario func){
        switch (cmbCargo.getSelectedIndex()){
            case 1 -> func.setCargo("Administrador");
            case 2 -> func.setCargo("Setor Financeiro");
            case 3 -> func.setCargo("Suporte");
            case 4 -> func.setCargo("Professor");
            case 5 -> func.setCargo("Secretária");
        }
        func.setCpf(txtCpf.getText());
        func.setDataNasc(txtDataNascimento.getText());
        func.setEstadoCivil(txtEstadoCivil.getText());
        func.setFormacao(txtFormacao.getText());
        func.setNaturalidade(txtNaturalidade.getText());
        func.setNome(txtNome.getText());
        func.setPcd(rbSim.isSelected());
        func.setPcdTexto(txtPcd.getText());
        if (rbMasculino.isSelected()){
            func.setSexo(Funcionario.Sexo.Masculino);
        } else if(rbFeminino.isSelected()){
            func.setSexo(Funcionario.Sexo.F);
        }else{
            func.setSexo(Funcionario.Sexo.O);
        }
        
        EnderecoFunc endereco = func.getIdEndereco();
        endereco.setBairro(txtBairro.getText());
        endereco.setCep(txtCep.getText());
        endereco.setCidade(txtCidade.getText());
        endereco.setEndereco(txtEndereco.getText());
        endereco.setNumero(Long.parseLong(txtNumero.getText()));
        endereco.setUf(txtUf.getText());
                
        return func;
    }
}
