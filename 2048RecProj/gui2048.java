/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048v2;

import java.awt.Color;
import java.awt.event.*;

/**
 *
 * @author shreyasshukla
 */

public class gui2048 extends javax.swing.JFrame 
{

    private Board gameBoard;
    
    /**
     * Creates new form gui2048
     */
    public gui2048() 
    {
        initComponents();
        gameBoard = new Board(); 
        String name = "pos2";
        pos1.setText("2");
        
//        setBoardVals();
        //gui2048.addKeyListener(new KeyListener(){
        //});
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pos24 = new javax.swing.JLabel();
        pos4 = new javax.swing.JLabel();
        downButton = new java.awt.Button();
        upButton = new java.awt.Button();
        rightButton = new java.awt.Button();
        leftButton = new java.awt.Button();
        pos1 = new javax.swing.JLabel();
        pos3 = new javax.swing.JLabel();
        pos8 = new javax.swing.JLabel();
        pos7 = new javax.swing.JLabel();
        pos6 = new javax.swing.JLabel();
        pos5 = new javax.swing.JLabel();
        pos2 = new javax.swing.JLabel();
        pos16 = new javax.swing.JLabel();
        pos14 = new javax.swing.JLabel();
        pos13 = new javax.swing.JLabel();
        pos10 = new javax.swing.JLabel();
        pos11 = new javax.swing.JLabel();
        pos12 = new javax.swing.JLabel();
        pos9 = new javax.swing.JLabel();
        pos15 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        pos24.setBackground(new java.awt.Color(255, 204, 204));
        pos24.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos24.setText("0");
        pos24.setOpaque(true);
        pos24.setPreferredSize(new java.awt.Dimension(10, 16));
        pos24.setSize(new java.awt.Dimension(50, 50));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        pos4.setBackground(new java.awt.Color(255, 204, 204));
        pos4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos4.setText("0");
        pos4.setOpaque(true);
        pos4.setPreferredSize(new java.awt.Dimension(10, 16));
        pos4.setSize(new java.awt.Dimension(50, 50));

        downButton.setLabel("DOWN");
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });

        upButton.setLabel("UP");
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });

        rightButton.setLabel("RIGHT");
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButtonActionPerformed(evt);
            }
        });

        leftButton.setLabel("LEFT");
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });

        pos1.setBackground(new java.awt.Color(255, 204, 204));
        pos1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos1.setText("0");
        pos1.setOpaque(true);
        pos1.setPreferredSize(new java.awt.Dimension(10, 16));
        pos1.setSize(new java.awt.Dimension(50, 50));

        pos3.setBackground(new java.awt.Color(255, 204, 204));
        pos3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos3.setText("0");
        pos3.setOpaque(true);
        pos3.setPreferredSize(new java.awt.Dimension(10, 16));
        pos3.setSize(new java.awt.Dimension(50, 50));

        pos8.setBackground(new java.awt.Color(255, 204, 204));
        pos8.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos8.setText("0");
        pos8.setOpaque(true);
        pos8.setPreferredSize(new java.awt.Dimension(10, 16));
        pos8.setSize(new java.awt.Dimension(50, 50));

        pos7.setBackground(new java.awt.Color(255, 204, 204));
        pos7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos7.setText("0");
        pos7.setOpaque(true);
        pos7.setPreferredSize(new java.awt.Dimension(10, 16));
        pos7.setSize(new java.awt.Dimension(50, 50));

        pos6.setBackground(new java.awt.Color(255, 204, 204));
        pos6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos6.setText("0");
        pos6.setOpaque(true);
        pos6.setPreferredSize(new java.awt.Dimension(10, 16));
        pos6.setSize(new java.awt.Dimension(50, 50));

        pos5.setBackground(new java.awt.Color(255, 204, 204));
        pos5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos5.setText("0");
        pos5.setOpaque(true);
        pos5.setPreferredSize(new java.awt.Dimension(10, 16));
        pos5.setSize(new java.awt.Dimension(50, 50));

        pos2.setBackground(new java.awt.Color(255, 204, 204));
        pos2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos2.setText("0");
        pos2.setOpaque(true);
        pos2.setPreferredSize(new java.awt.Dimension(10, 16));
        pos2.setSize(new java.awt.Dimension(50, 50));

        pos16.setBackground(new java.awt.Color(255, 204, 204));
        pos16.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos16.setText("0");
        pos16.setOpaque(true);
        pos16.setPreferredSize(new java.awt.Dimension(10, 16));
        pos16.setSize(new java.awt.Dimension(50, 50));

        pos14.setBackground(new java.awt.Color(255, 204, 204));
        pos14.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos14.setText("0");
        pos14.setOpaque(true);
        pos14.setPreferredSize(new java.awt.Dimension(10, 16));
        pos14.setSize(new java.awt.Dimension(50, 50));

        pos13.setBackground(new java.awt.Color(255, 204, 204));
        pos13.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos13.setText("0");
        pos13.setOpaque(true);
        pos13.setPreferredSize(new java.awt.Dimension(10, 16));
        pos13.setSize(new java.awt.Dimension(50, 50));

        pos10.setBackground(new java.awt.Color(255, 204, 204));
        pos10.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos10.setText("0");
        pos10.setOpaque(true);
        pos10.setPreferredSize(new java.awt.Dimension(10, 16));
        pos10.setSize(new java.awt.Dimension(50, 50));

        pos11.setBackground(new java.awt.Color(255, 204, 204));
        pos11.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos11.setText("0");
        pos11.setOpaque(true);
        pos11.setPreferredSize(new java.awt.Dimension(10, 16));
        pos11.setSize(new java.awt.Dimension(50, 50));

        pos12.setBackground(new java.awt.Color(255, 204, 204));
        pos12.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos12.setText("0");
        pos12.setOpaque(true);
        pos12.setPreferredSize(new java.awt.Dimension(10, 16));
        pos12.setSize(new java.awt.Dimension(50, 50));

        pos9.setBackground(new java.awt.Color(255, 204, 204));
        pos9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos9.setText("0");
        pos9.setOpaque(true);
        pos9.setPreferredSize(new java.awt.Dimension(10, 16));
        pos9.setSize(new java.awt.Dimension(50, 50));

        pos15.setBackground(new java.awt.Color(255, 204, 204));
        pos15.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pos15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos15.setText("0");
        pos15.setOpaque(true);
        pos15.setPreferredSize(new java.awt.Dimension(10, 16));
        pos15.setSize(new java.awt.Dimension(50, 50));

        score.setBackground(new java.awt.Color(0, 255, 204));
        score.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score.setText("0");
        score.setOpaque(true);
        score.setPreferredSize(new java.awt.Dimension(10, 16));
        score.setSize(new java.awt.Dimension(50, 50));

        jLabel1.setText("SCORE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pos2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pos6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pos10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pos14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135)
                                .addComponent(downButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pos5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pos9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pos13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(leftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(upButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pos3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pos7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pos11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pos15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(201, 201, 201))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(pos4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pos8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pos12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pos16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jLabel1)))
                        .addGap(1, 1, 1)))
                .addComponent(rightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(pos1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(666, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pos6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pos2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pos10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pos14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(leftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pos5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pos9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pos13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(upButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addComponent(downButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pos15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pos4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(245, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(270, 270, 270))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(pos1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(600, Short.MAX_VALUE)))
        );

        downButton.getAccessibleContext().setAccessibleName("UP");

        pack();
    }// </editor-fold>                        

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
      moveBoard("down");
       
    }                                          

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
       moveBoard("up");
       
    }                                        

    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
       moveBoard("right");
       
    }                                           

    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
       moveBoard("left");
       
    }                                          

    private void moveBoard(String dir)
    {
       gameBoard.moveBoard(dir);
       gameBoard.spawn();
       setBoardVals();
       
       int s = gameBoard.getTotalScore();
       score.setText(Integer.toString(s));
    }
    
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {                                
        
        
        if(evt.getKeyCode() == KeyEvent.VK_W)
        {
            moveBoard("up");
        }
        
        if(evt.getKeyCode() == KeyEvent.VK_DOWN)
        {
            moveBoard("down");
        }
        
        if(evt.getKeyCode() == KeyEvent.VK_LEFT)
        {
            moveBoard("left");
        }
        
        if(evt.getKeyCode() == KeyEvent.VK_RIGHT)
        {
           moveBoard("right"); 
        }
        
        
    }                               

    
    
    
    
    private void setTextAndColor(javax.swing.JLabel pos, int val)
    {
        
        pos.setText(Integer.toString(val));
        
        if(val == 0)
        {
            pos.setForeground(Color.black);
            pos.setBackground(Color.darkGray);
        }
        
        else if(val == 2)
        {
            pos.setForeground(Color.black);
            pos.setBackground(Color.LIGHT_GRAY);
        }
        
        else if(val == 4)
        {
            pos.setForeground(Color.black);
            pos.setBackground(Color.gray);
        }
        
        else if(val == 8)
        {
            pos.setForeground(Color.white);
            pos.setBackground(Color.ORANGE);
        }
        
        else if(val == 16)
        {
            pos.setForeground(Color.white);
            pos.setBackground(Color.PINK);
        }
        
        else if(val == 32)
        {
            pos.setForeground(Color.white);
            pos.setBackground(Color.RED);
        }
        
        else if(val == 64)
        {
            pos.setForeground(Color.BLACK);
            pos.setBackground(Color.YELLOW);
        }
        
        else if(val == 128)
        {
            pos.setForeground(Color.black);
            pos.setBackground(Color.MAGENTA);
        }
        
        else if(val == 256)
        {
            pos.setForeground(Color.white);
            pos.setBackground(Color.green);
        }
        
        else if(val == 512)
        {
            pos.setForeground(Color.black);
            pos.setBackground(Color.cyan);
        }
        
        else if(val == 1024)
        {
            pos.setForeground(Color.white);
            pos.setBackground(Color.blue);
        }
        
        else if(val == 2048)
        {
            pos.setForeground(Color.white);
            pos.setBackground(Color.black);
        }
        
    }
    
    private void setBoardVals()
    {
        int arr [][] = gameBoard.getBoard();
        setTextAndColor(pos1,arr[0][0]);
        setTextAndColor(pos2,arr[1][0]);
        setTextAndColor(pos3,arr[2][0]);
        setTextAndColor(pos4,arr[3][0]);
        setTextAndColor(pos5,arr[0][1]);
        setTextAndColor(pos6,arr[1][1]);
        setTextAndColor(pos7,arr[2][1]);
        setTextAndColor(pos8,arr[3][1]);
        setTextAndColor(pos9,arr[0][2]);
        setTextAndColor(pos10,arr[1][2]);
        setTextAndColor(pos11,arr[2][2]);
        setTextAndColor(pos12,arr[3][2]);
        setTextAndColor(pos13,arr[0][3]);
        setTextAndColor(pos14,arr[1][3]);
        setTextAndColor(pos15,arr[2][3]);
        setTextAndColor(pos16,arr[3][3]);
        
        
      
        
    }    
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
            java.util.logging.Logger.getLogger(gui2048.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui2048.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui2048.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui2048.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new gui2048().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private java.awt.Button downButton;
    private javax.swing.JLabel jLabel1;
    private java.awt.Button leftButton;
    private javax.swing.JLabel pos1;
    private javax.swing.JLabel pos10;
    private javax.swing.JLabel pos11;
    private javax.swing.JLabel pos12;
    private javax.swing.JLabel pos13;
    private javax.swing.JLabel pos14;
    private javax.swing.JLabel pos15;
    private javax.swing.JLabel pos16;
    private javax.swing.JLabel pos2;
    private javax.swing.JLabel pos24;
    private javax.swing.JLabel pos3;
    private javax.swing.JLabel pos4;
    private javax.swing.JLabel pos5;
    private javax.swing.JLabel pos6;
    private javax.swing.JLabel pos7;
    private javax.swing.JLabel pos8;
    private javax.swing.JLabel pos9;
    private java.awt.Button rightButton;
    private javax.swing.JLabel score;
    private java.awt.Button upButton;
    // End of variables declaration                   
}
