package com.oleg.programmers.gui;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.oleg.programmers.model.Employee;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainFrame extends javax.swing.JFrame {
    
    private Map <String, Set<Employee>> project;
    private String pathSave;

    public MainFrame() {
        initComponents();

        project = new HashMap<>();

        jList1.setModel(new DefaultComboBoxModel<Employee>());
        jList2.setModel(new DefaultComboBoxModel<Employee>());
        jList3.setModel(new DefaultComboBoxModel<Employee>());
        jList4.setModel(new DefaultComboBoxModel<Employee>());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jList2);

        jScrollPane3.setViewportView(jList3);

        jScrollPane4.setViewportView(jList4);

        jLabel1.setText("Тестировщики");

        jLabel2.setText("Аналитики");

        jLabel3.setText("Разработчики");

        jLabel4.setText("Тимлиды");

        jLabel5.setText("Персонал");

        jButton1.setText("Добавить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Save as...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Employee item = (Employee) jComboBox1.getSelectedItem();        
        if (item == null)
            return;        
        DefaultComboBoxModel<Employee> tester = (DefaultComboBoxModel<Employee>) jList1.getModel();
        DefaultComboBoxModel<Employee> analitic = (DefaultComboBoxModel<Employee>) jList2.getModel();
        DefaultComboBoxModel<Employee> programmer = (DefaultComboBoxModel<Employee>) jList3.getModel();
        DefaultComboBoxModel<Employee> timlead = (DefaultComboBoxModel<Employee>) jList4.getModel();
        if (item.getSpecial().equals("Tester")){      
           if (!project.containsKey("Tester"))
               project.put(item.getSpecial(), new HashSet<Employee>());
           boolean has = project.get(item.getSpecial()).add(item);
           if (has)
               tester.addElement(item);
        }
        else if (item.getSpecial().equals("Analitic")){           
           if (!project.containsKey(item.getSpecial()))
               project.put(item.getSpecial(), new HashSet<Employee>());
           boolean has = project.get(item.getSpecial()).add(item);
           if (has)
               analitic.addElement(item);
        }
        else if (item.getSpecial().equals("Programmer")){           
           if (!project.containsKey(item.getSpecial()))
               project.put(item.getSpecial(), new HashSet<Employee>());
           boolean has = project.get(item.getSpecial()).add(item);
           if (has)
               programmer.addElement(item);
        }
        else if (item.getSpecial().equals("Timlead")){       
           if (!project.containsKey(item.getSpecial()))
               project.put(item.getSpecial(), new HashSet<Employee>());
           boolean has = project.get(item.getSpecial()).add(item);
           if (has)
               timlead.addElement(item);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filterJson = new FileNameExtensionFilter("JSON Files", "json", "JSON");
        chooser.setFileFilter(filterJson);
        FileNameExtensionFilter filterCsv = new FileNameExtensionFilter("CSV Files", "csv", "CSV");
        chooser.addChoosableFileFilter(filterCsv);
        int res = chooser.showOpenDialog(this);
        Gson gson = new Gson();
        if(res == JFileChooser.APPROVE_OPTION){
            File selectedFile = chooser.getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());
            
            try(BufferedReader br = new BufferedReader(new FileReader(selectedFile))){
                if (selectedFile.getAbsolutePath().endsWith(".csv")){
                    Set<Employee> mas = new HashSet<>();
                    br.readLine();
                    while (br.ready()) {
                        String line = br.readLine();
                        String[] arrLine = line.split(";");
                        Employee emp = new Employee(arrLine[0], 
                                Double.parseDouble(arrLine[1]), arrLine[2]);
                        mas.add(emp);
                    }
                    Employee[] mass = mas.toArray(new Employee[0]);
                    jComboBox1.setModel(new DefaultComboBoxModel<Employee>(mass));
                }
                else if (selectedFile.getAbsolutePath().endsWith(".json")){
                    Set<Employee> mas = gson.fromJson(br, new TypeToken<Set<Employee>>() {}.getType());
                    Employee[] mass = mas.toArray(new Employee[0]);
                    jComboBox1.setModel(new DefaultComboBoxModel<Employee>(mass));
                }               
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "Ощибка ввода-вывода", "Ошибка", JOptionPane.ERROR_MESSAGE);
            } catch (JsonSyntaxException ex) {
                JOptionPane.showMessageDialog(rootPane, "Ощибка данных файла", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static File getSelectedFileWithExtension(JFileChooser c) {
        File file = c.getSelectedFile();
        if (c.getFileFilter() instanceof FileNameExtensionFilter) {
            String[] exts = ((FileNameExtensionFilter)c.getFileFilter()).getExtensions();
            String nameLower = file.getName().toLowerCase();
            for (String ext : exts) { // check if it already has a valid extension
                if (nameLower.endsWith('.' + ext.toLowerCase())) {
                    return file; // if yes, return as-is
                }
            }
            // if not, append the first extension from the selected filter
            file = new File(file.toString() + '.' + exts[0]);
        }
        return file;
    }
    
    private void load(String filePath){
        Gson gson = new Gson();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){
            if (filePath.endsWith(".json")){
                gson.newBuilder().setPrettyPrinting().create().toJson(project, bw);
            }
            else if (filePath.endsWith(".csv")){
                bw.write("fio;salary;special");
                bw.newLine();
                for (Map.Entry<String, Set<Employee>> entry : project.entrySet()) {
                    for (Employee employee : entry.getValue()) {
                        bw.write(employee.getFio() + ";"
                        + employee.getSalary() + ";" + employee.getSpecial());
                        bw.newLine();
                    }
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error IO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filterJson = new FileNameExtensionFilter("JSON Files", "json", "JSON");
        chooser.setFileFilter(filterJson);
        FileNameExtensionFilter filterCsv = new FileNameExtensionFilter("CSV Files", "csv", "CSV");
        chooser.addChoosableFileFilter(filterCsv);
        int res = chooser.showSaveDialog(this);
        Gson gson = new Gson();
        if(res == JFileChooser.APPROVE_OPTION){
            File selectedFileSave = getSelectedFileWithExtension(chooser);
            System.out.println(selectedFileSave.getAbsolutePath());
            pathSave = selectedFileSave.getAbsolutePath();
            if (project.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Нет данных для записи", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            load(pathSave);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (pathSave == null){
            jMenuItem2ActionPerformed(evt);
            return;
        }
        if (project.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Нет данных для записи", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;      
        }
        load(pathSave);  
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Employee> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<Employee> jList1;
    private javax.swing.JList<Employee> jList2;
    private javax.swing.JList<Employee> jList3;
    private javax.swing.JList<Employee> jList4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
