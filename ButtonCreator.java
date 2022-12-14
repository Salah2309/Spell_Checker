import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonCreator extends JButton{
    public ButtonCreator(ImageIcon image){
        this.setBounds(0,0,image.getIconWidth(),image.getIconHeight());
        this.setBackground(new Color(33,33,33));
        this.setIcon(image);
        this.setBorder(BorderFactory.createEmptyBorder());
    }
}
