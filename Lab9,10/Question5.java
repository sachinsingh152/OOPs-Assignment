package assignmentjdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Question5 {
    private JFrame frame;
    private JTextArea textArea;
    private JLabel statusBar;

    public static void main(String[] args) {
       Question5 a=new Question5();
    }

    public Question5() {
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("Text Editor");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

       
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

     
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem clearItem = new JMenuItem("Clear");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(clearItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        
        statusBar = new JLabel("Lines: 0, Characters: 0");
        frame.add(statusBar, BorderLayout.SOUTH);

       
        openItem.addActionListener(e -> openFile());
        saveItem.addActionListener(e -> saveFile());
        clearItem.addActionListener(e -> clearText());
        exitItem.addActionListener(e -> System.exit(0));

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                updateStatusBar();
            }
        });

        frame.setVisible(true);
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(frame);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                textArea.setText("");
                String line;
                while ((line = br.readLine()) != null) {
                    textArea.append(line + "\n");
                }
                updateStatusBar();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error opening file: " + ex.getMessage());
            }
        }
    }

    private void saveFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(frame);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write(textArea.getText());
                JOptionPane.showMessageDialog(frame, "File saved successfully!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error saving file: " + ex.getMessage());
            }
        }
    }

    private void clearText() {
        textArea.setText("");
        updateStatusBar();
    }

    private void updateStatusBar() {
        String text = textArea.getText();
        int lines = text.split("\n").length;
        int characters = text.length();
        statusBar.setText("Lines: " + lines + ", Characters: " + characters);
    }
}
