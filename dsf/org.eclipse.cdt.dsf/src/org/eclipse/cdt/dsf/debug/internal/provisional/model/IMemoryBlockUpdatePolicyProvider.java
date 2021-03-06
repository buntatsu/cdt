/*******************************************************************************
 * Copyright (c) 2008, 2009 Wind River Systems and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Wind River Systems - Ted Williams - initial API and implementation
 *******************************************************************************/

package org.eclipse.cdt.dsf.debug.internal.provisional.model;

/**
 * This interface is EXPERIMENTAL.
 *
 * @since 1.1
 */
public interface IMemoryBlockUpdatePolicyProvider {
	public String[] getUpdatePolicies();

	public String getUpdatePolicyDescription(String id);

	public String getUpdatePolicy();

	public void setUpdatePolicy(String id);

	public void clearCache();
}
