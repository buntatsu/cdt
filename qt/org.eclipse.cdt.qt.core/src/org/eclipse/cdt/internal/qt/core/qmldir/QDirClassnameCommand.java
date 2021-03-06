/*******************************************************************************
 * Copyright (c) 2015 QNX Software Systems and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * QNX Software Systems - Initial API and implementation
 *******************************************************************************/
package org.eclipse.cdt.internal.qt.core.qmldir;

import org.eclipse.cdt.qt.core.qmldir.IQDirClassnameCommand;

public class QDirClassnameCommand extends QDirASTNode implements IQDirClassnameCommand {

	private QDirWord ident;

	public void setIdentifier(QDirWord value) {
		this.ident = value;
	}

	@Override
	public QDirWord getIdentifier() {
		return ident;
	}

}
