package assignmentjdbc;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Question4 {
    private JFrame frame;
    private JTextField txtStudentID, txtName, txtAge, txtGender, txtDepartment;
    private JTable table;
    private DefaultTableModel model;

    // Database connection details
    private final String URL = "jdbc:mysql://localhost:3306/JAVA";
    private final String USER = "root";
    private final String PASSWORD = "";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Question4::new);
    }

    public Question4() {
        initializeUI();
        loadTableData();
    }

    private void initializeUI() {
        frame = new JFrame("Student Management System");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Panel for input fields
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(new JLabel("Student ID:"));
        txtStudentID = new JTextField();
        panel.add(txtStudentID);

        panel.add(new JLabel("Name:"));
        txtName = new JTextField();
        panel.add(txtName);

        panel.add(new JLabel("Age:"));
        txtAge = new JTextField();
        panel.add(txtAge);

        panel.add(new JLabel("Gender:"));
        txtGender = new JTextField();
        panel.add(txtGender);

        panel.add(new JLabel("Department:"));
        txtDepartment = new JTextField();
        panel.add(txtDepartment);

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton btnAdd = new JButton("Add");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");
        JButton btnView = new JButton("View");

        buttonPanel.add(btnAdd);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnView);

        // Table for displaying data
        model = new DefaultTableModel(new String[]{"Student ID", "Name", "Age", "Gender", "Department"}, 0);
        table = new JTable(model);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Add ActionListeners for buttons
        btnAdd.addActionListener(e -> addStudent());
        btnUpdate.addActionListener(e -> updateStudent());
        btnDelete.addActionListener(e -> deleteStudent());
        btnView.addActionListener(e -> loadTableData());

        frame.setVisible(true);
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private void loadTableData() {
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM Students");
            model.setRowCount(0); // Clear table
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("StudentID"),
                        rs.getString("Name"),
                        rs.getInt("Age"),
                        rs.getString("Gender"),
                        rs.getString("Department")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Error loading data: " + e.getMessage());
        }
    }

    private void addStudent() {
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Students VALUES (?, ?, ?, ?, ?)")) {
            pstmt.setInt(1, Integer.parseInt(txtStudentID.getText()));
            pstmt.setString(2, txtName.getText());
            pstmt.setInt(3, Integer.parseInt(txtAge.getText()));
            pstmt.setString(4, txtGender.getText());
            pstmt.setString(5, txtDepartment.getText());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(frame, "Student added successfully!");
            loadTableData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Error adding student: " + e.getMessage());
        }
    }

    private void updateStudent() {
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement("UPDATE Students SET Name = ?, Age = ?, Gender = ?, Department = ? WHERE StudentID = ?")) {
            pstmt.setString(1, txtName.getText());
            pstmt.setInt(2, Integer.parseInt(txtAge.getText()));
            pstmt.setString(3, txtGender.getText());
            pstmt.setString(4, txtDepartment.getText());
            pstmt.setInt(5, Integer.parseInt(txtStudentID.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(frame, "Student updated successfully!");
            loadTableData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Error updating student: " + e.getMessage());
        }
    }

    private void deleteStudent() {
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement("DELETE FROM Students WHERE StudentID = ?")) {
            pstmt.setInt(1, Integer.parseInt(txtStudentID.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(frame, "Student deleted successfully!");
            loadTableData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Error deleting student: " + e.getMessage());
        }
    }
}
