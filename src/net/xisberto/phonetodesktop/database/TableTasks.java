/*******************************************************************************
 * Copyright (c) 2013 Humberto Fraga <xisberto@gmail.com>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Humberto Fraga <xisberto@gmail.com> - initial API and implementation
 ******************************************************************************/
package net.xisberto.phonetodesktop.database;

public class TableTasks {
	public static final String
			TABLE_NAME = "Tasks",
			COLUMN_GOOGLE_ID = "google_id",
			COLUMN_TITLE = "title",
			COLUMN_DESCRIPTION = "description",
			COLUMN_STATUS = "status",
			CREATE_SQL = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " ( " +
					COLUMN_GOOGLE_ID + " TEXT, " +
					COLUMN_TITLE + " TEXT, " +
					COLUMN_DESCRIPTION + " TEXT, " +
					COLUMN_STATUS + " TEXT )";
	public static final String[]
			COLUMNS = {"ROWID", COLUMN_GOOGLE_ID, COLUMN_TITLE, COLUMN_DESCRIPTION, COLUMN_STATUS};
	
}
