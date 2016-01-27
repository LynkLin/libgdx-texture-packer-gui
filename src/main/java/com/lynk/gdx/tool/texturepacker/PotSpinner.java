package com.lynk.gdx.tool.texturepacker;

import javax.swing.JSpinner;
import javax.swing.SpinnerModel;

public class PotSpinner extends JSpinner {
	private static final long serialVersionUID = 1L;
	
	private Object valueBefore;

	public PotSpinner () {
		super();
	}

	public PotSpinner (SpinnerModel model) {
		super(model);
	}

	public Object getValueBefore () {
		return valueBefore;
	}

	@Override
	public void setValue (Object value) {
		valueBefore = getValue();
//		System.out.println(valueBefore + " -> " + value);
		super.setValue(value);
	}
}
