package com.design.pattern.interfaces.adapter.object.eg;

import javax.swing.table.AbstractTableModel;

public class RocketTableModel extends AbstractTableModel {
	
	protected Rocket[] rockets;

	protected String[] columnNames = new String[] { "Name", "Price", "Apogee" };

	/**
	 * Construct a rocket table from an array of rockets.
	 * 
	 * @param rockets
	 *            an array of rockets
	 */
	public RocketTableModel(Rocket[] rockets) {
		this.rockets = rockets;
	}

	/**
	 * @return the number of columns in this table.
	 */
	public int getColumnCount() {
		return columnNames.length;
	}

	/**
	 * @param index
	 *            which column is interesting
	 * @return the name of the indicated column
	 */
	public String getColumnName(int i) {
		return columnNames[i];
	}

	/**
	 * @return the number of rows in this table.
	 */
	public int getRowCount() {
		return rockets.length;
	}

	/**
	 * @param row
	 *            which row is interesting
	 * @param col
	 *            which column is interesting
	 * @return the value at the indicated row and column.
	 */
	public Object getValueAt(int row, int col) {
		switch (col) {
		case 0:
			return rockets[row].getName();
		case 1:
			return rockets[row].getPrice();
		case 2:
			return new Double(rockets[row].getApogee());
		default:
			return null;
		}
	}

}
