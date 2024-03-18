/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicmanagerapp;

import javax.swing.JOptionPane;

/**
 *
 * @author dmoc2
 */
public class Music_Manager_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Music_Manager_GUI
     */
    
    
    SongSchema newSong;
    
       PopRapDDL  loadDDL1;
       SongStackInterface loadFunctions;
       
    public Music_Manager_GUI() {
        initComponents();
        newSong = new SongSchema();
        loadFunctions = new SavedSongsStack();
         loadDDL1 = new PopRapDDL();
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
        jLabel1 = new javax.swing.JLabel();
        HomeLabel = new javax.swing.JLabel();
        songNameLabel = new javax.swing.JLabel();
        songNameTF = new javax.swing.JTextField();
        artistNameLabel = new javax.swing.JLabel();
        artistNameTF = new javax.swing.JTextField();
        albumNameLabel = new javax.swing.JLabel();
        albumNameTF = new javax.swing.JTextField();
        GenreLabel = new javax.swing.JLabel();
        genreComboBox = new javax.swing.JComboBox<>();
        addSongBTN = new javax.swing.JButton();
        LikedSongPlaylistPanel = new javax.swing.JPanel();
        HeaderPane1 = new javax.swing.JPanel();
        LikeLogo = new javax.swing.JLabel();
        LikedSongsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayLikedSongsArea = new javax.swing.JTextArea();
        searchTF = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
        addToPlaylistBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        displayBTN = new javax.swing.JButton();
        StringifyLogo = new javax.swing.JLabel();
        HeadingText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        border.setBackground(new java.awt.Color(0, 0, 0));

        body.setBackground(new java.awt.Color(0, 0, 0));

        layeredHeadPane.setBackground(new java.awt.Color(153, 204, 255));

        HeaderPane.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/homify.png"))); // NOI18N

        HomeLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        HomeLabel.setText("Home |   Add Your Favorite Songs             ");

        javax.swing.GroupLayout HeaderPaneLayout = new javax.swing.GroupLayout(HeaderPane);
        HeaderPane.setLayout(HeaderPaneLayout);
        HeaderPaneLayout.setHorizontalGroup(
            HeaderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HomeLabel)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        HeaderPaneLayout.setVerticalGroup(
            HeaderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(HeaderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        songNameLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        songNameLabel.setText("*Song Name:");

        songNameTF.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        songNameTF.setToolTipText("Enter your song name here");
        songNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songNameTFActionPerformed(evt);
            }
        });

        artistNameLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        artistNameLabel.setText("*Artist Name:");

        artistNameTF.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        artistNameTF.setToolTipText("Enter your artist name here");
        artistNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistNameTFActionPerformed(evt);
            }
        });

        albumNameLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        albumNameLabel.setText("Album Name:");

        albumNameTF.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        albumNameTF.setToolTipText("Not a required field but you can enter the album name");
        albumNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumNameTFActionPerformed(evt);
            }
        });

        GenreLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        GenreLabel.setText("*Genre:");

        genreComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pop/Rap", "Indie/Rock" }));
        genreComboBox.setToolTipText("Please select the right genres");

        addSongBTN.setText("Add Song");
        addSongBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addSongBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredHeadPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(artistNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(songNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(albumNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GenreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(songNameTF)
                            .addComponent(artistNameTF)
                            .addComponent(albumNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(genreComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(addSongBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(layeredHeadPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(songNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(artistNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(artistNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(albumNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(albumNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GenreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(genreComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(addSongBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        tabbedPane.addTab("Home", homePanel);

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
                .addContainerGap(10, Short.MAX_VALUE))
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

        addToPlaylistBTN.setBackground(new java.awt.Color(153, 255, 255));
        addToPlaylistBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/addPlaylist.png"))); // NOI18N
        addToPlaylistBTN.setToolTipText("Press me to add ur most recent song to a playlist");
        addToPlaylistBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToPlaylistBTNActionPerformed(evt);
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

        javax.swing.GroupLayout LikedSongPlaylistPanelLayout = new javax.swing.GroupLayout(LikedSongPlaylistPanel);
        LikedSongPlaylistPanel.setLayout(LikedSongPlaylistPanelLayout);
        LikedSongPlaylistPanelLayout.setHorizontalGroup(
            LikedSongPlaylistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LikedSongPlaylistPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LikedSongPlaylistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LikedSongPlaylistPanelLayout.createSequentialGroup()
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LikedSongPlaylistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addToPlaylistBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        LikedSongPlaylistPanelLayout.setVerticalGroup(
            LikedSongPlaylistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LikedSongPlaylistPanelLayout.createSequentialGroup()
                .addComponent(HeaderPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LikedSongPlaylistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LikedSongPlaylistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addToPlaylistBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(LikedSongPlaylistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBTN, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        tabbedPane.addTab("Liked Songs", LikedSongPlaylistPanel);

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

    private void addSongBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSongBTNActionPerformed
       
        loadFunctions.pushPlaylist(newSong);
        
    }//GEN-LAST:event_addSongBTNActionPerformed

    private void songNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songNameTFActionPerformed

    private void artistNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_artistNameTFActionPerformed

    private void albumNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_albumNameTFActionPerformed

    private void addToPlaylistBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToPlaylistBTNActionPerformed
        // TODO add your handling code here:
            
       
        
       
            System.out.println("loading transfer");
            loadFunctions.transfer();
          
    }//GEN-LAST:event_addToPlaylistBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
        loadFunctions.search();
    }//GEN-LAST:event_searchBTNActionPerformed

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        // TODO add your handling code here:
      
        displayLikedSongsArea.setText("");
        displayLikedSongsArea.setText("# \tTitle \t Artist \t Album \t Genre \n");
        
        displayLikedSongsArea.append(loadFunctions.displayPlaylist());  
    }//GEN-LAST:event_displayBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
       // loadFunctions.pop();
          displayLikedSongsArea.setText("");
          displayLikedSongsArea.setText("# \tTitle \t Artist \t Album \t Genre \n");
        // displayLikedSongsArea.append(loadFunctions.displayLikedSongs());
    }//GEN-LAST:event_deleteBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Music_Manager_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Music_Manager_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Music_Manager_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Music_Manager_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Music_Manager_GUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GenreLabel;
    private javax.swing.JPanel HeaderPane;
    private javax.swing.JPanel HeaderPane1;
    private javax.swing.JLabel HeadingText;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel LikeLogo;
    private static javax.swing.JPanel LikedSongPlaylistPanel;
    private javax.swing.JLabel LikedSongsLabel;
    private javax.swing.JLabel StringifyLogo;
    private javax.swing.JButton addSongBTN;
    private javax.swing.JButton addToPlaylistBTN;
    private javax.swing.JLabel albumNameLabel;
    public static javax.swing.JTextField albumNameTF;
    private javax.swing.JLabel artistNameLabel;
    public static javax.swing.JTextField artistNameTF;
    private javax.swing.JPanel body;
    private javax.swing.JPanel border;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton displayBTN;
    public static javax.swing.JTextArea displayLikedSongsArea;
    public static javax.swing.JComboBox<String> genreComboBox;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane layeredHeadPane;
    private javax.swing.JButton searchBTN;
    public static javax.swing.JTextField searchTF;
    private javax.swing.JLabel songNameLabel;
    public static javax.swing.JTextField songNameTF;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
