/*******************************************************************************
 * Copyright (c) 2009, 2012 Wind River Systems, Inc. and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Markus Schorn - initial API and implementation
 *******************************************************************************/
package org.eclipse.cdt.internal.core.parser.scanner;

import org.eclipse.cdt.core.parser.IInactiveCodeToken;

/**
 * Special token to separate active from inactive code
 */
public class InactiveCodeToken extends Token implements IInactiveCodeToken {
	private int fOldNesting;
	private int fNewNesting;

	InactiveCodeToken(int kind, int oldNesting, int newNesting, int offset) {
		super(kind, null, offset, offset);
		fOldNesting = oldNesting;
		fNewNesting = newNesting;
	}

	@Override
	public int getOldNesting() {
		return fOldNesting;
	}

	@Override
	public int getNewNesting() {
		return fNewNesting;
	}
}
