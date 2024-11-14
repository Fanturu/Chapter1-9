import java.awt.*; 
import javax.swing.*; 

public class GUI extends JFrame {
    
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1; 
    private JButton plainButton; 
    private JButton fancyButton;
    private JButton ButtonHandler;
    private JTextArea Textbox1;
    private JRadioButton b1, b2, b3;
    private JComboBox combobox;
    private JCheckBox cb1, cb2 ;

    public GUI() {
        super("Kedai Aiskrim");

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        label1 = new JLabel("Kedai Aiskrim");
        container.add(label1);

        textField1 = new JTextField(10);
        container.add(textField1);

        plainButton = new JButton("Isi Nama");
        container.add(plainButton);

        Icon ice = new ImageIcon("C:\\Users\\Acer\\OneDrive\\Pictures\\200412_JIMY_RL_FEATURED-IMEJ.jpg");
        fancyButton = new JButton("Macam2 Aiskrim Ada", ice);
        container.add(fancyButton);
        
        Textbox1 = new JTextArea ("Pilih Ikut Citarasa Anda");
        Textbox1.setSize(100,200);
        Textbox1.setLocation(20,20);
        Textbox1.setBackground(Color.PINK);
        Textbox1.setForeground(Color.DARK_GRAY);
        Textbox1.setFont(new
        Font("Times New Roman",Font.TRUETYPE_FONT,16));
        add(Textbox1);
        
        b1 = new JRadioButton("Hagen Dazz");
        b2 = new JRadioButton("Basken Robin");
        b3 = new JRadioButton("Walls");
        
        b1.setBounds(20,20,200,50);
        b2.setBounds(20,70,200,50);
        b3.setBounds(20,110,200,50);
        
        container.add(b1);
        container.add(b2);
        container.add(b3);
        
        String names [] = {"Strawberry", "Vanilla", "Coklat"};
        combobox = new JComboBox(names);
        combobox.setMaximumRowCount(3);
        combobox.setBounds(50,50,100,20);
        container.add(combobox);

        cb1 = new JCheckBox("Chocolate Chip");
        cb2 = new JCheckBox("Boba");

        container.add(cb1);
        container.add(cb2);
        
        setSize(350, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        GUI application = new GUI();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
