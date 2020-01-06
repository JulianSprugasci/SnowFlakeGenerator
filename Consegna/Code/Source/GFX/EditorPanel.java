package GFX;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 * This is the main editor's graphics interface.
 * @author Julian Sprugasci
 */

public class EditorPanel extends javax.swing.JPanel {
    
    /**
     * Triangle color.
     */
    Color triangleColor = new Color(26, 188, 156);
    
    /**
     * Count for the Dark Mode.
     */
    private int count = 0;
    
    /**
     * Horizontal coordinates of Mouse.
     */
    private int xMouse = 0;
    
    /**
     * Vertical coordinates of Mouse.
     */
    private int yMouse = 0;

    /**
     * Creates new form EditorPanel
     */
    public EditorPanel() {
        initComponents();
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                jLabel1.setText("" + getWidth() + ", " + getHeight());
            }

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        editorControl = new javax.swing.JPanel();
        triangleColorButton = new javax.swing.JButton();
        importPointsButton = new javax.swing.JButton();
        savePointsButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        generateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pointsColorButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        backgroundColorButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        darkModeCheckBox = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        polygonsColorButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mouseLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ciccio = new javax.swing.JPanel();
        saveImage = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        svgButton = new javax.swing.JButton();
        pngButton = new javax.swing.JButton();
        jpgButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        nameTextBox = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        heightTextBox = new javax.swing.JTextField();
        widthTextBox = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        editor = new GFX.SnowFlakePanel();

