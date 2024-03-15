/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author dmoc2
 */
public class PlaylistGUI extends javax.swing.JFrame {

    /**
     * Creates new form PlaylistGUI
     */
    public PlaylistGUI() {
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

        border = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        layeredHeadPane = new javax.swing.JLayeredPane();
        HeaderPane = new javax.swing.JPanel();
        HomeLabel = new javax.swing.JLabel();
        PopRapPanel = new javax.swing.JPanel();
        HeaderPane2 = new javax.swing.JPanel();
        LikeLogo1 = new javax.swing.JLabel();
        LikedSongsLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayPopSongs = new javax.swing.JTextArea();
        searchTF1 = new javax.swing.JTextField();
        searchBTN1 = new javax.swing.JButton();
        deleteBTN1 = new javax.swing.JButton();
        displayBTN1 = new javax.swing.JButton();
        shuffle = new javax.swing.JButton();
        IndieRockPanel = new javax.swing.JPanel();
        HeaderPane1 = new javax.swing.JPanel();
        LikeLogo = new javax.swing.JLabel();
        LikedSongsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayLikedSongsArea = new javax.swing.JTextArea();
        searchTF = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        displayBTN = new javax.swing.JButton();
        shuffleBTN = new javax.swing.JButton();
        StringifyLogo = new javax.swing.JLabel();
        HeadingText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        border.setBackground(new java.awt.Color(0, 0, 0));

        body.setBackground(new java.awt.Color(0, 0, 0));

        layeredHeadPane.setBackground(new java.awt.Color(153, 204, 255));

        HeaderPane.setBackground(new java.awt.Color(0, 204, 204));

        HomeLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        HomeLabel.setText("Pop/Rap | That Friday Feeling PlayList             ");

        javax.swing.GroupLayout HeaderPaneLayout = new javax.swing.GroupLayout(HeaderPane);
        HeaderPane.setLayout(HeaderPaneLayout);
        HeaderPaneLayout.setHorizontalGroup(
            HeaderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPaneLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(HomeLabel)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        HeaderPaneLayout.setVerticalGroup(
            HeaderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(HomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layeredHeadPane.setLayer(HeaderPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layeredHeadPaneLayout = new javax.swing.GroupLayout(layeredHeadPane);
        layeredHeadPane.setLayout(layeredHeadPaneLayout);
        layeredHeadPaneLayout.setHorizontalGroup(
            layeredHeadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layeredHeadPaneLayout.setVerticalGroup(
            layeredHeadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredHeadPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(HeaderPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        HeaderPane2.setBackground(new java.awt.Color(0, 204, 204));

        LikeLogo1.setBackground(new java.awt.Color(153, 204, 255));
        LikeLogo1.setForeground(new java.awt.Color(255, 255, 255));
        LikeLogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LikeLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/loveHeartLogo.png"))); // NOI18N

        LikedSongsLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        LikedSongsLabel1.setText("Liked Songs |   View all of your favourite Songs ");

        javax.swing.GroupLayout HeaderPane2Layout = new javax.swing.GroupLayout(HeaderPane2);
        HeaderPane2.setLayout(HeaderPane2Layout);
        HeaderPane2Layout.setHorizontalGroup(
            HeaderPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LikeLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LikedSongsLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderPane2Layout.setVerticalGroup(
            HeaderPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPane2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(HeaderPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LikeLogo1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LikedSongsLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        displayPopSongs.setColumns(20);
        displayPopSongs.setRows(5);
        displayPopSongs.setText("Title \t Artist \t Album \t Genre \n");
        jScrollPane2.setViewportView(displayPopSongs);

        searchTF1.setToolTipText("Enter the song name to complete the search");

        searchBTN1.setBackground(new java.awt.Color(102, 102, 102));
        searchBTN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/searchIcon.png"))); // NOI18N
        searchBTN1.setToolTipText("Enter into the searchterm field and press me");
        searchBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTN1ActionPerformed(evt);
            }
        });

        deleteBTN1.setBackground(new java.awt.Color(255, 102, 102));
        deleteBTN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/binIcon.png"))); // NOI18N
        deleteBTN1.setToolTipText("Press me to delete the most recent song");
        deleteBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTN1ActionPerformed(evt);
            }
        });

        displayBTN1.setText("Display");
        displayBTN1.setToolTipText("Press me to refresh the liked songs after searching");
        displayBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTN1ActionPerformed(evt);
            }
        });

        shuffle.setText("Shuffle");

        javax.swing.GroupLayout PopRapPanelLayout = new javax.swing.GroupLayout(PopRapPanel);
        PopRapPanel.setLayout(PopRapPanelLayout);
        PopRapPanelLayout.setHorizontalGroup(
            PopRapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PopRapPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PopRapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PopRapPanelLayout.createSequentialGroup()
                        .addComponent(searchTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBTN1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayBTN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PopRapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBTN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shuffle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PopRapPanelLayout.setVerticalGroup(
            PopRapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PopRapPanelLayout.createSequentialGroup()
                .addComponent(HeaderPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PopRapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PopRapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(deleteBTN1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(displayBTN1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(PopRapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PopRapPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PopRapPanelLayout.createSequentialGroup()
                        .addComponent(shuffle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredHeadPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PopRapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(layeredHeadPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
            .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PopRapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabbedPane.addTab("Pop/Rap", homePanel);

        HeaderPane1.setBackground(new java.awt.Color(0, 204, 204));

        LikeLogo.setBackground(new java.awt.Color(153, 204, 255));
        LikeLogo.setForeground(new java.awt.Color(255, 255, 255));
        LikeLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LikeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/loveHeartLogo.png"))); // NOI18N

        LikedSongsLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        LikedSongsLabel.setText("Liked Songs |   View all of your favourite Songs ");

        javax.swing.GroupLayout HeaderPane1Layout = new javax.swing.GroupLayout(HeaderPane1);
        HeaderPane1.setLayout(HeaderPane1Layout);
        HeaderPane1Layout.setHorizontalGroup(
            HeaderPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LikeLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LikedSongsLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderPane1Layout.setVerticalGroup(
            HeaderPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(HeaderPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LikeLogo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LikedSongsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        displayLikedSongsArea.setColumns(20);
        displayLikedSongsArea.setRows(5);
        displayLikedSongsArea.setText("Title \t Artist \t Album \t Genre \n");
        jScrollPane1.setViewportView(displayLikedSongsArea);

        searchTF.setToolTipText("Enter the song name to complete the search");

        searchBTN.setBackground(new java.awt.Color(102, 102, 102));
        searchBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/searchIcon.png"))); // NOI18N
        searchBTN.setToolTipText("Enter into the searchterm field and press me");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        deleteBTN.setBackground(new java.awt.Color(255, 102, 102));
        deleteBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/binIcon.png"))); // NOI18N
        deleteBTN.setToolTipText("Press me to delete the most recent song");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        displayBTN.setText("Display");
        displayBTN.setToolTipText("Press me to refresh the liked songs after searching");
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });

        shuffleBTN.setText("Shuffle");

        javax.swing.GroupLayout IndieRockPanelLayout = new javax.swing.GroupLayout(IndieRockPanel);
        IndieRockPanel.setLayout(IndieRockPanelLayout);
        IndieRockPanelLayout.setHorizontalGroup(
            IndieRockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(IndieRockPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IndieRockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(IndieRockPanelLayout.createSequentialGroup()
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IndieRockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shuffleBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        IndieRockPanelLayout.setVerticalGroup(
            IndieRockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IndieRockPanelLayout.createSequentialGroup()
                .addComponent(HeaderPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(IndieRockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(IndieRockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(deleteBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(displayBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(IndieRockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shuffleBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabbedPane.addTab("Indie/Rock", IndieRockPanel);

        StringifyLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Stringify.png"))); // NOI18N

        HeadingText.setBackground(new java.awt.Color(255, 255, 255));
        HeadingText.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 35)); // NOI18N
        HeadingText.setForeground(new java.awt.Color(255, 255, 255));
        HeadingText.setText("Stringify");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StringifyLogo)
                .addGap(18, 18, 18)
                .addComponent(HeadingText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StringifyLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeadingText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout borderLayout = new javax.swing.GroupLayout(border);
        border.setLayout(borderLayout);
        borderLayout.setHorizontalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        borderLayout.setVerticalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
       
    }//GEN-LAST:event_displayBTNActionPerformed

    private void searchBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBTN1ActionPerformed

    private void deleteBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBTN1ActionPerformed

    private void displayBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayBTN1ActionPerformed

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
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaylistGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPane;
    private javax.swing.JPanel HeaderPane1;
    private javax.swing.JPanel HeaderPane2;
    private javax.swing.JLabel HeadingText;
    private javax.swing.JLabel HomeLabel;
    private static javax.swing.JPanel IndieRockPanel;
    private javax.swing.JLabel LikeLogo;
    private javax.swing.JLabel LikeLogo1;
    private javax.swing.JLabel LikedSongsLabel;
    private javax.swing.JLabel LikedSongsLabel1;
    private static javax.swing.JPanel PopRapPanel;
    private javax.swing.JLabel StringifyLogo;
    private javax.swing.JPanel body;
    private javax.swing.JPanel border;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton deleteBTN1;
    private javax.swing.JButton displayBTN;
    private javax.swing.JButton displayBTN1;
    public static javax.swing.JTextArea displayLikedSongsArea;
    public static javax.swing.JTextArea displayPopSongs;
    private javax.swing.JPanel homePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLayeredPane layeredHeadPane;
    private javax.swing.JButton searchBTN;
    private javax.swing.JButton searchBTN1;
    public static javax.swing.JTextField searchTF;
    public static javax.swing.JTextField searchTF1;
    private javax.swing.JButton shuffle;
    private javax.swing.JButton shuffleBTN;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}