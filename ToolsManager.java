import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ToolsManager extends JFrame implements ActionListener{
    LayoutManager finalLayout;
    JTextField SearchField;
    JTextArea OutputField;
    JButton ExitButton;
    JButton SettingsButton;
    JButton DictionaryButton;

    ToolsManager(LayoutManager layout){
        ProgramNamer(layout);
        Search(layout);
        Output(layout);
        Settings(layout);
        Exit(layout);
        Dictionary(layout);

        finalLayout = layout;
    }

    //PROGRAM NAMER
    public void ProgramNamer(LayoutManager layout){
        JLabel programName = new JLabel();
        programName.setText("Spell Checker & Dictionary!");
        programName.setVerticalAlignment(JLabel.BOTTOM);
        programName.setHorizontalAlignment(JLabel.CENTER);
        programName.setFont(new Font("MV Boli", Font.PLAIN, 40));
        programName.setForeground(Color.cyan);
        layout.topBottomPanel.add(programName);
    }

    //SEARCH BOX:
    public void Search(LayoutManager layout){
        SearchField = new JTextField();
        SearchField.setPreferredSize(new Dimension(800,50));
        SearchField.setBackground(new Color(20,20,20));
        SearchField.setBorder(BorderFactory.createEmptyBorder());
        SearchField.setFont(new Font("Consolas",Font.PLAIN,30));
        SearchField.setCaretColor(Color.CYAN);
        SearchField.setForeground(Color.WHITE);
        SearchField.addActionListener(this);

        layout.centerTopPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        layout.centerTopPanel.add(SearchField);
    }

    //OUTPUT BOX:
    public void Output(LayoutManager layout){
        OutputField = new JTextArea();
        OutputField.setPreferredSize(new Dimension(1170,675));
        OutputField.setBackground(new Color(25,25,25));
        OutputField.setBorder(BorderFactory.createEmptyBorder());
        OutputField.setEditable(false);
        OutputField.setFont(new Font("Consolas",Font.PLAIN,25));
        OutputField.setLineWrap(true);
        
        OutputField.setForeground(Color.GREEN); //or red if autocorrector triggered
        layout.centerCenterPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        layout.centerCenterPanel.add(OutputField);
    }

    //SETTINGS BUTTON:
    public void Settings(LayoutManager layout){
        SettingsButton = new ButtonCreator(new ImageIcon("Images/Settings.png"));
        SettingsButton.addActionListener(this);
        layout.topTopPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        layout.topTopPanel.add(SettingsButton);
    }

    //EXIT BUTTON:
    public void Exit(LayoutManager layout){
        ExitButton = new ButtonCreator(new ImageIcon("Images/ExitButton.png"));
        ExitButton.addActionListener(this);
        layout.topTopPanel.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        layout.topTopPanel.add(ExitButton);
    }

    //DICTIONARY BUTTON:
    public void Dictionary(LayoutManager layout){
        DictionaryButton = new ButtonCreator(new ImageIcon("Images/Dictionary.png"));
        DictionaryButton.addActionListener(this);        
        layout.centerTopPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        layout.centerTopPanel.add(DictionaryButton);
    }

    //ACTION LISTENER:
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ExitButton){
            System.exit(0);
        }
        if(e.getSource() == SettingsButton){
           //settings implimentation
        }
        if(e.getSource() == DictionaryButton){
            new Dictionary(SearchField.getText(), finalLayout);
        }
        if(e.getSource() == SearchField){
            new Decider(SearchField.getText(), finalLayout);
            OutputField.setText(SearchField.getText());
        }
    }
}
