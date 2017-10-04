package com.app.integrated.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.app.abacus.panel.exception.AbacusException;

import com.app.instructions.beans.Action;
import com.app.instructions.compiler.InstructionCompiler;
import com.app.instructions.compiler.exception.CompilerException;
import com.app.test.TextAreaRenderer;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Main_Panel extends JFrame {

	private JPanel contentPane;

	LinkedHashMap<String, HashMap<String, List<Action>>> data;
	private String teacheralign;
	private String studentalign;

	private int topichight;
	private int topicwidth;
	private int abacushight;
	private int abacuswidth;
	private int instructionhight;
	private int instructionwidth;
	
	private String row1Layout;
	private String row2Layout;
	private String row3Layout;
	
	public String getRow1Layout() {
		return row1Layout;
	}

	public void setRow1Layout(String row1Layout) {
		this.row1Layout = row1Layout;
	}

	public String getRow2Layout() {
		return row2Layout;
	}

	public void setRow2Layout(String row2Layout) {
		this.row2Layout = row2Layout;
	}

	public String getRow3Layout() {
		return row3Layout;
	}

	public void setRow3Layout(String row3Layout) {
		this.row3Layout = row3Layout;
	}

	public int getTopichight() {
		return topichight;
	}

	public void setTopichight(int topichight) {
		this.topichight = topichight;
	}

	public int getTopicwidth() {
		return topicwidth;
	}

	public void setTopicwidth(int topicwidth) {
		this.topicwidth = topicwidth;
	}

	public int getAbacushight() {
		return abacushight;
	}

	public void setAbacushight(int abacushight) {
		this.abacushight = abacushight;
	}

	public int getAbacuswidth() {
		return abacuswidth;
	}

	public void setAbacuswidth(int abacuswidth) {
		this.abacuswidth = abacuswidth;
	}

	public int getInstructionhight() {
		return instructionhight;
	}

	public void setInstructionhight(int instructionhight) {
		this.instructionhight = instructionhight;
	}

	public int getInstructionwidth() {
		return instructionwidth;
	}

	public void setInstructionwidth(int instructionwidth) {
		this.instructionwidth = instructionwidth;
	}

	/**
	 * @return the data
	 */
	public LinkedHashMap<String, HashMap<String, List<Action>>> getData() {
		return data;
	}

	/**
	 * @return the teacheralign
	 */
	public String getTeacheralign() {
		return teacheralign;
	}

	/**
	 * @param teacheralign
	 *            the teacheralign to set
	 */
	public void setTeacheralign(String teacheralign) {
		this.teacheralign = teacheralign;
	}

	/**
	 * @return the studentalign
	 */
	public String getStudentalign() {
		return studentalign;
	}

	/**
	 * @param studentalign
	 *            the studentalign to set
	 */
	public void setStudentalign(String studentalign) {
		this.studentalign = studentalign;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(LinkedHashMap<String, HashMap<String, List<Action>>> data) {
		this.data = data;
	}

	private int row1height, row1width, row2height, row2width, row3height, row3width, fontsize, numofrows, noofcoloumns,
			noofrods;
	String topicalignment;
	InstructionCompiler compiler;

	public int getRow1height() {
		return row1height;
	}

	public void setRow1height(int row1height) {
		this.row1height = row1height;
	}

	public int getRow1width() {
		return row1width;
	}

	public void setRow1width(int row1width) {
		this.row1width = row1width;
	}

	public int getRow2height() {
		return row2height;
	}

	public void setRow2height(int row2height) {
		this.row2height = row2height;
	}

	public int getRow2width() {
		return row2width;
	}

	public void setRow2width(int row2width) {
		this.row2width = row2width;
	}

	public int getRow3height() {
		return row3height;
	}

	public void setRow3height(int row3height) {
		this.row3height = row3height;
	}

	public int getRow3width() {
		return row3width;
	}

	public void setRow3width(int row3width) {
		this.row3width = row3width;
	}

	/**
	 * @return the topicalignment
	 */
	public String getTopicalignment() {
		return topicalignment;
	}

	/**
	 * @param topicalignment
	 *            the topicalignment to set
	 */
	public void setTopicalignment(String topicalignment) {
		this.topicalignment = topicalignment;
	}

	/**
	 * @return the noofrods
	 */
	public int getNoofrods() {
		return noofrods;
	}

	/**
	 * @param noofrods
	 *            the noofrods to set
	 */
	public void setNoofrods(int noofrods) {
		this.noofrods = noofrods;
	}

	/**
	 * @return the numofrows
	 */
	public int getNumofrows() {
		return numofrows;
	}

	/**
	 * @param numofrows
	 *            the numofrows to set
	 */
	public void setNumofrows(int numofrows) {
		this.numofrows = numofrows;
	}

	/**
	 * @return the noofcoloumns
	 */
	public int getNoofcoloumns() {
		return noofcoloumns;
	}

	/**
	 * @param noofcoloumns
	 *            the noofcoloumns to set
	 */
	public void setNoofcoloumns(int noofcoloumns) {
		this.noofcoloumns = noofcoloumns;
	}

	/**
	 * @return the fontsize
	 */
	public int getFontsize() {
		return fontsize;
	}

	/**
	 * @param fontsize
	 *            the fontsize to set
	 */
	public void setFontsize(int fontsize) {
		this.fontsize = fontsize;
	}

	/**
	 * @return the fontname
	 */
	public String getFontname() {
		return fontname;
	}

	/**
	 * @param fontname
	 *            the fontname to set
	 */
	public void setFontname(String fontname) {
		this.fontname = fontname;
	}

	private String topicname, fontname;
	private JTextField textField;

	private JPanel tablepanel;

	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Panel frame = new Main_Panel();
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
	public Main_Panel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Load Instruction Sheet");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					JFileChooser jFileChooser = new JFileChooser();
					int result = jFileChooser.showOpenDialog(new JFrame());
					if (result == JFileChooser.APPROVE_OPTION) {
						File selectedFile = jFileChooser.getSelectedFile();
						textField.setText(selectedFile.getAbsolutePath());
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(17, 58, 172, 48);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Show Integrated Panel\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (getRow2height() > 0 && getRow3height() > 0) {
					try {
						TestAllAbacusComponent testAllAbacusComponent = new TestAllAbacusComponent(getRow1Layout(),getRow2Layout(),getRow3Layout(),getRow1height(),
								getRow1width(), getRow2height(), getRow2width(), getRow3height(), getRow3width(),
								getTopichight(), getTopicwidth(), getAbacushight(), getAbacuswidth(),
								getInstructionhight(), getInstructionwidth(), getNoofrods(), getTopicname(),
								getFontname(), getFontsize(), getTopicalignment(), getStudentalign(),
								getTeacheralign());

						testAllAbacusComponent.setCompilerdata(getData());
						testAllAbacusComponent.showPanel();
						testAllAbacusComponent.setVisible(true);
						testAllAbacusComponent.invalidate();
						testAllAbacusComponent.validate();
						testAllAbacusComponent.repaint();

						// testAllAbacusComponent.pack();
					} catch (Throwable e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Please select a file first", "InfoBox: Integrated Panel",
							JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		btnNewButton_1.setBounds(17, 177, 172, 48);
		contentPane.add(btnNewButton_1);

		textField = new JTextField();
		textField.setBounds(201, 68, 221, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton_2 = new JButton("Compiler");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() > 0) {
					try {

						compiler = new InstructionCompiler(textField.getText());
						boolean isAllSet = compiler.compileInstructions();
						if (!isAllSet) {
							JOptionPane.showMessageDialog(null, "Found Errors!!!. Please resolve!!!",
									"InfoBox: Abacus Compiler", JOptionPane.INFORMATION_MESSAGE);
							displayErrors(compiler.getMapOfErrors());
						} else {
							JOptionPane.showMessageDialog(null, "No Errors!!!.", "InfoBox: Abacus Compiler",
									JOptionPane.INFORMATION_MESSAGE);
							setData(compiler.getInstructionData());
							start_beforInstructing();
						}
					} catch (CompilerException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (AbacusException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				} else {
					JOptionPane.showMessageDialog(null, "Please select a file first", "InfoBox: Integrated Panel",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnNewButton_2.setBounds(17, 123, 172, 42);
		contentPane.add(btnNewButton_2);

		tablepanel = new JPanel();
		tablepanel.setBackground(Color.RED);
		tablepanel.setBounds(10, 100, this.getWidth() - 20, this.getHeight() - 150);
		// add the table to the frame

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Row");
		model.addColumn("Instructions");
		model.addColumn("Actions");

		table = new JTable(model);
		table.setGridColor(Color.LIGHT_GRAY);

		table.getColumn("Instructions").setCellRenderer(new TextAreaRenderer());
		table.getColumn("Actions").setCellRenderer(new TextAreaRenderer());

		TableColumn column = table.getColumnModel().getColumn(0);
		column.setPreferredWidth(100);

		column = table.getColumnModel().getColumn(1);
		column.setPreferredWidth(300);

		column = table.getColumnModel().getColumn(2);
		column.setPreferredWidth(600);

		table.setPreferredScrollableViewportSize(
				new Dimension(tablepanel.getWidth() - 20, tablepanel.getHeight() - 40));
		tablepanel.add(new JScrollPane(table));
	}

	private void displayErrors(LinkedHashMap<String, HashMap<String, List<String>>> errors) {
		// TODO Auto-generated method stub

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.getDataVector().removeAllElements();

		Set<Entry<String, HashMap<String, List<String>>>> entrySet = errors.entrySet();
		for (Entry<String, HashMap<String, List<String>>> entry : entrySet) {
			Object[] tableRow = new Object[3];
			String row = entry.getKey();
			tableRow[0] = row;

			HashMap<String, List<String>> errorMsgs = entry.getValue();
			List<String> errorList = errorMsgs.get("instructionError");
			StringBuffer insBuf = new StringBuffer();
			for (String errorMsg : errorList) {
				System.out.println(errorMsg);
				insBuf.append(errorMsg).append("\n");
			}

			tableRow[1] = insBuf.toString();

			StringBuffer actBuf = new StringBuffer();
			List<String> errorAList = errorMsgs.get("actionError");
			for (String errorMsg : errorAList) {
				actBuf.append(errorMsg).append("\n");
			}
			tableRow[2] = actBuf.toString();
			model.addRow(tableRow);
		}
		JOptionPane.showConfirmDialog(null, tablepanel, "Error Details", JOptionPane.CANCEL_OPTION);
	}

	public void start_beforInstructing() throws AbacusException {
		Set<Entry<String, HashMap<String, List<Action>>>> entrySet = data.entrySet();
		int i = 0;
		HashMap<String, String> actionMap = new HashMap<String, String>();
		for (Entry<String, HashMap<String, List<Action>>> entry : entrySet) {
			String key = entry.getKey();

			HashMap<String, List<Action>> map = entry.getValue();
			Set<Entry<String, List<Action>>> sEntry = map.entrySet();
			for (Entry<String, List<Action>> entry2 : sEntry) {
				i++;
				String instruction = entry2.getKey();

				ArrayList<String> strings = new ArrayList<>(Arrays.asList(instruction.split("")));
				if (instruction.contains("Learning")) {
					String s = instruction.replace("<Topic>", "");
					String s2 = s.replace("</Topic>", "");
					String s3 = s2.replace("\"", " ");
					setTopicname(s3);
				}
				List<Action> listOfActions = entry2.getValue();
				for (Action actionlist : listOfActions) {
					if (actionlist.getActionName().contains("Font")) {
						setFontname(String.valueOf(actionlist.getFont().getName()));
						setFontsize(Integer.parseInt(actionlist.getFont().getSize()));
					} else if (actionlist.getActionName().contains("Layout")) {
						setNumofrows((actionlist.getLayout().getNumOfRow()));
						setNoofcoloumns(((actionlist.getLayout().getNumOfCols())));

						for (int j = 0; j < actionlist.getLayout().getRows().size(); j++) {
							if (j == 0) {
								setRow1height(Integer.parseInt(actionlist.getLayout().getRows().get(j).getHeight().replaceAll("null", "")));
								setRow1width(Integer.parseInt(actionlist.getLayout().getRows().get(j).getWidth().replaceAll("null", "")));

								if (actionlist.getLayout().getRows().get(j).getCols().get(0).getComponentName().contains("topic")) {
									setTopichight(getRow1height());
									setTopicwidth(getRow1width());
									setRow1Layout("topic");

										
								} else if (actionlist.getLayout().getRows().get(j).getCols().get(0).getComponentName().contains("abacus")) {
									setAbacushight(getRow1height());
									setAbacuswidth(getRow1width());
									setRow1Layout("abacus");
									
										
								} else if (actionlist.getLayout().getRows().get(j).getCols().get(0).getComponentName().contains("actor")) {
									setInstructionhight(getRow1height());
									setInstructionwidth(getRow1width());
									setRow1Layout("actor");
								}
							}
							if (j == 1) {
								
								setRow2height(Integer.parseInt(actionlist.getLayout().getRows().get(j).getHeight().replaceAll("null", "")));
								setRow2width(Integer.parseInt(actionlist.getLayout().getRows().get(j).getWidth().replaceAll("null", "")));
								
								if (actionlist.getLayout().getRows().get(j).getCols().get(0).getComponentName().contains("topic")) {
									setTopichight(getRow2height());
									setTopicwidth(getRow2width());
									setRow2Layout("topic");

										
								} else if (actionlist.getLayout().getRows().get(j).getCols().get(0).getComponentName().contains("abacus")) {
									setAbacushight(getRow2height());
									setAbacuswidth(getRow2width());
									setRow2Layout("abacus");
									
										
								} else if (actionlist.getLayout().getRows().get(j).getCols().get(0).getComponentName().contains("actor")) {
									setInstructionhight(getRow2height());
									setInstructionwidth(getRow2width());
									setRow2Layout("actor");
					
								}
							}
							if (j == 2) {
								setRow3height(Integer.parseInt(actionlist.getLayout().getRows().get(j).getHeight().replaceAll("null", "")));
								setRow3width(Integer.parseInt(actionlist.getLayout().getRows().get(j).getWidth().replaceAll("null", "")));
								
								if (actionlist.getLayout().getRows().get(j).getCols().get(0).getComponentName().contains("topic")) {
									setTopichight(getRow3height());
									setTopicwidth(getRow3width());
									setRow3Layout("topic");

										
								} else if (actionlist.getLayout().getRows().get(j).getCols().get(0).getComponentName().contains("abacus")) {
									setAbacushight(getRow3height());
									setAbacuswidth(getRow3width());
									setRow3Layout("abacus");
									
										
								} else if (actionlist.getLayout().getRows().get(j).getCols().get(0).getComponentName().contains("actor")) {
									setInstructionhight(getRow3height());
									setInstructionwidth(getRow3width());
									setRow3Layout("actor");
					
								}
							}
						}
					} else if (actionlist.getActionName().replaceAll("null", "").contains("Component")) {
						System.out.println("" + actionlist);
						if (actionlist.getComponent().getName().replaceAll("null", "").equals("abacus")) {
							if (actionlist.getRodNumber() != null) {
								setNoofrods(actionlist.getRodNumber());
								System.out.println("get rods " + getNoofrods());
							}
						} else if (actionlist.getComponent().getName().equals("topic")) {
							setTopicalignment(actionlist.getComponent().getAlign());
							System.out.println("get topic " + getTopicalignment());
						} else if (actionlist.getComponent().getName().contains("actor")) {
							setTeacheralign((actionlist.getComponent().getTeacherAlign()));
							setStudentalign((actionlist.getComponent().getStudentAlign()));

							System.out.println("teacheralign : " + getTeacheralign());
							System.out.println("studentalign : " + getStudentalign());
						}
					}
				}
			}
		}
	}

	/**
	 * @return the topicname
	 */
	public String getTopicname() {
		return topicname;
	}

	/**
	 * @param topicname
	 *            the topicname to set
	 */
	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}
}
