import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSpinner;

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

		ArrayList<Movie> movies = new ArrayList<Movie>();

		try {
			String line = null;
			Scanner input = new Scanner(new File("fileMovie.txt"));
			// while((line = br.readLine()) != null){
			while (input.hasNextLine()) {
				if ((line = input.nextLine()) != null) {
					String[] word = line.split(";");
					String mN = word[0];
					double mP = Double.parseDouble(word[1]);
					String aR = word[2];
					String mD = word[3];
					String mT = word[4];
					String theatre = word[5];
					int aT = Integer.parseInt(word[6]);

					movies.add(new Movie(mN, mP, aR, mD, mT, theatre, aT));
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 401);
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
		Centralpanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 273, 281);
		Centralpanel.add(panel);
		panel.setLayout(null);

		JLabel lblSelectAMovie = new JLabel("Select a movie:");
		lblSelectAMovie.setBounds(5, 8, 73, 14);
		panel.add(lblSelectAMovie);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(96, 5, 155, 20);
		// comboBox.setModel(new DefaultComboBoxModel(new String[] {"sele is a
		// great guy"}));
		// comboBox.setModel(new DefaultComboBoxModel(new String[] {"sele is a
		// great guy"}));
		String[] wordMovie = new String[movies.size()];
		for (int i = 0; i < movies.size(); i++) {
			wordMovie[i] = movies.get(i).getMovieName();
		}
		comboBox.setModel(new DefaultComboBoxModel(wordMovie));

		panel.add(comboBox);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Movie Booking", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBounds(4, 33, 259, 99);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblSelectDate = new JLabel("Select Date :");
		lblSelectDate.setBounds(10, 22, 77, 14);
		panel_1.add(lblSelectDate);

		JComboBox comboBox_2 = new JComboBox();
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				JComboBox comboBox = (JComboBox) event.getSource();

				Object selected = comboBox.getSelectedItem();
				if (selected.toString().equals(movies.get(comboBox.getSelectedIndex()).getMovieName())) {
					for (int i = 0; i < movies.size(); i++) {
						wordMovie[i] = movies.get(comboBox.getSelectedIndex()).getMoviePreview();
					}
					comboBox_2.setModel(new DefaultComboBoxModel(wordMovie));
				}
			}
		});
		// comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"19th
		// December 2017", "19th December 2017", "19th December 2017", "19th
		// December 2018", "19th December 2017", "19th December 2017", "19th
		// December 2018"}));
		comboBox_2.setBounds(93, 21, 156, 20);
		panel_1.add(comboBox_2);

		JLabel lblSelectTime = new JLabel("Select Time:");
		lblSelectTime.setBounds(10, 58, 70, 14);
		panel_1.add(lblSelectTime);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "9:90 pm", "10:34 pm" }));
		comboBox_1.setBounds(94, 52, 155, 20);
		panel_1.add(comboBox_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Ticket Pricing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(5, 131, 258, 139);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblAdults = new JLabel("Adults :");
		lblAdults.setBounds(10, 24, 46, 14);
		panel_2.add(lblAdults);

		JLabel label = new JLabel("\u00A35.00");
		label.setForeground(Color.CYAN);
		label.setBounds(57, 24, 46, 14);
		panel_2.add(label);

		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(123, 24, 65, 14);
		panel_2.add(lblQuantity);

		JSpinner spinner = new JSpinner();
		spinner.setBounds(198, 21, 39, 20);
		panel_2.add(spinner);

		JPanel movie_info = new JPanel();
		movie_info.setBorder(new TitledBorder(null, "Movie Info", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		movie_info.setBounds(272, 0, 213, 270);
		Centralpanel.add(movie_info);
		movie_info.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JPanel footer = new JPanel();
		contentPane.add(footer, BorderLayout.SOUTH);

		JLabel footerlabel = new JLabel("Made by Eromonsele Okhilua");
		footer.add(footerlabel);
	}
}
