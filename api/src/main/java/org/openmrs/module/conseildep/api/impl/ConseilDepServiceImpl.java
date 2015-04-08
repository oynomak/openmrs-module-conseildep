/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.conseildep.api.impl;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.conseildep.GeneratedId;
import org.openmrs.module.conseildep.api.ConseilDepService;
import org.openmrs.module.conseildep.api.db.ConseilDepDAO;

/**
 * It is a default implementation of {@link ConseilDepService}.
 */
public class ConseilDepServiceImpl implements ConseilDepService {

	protected final Log log = LogFactory.getLog(this.getClass());

	private ConseilDepDAO dao;

	/**
	 * @param dao
	 *            the dao to set
	 */
	public void setDao(ConseilDepDAO dao) {
		this.dao = dao;
	}

	/**
	 * @return the dao
	 */
	public ConseilDepDAO getDao() {
		return dao;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.openmrs.module.ConseilDepService.api.GeneratedIdService#saveGeneratedId(org.openmrs.module.generateurid.GeneratedId)
	 */
	@Override
	public void saveGeneratedId(GeneratedId generatedId) {

		getDao().saveGeneratedId(generatedId);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.openmrs.module.ConseilDepService.api.GeneratedIdService#deleteGeneratedId(org.openmrs.module.generateurid.GeneratedId)
	 */
	@Override
	public void deleteGeneratedId(GeneratedId generatedId, String reason) {

		getDao().retireGeneratedId(generatedId, reason);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.openmrs.module.ConseilDepService.api.GeneratedIdService#getGeneratedIdById(java.lang.Integer)
	 */
	@Override
	public GeneratedId getGeneratedIdById(Integer generatedidId) {

		return getDao().getGeneratedIdById(generatedidId);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.openmrs.module.ConseilDepService.api.GeneratedIdService#getGeneratedIdByIdentifier(java.lang.String)
	 */
	@Override
	public GeneratedId getGeneratedIdByIdentifier(String patientIdentifiant) {

		return getDao().getGeneratedIdByIdentifier(patientIdentifiant);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.openmrs.module.ConseilDepService.api.GeneratedIdService#getAllGeneratedIds()
	 */
	@Override
	public Collection<GeneratedId> getAllGeneratedIds() {

		return getDao().getAllGeneratedIds();
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.openmrs.module.ConseilDepService.api.GeneratedIdService#updateGeneratedId(org.openmrs.module.generateurid.GeneratedId)
	 */
	@Override
	public void updateGeneratedId(GeneratedId generatedId) {

		getDao().updateGeneratedId(generatedId);
	}
}