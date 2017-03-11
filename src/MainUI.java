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
import javax.swing.JTextArea;

public class MainUI extends JFrame {

	private JPanel contentPane;
	CinemaOperations cinemaOperations;

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

		cinemaOperations = new CinemaOperations();
		cinemaOperations.addTheater();

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 444);
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
		panel.setBounds(0, 0, 293, 329);
		Centralpanel.add(panel);
		panel.setLayout(null);

		JLabel lblSelectAMovie = new JLabel("Select a movie:");
		lblSelectAMovie.setBounds(13, 57, 97, 14);
		panel.add(lblSelectAMovie);

		JComboBox cmbBxMovieList = new JComboBox();
		cmbBxMovieList.setBounds(120, 54, 155, 20);

		cmbBxMovieList.setModel(new DefaultComboBoxModel());

		panel.add(cmbBxMovieList);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Movie Booking", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBounds(5, 82, 282, 97);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblSelectDate = new JLabel("Select Date :");
		lblSelectDate.setBounds(10, 30, 77, 14);
		panel_1.add(lblSelectDate);

		JComboBox cmbBxMovieDate = new JComboBox();
		cmbBxMovieDate.setBounds(116, 27, 156, 20);
		panel_1.add(cmbBxMovieDate);

		JLabel lblSelectTime = new JLabel("Select Time:");
		lblSelectTime.setBounds(10, 61, 70, 14);
		panel_1.add(lblSelectTime);

		JComboBox cmbBxMovieTime = new JComboBox();
		cmbBxMovieTime.setModel(new DefaultComboBoxModel(new String[] { "9:90 pm", "10:34 pm" }));
		cmbBxMovieTime.setBounds(116, 58, 155, 20);
		panel_1.add(cmbBxMovieTime);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Ticket Pricing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(5, 179, 282, 150);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblAdults = new JLabel("Adults :");
		lblAdults.setBounds(10, 24, 46, 14);
		panel_2.add(lblAdults);

		JLabel labelPricing = new JLabel("\u00A35.00");
		labelPricing.setForeground(Color.CYAN);
		labelPricing.setBounds(57, 24, 46, 14);
		panel_2.add(labelPricing);

		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(123, 24, 65, 14);
		panel_2.add(lblQuantity);

		JSpinner spinner = new JSpinner();
		spinner.setBounds(198, 21, 39, 20);
		panel_2.add(spinner);

		JLabel lblSelectATheater = new JLabel("Select a Theater:");
		lblSelectATheater.setBounds(13, 17, 97, 14);
		panel.add(lblSelectATheater);

		JComboBox cmbBxTheater = new JComboBox();
		cmbBxTheater.setBounds(120, 14, 155, 20);
		panel.add(cmbBxTheater);

		JPanel movie_info = new JPanel();
		movie_info.setBorder(null);
		movie_info.setBounds(297, 0, 266, 329);
		Centralpanel.add(movie_info);
		movie_info.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JLabel lblImagePic = new JLabel("gdffgh");
		movie_info.add(lblImagePic);

		JPanel footer = new JPanel();
		contentPane.add(footer, BorderLayout.SOUTH);

		JLabel footerlabel = new JLabel("Made by Eromonsele Okhilua");
		footer.add(footerlabel);

		cmbBxMovieList.setEnabled(false);
		cmbBxMovieDate.setEnabled(false);
		cmbBxMovieTime.setEnabled(false);
		spinner.setEnabled(false);

		cmbBxTheater.setModel(new DefaultComboBoxModel<String>(cinemaOperations.displayTheaterName()));

		cmbBxTheater.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JComboBox cmbBxTheater = (JComboBox) event.getSource();
				Object selected = cmbBxTheater.getSelectedItem();

				if (selected.toString()
						.equals(cinemaOperations.getTheaters().get(cmbBxTheater.getSelectedIndex()).getTheaterName())) {
					cmbBxMovieList.setModel(
							new DefaultComboBoxModel<String>(new String[] { cinemaOperations.displayMovieName(0) }));
					cmbBxMovieList.setEnabled(true);
				}

			}
		});

		cmbBxMovieList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JComboBox cmbBxMovieList = (JComboBox) event.getSource();
				Object selected = cmbBxMovieList.getSelectedItem();

				if (selected.toString().equals(cinemaOperations.getTheaters().get(cmbBxMovieList.getSelectedIndex())
						.getMoviesList().get(cmbBxMovieList.getSelectedIndex()).getMovieName())) {
					cmbBxMovieDate.setEnabled(true);
					cmbBxMovieDate.setModel(
							new DefaultComboBoxModel<String>(new String[] { cinemaOperations.displayMovieDate(0) }));

				}
			}
		});

		cmbBxMovieDate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JComboBox cmbBxMovieDate = (JComboBox) event.getSource();
				Object selected = cmbBxMovieDate.getSelectedItem();

				if (selected.toString().equals(cinemaOperations.getTheaters().get(cmbBxMovieDate.getSelectedIndex())
						.getMoviesList().get(cmbBxMovieDate.getSelectedIndex()).getMoviePreview())) {
					cmbBxMovieTime.setEnabled(true);
					cmbBxMovieTime.setModel(
							new DefaultComboBoxModel<String>(new String[] { cinemaOperations.displayMovieTime(0) }));
				}
			}
		});

		cmbBxMovieTime.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JComboBox cmbBxMovieTime = (JComboBox) event.getSource();
				Object selected = cmbBxMovieTime.getSelectedItem();

				if (selected.toString().equals(cinemaOperations.getTheaters().get(cmbBxMovieTime.getSelectedIndex()).getMoviesList().get(cmbBxMovieTime.getSelectedIndex()).getMovieTime())) {
					spinner.setEnabled(true);
					labelPricing.setText(cinemaOperations.displayMoviePrice(0));
				}
			}
		});
	}
}
