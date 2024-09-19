package trab;

import org.mariuszgromada.math.mxparser.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
        this.setTitle("Método da Quadratura Gaussiana");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtExp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLimiteInf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLimiteSup = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumPontos = new javax.swing.JTextField();
        txtErro = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        resultadoFinal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrecisao = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 453));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setText("Quadratura Gaussiana");

        btnCalcular.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("f(x):");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 0));
        jLabel3.setText("A:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("B:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText("Num.Pontos");

        txtErro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtErro.setForeground(new java.awt.Color(51, 255, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 0));
        jLabel7.setText("Erro:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 0));
        jLabel8.setText("Resultado:");

        resultadoFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resultadoFinal.setForeground(new java.awt.Color(51, 255, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 0));
        jLabel9.setText("Precisão:");

        txtPrecisao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrecisao.setForeground(new java.awt.Color(51, 255, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecisao, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtErro, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(resultadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNumPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtLimiteInf, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtLimiteSup, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtNumPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLimiteInf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtLimiteSup, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(resultadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecisao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtErro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validaCampos(String pExp, String pLimInf, String pLimSup, String pNumPontos){
        return pExp.equals("") || pLimInf.equals("") || pLimSup.equals("") || pNumPontos.equals("");
    }
    
    private double f(String funcao, double x) {
        Function f = new Function("f", funcao, "x");
        Expression e = new Expression("f("+x+")", f);
        return e.calculate();
    }
    
    private double quad_gauss(Map<Integer, PesoPonto> mapaPesosPontos, int num, double a, double b, String funcao) {
        ArrayList<Double> pontos2 = new ArrayList<>();
        double x = 0;
        double w = 0;
        double soma = 0;
        PesoPonto pp = mapaPesosPontos.get(num);
        
        for(int i = 0; i < num; i++) {
            pontos2.add(pp.getPontos().get(i) * ((b - a) / 2) + ((b + a) / 2));
            x = pontos2.get(i);
            w = pp.getPesos().get(i);
            soma += w * f(funcao, x);
        }
        soma *= ((b - a) / 2);
                
        return soma;
    }
    
    private double erro_quad_gauss(int num, double a, double b, String funcao) {
        double h = (b - a)/num;
        double f1 = f(funcao, a+h*2);
        double f2 = f(funcao, a+h);
        double f3 = f(funcao, a);
        double f4 = f(funcao, a - h);
        double f5 = f(funcao, a-2*h);
        
        double derivada_quarta = (f1 - 4 * f2 + 6 * f3 - 4 * f4 + f5) / (Math.pow(h,4));
        double erro = 0.0074074074 * derivada_quarta;
        
        return erro;
    }
    
    private double extrapolacao_richardson(Map<Integer, PesoPonto> mapaPesosPontos, int num, double a, double b, String funcao) {
        int num2;        
        if(num == 2) num2 = num + 1;
        else num2 = num - 1;
        
        double integral1 = quad_gauss(mapaPesosPontos, num, a, b, funcao); // + erro_quad_gauss(num1, a, b, funcao);
        double integral2 = quad_gauss(mapaPesosPontos, num2, a, b, funcao); // + erro_quad_gauss(num2, a, b, funcao);
        double resultado = integral2 + ((Math.pow(num,2))/(Math.pow(num2,2) - Math.pow(num,2))) * (integral2 - integral1);
        
        return resultado;
    }
    
    //TENTATIVA FRACASSADA DE RICHARDSON
    /*private double quad_gauss_comH(Map<Integer, PesoPonto> mapaPesosPontos, int num, double a, double b, String funcao, double h) {
        ArrayList<Double> pontos2 = new ArrayList<>();
        double x = 0;
        double w = 0;
        double soma = 0;
        PesoPonto pp = mapaPesosPontos.get(num);
        
        for(int i = 0; i < num; i++) {
            pontos2.add(pp.getPontos().get(i) * ((b - a) / 2) + ((b + a) / 2) + h);
            x = pontos2.get(i);
            w = pp.getPesos().get(i);
            soma += w * f(funcao, x);
        }
        soma *= ((b - a) / 2);
                
        return soma;
    }*/
    
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double a = 0;
        double b = 0;
        int num = 0;
        
        Map<Integer, PesoPonto> mapaPesosPontos;
        mapaPesosPontos = new HashMap<Integer, PesoPonto>();
        PesoPonto n2 = new PesoPonto(2);
        PesoPonto n3 = new PesoPonto(3);
        PesoPonto n4 = new PesoPonto(4);
        PesoPonto n5 = new PesoPonto(5);
        mapaPesosPontos.put(2, n2);
        mapaPesosPontos.put(3, n3);
        mapaPesosPontos.put(4, n4);
        mapaPesosPontos.put(5, n5);
        
        if(validaCampos(txtExp.getText(),txtLimiteInf.getText(),txtLimiteSup.getText(),txtNumPontos.getText())){
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos", "Quadratura Gaussiana", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            a = Double.parseDouble(txtLimiteInf.getText());
            b =  Double.parseDouble(txtLimiteSup.getText());
            num = Integer.parseInt(txtNumPontos.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Somente valores númericos são permitidos!", "Quadratura Gaussiana", JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        if(num > 5 || num < 2){
            JOptionPane.showMessageDialog(this, "Informe um valor no intervalo: 2 <= valor <= 5 ", "Quadratura Gaussiana", JOptionPane.ERROR_MESSAGE);
            return;
        }
	
        String funcao = txtExp.getText();
        
        double integralNumerica = quad_gauss(mapaPesosPontos, num, a, b, funcao);
        resultadoFinal.setText(String.valueOf(integralNumerica));
        
        double erro = erro_quad_gauss(num, a, b, funcao);
        txtErro.setText(String.valueOf(erro));
        
        double richardson = extrapolacao_richardson(mapaPesosPontos, num, a, b, funcao);
        txtPrecisao.setText(String.valueOf(richardson));
        
        /***********  INTEGRAL DO MATH PARSER  ***********
        Expression integralMathParser = new Expression("2 * int("+txtExp.getText()+", x, "+a+", "+b+")");
        double precisao = integralMathParser.calculate() - integralNumerica;
        txtPrecisao.setText(String.valueOf(precisao));
        *************************************************/
        
        
        
        
        //EXTRAPOLAÇÃO DE RICHARDSON - TENTATIVAS FRACASSADAS
        
        /**********   ERRADÍSSIMO   **********
        double c1_1 = quad_gauss(mapaPesosPontos, 2, a, b, funcao);
        double c1_2 = quad_gauss(mapaPesosPontos, 3, a, b, funcao);
        double c1_3 = quad_gauss(mapaPesosPontos, 4, a, b, funcao);
        double c1_4 = quad_gauss(mapaPesosPontos, 5, a, b, funcao);
        
        double c2_1 = (2 * c1_2 - c1_1);  
        double c2_2 = (2 * c1_3 - c1_2);
        double c2_3 = (2 * c1_4 - c1_3);
        
        double c3_1 = (4 * c2_2 - c2_1) / 3;
        double c3_2 = (4 * c2_3 - c2_2) / 3;
        
        double c4_1 = (4 * c3_2 - c3_1) / 7;
        
        double result = 0;
        
        switch(num) {
            case 2:
                result = c1_1;
                break;
            case 3:
                result = c2_1;
                break;
            case 4:
                result = c3_1;
                break;
            case 5:
                result = c4_1;
                break;
        }
        
        txtErro.setText(String.valueOf(result));
        */
        
        /***************  FORMULA COM ERRO  **************
        int numExtrapolacoes = 4;
        double auxOrdemErro = 1;
        int ordemErro = 0;
        while(auxOrdemErro > erro) {
            ordemErro++;
        }
        double h = erro;
        double fi;
        for(int i = ordemErro + 1; i < numExtrapolacoes; i++) {
            fi = Math.pow(2,i) * quad_gauss(mapaPesosPontos, num, a, b, f);
        }
        */
        
        /***************  ESTA AFASTANDO  ***************
        int num1;
        int num2;        
        if(num == 2) {
            num1 = num;
            num2 = num + 1;
        } else {
            num1 = num;
            num2 = num - 1;
        }
        double integral1 = quad_gauss(mapaPesosPontos, num1, a, b, funcao) + erro_quad_gauss(num1, a, b, funcao);
        double integral2 = quad_gauss(mapaPesosPontos, num2, a, b, funcao) + erro_quad_gauss(num2, a, b, funcao);
        double resultado = integral2 + ((Math.pow(num1,2))/(Math.pow(num2,2) - Math.pow(num1,2))) * (integral2 - integral1);
        
        txtPrecisao.setText(String.valueOf(resultado));
        */
        /**********   ERRADÍSSIMO   **********
        double h;
        double int1;
        double f1, f2, f3, f4;
        
        h = erro;        
        int1 = quad_gauss_comH(mapaPesosPontos, num, a, b, funcao, h);
        f1 = (int1 - integralNumerica) / h;
        
        h = h/2;        
        int1 = quad_gauss_comH(mapaPesosPontos, num, a, b, funcao, h);
        f2 = (int1 - integralNumerica) / h;
        
        h = h/4;        
        int1 = quad_gauss_comH(mapaPesosPontos, num, a, b, funcao, h);
        f3 = (int1 - integralNumerica) / h;
        
        h = h/8;        
        int1 = quad_gauss_comH(mapaPesosPontos, num, a, b, funcao, h);
        f4 = (int1 - integralNumerica) / h;
        
        double B1, B2, B3;
        B1 = 2 * f2 - f1;
        B2 = 2 * f3 - f2;
        B3 = 2 * f4 - f3;
        
        double C1, C2;
        C1 = (4 * B2 - B1) / 3;
        C2 = (4 * B3 - B2) / 3;
        
        double D1;
        D1 = (8 * C2 - C1) / 7;
        
        txtPrecisao.setText(String.valueOf(D1));
        */
    }//GEN-LAST:event_btnCalcularActionPerformed

    public static void main(String args[]) {   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel resultadoFinal;
    private javax.swing.JLabel txtErro;
    private javax.swing.JTextField txtExp;
    private javax.swing.JTextField txtLimiteInf;
    private javax.swing.JTextField txtLimiteSup;
    private javax.swing.JTextField txtNumPontos;
    private javax.swing.JLabel txtPrecisao;
    // End of variables declaration//GEN-END:variables

    private Object getPesos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
