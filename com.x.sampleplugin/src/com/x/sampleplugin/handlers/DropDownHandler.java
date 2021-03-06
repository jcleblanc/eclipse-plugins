package com.x.sampleplugin.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class DropDownHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public DropDownHandler() {}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		//event.getParameter("com.x.sampleplugin.dropdown.msg").equals("start")
		//event.getParameter("com.x.sampleplugin.dropdown.msg")
		
		MessageDialog.openInformation(
				window.getShell(),
				event.getParameter("com.x.sampleplugin.dropdown.msg"),
				"Hello, Eclipse world");
		return null;
	}
}