        setMinimumSize(new java.awt.Dimension(1024, 748));
        setLayout(new java.awt.BorderLayout());

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(82, 62));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(200, 784));

        editorControl.setPreferredSize(new java.awt.Dimension(200, 748));

        triangleColorButton.setBackground(new java.awt.Color(236, 240, 241));
        triangleColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleColorButtonActionPerformed(evt);
            }
        });

        importPointsButton.setText("Import points");
        importPointsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importPointsButtonActionPerformed(evt);
            }
        });

        savePointsButton.setText("Save points");
        savePointsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePointsButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel3.setText("Triangle");

        pointsColorButton.setBackground(new java.awt.Color(255, 0, 0));
        pointsColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsColorButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Points");

        backgroundColorButton.setBackground(new java.awt.Color(189, 195, 199));
        backgroundColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgroundColorButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Background");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Preview");

        jCheckBox1.setText("  Grid View");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        darkModeCheckBox.setText("   Dark Mode");
        darkModeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkModeCheckBoxActionPerformed(evt);
            }
        });

        jLabel8.setText("Size: ");

        polygonsColorButton.setBackground(new java.awt.Color(0, 240, 0));
        polygonsColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polygonsColorButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Polygons");

        jLabel10.setText("Mouse: ");

        mouseLabel.setText("Status OK!");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Status");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Debug");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Colors");

        ciccio.setForeground(new java.awt.Color(255, 188, 188));

        javax.swing.GroupLayout ciccioLayout = new javax.swing.GroupLayout(ciccio);
        ciccio.setLayout(ciccioLayout);
        ciccioLayout.setHorizontalGroup(
            ciccioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ciccioLayout.setVerticalGroup(
            ciccioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout editorControlLayout = new javax.swing.GroupLayout(editorControl);
        editorControl.setLayout(editorControlLayout);
        editorControlLayout.setHorizontalGroup(
            editorControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editorControlLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(editorControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editorControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mouseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(editorControlLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(editorControlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(editorControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editorControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(editorControlLayout.createSequentialGroup()
                            .addComponent(pointsColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(editorControlLayout.createSequentialGroup()
                            .addComponent(triangleColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(editorControlLayout.createSequentialGroup()
                            .addComponent(backgroundColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(editorControlLayout.createSequentialGroup()
                            .addComponent(polygonsColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(editorControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(darkModeCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(editorControlLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(editorControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(importPointsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(savePointsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(editorControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ciccio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        editorControlLayout.setVerticalGroup(
            editorControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editorControlLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(editorControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(triangleColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editorControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pointsColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editorControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backgroundColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editorControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(polygonsColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(darkModeCheckBox)
                .addGap(1, 1, 1)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editorControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editorControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(mouseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(importPointsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savePointsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ciccio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Control", editorControl);

        saveImage.setPreferredSize(new java.awt.Dimension(0, 748));
        saveImage.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                saveImageComponentHidden(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Save Image");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Select a type of image");

        svgButton.setText("Svg");
        svgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svgButtonActionPerformed(evt);
            }
        });

        pngButton.setText("Png");
        pngButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pngButtonActionPerformed(evt);
            }
        });

        jpgButton.setText("Jpg");
        jpgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpgButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("Name");

        nameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextBoxActionPerformed(evt);
            }
        });

        jLabel15.setText("Height");

        jLabel16.setText("Width");

        heightTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTextBoxActionPerformed(evt);
            }
        });

        widthTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthTextBoxActionPerformed(evt);
            }
        });

        jButton6.setText("Save Snowflake");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout saveImageLayout = new javax.swing.GroupLayout(saveImage);
        saveImage.setLayout(saveImageLayout);
        saveImageLayout.setHorizontalGroup(
            saveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveImageLayout.createSequentialGroup()
                .addGroup(saveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(saveImageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(saveImageLayout.createSequentialGroup()
                        .addGroup(saveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(saveImageLayout.createSequentialGroup()
                                .addGroup(saveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(saveImageLayout.createSequentialGroup()
                                        .addGroup(saveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(saveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel16))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(saveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(widthTextBox, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameTextBox)
                                            .addComponent(heightTextBox)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saveImageLayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(svgButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(pngButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jpgButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saveImageLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        saveImageLayout.setVerticalGroup(
            saveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveImageLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(saveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(svgButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pngButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpgButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(saveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(nameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(saveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(widthTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(saveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(heightTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(370, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Save", saveImage);

        add(jTabbedPane1, java.awt.BorderLayout.EAST);
        add(editor, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void saveImageComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_saveImageComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_saveImageComponentHidden

    /**
     * This method checks if the user has chosen the type of image.
     * @param evt Mouse event.
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            if (this.type == 0) {
                JOptionPane.showMessageDialog(null, "Please, choose a type of image");
                return;
            } else {
                editor.saveImage(nameTextBox.getText(), Integer.parseInt(widthTextBox.getText()), Integer.parseInt(widthTextBox.getText()), this.type);
                resultLabel.setText("Image saved correctly!");
            }
        } catch (IOException ex) {
            System.err.println("Error");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void widthTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthTextBoxActionPerformed
       
    }//GEN-LAST:event_widthTextBoxActionPerformed

    private void heightTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTextBoxActionPerformed
        
    }//GEN-LAST:event_heightTextBoxActionPerformed

    private void nameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextBoxActionPerformed
       
    }//GEN-LAST:event_nameTextBoxActionPerformed

    /**
     * This method checks if the jpg button has been clicked.
     * Consequently it resets the other colors of the buttons.
     * @param evt Mouse event
     */
    private void jpgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpgButtonActionPerformed
        this.svgActive = false;
        this.pngActive = false;
        this.jpgActive = true;
        this.jpgButton.setBackground(new Color(0, 255, 0));
        this.pngButton.setBackground(new Color(240, 240, 240));
        this.svgButton.setBackground(new Color(240, 240, 240));
        this.type = 1;
    }//GEN-LAST:event_jpgButtonActionPerformed

    /**
     * This method checks if the png button has been clicked.
     * Consequently it resets the other colors of the buttons.
     * @param evt Mouse event
     */
    private void pngButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pngButtonActionPerformed
        this.svgActive = false;
        this.pngActive = true;
        this.jpgActive = false;
        this.pngButton.setBackground(new Color(0, 255, 0));
        this.svgButton.setBackground(new Color(240, 240, 240));
        this.jpgButton.setBackground(new Color(240, 240, 240));
        this.type = 2;
    }//GEN-LAST:event_pngButtonActionPerformed

    /**
     * This method checks if the svg button has been clicked.
     * Consequently it resets the other colors of the buttons.
     * @param evt Mouse event.
     */
    private void svgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svgButtonActionPerformed
        this.svgActive = true;
        this.pngActive = false;
        this.jpgActive = false;
        this.svgButton.setBackground(new Color(0, 255, 0));
        this.pngButton.setBackground(new Color(240, 240, 240));
        this.jpgButton.setBackground(new Color(240, 240, 240));
        this.type = 3;
    }//GEN-LAST:event_svgButtonActionPerformed

    /**
     * This method changes the color of the polygon and 
     * changes the background color of the button.
     * @param evt Mouse event.
     */
    private void polygonsColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polygonsColorButtonActionPerformed
        Color newColor = JColorChooser.showDialog(null, "Choose a color", Color.RED);
        Color finalColor = new Color(newColor.getRed(), newColor.getGreen(), newColor.getBlue(), 80);
        polygonsColorButton.setBackground(finalColor);
        //editor.setAreaColor(finalColor);
        repaint();
    }//GEN-LAST:event_polygonsColorButtonActionPerformed

    /**
     * This method checks if the Dark Mode has benn activated or not.
     * @param evt Mouse event.
     */
    private void darkModeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkModeCheckBoxActionPerformed
        count++;
       if (!(count % 2 == 0)) {
            Color triangle = new Color(20, 20, 20);
            Color point = new Color(0, 230, 230);
            Color background = new Color(70, 70, 70);
            Color polygon = new Color(255, 179, 255, 80);
            triangleColorButton.setBackground(triangle);
            backgroundColorButton.setBackground(background);
            pointsColorButton.setBackground(point);
            polygonsColorButton.setBackground(polygon);
            editor.setAreaColor(polygon);
            editor.setPointsColor(point);
            editor.setBackgroundColor(background);
            editor.getTriangle().setColor(triangle);
            repaint();
        } else {
            Color triangle = new Color(236, 240, 241);
            Color point = Color.red;
            Color background = new Color(189, 195, 199);
            Color polygon = new Color(0, 255, 0, 80);
            triangleColorButton.setBackground(triangle);
            backgroundColorButton.setBackground(background);
            pointsColorButton.setBackground(point);
            polygonsColorButton.setBackground(polygon);
            editor.setAreaColor(polygon);
            editor.setPointsColor(point);
            editor.setBackgroundColor(background);
            editor.getTriangle().setColor(triangle);
            repaint();
        }
    }//GEN-LAST:event_darkModeCheckBoxActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    /**
     * This method changes the color of the editor's background and 
     * changes the background color of the button.
     * @param evt Mouse event.
     */
    private void backgroundColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backgroundColorButtonActionPerformed
        Color newColor = JColorChooser.showDialog(null, "Choose a color", Color.RED);
        backgroundColorButton.setBackground(newColor);
        editor.setBackgroundColor(newColor);
        repaint();
    }//GEN-LAST:event_backgroundColorButtonActionPerformed

    /**
     * This method changes the color of the points and 
     * changes the background color of the button.
     * @param evt Mouse event.
     */
    private void pointsColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsColorButtonActionPerformed
        Color newColor = JColorChooser.showDialog(null, "Choose a color", Color.RED);
        pointsColorButton.setBackground(newColor);
        editor.setPointsColor(newColor);
        repaint();
    }//GEN-LAST:event_pointsColorButtonActionPerformed

    /**
     * This method generate the final SnowFlake.
     * @param evt Mouse event.
     */
    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        countGenerate++;
        editor.generate();
        if (countGenerate == 1) {
            int input = JOptionPane.showConfirmDialog(null, "Do you really want to generate the polygon?");
            if (input == 0) {
                editor.generate();
                pp = new PreviewPanel(editor.getShape(), editor.getReversedShape());
                pp.setSize(ciccio.getWidth(), ciccio.getHeight());
                this.ciccio.add(pp);
                repaint();
            }else{
                return;
            }
        }
        pp.repaint();
        repaint();
    }//GEN-LAST:event_generateButtonActionPerformed

    /**
     * This method reset the content into the editor.
     * @param evt Mouse event.
     */
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "Are you really sure you reset everything?");
        if (input == 0) {
            editor.setIsreset();
            editor.resetAll();
            this.repaint();
        } else {
            return;
        }

    }//GEN-LAST:event_resetButtonActionPerformed

    /**
     * This method saves the points into a file txt
     * @param evt Mouse event.
     */
    private void savePointsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePointsButtonActionPerformed
        try {
            editor.savePoints();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error: file not supported!");
        } catch (UnsupportedEncodingException ex) {
            JOptionPane.showMessageDialog(null, "Shish");
        }
    }//GEN-LAST:event_savePointsButtonActionPerformed

    /**
     * This method import the points from a file txt.
     * @param evt Mouse event.
     */
    private void importPointsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importPointsButtonActionPerformed
        editor.importPoints();
    }//GEN-LAST:event_importPointsButtonActionPerformed

    /**
     * This method changes the color of the triangle and 
     * changes the background color of the button.
     * @param evt Mouse event.
     */
    private void triangleColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleColorButtonActionPerformed
        Color newColor = JColorChooser.showDialog(null, "Choose a color", Color.RED);
        triangleColorButton.setBackground(newColor);
        editor.getTriangle().setColor(newColor);
        repaint();
    }//GEN-LAST:event_triangleColorButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backgroundColorButton;
    private javax.swing.JPanel ciccio;
    private javax.swing.JCheckBox darkModeCheckBox;
    private GFX.SnowFlakePanel editor;
    private javax.swing.JPanel editorControl;
    private javax.swing.JButton generateButton;
    private javax.swing.JTextField heightTextBox;
    private javax.swing.JButton importPointsButton;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jpgButton;
    private javax.swing.JLabel mouseLabel;
    private javax.swing.JTextField nameTextBox;
    private javax.swing.JButton pngButton;
    private javax.swing.JButton pointsColorButton;
    private javax.swing.JButton polygonsColorButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JPanel saveImage;
    private javax.swing.JButton savePointsButton;
    private javax.swing.JButton svgButton;
    private javax.swing.JButton triangleColorButton;
    private javax.swing.JTextField widthTextBox;
    // End of variables declaration//GEN-END:variables
    /**
     * Check if the svg button has been activated or not.
     */
    private boolean svgActive = false;
    
    /**
     * Check if the png button has been activated or not.
     */
    private boolean pngActive = false;
    
    /**
     * Check if the jpg button has been activated or not.
     */
    private boolean jpgActive = false;
    
    /**
     * The type of the image selected.
     */
    private int type = 0;
    
    /**
     * Number of Snowflakes generated.
     */
    private int countGenerate = 0;
    
    /**
     * Preview Panel
     */
    private PreviewPanel pp;

    /**
     * The label returns to update it.
     * @return mouseLabel.
     */
    public JLabel getLabel() {
        return this.mouseLabel;
    }
}
