package org.reldb.relweb;

import org.eclipse.rap.rwt.application.AbstractEntryPoint;
import org.eclipse.swt.widgets.Composite;

public class BasicEntryPoint extends AbstractEntryPoint {
	private static final long serialVersionUID = 1L;

	@Override
    protected void createContents(Composite parent) {
		new MainDisplay(parent);
    }

}
