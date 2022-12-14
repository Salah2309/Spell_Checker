import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class LayoutManager {
    JPanel topPanel = new JPanel();
    JPanel rightPanel = new JPanel();
    JPanel downPanel = new JPanel();
    JPanel leftPanel = new JPanel();
    JPanel centerPanel = new JPanel();

    JPanel centerTopPanel = new JPanel();
    JPanel centerRightPanel = new JPanel();
    JPanel centerDownPanel = new JPanel();
    JPanel centerLeftPanel = new JPanel();
    JPanel centerCenterPanel = new JPanel();
    JPanel topTopPanel = new JPanel();
    JPanel topBottomPanel = new JPanel();

    LayoutManager(JFrame frame){
        frame.setLayout(new BorderLayout());
        topPanel.setPreferredSize(new Dimension(150,150));
        rightPanel.setPreferredSize(new Dimension(10,10));
        downPanel.setPreferredSize(new Dimension(10,10));
        leftPanel.setPreferredSize(new Dimension(10,10));
        centerTopPanel.setPreferredSize(new Dimension(150,100));
        centerRightPanel.setPreferredSize(new Dimension(100,100));
        centerDownPanel.setPreferredSize(new Dimension(95,95));
        centerLeftPanel.setPreferredSize(new Dimension(100,100));
        centerCenterPanel.setPreferredSize(new Dimension(100,100));
        topTopPanel.setPreferredSize(new Dimension(100,100));
        topBottomPanel.setPreferredSize(new Dimension(85,75));

        topPanel.setBackground(new Color(33,33,33));
        rightPanel.setBackground(new Color(33,33,33));
        downPanel.setBackground(new Color(33,33,33));
        leftPanel.setBackground(new Color(33,33,33));
        centerPanel.setBackground(new Color(33,33,33));
        centerTopPanel.setBackground(new Color(33,33,33));
        centerRightPanel.setBackground(new Color(33,33,33));
        centerDownPanel.setBackground(new Color(33,33,33));
        centerLeftPanel.setBackground(new Color(33,33,33));
        centerCenterPanel.setBackground(new Color(33,33,33));
        topTopPanel.setBackground(new Color(33,33,33));
        topBottomPanel.setBackground(new Color(33,33,33));

        frame.add(topPanel,BorderLayout.NORTH);
        frame.add(rightPanel,BorderLayout.EAST);
        frame.add(downPanel,BorderLayout.SOUTH);
        frame.add(leftPanel,BorderLayout.WEST);
        frame.add(centerPanel,BorderLayout.CENTER);

        centerPanel.setLayout(new BorderLayout());
        topPanel.setLayout(new BorderLayout());

        centerPanel.add(centerTopPanel,BorderLayout.NORTH);
        centerPanel.add(centerRightPanel,BorderLayout.EAST);
        centerPanel.add(centerDownPanel,BorderLayout.SOUTH);
        centerPanel.add(centerLeftPanel,BorderLayout.WEST);
        centerPanel.add(centerCenterPanel,BorderLayout.CENTER);

        centerCenterPanel.setLayout(new BorderLayout());

        topPanel.add(topBottomPanel, BorderLayout.SOUTH);
        topPanel.add(topTopPanel, BorderLayout.NORTH);
    }
}
