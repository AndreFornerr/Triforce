package triforce;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author l147033
 */
public class Cadastrar_Funcionario extends javax.swing.JFrame {

    /**
     * Creates new form Cadastrar_Funcionario
     */
    public Cadastrar_Funcionario() {
        initComponents();
        lbl_confirmar_nome.setVisible(false);
        lbl_confirmar_nome.setForeground(Color.red);
        lbl_confirmar_cpf.setVisible(false);
        lbl_confirmar_cpf.setForeground(Color.red);        
        lbl_confirmar_email.setVisible(false);
        lbl_confirmar_email.setForeground(Color.red);
        lbl_confirmar_telefone.setVisible(false);
        lbl_confirmar_telefone.setForeground(Color.red);
        lbl_confirmar_senha.setVisible(false);
        lbl_confirmar_senha.setForeground(Color.red);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_cpf = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_telefone = new javax.swing.JLabel();
        lbl_senha = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_cpf = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_telefone = new javax.swing.JTextField();
        txt_senha = new javax.swing.JTextField();
        btn_gravar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        lbl_confirmar_nome = new javax.swing.JLabel();
        lbl_confirmar_cpf = new javax.swing.JLabel();
        lbl_confirmar_email = new javax.swing.JLabel();
        lbl_confirmar_telefone = new javax.swing.JLabel();
        lbl_confirmar_senha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastrar Funcionario");

        lbl_nome.setText("Nome *");

        lbl_cpf.setText("CPF *");

        lbl_email.setText("E-mail *");

        lbl_telefone.setText("Telefone *");

        lbl_senha.setText("Senha *");

        btn_gravar.setText("Gravar");
        btn_gravar.setPreferredSize(new java.awt.Dimension(80, 25));
        btn_gravar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gravarMouseClicked(evt);
            }
        });

        btn_voltar.setText("Voltar");
        btn_voltar.setPreferredSize(new java.awt.Dimension(80, 25));

        lbl_confirmar_nome.setText("*");

        lbl_confirmar_cpf.setText("*");

        lbl_confirmar_email.setText("*");

        lbl_confirmar_telefone.setText("*");

        lbl_confirmar_senha.setText("*");

        jLabel2.setText("*campos obrigatorios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nome)
                    .addComponent(lbl_cpf)
                    .addComponent(lbl_email)
                    .addComponent(lbl_telefone)
                    .addComponent(lbl_senha))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_confirmar_nome))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_confirmar_telefone))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_confirmar_senha))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_confirmar_email))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_confirmar_cpf)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_confirmar_nome))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cpf)
                    .addComponent(lbl_confirmar_cpf))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_email)
                    .addComponent(lbl_confirmar_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_senha)
                    .addComponent(lbl_confirmar_senha)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefone)
                    .addComponent(lbl_confirmar_telefone)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gravarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gravarMouseClicked
        // TODO add your handling code here:
        //nome
        if (txt_nome.getText().length() > 0)
        {
            lbl_confirmar_nome.setVisible(false);
            
        }else
        {
            lbl_confirmar_nome.setVisible(true);
            
        }
        //cpf
        if(txt_cpf.getText().length() > 0 )
        {
            lbl_confirmar_cpf.setVisible(false);
        }else{
            lbl_confirmar_cpf.setVisible(true);
        }
        //email
        if(txt_email.getText().length() > 0 )
        {
            lbl_confirmar_email.setVisible(false);
        }else{
            lbl_confirmar_email.setVisible(true);
        }
       //telefone
        if(txt_telefone.getText().length()>0)
        {
            lbl_confirmar_telefone.setVisible(false);
        }else{
            lbl_confirmar_telefone.setVisible(true);
        }        
        //senha
        if(txt_senha.getText().length() > 0)
        {
            lbl_confirmar_senha.setVisible(false);
        }else{
            lbl_confirmar_senha.setVisible(true);
        }
        //// fim dos if encadeados 
        
        if(txt_nome.getText().length() > 0 
           && txt_cpf.getText().length()> 0
           && txt_email.getText().length() > 0
           && txt_telefone.getText().length() > 0            
           && txt_senha.getText().length() > 0)          
        {
        JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso");        
        }
        else{
       // JOptionPane.showMessageDialog(null, "Favor validar" );
        }
    }//GEN-LAST:event_btn_gravarMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_confirmar_cpf;
    private javax.swing.JLabel lbl_confirmar_email;
    private javax.swing.JLabel lbl_confirmar_nome;
    private javax.swing.JLabel lbl_confirmar_senha;
    private javax.swing.JLabel lbl_confirmar_telefone;
    private javax.swing.JLabel lbl_cpf;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_telefone;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_senha;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}
