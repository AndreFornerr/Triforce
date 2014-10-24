package triforce;


import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalBorders;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a145292
 */
public class CadastroProduto extends javax.swing.JFrame {
     
    /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {
        initComponents();
        lbl_confirmarTitulo.setVisible(false);
        lbl_confirmarTitulo.setForeground(Color.green);
        lbl_confirmarVolume.setVisible(false);
        lbl_confirmarVolume.setForeground(Color.white);
        lbl_confirmarAutor.setVisible(false);
        lbl_confirmarAutor.setForeground(Color.black);
        lbl_confirmarDatalcto.setVisible(false);
        lbl_confirmarDatalcto.setForeground(Color.blue);
        lbl_confirmarCategoria.setVisible(false);
        lbl_confirmarCategoria.setForeground(Color.red);
        lbl_confirmarPreco.setVisible(false);
        lbl_confirmarPreco.setForeground(Color.pink);
        lbl_confirmarSaldo.setVisible(false);
        lbl_confirmarSaldo.setForeground(Color.yellow);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        lbl_cadastroproduto = new javax.swing.JLabel();
        lbl_volume = new javax.swing.JLabel();
        lbl_autor = new javax.swing.JLabel();
        lbl_datalcto = new javax.swing.JLabel();
        lbl_categoria = new javax.swing.JLabel();
        lbl_preco = new javax.swing.JLabel();
        lbl_valor = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        txt_volume = new javax.swing.JTextField();
        txt_autor = new javax.swing.JTextField();
        txt_categoria = new javax.swing.JTextField();
        txt_preco = new javax.swing.JTextField();
        txt_saldo = new javax.swing.JTextField();
        txt_datalco = new javax.swing.JTextField();
        btn_gravar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        lbl_confirmarTitulo = new javax.swing.JLabel();
        lbl_confirmarVolume = new javax.swing.JLabel();
        lbl_confirmarAutor = new javax.swing.JLabel();
        lbl_confirmarDatalcto = new javax.swing.JLabel();
        lbl_confirmarCategoria = new javax.swing.JLabel();
        lbl_confirmarPreco = new javax.swing.JLabel();
        lbl_confirmarSaldo = new javax.swing.JLabel();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_titulo.setText("Título*");

        lbl_cadastroproduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_cadastroproduto.setText("Cadastro Produto");

        lbl_volume.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_volume.setText("Volume*");

        lbl_autor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_autor.setText("Autor*");

        lbl_datalcto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_datalcto.setText("DataLcto*");

        lbl_categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_categoria.setText("Categoria*");

        lbl_preco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_preco.setText("Preço*");

        lbl_valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_valor.setText("Saldo*");

        btn_gravar.setText("Gravar");
        btn_gravar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gravarMouseClicked(evt);
            }
        });
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });

        btn_voltar.setText("Voltar");
        btn_voltar.setToolTipText("");

        lbl_confirmarTitulo.setText("* ");

        lbl_confirmarVolume.setText("* ");

        lbl_confirmarAutor.setText("* ");

        lbl_confirmarDatalcto.setText("* ");

        lbl_confirmarCategoria.setText("* ");

        lbl_confirmarPreco.setText("* ");

        lbl_confirmarSaldo.setText("*");

        label1.setText("*Campos obrigátorios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_datalcto)
                            .addComponent(lbl_autor)
                            .addComponent(lbl_volume)
                            .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_autor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_titulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_volume, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_datalco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_categoria)
                            .addComponent(lbl_preco)
                            .addComponent(lbl_valor))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_gravar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_voltar))
                            .addComponent(txt_preco)
                            .addComponent(txt_saldo)
                            .addComponent(txt_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_cadastroproduto)
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_confirmarTitulo)
                    .addComponent(lbl_confirmarVolume)
                    .addComponent(lbl_confirmarAutor)
                    .addComponent(lbl_confirmarDatalcto)
                    .addComponent(lbl_confirmarCategoria)
                    .addComponent(lbl_confirmarPreco)
                    .addComponent(lbl_confirmarSaldo))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_cadastroproduto)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_confirmarTitulo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_volume)
                    .addComponent(txt_volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_confirmarVolume))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_autor)
                    .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_confirmarAutor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_datalcto)
                    .addComponent(txt_datalco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_confirmarDatalcto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_categoria)
                    .addComponent(txt_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_confirmarCategoria))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_preco)
                    .addComponent(txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_confirmarPreco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_valor)
                    .addComponent(txt_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_confirmarSaldo))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_gravar)
                    .addComponent(btn_voltar))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void btn_gravarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gravarMouseClicked
        // TODO add your handling code here:
        
       
        ///visibilidade do titulo
        if (txt_titulo.getText().length() > 0)
        {
            lbl_confirmarTitulo.setVisible(false);
            
        }else
        {
            lbl_confirmarTitulo.setVisible(true);
            
        }
        ///////visibilidade volume
        if(txt_volume.getText().length() > 0 )
        {
            lbl_confirmarVolume.setVisible(false);
        }else{
            lbl_confirmarVolume.setVisible(true);
        }
       ///////visibilidade auto
        if(txt_autor.getText().length()>0)
        {
            lbl_confirmarAutor.setVisible(false);
        }else{
            lbl_confirmarAutor.setVisible(true);
        }
        /// visibilidade de data  de lançamento
        if(txt_datalco.getText().length() > 0 )
        {
            lbl_confirmarDatalcto.setVisible(false);
        }else{
            lbl_confirmarDatalcto.setVisible(true);
        }
        //visibilidade categoria
        if(txt_categoria.getText().length() > 0)
        {
            lbl_confirmarCategoria.setVisible(false);
        }else{
            lbl_confirmarCategoria.setVisible(true);
        }
        //visibilidade preco
        if(txt_preco.getText().length() > 0 )
        {
            lbl_confirmarPreco.setVisible(false);
        }else {
            lbl_confirmarPreco.setVisible(true);
        }
        //visibilidae do preco 
        if(txt_saldo.getText().length() > 0 )
        {
            lbl_confirmarSaldo.setVisible(false);
        }else{
            lbl_confirmarSaldo.setVisible(true);
        }
        //// fim dos if encadeados 
        
        if(txt_titulo.getText().length() > 0 
           && txt_volume.getText().length()> 0 
           && txt_autor.getText().length() > 0 
           && txt_datalco.getText().length() > 0 
           && txt_categoria.getText().length() > 0 
           && txt_preco.getText().length() > 0 
           && txt_saldo.getText().length() > 0 )
            
        {
        JOptionPane.showMessageDialog(null, "Dados Cadastrados com sucesso");
        
        }
        else{
       // JOptionPane.showMessageDialog(null, "Favor validar" );
        }
    }//GEN-LAST:event_btn_gravarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_voltar;
    private java.awt.Label label1;
    private javax.swing.JLabel lbl_autor;
    private javax.swing.JLabel lbl_cadastroproduto;
    private javax.swing.JLabel lbl_categoria;
    private javax.swing.JLabel lbl_confirmarAutor;
    private javax.swing.JLabel lbl_confirmarCategoria;
    private javax.swing.JLabel lbl_confirmarDatalcto;
    private javax.swing.JLabel lbl_confirmarPreco;
    private javax.swing.JLabel lbl_confirmarSaldo;
    private javax.swing.JLabel lbl_confirmarTitulo;
    private javax.swing.JLabel lbl_confirmarVolume;
    private javax.swing.JLabel lbl_datalcto;
    private javax.swing.JLabel lbl_preco;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_valor;
    private javax.swing.JLabel lbl_volume;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_datalco;
    private javax.swing.JTextField txt_preco;
    private javax.swing.JTextField txt_saldo;
    private javax.swing.JTextField txt_titulo;
    private javax.swing.JTextField txt_volume;
    // End of variables declaration//GEN-END:variables
}
