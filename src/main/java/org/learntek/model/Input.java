/**
 * 
 */
package org.learntek.model;

import java.io.Serializable;

/**
 * @author HP
 *
 */
public class Input implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int no1;
	private int no2;
	
	/**
	 * @return the no1
	 */
	public int getNo1() {
		return no1;
	}
	/**
	 * @param no1 the no1 to set
	 */
	public void setNo1(int no1) {
		this.no1 = no1;
	}
	/**
	 * @return the no2
	 */
	public int getNo2() {
		return no2;
	}
	/**
	 * @param no2 the no2 to set
	 */
	public void setNo2(int no2) {
		this.no2 = no2;
	}
}
