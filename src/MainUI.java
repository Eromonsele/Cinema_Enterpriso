import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel cinemaTitle = new JPanel();
		contentPane.add(cinemaTitle, BorderLayout.NORTH);
		cinemaTitle.setLayout(new BorderLayout(0, 0));
		
		JLabel cinemaLabel = new JLabel("Odeon Cineplex");
		cinemaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cinemaLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		cinemaTitle.add(cinemaLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cinemaTitle.add(lblNewLabel, BorderLayout.SOUTH);
		
		JPanel Centralpanel = new JPanel();
		contentPane.add(Centralpanel, BorderLayout.CENTER);
		
		JPanel South_panel = new JPanel();
		contentPane.add(South_panel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("Made by Eromonsele Okhilua");
		South_panel.add(lblNewLabel_1);
	}

}
