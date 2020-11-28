
package program;


import java.awt.HeadlessException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public final class ConvertWindow extends javax.swing.JFrame {

      ConvertList_Name converter_lister = new ConvertList_Name();
      
    public ConvertWindow() throws InstantiationException, IllegalAccessException {

        try {
            initComponents();
            this.setLocationRelativeTo(null); //set jFrame to appear centered
            this.ComboBox_input.removeAllItems();
            this.ComboBox_output.removeAllItems();
            
            converter_lister.ConvertLister();
            
            for (String converter : converter_lister.getConverterLister()) {
                this.ComboBox_input.addItem(converter);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Input_Values = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboBox_output = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Output_values = new javax.swing.JTextField();
        Clear_Fields = new javax.swing.JButton();
        ComboBox_input = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opt_help = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ICONVERT - Conversão de Unidades");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(5, 196, 107));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(70, 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Entrada dos valores");

        Input_Values.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Input_Values.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_numbers_35px.png"))); // NOI18N
        jLabel2.setInheritsPopupMenu(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_currency_exchange_35px.png"))); // NOI18N
        jLabel4.setInheritsPopupMenu(false);

        ComboBox_output.setBorder(null);
        ComboBox_output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_outputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Saída dos valores");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(70, 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_export_35px.png"))); // NOI18N
        jLabel5.setInheritsPopupMenu(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_right_arrow_35px.png"))); // NOI18N
        jLabel6.setInheritsPopupMenu(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Olá! Seja bem vindo ao ICONVERT ");

        Output_values.setEditable(false);
        Output_values.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Output_values.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Clear_Fields.setText("Limpar");
        Clear_Fields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_FieldsActionPerformed(evt);
            }
        });

        ComboBox_input.setBorder(null);
        ComboBox_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_inputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Input_Values, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBox_input, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboBox_output, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(23, 23, 23)))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Output_values, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(Clear_Fields, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Input_Values, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel4)
                    .addComponent(ComboBox_input, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboBox_output)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Output_values, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Clear_Fields)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setOpaque(false);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(66, 40));

        jMenu1.setText("Arquivo");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuBar1.add(jMenu1);

        opt_help.setText("Ajuda");
        opt_help.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        opt_help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opt_helpMouseClicked(evt);
            }
        });
        jMenuBar1.add(opt_help);

        setJMenuBar(jMenuBar1);

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

    private void opt_helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opt_helpMouseClicked
        Help window_help = new Help();
        window_help.setVisible(true);
    }//GEN-LAST:event_opt_helpMouseClicked

    private void Clear_FieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_FieldsActionPerformed
        // TODO add your handling code here:
        Input_Values.setText("");
        Output_values.setText("");
    }//GEN-LAST:event_Clear_FieldsActionPerformed

    private void ComboBox_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_inputActionPerformed
        try {
            this.ComboBox_output.removeAllItems();
            if (this.ComboBox_input.isPopupVisible()) {

                String unit_selected = (String) this.ComboBox_input.getSelectedItem();
                int index_begin = unit_selected.indexOf("[");
                int index_end = unit_selected.indexOf("]");
                String unit = unit_selected.substring(index_begin + 1, index_end);
                JOptionPane.showMessageDialog(null, "A measure type of " + unit + " was selected.");

                if (unit.equals("distance")) {
                    this.ComboBox_output.setModel(new DefaultComboBoxModel<>(converter_lister.getDistanceList().toArray(new String[0])));
                }
                if (unit.equals("area")) {
                    this.ComboBox_output.setModel(new DefaultComboBoxModel<>(converter_lister.getAreaList().toArray(new String[0])));
                }
                if (unit.equals("volume")) {
                    this.ComboBox_output.setModel(new DefaultComboBoxModel<>(converter_lister.getVolumeList().toArray(new String[0])));
                }
                if (unit.equals("mass")) {
                    this.ComboBox_output.setModel(new DefaultComboBoxModel<>(converter_lister.getMassList().toArray(new String[0])));
                }
                if (unit.equals("time")) {
                    this.ComboBox_output.setModel(new DefaultComboBoxModel<>(converter_lister.getTimeList().toArray(new String[0])));
                }
                if (unit.equals("speed")) {
                    this.ComboBox_output.setModel(new DefaultComboBoxModel<>(converter_lister.getSpeedList().toArray(new String[0])));
                }
                if (unit.equals("acceleration")) {
                    this.ComboBox_output.setModel(new DefaultComboBoxModel<>(converter_lister.getAccelerationList().toArray(new String[0])));
                }
                if (unit.equals("storage")) {
                    this.ComboBox_output.setModel(new DefaultComboBoxModel<>(converter_lister.getStorageList().toArray(new String[0])));
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e);
        }
    }//GEN-LAST:event_ComboBox_inputActionPerformed

    private void ComboBox_outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_outputActionPerformed

        try {
            if (this.ComboBox_output.isPopupVisible()) {
                
                String selectedFrom = (String) this.ComboBox_input.getSelectedItem();
                String selectedOut = (String) this.ComboBox_output.getSelectedItem();
                String ConvertFrom_value = this.Input_Values.getText();
                
                calculator values_converter = new calculator(selectedOut, selectedFrom, ConvertFrom_value);
                
                this.Output_values.setText(Double.toString(values_converter.Calculator_values()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e);
        }
    }//GEN-LAST:event_ComboBox_outputActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new ConvertWindow().setVisible(true);
            } catch (IllegalAccessException | InstantiationException e) {
                JOptionPane.showMessageDialog(null, "Error:" + e);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear_Fields;
    private javax.swing.JComboBox<String> ComboBox_input;
    private javax.swing.JComboBox<String> ComboBox_output;
    private javax.swing.JTextField Input_Values;
    private javax.swing.JTextField Output_values;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu opt_help;
    // End of variables declaration//GEN-END:variables
}
