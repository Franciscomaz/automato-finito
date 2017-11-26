/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import automato.AutomatoFinitoDeterministico;
import automato.TabelaAutomato;
import listener.AutomatoListener;

/**
 *
 * @author Francisco
 */
public final class TelaAutomato extends javax.swing.JPanel {

    private final AutomatoListener l = new AutomatoListener(this);
    private final AutomatoFinitoDeterministico automato;

    /**
     * Creates new form TelaAutomato
     *
     * @param automato
     */
    public TelaAutomato(AutomatoFinitoDeterministico automato) {
        initComponents();
        this.automato = automato;
        tabelaAutomato.setModel(new TabelaAutomato(automato));
        automato.getMatrizTransicoes().imprimir();
    }
    
    public AutomatoFinitoDeterministico getAutomatoFinito(){
        return automato;
    }

    public String getSentenca(){
        return fieldSentenca.getText();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAutomato = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fieldSentenca = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(400, 528));
        setMinimumSize(new java.awt.Dimension(400, 528));
        setPreferredSize(new java.awt.Dimension(400, 528));

        tabelaAutomato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaAutomato);

        jLabel1.setText("Sentença:");

        btnVerificar.addActionListener(l);
        btnVerificar.setText("Verificar");

        buttonVoltar.addActionListener(l);
        buttonVoltar.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(fieldSentenca, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVerificar))
                            .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldSentenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(buttonVoltar)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField fieldSentenca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAutomato;
    // End of variables declaration//GEN-END:variables
}
