package com.fafica.telasSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import com.fafica.fachada.Fachada;
import com.fafica.funcionario.CPFInvalidoException;
import com.fafica.funcionario.Funcionario;
import com.fafica.funcionario.FuncionarioJaCadastradoException;
import com.fafica.funcionario.FuncionarioNaoEncontradoException;
import com.fafica.util.CampoObrigatorioInvalidoException;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaFuncionario {

	private JFrame frmCadastroAdm;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtCPF;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTable table;
	private DefaultTableModel model;
	private Fachada fachada;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFuncionario window = new TelaFuncionario();
					window.frmCadastroAdm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	
	public TelaFuncionario() throws ClassNotFoundException, SQLException {
		fachada = Fachada.getInstance();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroAdm = new JFrame();
		frmCadastroAdm.setTitle("                                                       Cadastro ADM");
		frmCadastroAdm.setBounds(100, 100, 594, 411);
		frmCadastroAdm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroAdm.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 3, 543, 40);
		frmCadastroAdm.getContentPane().add(panel);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				procurar();
			}
		});
		panel.add(btnProcurar);
		
		JButton btnListar = new JButton("Listar");
		panel.add(btnListar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampo();
			}
		});
		panel.add(btnLimpar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizar();
			}
		});
		panel.add(btnAlterar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remover();
			}
		});
		panel.add(btnRemover);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar();
			}
		});
		panel.add(btnCadastrar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(24, 54, 46, 14);
		frmCadastroAdm.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(56, 51, 209, 20);
		frmCadastroAdm.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("Endereco:");
		lblCpf.setBounds(287, 54, 57, 14);
		frmCadastroAdm.getContentPane().add(lblCpf);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(342, 51, 173, 17);
		frmCadastroAdm.getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setBounds(24, 98, 57, 14);
		frmCadastroAdm.getContentPane().add(lblNewLabel);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(56, 95, 196, 20);
		frmCadastroAdm.getContentPane().add(txtCPF);
		txtCPF.setColumns(10);
		
		JLabel lblTel = new JLabel("Tel:");
		lblTel.setBounds(287, 98, 46, 14);
		frmCadastroAdm.getContentPane().add(lblTel);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(312, 95, 143, 20);
		frmCadastroAdm.getContentPane().add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(24, 146, 46, 14);
		frmCadastroAdm.getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(56, 143, 159, 20);
		frmCadastroAdm.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 212, 537, 160);
		frmCadastroAdm.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "CPf", "Endere\u00E7o", "Telefone", "Email"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(203);
		table.getColumnModel().getColumn(1).setPreferredWidth(167);
		table.getColumnModel().getColumn(2).setPreferredWidth(215);
		table.getColumnModel().getColumn(3).setPreferredWidth(168);
		table.getColumnModel().getColumn(4).setPreferredWidth(180);
		model = (DefaultTableModel) table.getModel(); 
		table.getColumnModel().getColumn(1).setPreferredWidth(474);
		model = (DefaultTableModel) table.getModel();
		scrollPane.setViewportView(table);
	}
	private void cadastrar() {
		String nome			= txtNome.getText();
		String cpf 			= txtEndereco.getText();
		String telefone		= txtTelefone.getText();
		String endereco		= txtCPF.getText();
		String email		= txtEmail.getText();
		Funcionario funcionario	= new Funcionario(nome,cpf,endereco,telefone,email);
		
		try {
			fachada.cadastrarFuncionario(funcionario);
			JOptionPane.showMessageDialog(frame, "Cliente Cadastrado com Sucesso");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (CPFInvalidoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (FuncionarioJaCadastradoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (CampoObrigatorioInvalidoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (FuncionarioNaoEncontradoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	private void limparCampo() {
		txtNome.setText("");
		txtEndereco.setText("");
		txtCPF.setText("");
		txtEmail.setText("");
		txtTelefone.setText("");
	}
	private void procurar(){
		try {
			Funcionario funcionario  = fachada.procurarFuncionario(txtCPF.getText());
			txtNome.setText(funcionario.getNomeFuncionario());
			txtCPF.setText(funcionario.getCpfFuncionario());
			txtEndereco.setText(funcionario.getCpfFuncionario());
			txtCPF.setText(funcionario.getEnderecoFuncionario());
			txtTelefone.setText(funcionario.getTelefoneFuncionario());
			txtEmail.setText(funcionario.getEmailFuncionario());
		} catch (CPFInvalidoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (FuncionarioNaoEncontradoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void remover(){
		try {
			fachada.remorverFuncionario(txtCPF.getText());
			JOptionPane.showMessageDialog(frame, "Cliente Removido com Sucesso");
			limparCampo();
		} catch (FuncionarioNaoEncontradoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (CPFInvalidoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (CampoObrigatorioInvalidoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void atualizar(){
		try{
		Funcionario funcionario = fachada.procurarFuncionario(txtCPF.getText());
		funcionario.setNomeFuncionario(txtNome.getText());
		funcionario.setCpfFuncionario(txtEndereco.getText());
		funcionario.setEnderecoFuncionario(txtCPF.getText());
		funcionario.setTelefoneFuncionario(txtTelefone.getText());
		funcionario.setEmailFuncionario(txtEmail.getText());
		fachada.atualizarFuncionario(funcionario);
		JOptionPane.showMessageDialog(frame, "Cliente Atualizado com Sucesso");
		limparCampo();
		
	} catch (CPFInvalidoException e) {
		// TODO Auto-generated catch block
		JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
	} catch (FuncionarioNaoEncontradoException e) {
		// TODO Auto-generated catch block
		JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
	}
	}
	
}
