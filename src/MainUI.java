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
import javax.swing.ImageIcon;
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
import java.awt.Rectangle;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JTextPane;

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
		setContentPane(contentPane);

		JPanel cinemaApp = new JPanel();
		cinemaApp.setVisible(false);
		contentPane.setLayout(new CardLayout(0, 0));
		contentPane.add(cinemaApp, "name_16078629756897");
		cinemaApp.setLayout(new BorderLayout(0, 0));

		JPanel Centralpanel = new JPanel();
		cinemaApp.add(Centralpanel, BorderLayout.CENTER);
		Centralpanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 293, 329);
		Centralpanel.add(panel);
		panel.setLayout(null);

		JLabel lblSelectAMovie = new JLabel("Select a movie:");
		lblSelectAMovie.setBounds(13, 57, 97, 14);
		panel.add(lblSelectAMovie);

		JComboBox<String> cmbBxMovieList_1 = new JComboBox<String>();
		cmbBxMovieList_1.setBounds(120, 54, 155, 20);

		cmbBxMovieList_1.setModel(new DefaultComboBoxModel<String>());

		panel.add(cmbBxMovieList_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Movie Booking", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBounds(5, 82, 282, 97);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblSelectDate = new JLabel("Select Date :");
		lblSelectDate.setBounds(10, 30, 77, 14);
		panel_1.add(lblSelectDate);

		JComboBox<String> cmbBxMovieDate_1 = new JComboBox<String>();
		cmbBxMovieDate_1.setBounds(116, 27, 156, 20);
		panel_1.add(cmbBxMovieDate_1);

		JLabel lblSelectTime = new JLabel("Select Time:");
		lblSelectTime.setBounds(10, 61, 70, 14);
		panel_1.add(lblSelectTime);

		JComboBox<String> cmbBxMovieTime_1 = new JComboBox<String>();
		cmbBxMovieTime_1.setBounds(116, 58, 155, 20);
		panel_1.add(cmbBxMovieTime_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Ticket Pricing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(5, 179, 282, 150);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblAdults = new JLabel("Adults :");
		lblAdults.setBounds(10, 24, 46, 14);
		panel_2.add(lblAdults);

		JLabel labelPricing = new JLabel("\u00A30.00");
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

		JComboBox<String> cmbBxTheater_1 = new JComboBox<String>();
		cmbBxTheater_1.setBounds(120, 14, 155, 20);
		panel.add(cmbBxTheater_1);

		JPanel movie_info = new JPanel();
		movie_info.setBorder(null);
		movie_info.setBounds(297, 0, 276, 329);
		Centralpanel.add(movie_info);
		movie_info.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblImagePic = new JLabel("gdffgh");
		lblImagePic.setBounds(new Rectangle(300, 300, 300, 300));
		movie_info.add(lblImagePic);

		cmbBxMovieList_1.setEnabled(false);
		cmbBxMovieDate_1.setEnabled(false);
		cmbBxMovieTime_1.setEnabled(false);
		spinner.setEnabled(false);

		JButton btnPlaceOrder = new JButton("Place Order");
		btnPlaceOrder.setBounds(10, 116, 113, 23);
		panel_2.add(btnPlaceOrder);
		lblImagePic.setText("");
		cmbBxTheater_1.setModel(new DefaultComboBoxModel<String>(cinemaOperations.displayTheaterName()));

		JPanel footer = new JPanel();
		cinemaApp.add(footer, BorderLayout.SOUTH);

		JLabel footerlabel = new JLabel("Made by Eromonsele Okhilua");
		footer.add(footerlabel);

		JPanel cinemaTitle = new JPanel();
		cinemaApp.add(cinemaTitle, BorderLayout.NORTH);
		cinemaTitle.setLayout(new BorderLayout(0, 0));

		JLabel cinemaLabel = new JLabel("Odeon Cineplex");
		cinemaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cinemaLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		cinemaTitle.add(cinemaLabel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cinemaTitle.add(lblNewLabel, BorderLayout.SOUTH);

		JPanel PreCheckOut = new JPanel();
		PreCheckOut.setVisible(false);
		contentPane.add(PreCheckOut, "name_16078638555846");
		PreCheckOut.setLayout(null);

		JPanel optionalSnacks = new JPanel();
		optionalSnacks.setBounds(281, 0, 282, 405);
		PreCheckOut.add(optionalSnacks);

		JPanel shoppingCartSummary = new JPanel();
		shoppingCartSummary.setBounds(0, 0, 281, 405);
		PreCheckOut.add(shoppingCartSummary);
		shoppingCartSummary.setLayout(new BorderLayout(0, 0));

		JPanel shoppinCart = new JPanel();
		shoppingCartSummary.add(shoppinCart, BorderLayout.CENTER);
		shoppinCart.setLayout(null);

		JTextPane shoppingCartInfo = new JTextPane();
		shoppingCartInfo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		shoppingCartInfo.setForeground(new Color(0, 0, 255));
		shoppingCartInfo.setEnabled(false);
		shoppingCartInfo.setEditable(false);
		shoppingCartInfo.setText("Huddersfield Cinema");
		shoppingCartInfo.setBounds(0, 5, 281, 367);
		shoppinCart.add(shoppingCartInfo);

		JPanel CheckOut = new JPanel();
		shoppingCartSummary.add(CheckOut, BorderLayout.SOUTH);

		JButton btnPayViaCard = new JButton("Pay Via Card");
		CheckOut.add(btnPayViaCard);

		JButton btnPayViaCash = new JButton("Pay By Cash");
		CheckOut.add(btnPayViaCash);

		JPanel Receipt = new JPanel();
		Receipt.setVisible(false);
		contentPane.add(Receipt, "name_16078647602490");
		Receipt.setLayout(new BorderLayout(0, 0));

		shoppingCartInfo.setText(shoppingCartInfo.getText() + "\ndreas ");

		cmbBxTheater_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JComboBox<?> cmbBxTheater = (JComboBox<?>) event.getSource();
				Object selected = cmbBxTheater_1.getSelectedItem();

				if (selected.toString()
						.equals(cinemaOperations.getTheaters().get(cmbBxTheater.getSelectedIndex()).getTheaterName())) {
					cmbBxMovieList_1.setModel(new DefaultComboBoxModel<String>(
							cinemaOperations.displayMovieName(cmbBxTheater.getSelectedIndex())));
					cmbBxMovieList_1.setEnabled(true);
				}

			}
		});

		cmbBxMovieList_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JComboBox<?> cmbBxMovieList = (JComboBox<?>) event.getSource();
				Object selected = cmbBxMovieList.getSelectedItem();

				if (selected.toString().equals(cinemaOperations.getTheaters().get(cmbBxMovieList.getSelectedIndex())
						.getMoviesList().get(cmbBxMovieList.getSelectedIndex()).getMovieName())) {
					cmbBxMovieDate_1.setEnabled(true);
					cmbBxMovieDate_1.setModel(new DefaultComboBoxModel<String>(
							new String[] { cinemaOperations.displayMovieDate(cmbBxMovieList.getSelectedIndex()) }));
					// cmbBxMovieTime_1.setEnabled(true);
					//
					switch (cmbBxMovieList.getSelectedIndex()) {
					case 0:
						lblImagePic.setIcon(new ImageIcon(getClass()
								.getResource(cinemaOperations.displayMoviePic(cmbBxMovieList.getSelectedIndex()))));
						break;
					case 1:
						lblImagePic.setIcon(new ImageIcon(getClass().getResource(cinemaOperations.displayMoviePic(1))));
						break;
					case 2:
						lblImagePic.setIcon(new ImageIcon(getClass().getResource(cinemaOperations.displayMoviePic(2))));
						break;
					case 3:
						lblImagePic.setIcon(new ImageIcon(getClass().getResource(cinemaOperations.displayMoviePic(3))));
						break;
					case 4:
						lblImagePic.setIcon(new ImageIcon(getClass().getResource(cinemaOperations.displayMoviePic(4))));
						break;
					case 5:
						lblImagePic.setIcon(new ImageIcon(getClass().getResource(cinemaOperations.displayMoviePic(5))));
						break;
					default:
						lblImagePic.setIcon(new ImageIcon(getClass().getResource("")));
						break;
					}
				}
			}
		});

		cmbBxMovieDate_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JComboBox cmbBxMovieDate = (JComboBox) event.getSource();
				Object selected = cmbBxMovieDate.getSelectedItem();

				if (selected.toString().equals(cinemaOperations.getTheaters().get(cmbBxMovieList_1.getSelectedIndex())
						.getMoviesList().get(cmbBxMovieList_1.getSelectedIndex()).getMoviePreview())) {
					cmbBxMovieTime_1.setEnabled(true);
					cmbBxMovieTime_1.setModel(new DefaultComboBoxModel<String>(
							new String[] { cinemaOperations.displayMovieTime(cmbBxMovieList_1.getSelectedIndex()) }));
				}
			}
		});

		cmbBxMovieTime_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JComboBox<?> cmbBxMovieTime = (JComboBox<?>) event.getSource();
				Object selected = cmbBxMovieTime.getSelectedItem();

				if (selected.toString().equals(cinemaOperations.getTheaters().get(cmbBxMovieList_1.getSelectedIndex())
						.getMoviesList().get(cmbBxMovieList_1.getSelectedIndex()).getMovieTime())) {
					spinner.setModel(new SpinnerNumberModel(0, 0,
							cinemaOperations.displayAvailableTickets(cmbBxMovieList_1.getSelectedIndex()), 1));
					spinner.setEnabled(true);
					labelPricing.setText(cinemaOperations.displayMoviePrice(cmbBxMovieList_1.getSelectedIndex()));

				}
			}
		});

		btnPlaceOrder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cinemaApp.setVisible(false);
				PreCheckOut.setVisible(true);
			}
		});
	}
}
