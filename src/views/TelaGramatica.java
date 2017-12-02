/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
import utils.AutomatoException;
import listener.GramaticaListener;
import utils.CustomDocumentFilter;
import javax.swing.text.AbstractDocument;
import static utils.GramaticaRegex.GRAMATICA;
import javax.swing.JOptionPane;
/**
 *
 * @author Francisco
 */
public class TelaGramatica extends javax.swing.JPanel {
    private final GramaticaListener l = new GramaticaListener(this);
    /**
     * Creates new form TelaGramatic
     */
    public TelaGramatica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gramaticaTextArea = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(400, 400));

        buttonEnviar.setText("Enviar");
        buttonEnviar.addActionListener(l);

        gramaticaTextArea.setColumns(20);
        gramaticaTextArea.setRows(5);
        gramaticaTextArea.setText("S=aA|aC|bB|bC\nA=aF|a\nB=bF|b\nC=aA|aC|bB|bC\nF=aF|bF|a|b");
        jScrollPane1.setViewportView(gramaticaTextArea);
        AbstractDocument document = (AbstractDocument) gramaticaTextArea.getDocument();
        document.setDocumentFilter(new CustomDocumentFilter(GRAMATICA));

        jLabel6.setText("Gramática:");

        jLabel3.setText("Nulo:");

        jLabel4.setText("&");

        jLabel1.setText("Regra:");

        jLabel2.setText("N=tN|tN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonEnviar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEnviar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public String getGramatica(){     
        try {
            validaGramatica();
            return gramaticaTextArea.getText();
        } catch (AutomatoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
        return null;
    }
    
    public void validaGramatica() throws AutomatoException{
        String gramatica = gramaticaTextArea.getText();
        
        int index = gramatica.lastIndexOf("\n");
        
        if(gramatica.equals("")||gramatica.substring(index+1).length() < 3){
           throw new AutomatoException("Insira uma gramática válida.");
       }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEnviar;
    private javax.swing.JTextArea gramaticaTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
