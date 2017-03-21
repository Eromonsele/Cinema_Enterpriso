import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MainUI extends JFrame {

	private JPanel contentPane;
	CinemaOperations cinemaOperations;
	DefaultListModel<String> cartList = new DefaultListModel<String>();

	private JPanel cinemaApp;
	private JPanel centralPanel;
	private JPanel panel;
	private JLabel lblSelectAMovie;
	private JPanel panel_1;
	private JLabel lblSelectDate;
	private JComboBox<String> cmbBxMovieDate_1;
	private JLabel lblSelectTime;
	private JComboBox<String> cmbBxMovieTime_1;
	private JPanel panel_2;
	private JLabel lblSelectATheater;
	private JComboBox<String> cmbBxTheater_1;
	private JPanel movie_info;
	private JLabel lblImagePic;
	private JPanel footer;
	private JLabel footerlabel;
	private JPanel cinemaTitle;
	private JLabel cinemaLabel;
	private JLabel lblNewLabel;
	private JPanel PreCheckOut;
	private JPanel optionalSnacks;
	private JLabel lblPickASnack;
	private JComboBox<String> cnbBxSnacksList;
	private JLabel lblPickADrink;
	private JComboBox<String> cmbBxDrinksList;
	private JButton btnAddCart;
	private JLabel lblPrice;
	private JLabel label_1;
	private JLabel lblSnacksPrice;
	private JLabel lblQuantity;
	private JLabel adultslabelPricing;
	private JSpinner spinnerAdults;
	private JLabel lblAdults;
	private JPanel adultsPricePanel;
	private JButton btnPlaceOrder;
	private JPanel Receipt;
	private JButton btnPayViaCash;
	private JButton btnPayViaCard;
	private JPanel CheckOut;
	private JList<String> addCartList;
	private JScrollPane scrollPane;
	private JLabel lblShoppingCart;
	private JPanel shoppinCart;
	private JPanel shoppingCartSummary;
	private JButton btnWaiterService;
	private JLabel lblDoYouWish;
	private JLabel lblDrinksPrice;
	private JButton btnAddCart_1;
	private JComboBox<String> cmbBxMovieList_1;
	private JLabel lblAvailableSeats;
	private JPanel CheckOutByCard;
	private JLabel lblNameOnCard;
	private JLabel lblCardNumber;
	private JLabel lblExpiryDate;
	private JLabel lblSecurityCode;
	private JLabel lblOdeonCineplex;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtMm;
	private JLabel label;
	private JTextField txtYy;
	private JTextField textField_4;
	private JLabel lblBillingAddress;
	private JTextField textField_5;
	private JLabel lblPostalCode;
	private JTextField textField_2;
	private JLabel lblPhoneNumber;
	private JTextField textField_3;
	private JLabel lblMobileNumber;
	private JTextField textField_6;
	private JLabel lblCartSummary;
	private JLabel lblFilmClassification;
	private JButton btnRemoveFromCart;
	private JLabel lblDoYouWish_1;
	private JButton btnMoreMovies;
	private JLabel lblPaymentBy;

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
		cinemaOperations.addDrinks();
		cinemaOperations.addSnacks();

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		cinemaApp = new JPanel();
		cinemaApp.setVisible(false);
		contentPane.setLayout(new CardLayout(0, 0));
		contentPane.add(cinemaApp, "name_181745327054796");
		cinemaApp.setLayout(new BorderLayout(0, 0));

		centralPanel = new JPanel();
		cinemaApp.add(centralPanel, BorderLayout.CENTER);
		centralPanel.setLayout(null);

		panel = new JPanel();
		panel.setBounds(0, 0, 293, 329);
		centralPanel.add(panel);
		panel.setLayout(null);

		lblSelectAMovie = new JLabel("Select a movie:");
		lblSelectAMovie.setBounds(13, 57, 97, 14);
		panel.add(lblSelectAMovie);

		cmbBxMovieList_1 = new JComboBox<String>();
		cmbBxMovieList_1.setBounds(120, 54, 155, 20);

		cmbBxMovieList_1.setModel(new DefaultComboBoxModel<String>());

		panel.add(cmbBxMovieList_1);

		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Movie Booking", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBounds(5, 82, 282, 97);
		panel.add(panel_1);
		panel_1.setLayout(null);

		lblSelectDate = new JLabel("Select Date :");
		lblSelectDate.setBounds(10, 30, 77, 14);
		panel_1.add(lblSelectDate);

		cmbBxMovieDate_1 = new JComboBox<String>();
		cmbBxMovieDate_1.setBounds(116, 27, 156, 20);
		panel_1.add(cmbBxMovieDate_1);

		lblSelectTime = new JLabel("Select Time:");
		lblSelectTime.setBounds(10, 61, 70, 14);
		panel_1.add(lblSelectTime);

		cmbBxMovieTime_1 = new JComboBox<String>();
		cmbBxMovieTime_1.setBounds(116, 58, 155, 20);
		panel_1.add(cmbBxMovieTime_1);

		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Ticket Pricing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(5, 179, 282, 139);
		panel.add(panel_2);
		panel_2.setLayout(null);

		lblSelectATheater = new JLabel("Select a Theater:");
		lblSelectATheater.setBounds(13, 17, 97, 14);
		panel.add(lblSelectATheater);

		cmbBxTheater_1 = new JComboBox<String>();
		cmbBxTheater_1.setBounds(120, 14, 155, 20);
		panel.add(cmbBxTheater_1);

		movie_info = new JPanel();
		movie_info.setBorder(null);
		movie_info.setBounds(297, 0, 266, 343);
		centralPanel.add(movie_info);
		movie_info.setLayout(new BorderLayout(0, 0));

		lblImagePic = new JLabel("gdffgh");
		lblImagePic.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagePic.setBounds(new Rectangle(300, 300, 300, 300));
		movie_info.add(lblImagePic, BorderLayout.CENTER);

		cmbBxMovieList_1.setEnabled(false);
		cmbBxMovieDate_1.setEnabled(false);
		cmbBxMovieTime_1.setEnabled(false);
		// spinner.setEnabled(false);

		lblImagePic.setText("");

		lblFilmClassification = new JLabel();
		lblFilmClassification.setForeground(Color.RED);
		lblFilmClassification.setHorizontalAlignment(SwingConstants.CENTER);
		movie_info.add(lblFilmClassification, BorderLayout.SOUTH);

		cmbBxTheater_1.setModel(new DefaultComboBoxModel<String>(cinemaOperations.displayTheaterName()));

		footer = new JPanel();
		cinemaApp.add(footer, BorderLayout.SOUTH);

		footerlabel = new JLabel("Made by Eromonsele Okhilua");
		footer.add(footerlabel);

		cinemaTitle = new JPanel();
		cinemaApp.add(cinemaTitle, BorderLayout.NORTH);
		cinemaTitle.setLayout(new BorderLayout(0, 0));

		cinemaLabel = new JLabel("Odeon Cineplex");
		cinemaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cinemaLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		cinemaTitle.add(cinemaLabel, BorderLayout.NORTH);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cinemaTitle.add(lblNewLabel, BorderLayout.SOUTH);

		PreCheckOut = new JPanel();
		PreCheckOut.setVisible(false);
		contentPane.add(PreCheckOut, "name_181745339534855");
		PreCheckOut.setLayout(null);

		optionalSnacks = new JPanel();
		optionalSnacks.setBounds(281, 0, 282, 405);
		PreCheckOut.add(optionalSnacks);
		optionalSnacks.setLayout(null);

		lblPickASnack = new JLabel("Pick a Snack (Optional):");
		lblPickASnack.setBounds(10, 3, 197, 14);
		optionalSnacks.add(lblPickASnack);

		cnbBxSnacksList = new JComboBox();
		cnbBxSnacksList.setBounds(10, 28, 251, 20);
		optionalSnacks.add(cnbBxSnacksList);

		lblPickADrink = new JLabel("Pick a Drink (Optional):");
		lblPickADrink.setBounds(10, 95, 168, 14);
		optionalSnacks.add(lblPickADrink);

		cmbBxDrinksList = new JComboBox();
		cmbBxDrinksList.setBounds(10, 121, 251, 20);
		optionalSnacks.add(cmbBxDrinksList);

		btnAddCart = new JButton("Add Cart");
		btnAddCart.setBounds(177, 58, 84, 20);
		optionalSnacks.add(btnAddCart);

		lblPrice = new JLabel("Price : ");
		lblPrice.setBounds(10, 61, 46, 14);
		optionalSnacks.add(lblPrice);

		label_1 = new JLabel("Price : ");
		label_1.setBounds(10, 152, 46, 14);
		optionalSnacks.add(label_1);

		lblSnacksPrice = new JLabel("\u00A30.00");
		lblSnacksPrice.setBounds(47, 61, 46, 14);
		optionalSnacks.add(lblSnacksPrice);

		btnAddCart_1 = new JButton("Add Cart");
		btnAddCart_1.setBounds(177, 149, 84, 20);
		optionalSnacks.add(btnAddCart_1);

		lblDrinksPrice = new JLabel("\u00A30.00");
		lblDrinksPrice.setBounds(47, 152, 46, 14);
		optionalSnacks.add(lblDrinksPrice);

		lblDoYouWish = new JLabel("Do you wish to have a waiter service?");
		lblDoYouWish.setBounds(10, 192, 251, 14);
		optionalSnacks.add(lblDoYouWish);

		btnWaiterService = new JButton("Yes");
		btnWaiterService.setBounds(10, 218, 64, 23);
		optionalSnacks.add(btnWaiterService);

		shoppingCartSummary = new JPanel();
		shoppingCartSummary.setBounds(0, 0, 281, 405);
		PreCheckOut.add(shoppingCartSummary);
		shoppingCartSummary.setLayout(null);

		shoppinCart = new JPanel();
		shoppinCart.setBounds(0, 0, 281, 371);
		shoppingCartSummary.add(shoppinCart);
		shoppinCart.setLayout(null);

		lblShoppingCart = new JLabel("Huddersfield Cinema\r\n");
		lblShoppingCart.setBounds(0, 0, 281, 17);
		lblShoppingCart.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		shoppinCart.add(lblShoppingCart);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 44, 281, 327);
		shoppinCart.add(scrollPane);

		addCartList = new JList<String>();
		scrollPane.setViewportView(addCartList);

		JLabel lblItemPriceQuantity = new JLabel("Item                       Quantity                    Price");
		lblItemPriceQuantity.setBounds(0, 21, 281, 16);
		shoppinCart.add(lblItemPriceQuantity);

		CheckOut = new JPanel();
		CheckOut.setBounds(0, 372, 281, 33);
		shoppingCartSummary.add(CheckOut);
		CheckOut.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnRemoveFromCart = new JButton("Remove From Cart");
		CheckOut.add(btnRemoveFromCart);

		Receipt = new JPanel();
		Receipt.setVisible(false);

		CheckOutByCard = new JPanel();
		contentPane.add(CheckOutByCard, "name_181745361010330");
		CheckOutByCard.setLayout(null);

		lblNameOnCard = new JLabel("Name on Card");
		lblNameOnCard.setBounds(12, 31, 104, 16);
		CheckOutByCard.add(lblNameOnCard);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(283, 0, 280, 406);
		CheckOutByCard.add(panel_4);
		panel_4.setLayout(null);

		lblPostalCode = new JLabel("Postal Code");
		lblPostalCode.setBounds(12, 32, 71, 16);
		panel_4.add(lblPostalCode);

		textField_2 = new JTextField();
		textField_2.setBounds(12, 51, 97, 26);
		panel_4.add(textField_2);
		textField_2.setColumns(10);

		lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(12, 84, 132, 16);
		panel_4.add(lblPhoneNumber);

		textField_3 = new JTextField();
		textField_3.setBounds(12, 101, 226, 26);
		panel_4.add(textField_3);
		textField_3.setColumns(10);

		lblMobileNumber = new JLabel("Mobile Number");
		lblMobileNumber.setBounds(12, 139, 97, 16);
		panel_4.add(lblMobileNumber);

		textField_6 = new JTextField();
		textField_6.setBounds(12, 170, 226, 26);
		panel_4.add(textField_6);
		textField_6.setColumns(10);

		lblCartSummary = new JLabel("Cart Summary");
		lblCartSummary.setBounds(12, 221, 116, 16);
		panel_4.add(lblCartSummary);

		JLabel lblItemNumber = new JLabel("Item Number:");
		lblItemNumber.setBounds(12, 249, 97, 16);
		panel_4.add(lblItemNumber);

		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(12, 288, 55, 16);
		panel_4.add(lblTotal);

		JLabel lblCardTotalSummary = new JLabel("\u00A30.00");
		lblCardTotalSummary.setBounds(183, 288, 55, 16);
		panel_4.add(lblCardTotalSummary);

		JLabel lblCardCartSummaryItemNumber = new JLabel("1");
		lblCardCartSummaryItemNumber.setBounds(183, 249, 55, 16);
		panel_4.add(lblCardCartSummaryItemNumber);

		JButton btnConfirmPayment = new JButton("Confirm Payment");
		btnConfirmPayment.setBounds(136, 368, 132, 26);
		panel_4.add(btnConfirmPayment);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 285, 406);
		CheckOutByCard.add(panel_3);
		panel_3.setLayout(null);

		textField = new JTextField();
		textField.setBounds(12, 52, 261, 26);
		panel_3.add(textField);
		textField.setColumns(10);

		lblCardNumber = new JLabel("Card Number");
		lblCardNumber.setBounds(12, 84, 94, 16);
		panel_3.add(lblCardNumber);

		lblExpiryDate = new JLabel("Expiry Date");
		lblExpiryDate.setBounds(12, 142, 81, 16);
		panel_3.add(lblExpiryDate);

		lblSecurityCode = new JLabel("Security Code");
		lblSecurityCode.setBounds(150, 142, 104, 16);
		panel_3.add(lblSecurityCode);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 102, 261, 26);
		panel_3.add(textField_1);

		txtMm = new JTextField();
		txtMm.setText("MM\r\n");
		txtMm.setBounds(11, 170, 42, 26);
		panel_3.add(txtMm);
		txtMm.setColumns(10);

		txtYy = new JTextField();
		txtYy.setText("YY\r\n");
		txtYy.setColumns(10);
		txtYy.setBounds(65, 170, 42, 26);
		panel_3.add(txtYy);

		label = new JLabel("/");
		label.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		label.setBounds(54, 170, 15, 26);
		panel_3.add(label);

		textField_4 = new JTextField();
		textField_4.setBounds(150, 170, 42, 26);
		panel_3.add(textField_4);
		textField_4.setColumns(10);

		lblBillingAddress = new JLabel("Billing Address");
		lblBillingAddress.setBounds(12, 215, 94, 16);
		panel_3.add(lblBillingAddress);

		textField_5 = new JTextField();
		textField_5.setBounds(12, 243, 261, 151);
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		contentPane.add(Receipt, "name_181745350205738");
		Receipt.setLayout(new BorderLayout(0, 0));

		lblOdeonCineplex = new JLabel("Odeon Cineplex");
		Receipt.add(lblOdeonCineplex, BorderLayout.NORTH);

		btnPlaceOrder = new JButton("Place Order");
		btnPlaceOrder.setBounds(10, 91, 113, 23);
		panel_2.add(btnPlaceOrder);

		adultsPricePanel = new JPanel();
		adultsPricePanel.setBounds(10, 21, 259, 34);
		panel_2.add(adultsPricePanel);
		adultsPricePanel.setLayout(null);

		lblAdults = new JLabel("Adults :");
		lblAdults.setBounds(10, 11, 46, 14);
		adultsPricePanel.add(lblAdults);
		lblAdults.setForeground(Color.BLACK);

		spinnerAdults = new JSpinner();
		spinnerAdults.setBounds(183, 8, 33, 20);
		adultsPricePanel.add(spinnerAdults);

		adultslabelPricing = new JLabel("\u00A30.00");
		adultslabelPricing.setBounds(57, 8, 56, 20);
		adultsPricePanel.add(adultslabelPricing);
		adultslabelPricing.setForeground(Color.BLACK);

		lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(125, 11, 55, 14);
		adultsPricePanel.add(lblQuantity);

		lblAvailableSeats = new JLabel("");
		lblAvailableSeats.setBounds(219, 10, 28, 16);
		adultsPricePanel.add(lblAvailableSeats);
		cmbBxDrinksList.setModel(new DefaultComboBoxModel<String>(cinemaOperations.displayDrinks()));
		cnbBxSnacksList.setModel(new DefaultComboBoxModel<String>(cinemaOperations.displaySnacks()));

		btnPayViaCash = new JButton("By Cash");
		btnPayViaCash.setBounds(134, 367, 104, 26);
		optionalSnacks.add(btnPayViaCash);

		btnPayViaCard = new JButton("By Card");
		btnPayViaCard.setBounds(10, 367, 112, 26);
		optionalSnacks.add(btnPayViaCard);

		lblDoYouWish_1 = new JLabel("Do you wish to buy additional movie tickets?");
		lblDoYouWish_1.setBounds(10, 253, 260, 16);
		optionalSnacks.add(lblDoYouWish_1);

		btnMoreMovies = new JButton("Yes");

		btnMoreMovies.setBounds(10, 281, 64, 23);
		optionalSnacks.add(btnMoreMovies);

		lblPaymentBy = new JLabel("Payment");
		lblPaymentBy.setBounds(10, 339, 83, 16);
		optionalSnacks.add(lblPaymentBy);

		btnPayViaCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreCheckOut.setVisible(false);
				CheckOutByCard.setVisible(true);

				lblCardTotalSummary.setText("�" + cinemaOperations.calcReceiptItems());
				lblCardCartSummaryItemNumber.setText("" + cartList.size());

			}
		});

		btnPayViaCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreCheckOut.setVisible(false);
				Receipt.setVisible(true);

				System.out.println(
						cinemaOperations.remainingTickets(Integer.parseInt(spinnerAdults.getValue().toString()),
								cinemaOperations.getTheaters().get(cmbBxMovieList_1.getSelectedIndex()).getMoviesList()
										.get(cmbBxMovieList_1.getSelectedIndex()).getAvailableTickets()));
			}
		});
		btnPlaceOrder.setEnabled(false);

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

					lblFilmClassification
							.setText(cinemaOperations.displayAgeRestrictions(cmbBxMovieList.getSelectedIndex()));
					switch (cinemaOperations.getTheaters().get(cmbBxMovieList_1.getSelectedIndex()).getMoviesList()
							.get(cmbBxMovieList_1.getSelectedIndex()).getAgeRestrictions()) {
					case "18":
					case "R18":

						try {
							if (cinemaOperations.isOfAge(Integer.parseInt(JOptionPane.showInputDialog(
									"This movie requires an age check\nPlease enter age:"))) == false) {
								JOptionPane.showMessageDialog(null, "You are not of age, please try another movie");
								break;
							}

						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "Please enter a number");
						}

					default:
						cmbBxMovieDate_1.setEnabled(true);
						cmbBxMovieDate_1.setModel(new DefaultComboBoxModel<String>(new String[] { "SELECT A DATE",
								cinemaOperations.displayMovieDate(cmbBxMovieList.getSelectedIndex()) }));
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
					cmbBxMovieTime_1.setModel(new DefaultComboBoxModel<String>(new String[] { "SELECT MOVIE TIME",
							cinemaOperations.displayMovieTime(cmbBxMovieList_1.getSelectedIndex()) }));
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
					btnPlaceOrder.setEnabled(true);
					spinnerAdults.setModel(new SpinnerNumberModel(
							0, 0, cinemaOperations.getTheaters().get(cmbBxMovieList_1.getSelectedIndex())
									.getMoviesList().get(cmbBxMovieList_1.getSelectedIndex()).getAvailableTickets(),
							1));
					spinnerAdults.setEnabled(true);
					adultslabelPricing.setText(cinemaOperations.displayMoviePrice(cmbBxMovieList_1.getSelectedIndex()));
					lblAvailableSeats
							.setText(cinemaOperations.displayAvailableTickets(cmbBxMovieList_1.getSelectedIndex()));
				}
			}
		});

		cmbBxDrinksList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JComboBox<?> cmbBxDrinksList = (JComboBox<?>) event.getSource();
				Object selected = cmbBxDrinksList.getSelectedItem();

				if (selected.toString()
						.equals(cinemaOperations.getDrinks().get(cmbBxDrinksList.getSelectedIndex()).getDrinkName())) {
					lblDrinksPrice.setText(cinemaOperations.displayDrinkPrice(cmbBxDrinksList.getSelectedIndex()));
				}

			}
		});

		cnbBxSnacksList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JComboBox<?> cnbBxSnacksList = (JComboBox<?>) event.getSource();
				Object selected = cnbBxSnacksList.getSelectedItem();

				if (selected.toString()
						.equals(cinemaOperations.getSnacks().get(cnbBxSnacksList.getSelectedIndex()).getSnackName())) {
					lblSnacksPrice.setText(cinemaOperations.displaySnacksPrice(cnbBxSnacksList.getSelectedIndex()));
				}

			}
		});

		btnPlaceOrder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (Integer.parseInt(spinnerAdults.getValue().toString()) > 0) {
					cinemaApp.setVisible(false);
					PreCheckOut.setVisible(true);
					float itemPriceD = cinemaOperations.totalTickets(
							Integer.parseInt(spinnerAdults.getValue().toString()),
							cinemaOperations.getTheaters().get(0).getMoviesList().get(0).getMoviePrice());

					String itemPrice = "�" + String.format("%.2f",itemPriceD);
					cartList.addElement(
							cinemaOperations.receiptInfoFormatter(cmbBxMovieList_1.getSelectedItem().toString(),
									itemPrice, spinnerAdults.getValue().toString()));
					addCartList.setModel(cartList);
					cinemaOperations.getReceiptPrices().add(itemPriceD);

					if (cartList.isEmpty()) {
						btnRemoveFromCart.setEnabled(false);
						btnPayViaCard.setEnabled(false);
						btnPayViaCash.setEnabled(false);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Please type or pick a number");
				}
				buttonsEnabled();
			}
		});

		btnAddCart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String itemPrice = cinemaOperations.displaySnacksPrice(cnbBxSnacksList.getSelectedIndex());
				cartList.addElement(cinemaOperations.receiptInfoFormatter(cnbBxSnacksList.getSelectedItem().toString(),
						itemPrice, "1"));
				addCartList.setModel(cartList);
				cinemaOperations.getReceiptPrices()
						.add(cinemaOperations.getSnacks().get(cnbBxSnacksList.getSelectedIndex()).getSnackPrice());
				buttonsEnabled();
			}
		});

		btnAddCart_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String itemPrice = cinemaOperations.displayDrinkPrice(cmbBxDrinksList.getSelectedIndex());
				cartList.addElement(cinemaOperations.receiptInfoFormatter(cmbBxDrinksList.getSelectedItem().toString(),
						itemPrice, "1"));
				addCartList.setModel(cartList);
				cinemaOperations.getReceiptPrices()
						.add(cinemaOperations.getDrinks().get(cmbBxDrinksList.getSelectedIndex()).getDrinkPrice());
				buttonsEnabled();
			}
		});

		btnWaiterService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cartList.addElement(cinemaOperations.receiptInfoFormatter("Waiter Service", "�5.00", "1"));
				addCartList.setModel(cartList);
				cinemaOperations.getReceiptPrices().add(5.0f);
			}
		});

		btnConfirmPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckOutByCard.setVisible(false);
				Receipt.setVisible(true);
			}
		});

		btnMoreMovies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreCheckOut.setVisible(false);
				cinemaApp.repaint();
			}
		});

		btnRemoveFromCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (addCartList.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(null, "Please select an item to be removed");
				} else {
					cinemaOperations.getReceiptPrices().remove(cartList.indexOf(addCartList.getSelectedValue()));
					cartList.remove(addCartList.getSelectedIndex());
				}
				buttonsEnabled();
			}
		});

	}

	
	public void buttonsEnabled() {
		if (cartList.isEmpty()) {
			btnRemoveFromCart.setEnabled(false);
			btnPayViaCard.setEnabled(false);
			btnPayViaCash.setEnabled(false);
		} else {
			btnRemoveFromCart.setEnabled(true);
			btnPayViaCard.setEnabled(true);
			btnPayViaCash.setEnabled(true);
		}
	}
}
