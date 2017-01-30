package org.reldb.relweb;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Text;

public class MainDisplay extends Composite {
	private static final long serialVersionUID = 1L;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public MainDisplay(Composite parent) {
		super(parent, SWT.NONE);
		setLayout(null);
		
		SashForm sashForm = new SashForm(this, SWT.VERTICAL);
		sashForm.setBounds(0, 0, 450, 300);
				
		new Text(sashForm, SWT.BORDER | SWT.V_SCROLL);		
		new Text(sashForm, SWT.BORDER | SWT.V_SCROLL);
		sashForm.setWeights(new int[] {1, 1});
	}

	@Override
	protected void checkSubclass() {}
}
