package gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class S06_JTable extends StudyFrame{
	
	public S06_JTable() {
		super();
		
		Container con = getContentPane();
		
		
		String[] columnNames = {"employee_id","first_name","job_id","department_name"};
		String[][] data = {
				{"1","Smith","IT_PROG","IT"},
				{"2","Allen","IT_PROG","IT"},
				{"3","Ki","IT_PROG","IT"},
				{"4","Zoey","IT_PROG","IT"},
				{"5","Warren","IT_PROG","IT"},
		};
		
		
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);	//�÷��̸����� ������ �� �� ���
		
		table.getTableHeader().setPreferredSize(new Dimension(
				scrollPane.getWidth(),50)); //�÷� ĭ ���� ����
		
		table.getTableHeader().setFont(new Font("Small Fonts", Font.BOLD, 25));	//�÷� �۾� ũ��
		
		
		table.setCellSelectionEnabled(true); //��ĭ�� ����
		table.setRowHeight(50); //ĭ ����
		table.setAlignmentY(JTable.TOP_ALIGNMENT);
		table.setShowGrid(true);	//true:�� false:������
		table.setFont(new Font("Consolas", Font.PLAIN,20));
		
		con.add(scrollPane, "Center");
		
		/*
		 	�̺�Ʈ �������̽��� �״�� ����ϸ� �������̽� ������ ��� �߻� �޼��带 �����ؾ� �Ѵ�.
		 	�̷� ��쿡�� �̺�Ʈ ����� Ŭ������ ����ϸ� �����ϰ� ���� �߻� �޼��常 ������ �� �ִ�.
		 */
		
		table.getTableHeader().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				super.mouseDragged(e);
				System.out.println("���̺� ��� Ŭ����");
			}
		});
		
		scrollPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("��ũ�� ���� ���ο��� �巡����...");
			}
		});
		
		table.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				System.out.println("���̺��� ���콺 ���� ������");
			}
		});
		
		/*
		  	�� ������Ʈ�鿡�� �����ϴ� �̺�Ʈ�鵵 �ִ�.
		 */
	ListSelectionModel selection = table.getSelectionModel();
	
	selection.addListSelectionListener(new ListSelectionListener() {
		@Override
		public void valueChanged(ListSelectionEvent e) {
			if(e.getValueIsAdjusting()) {	//�ѹ� Ŭ���� ����
				System.out.println("����ڰ� �ٸ� ĭ�� �����ϸ� �߻��ϴ� �̺�Ʈ");
				System.out.println(
					table.getSelectedColumn() + "�� / " +
					table.getSelectedRow() + "���� ���õǾ����ϴ�." );
			System.out.println("���õ� �� : " + 
					table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
			}
		}
	});
	
}
	public static void main(String[] args) {
		S06_JTable frame = new S06_JTable();
		frame.setDefaultOptions();
		
	}
}
