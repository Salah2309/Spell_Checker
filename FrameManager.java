import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameManager extends JFrame{

    public FrameManager(){
        FrameSetter(this);
        new ToolsManager(new LayoutManager(this)); 
        this.setVisible(true);
    }
    
    private void FrameSetter(JFrame frame){
        this.setTitle("Spell Checker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(1920,1080);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true); 
        this.setIconImage(new ImageIcon("Images/Logo.png").getImage());
        this.getContentPane().setBackground(new Color(33,33,33));
    }
}