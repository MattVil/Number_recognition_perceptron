package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class TableGUI extends JPanel{
	
	private final static int SIZE = 10;
	
	private int[][] table;
	private int[] inputTable;
	
	private CellGUI[][] tableGUI;
	
	
	public TableGUI(){
		
		setPreferredSize(new Dimension(800, 800));
		
		table = new int[SIZE][SIZE];
		inputTable = new int[SIZE*SIZE];
		tableGUI = new CellGUI[SIZE][SIZE];
		this.setLayout(new GridLayout(SIZE, SIZE));
		
		initTable();
	}
	
	public void initTable(){
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				CellGUI cell = new CellGUI(i, j);
				
                MouseListener ml = new MouseListener() {
                    public void mouseClicked(MouseEvent e) {
                        
                        int buttonDown = e.getButton();
                        
                        if (buttonDown == MouseEvent.BUTTON1) {
                        	click(e, cell);
                        }
                        else if(buttonDown == MouseEvent.BUTTON3){
                        	for (int k = 0; k < SIZE; k++) {
								for (int l = 0; l < SIZE; l++) {
									table[k][l] = 0;
								}
							}
                        	refreshMap();
                        }
                    }
					public void mousePressed(MouseEvent e) {

					}
					public void mouseReleased(MouseEvent e) {
	
					}
					public void mouseEntered(MouseEvent e) {
	
					}
					public void mouseExited(MouseEvent e) {

					}
                };
                cell.addMouseListener(ml);
                tableGUI[i][j] = cell;
                add(tableGUI[i][j]);
			}
		}
	}
	
	public int[] getInputTable(){
		
		int k=0;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				inputTable[k] = table[i][j];
				k++;
			}
		}
		
		return inputTable;
	}
	
	public void refreshMap(){
		for(int i=0; i<SIZE; i++){
			for(int j=0; j<SIZE; j++){
				if(table[i][j] == 0){
					tableGUI[i][j].setBackground(Color.WHITE);
				}
				else if(table[i][j] == 1){
					tableGUI[i][j].setBackground(Color.BLACK);
				}
			}
		}
	}
	
	public int getTable(int i, int j){
		return table[i][j];
	}
	
	public void click(MouseEvent e, CellGUI cell) {
//	   	System.out.println(cell.getX()+";"+cell.getY());
//	   	System.out.println("\t" + (cell.getX())/267 +";"+(cell.getY())/160);
	    int x = (cell.getX()*SIZE/800);
		int y = (cell.getY())*SIZE/800;
//		System.out.println(x + " - " + y);
		if(table[y][x] == 0)
			table[y][x] = 1;
		else
			table[y][x] = 0;
		
		refreshMap();
	}

	public int[][] getTable() {
		return table;
	}

	public void setTable(int[][] table) {
		this.table = table;
	}
}
