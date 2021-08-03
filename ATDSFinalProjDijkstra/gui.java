/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author shreyasshukla
 */

public class gui extends javax.swing.JFrame {

    /**
     * Creates new form gui
     */
    private HashMap<Integer,location> locationById = new HashMap<>();
    int n = 20;
    int max = 100;
    int[][] graph = new int[n][n];
    operations op = new operations();
    
    public gui() throws FileNotFoundException, IOException 
    {
        initComponents();
        locationDirectory directory = new locationDirectory();
        locationById = directory.getLocationById();
        sourceOptions.removeAllItems();
        destinationOptions.removeAllItems();
        for(int key : locationById.keySet())
        {
            sourceOptions.addItem(key + ". " + locationById.get(key).getName());
            destinationOptions.addItem(key + ". " + locationById.get(key).getName());
        }
        
        String row;
        int rowIndex = 0;
        BufferedReader csvReader = new BufferedReader(new FileReader("vertices.csv"));
        while ((row = csvReader.readLine()) != null) 
        {
          String[] data = row.split(",");
          for(int i=0; i<data.length; i++){
              int value = max;
              if(!data[i].equals("*")){
                  value = Integer.parseInt(data[i]);
              }
              graph[rowIndex][i] = value;
          }
          rowIndex++;
        }
        
        csvReader.close();
        
        navigationTextArea.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        picLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sourceOptions = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        destinationOptions = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        goButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();
        redoButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        navigationTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        picLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/schoolMap.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/shreyasshukla/Desktop/texts.png")); // NOI18N

        sourceOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sourceOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceOptionsActionPerformed(evt);
            }
        });

        jLabel1.setText("Starting Position");

        destinationOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        destinationOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationOptionsActionPerformed(evt);
            }
        });

        jLabel3.setText("Destination");

        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        undoButton.setText("Undo");
        undoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoButtonActionPerformed(evt);
            }
        });

        redoButton.setText("Redo");
        redoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoButtonActionPerformed(evt);
            }
        });

        navigationTextArea.setColumns(20);
        navigationTextArea.setRows(5);
        jScrollPane1.setViewportView(navigationTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(picLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(destinationOptions, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sourceOptions, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(goButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(undoButton)
                                        .addGap(12, 12, 12)
                                        .addComponent(redoButton))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picLabel)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sourceOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(destinationOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(goButton)
                            .addComponent(undoButton)
                            .addComponent(redoButton))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void sourceOptionsActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void destinationOptionsActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
        int source = sourceOptions.getSelectedIndex() + 1;
        int destination = destinationOptions.getSelectedIndex() + 1;
        navigate(source,destination);
        op.addUndo(source, destination);
    }                                        

    private void undoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
  
        userInput ui = op.undo();
        if(ui == null)
        {
            return;
        }
        sourceOptions.setSelectedIndex(ui.getSource() - 1);
        destinationOptions.setSelectedIndex(ui.getDestination() - 1);
        navigate(ui.getSource(),ui.getDestination());
        
    }                                          

    private void redoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           

        userInput ui = op.redo();
        if(ui == null)
        {
            return;
        }
        sourceOptions.setSelectedIndex(ui.getSource() - 1);
        destinationOptions.setSelectedIndex(ui.getDestination() - 1);
        navigate(ui.getSource(),ui.getDestination());
        
        
    }                                          

    private void navigate(int source, int destination)
    {
        dijkstra shortestPath = new dijkstra();
        LinkedList<Integer> path = shortestPath.execute(graph,source,destination);
        String displayPath = "";
 
        int prevNode = -1;
        int currentNode = -1;
        boolean initialLoad = true;
        int step = 1;
        int totalTime = 0;
        
        while(!path.isEmpty())
        {
            currentNode = path.pop();
            if (initialLoad){
                prevNode = currentNode;
                initialLoad = false;
                //continue;
            }
            
            location prev = locationById.get(prevNode);
            location current = locationById.get(currentNode);
            int prevId = prev.getId();
            int currentId = current.getId();
            int timeTaken = graph[prevId-1][currentId-1];
            totalTime += timeTaken;
            
            displayPath += ("Step " + step + "\n");
            displayPath += ("\t" + prevId + "). " + prev.getName() + "\n");
            displayPath += ("\t" + currentId + "). " + current.getName() + "\n");
            displayPath += ("\t Time taken : " + timeTaken + " mins \n");
            
            step++;
            prevNode = currentNode;
        }
        
        displayPath = ("Total time taken is : " + totalTime + " mins \n") + displayPath;
        navigationTextArea.setText(displayPath);
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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> destinationOptions;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea navigationTextArea;
    private javax.swing.JLabel picLabel;
    private javax.swing.JButton redoButton;
    private javax.swing.JComboBox<String> sourceOptions;
    private javax.swing.JButton undoButton;
    // End of variables declaration                   
}
