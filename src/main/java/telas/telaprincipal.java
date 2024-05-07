package telas;
import javax.swing.JOptionPane;
import java.text.*;

public class telaprincipal extends javax.swing.JInternalFrame {

   
    public telaprincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuReserva = new javax.swing.JMenu();
        MenuHospede = new javax.swing.JMenu();
        MenuQuartos = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenu();

        MenuReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reservar.png"))); // NOI18N
        MenuReserva.setText("Reserva");
        MenuReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReservaActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuReserva);

        MenuHospede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hospedes.png"))); // NOI18N
        MenuHospede.setText("Hospede");
        MenuHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuHospedeActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuHospede);

        MenuQuartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quarto.png"))); // NOI18N
        MenuQuartos.setText("Quartos");
        MenuQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuQuartosActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuQuartos);

        MenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sair.png"))); // NOI18N
        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuQuartosActionPerformed
         telaquartos pousada = new telaquartos();
         pousada.setVisible(true);
//         Desktop.add(pousada);
    }//GEN-LAST:event_MenuQuartosActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
         int MenuSair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair? ", "Atenção",
            JOptionPane.YES_NO_OPTION);
        if(MenuSair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_MenuSairActionPerformed

    private void MenuReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuReservaActionPerformed

    private void MenuHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuHospedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuHospedeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuHospede;
    private javax.swing.JMenu MenuQuartos;
    private javax.swing.JMenu MenuReserva;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
