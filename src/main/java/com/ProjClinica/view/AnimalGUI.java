package com.ProjClinica.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ProjClinica.model.models.Animal;
import com.ProjClinica.model.service.AnimalService;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnimalGUI extends JFrame {



	private static final long serialVersionUID = -6866119353997213163L;

	private JPanel contentPane;
	private JTextField textFieldNomeAnimal;
	private JTextField textFieldEspecie;
	private JTextField textFieldRaca;
	private JTextField textFieldSexo;
	private JTextField textFieldNomeDono;
	private JTextField textFieldTelefone;
	private JButton btnCadastrar;
	private JButton btnAlterar;
	private JButton btnExcluir;
	private JButton btnSair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		setTitle("Cadastro Animal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNomeAnimal = new JLabel("Nome do Animal:");

		textFieldNomeAnimal = new JTextField();
		textFieldNomeAnimal.setColumns(10);

		JLabel lblEspecie = new JLabel("Esp\u00E9cie:");

		textFieldEspecie = new JTextField();
		textFieldEspecie.setColumns(10);

		JLabel lblNewRaca = new JLabel("Ra\u00E7a:");

		textFieldRaca = new JTextField();
		textFieldRaca.setColumns(10);

		JLabel lblSexo = new JLabel("Sexo:");

		textFieldSexo = new JTextField();
		textFieldSexo.setColumns(10);

		JLabel lblNomeDono = new JLabel("Nome do Dono:");

		textFieldNomeDono = new JTextField();
		textFieldNomeDono.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone:");

		textFieldTelefone = new JTextField();
		textFieldTelefone.setColumns(10);

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarAnimal();
			}
		});

		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alterarAnimal();
			}
		});

		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excluirAnimal();
			}
		});

		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sairAnimal();
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNomeAnimal)
												.addComponent(lblEspecie)
												.addComponent(lblNewRaca)
												.addComponent(lblSexo)
												.addComponent(lblNomeDono)
												.addComponent(lblTelefone))
										.addGap(20))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(btnCadastrar)
										.addGap(18)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
										.addGap(26)
										.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
								.addComponent(textFieldTelefone)
								.addComponent(textFieldNomeDono)
								.addComponent(textFieldSexo)
								.addComponent(textFieldRaca)
								.addComponent(textFieldEspecie)
								.addComponent(textFieldNomeAnimal, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
						.addContainerGap(138, Short.MAX_VALUE))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(36)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNomeAnimal)
								.addComponent(textFieldNomeAnimal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblEspecie)
								.addComponent(textFieldEspecie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewRaca)
								.addComponent(textFieldRaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSexo)
								.addComponent(textFieldSexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNomeDono)
								.addComponent(textFieldNomeDono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTelefone)
								.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCadastrar)
								.addComponent(btnAlterar)
								.addComponent(btnExcluir)
								.addComponent(btnSair))
						.addContainerGap())
				);
		contentPane.setLayout(gl_contentPane);
	}

	protected void sairAnimal() {
		dispose();

	}

	protected void excluirAnimal() {
		Animal animal = new Animal();
		AnimalService animalService = new AnimalService();
		animalService.delete(animal);

	}

	protected void alterarAnimal() {
		Animal animal = new Animal();
		AnimalService animalService = new AnimalService();
		animalService.update(animal);

	}

	protected void CadastrarAnimal() {
		Animal animal = pegarDadosAnimal();
		System.out.println(animal.toString());

		AnimalService animalService = new AnimalService();
		animalService.save(animal);	
	}


	public Animal pegarDadosAnimal() {

		Animal animal = new Animal();

		animal.setNome_animal(textFieldNomeAnimal.getText());
		animal.setEspecie(textFieldEspecie.getText());
		animal.setRaca(textFieldRaca.getText());
		animal.setSexo(textFieldSexo.getText());
		animal.setNome_dono(textFieldNomeDono.getText());
		animal.setTelefone(textFieldTelefone.getText());


		return animal;
	}


}
