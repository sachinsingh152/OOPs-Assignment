package assignmentjdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question6 {

    private JFrame frame;
    private JLabel questionLabel;
    private JRadioButton[] options;
    private ButtonGroup group;
    private JButton nextButton, submitButton;
    private JLabel scoreLabel;

    private int currentQuestion = 0;
    private int score = 0;

    private final String[] questions = {
            "What is the capital of India?",
            "Which planet is known as the Red Planet?",
            "What is the square root of 64?",
            "Who wrote the national anthem of India?"
    };

    private final String[][] optionsArray = {
            {"Mumbai", "Delhi", "Kolkata", "Chennai"},
            {"Earth", "Venus", "Mars", "Jupiter"},
            {"6", "7", "8", "9"},
            {"Rabindranath Tagore", "Bankim Chandra", "Premchand", "Sarojini Naidu"}
    };

    private final int[] correctAnswers = {1, 2, 2, 0};

    public static void main(String[] args) {
    	 Question6 a=new Question6();
    }

    public Question6() {
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("Quiz Application");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

      
        questionLabel = new JLabel("", SwingConstants.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(questionLabel, BorderLayout.NORTH);

       
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(4, 1));
        options = new JRadioButton[4];
        group = new ButtonGroup();

        for (int i = 0; i < options.length; i++) {
            options[i] = new JRadioButton();
            group.add(options[i]);
            optionsPanel.add(options[i]);
        }
        frame.add(optionsPanel, BorderLayout.CENTER);

       
        JPanel buttonPanel = new JPanel();
        nextButton = new JButton("Next");
        submitButton = new JButton("Finish");
        scoreLabel = new JLabel("Score: 0");

        nextButton.addActionListener(e -> handleNext());
        submitButton.addActionListener(e -> handleFinish());

        buttonPanel.add(nextButton);
        buttonPanel.add(submitButton);
        buttonPanel.add(scoreLabel);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        loadQuestion();
        frame.setVisible(true);
    }

    private void loadQuestion() {
        if (currentQuestion < questions.length) {
            questionLabel.setText((currentQuestion + 1) + ". " + questions[currentQuestion]);
            for (int i = 0; i < options.length; i++) {
                options[i].setText(optionsArray[currentQuestion][i]);
                options[i].setSelected(false);
            }
        } else {
            nextButton.setEnabled(false);
            JOptionPane.showMessageDialog(frame, "You have completed the quiz! Click Finish to see your final score.");
        }
    }

    private void handleNext() {
        if (isAnswerSelected()) {
            checkAnswer();
            currentQuestion++;

            loadQuestion();
        } else {
            JOptionPane.showMessageDialog(frame, "Please select an answer before proceeding.");
        }
    }

    private void handleFinish() {
    	
        if (isAnswerSelected()) {
          checkAnswer();
      }
        JOptionPane.showMessageDialog(frame, "Your final score is: " + score + " out of " + questions.length);
        System.exit(0);
    }

    private boolean isAnswerSelected() {
        for (JRadioButton option : options) {
            if (option.isSelected()) {
                return true;
            }
        }
        return false;
    }

    private void checkAnswer() {
        for (int i = 0; i < options.length; i++) {
            if (options[i].isSelected() && i == correctAnswers[currentQuestion]) {
                score++;
                break;
            }
        }
        scoreLabel.setText("Score: " + score);
    }
}
