package com.fafica.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroMotorista extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textEndereco;
	private JTextField textTelefone;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroMotorista frame = new TelaCadastroMotorista();
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
	public TelaCadastroMotorista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 731, 195);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIdMotorista = new JLabel("ID Motorista");
		lblIdMotorista.setBounds(10, 11, 82, 14);
		panel.add(lblIdMotorista);
		
		textId = new JTextField();
		textId.setBounds(104, 10, 122, 20);
		panel.add(textId);
		textId.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 51, 46, 14);
		panel.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(62, 51, 200, 20);
		panel.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 88, 46, 14);
		panel.add(lblCpf);
		
		textCpf = new JTextField();
		textCpf.setBounds(62, 82, 200, 20);
		panel.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel Endereco = new JLabel("Endereco");
		Endereco.setBounds(10, 126, 46, 14);
		panel.add(Endereco);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(62, 123, 200, 20);
		panel.add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 159, 46, 14);
		panel.add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(62, 153, 200, 20);
		panel.add(textTelefone);
		textTelefone.setColumns(10);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setBounds(253, 11, 47, 14);
		panel.add(lblSalario);
		
		textField = new JTextField();
		textField.setBounds(302, 10, 114, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(449, 9, 89, 23);
		panel.add(btnCadastrar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(559, 9, 89, 23);
		panel.add(btnAtualizar);
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setBounds(409, 79, 129, 23);
		panel.add(btnLimparCampos);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(559, 79, 89, 23);
		panel.add(btnRemover);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(437, 139, 89, 23);
		panel.add(btnProcurar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 206, 731, 175);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID Motorista", "Nome", "CPF", "Endereco", "Telefone", "Salario"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnListarMotorista = new JButton("Listar Motorista");
		btnListarMotorista.setBounds(333, 396, 134, 23);
		contentPane.add(btnListarMotorista);
	}

}
