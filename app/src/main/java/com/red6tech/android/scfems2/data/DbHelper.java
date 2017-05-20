package com.red6tech.android.scfems2.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Project: SCFEMS2
 * Created by stitched on 5/16/2017.
 */

public class DbHelper extends SQLiteOpenHelper {
    public static final String TAG = DbHelper.class.getSimpleName();

    /*
     * Define elements to create database
     */
    private static final String INTEGER = " INTEGER";
    private static final String TEXT = " TEXT";
    private static final String DOUBLE = " DOUBLE";
    private static final String ID_INTEGER = " INTEGER PRIMARY KEY AUTOINCREMENT";
    private static final String COMMA = ", ";
    private static final String NULL = " NULL";
    private static final String NOT_NULL = " NOT NULL";
    private static final String DEFAULT = " DEFAULT ";

    /* Foreign key syntax calls for Foreign Key to declare itself and the
     * table and field it references. Example using the resource table is:
     * FOREIGN KEY(requestsEntry.COLUMN_INCIDENT_NUMBER) REFERENCES
     * incidentEntry.TABLE_NAME(incidentEntry.COLUMN_INCIDENT_NUMBER)
     */
    private static final String FOREIGN_KEY = " FOREIGN KEY ";
    private static final String REFERENCES = " REFERENCES ";

    public DbHelper(Context context) {
        super(context, DataContract.DB_NAME, null, DataContract.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_MEDICATIONS_TABLE = "CREATE TABLE IF NOT EXISTS " +
                DataContract.MedicationData.TABLE_NAME + " (" +
                DataContract.MedicationData._ID + ID_INTEGER + COMMA +
                DataContract.MedicationData.COLUMN_DESCRIPTION + COMMA +
                DataContract.MedicationData.COLUMN_DOSAGE + COMMA +
                DataContract.MedicationData.COLUMN_INDICATION + COMMA +
                DataContract.MedicationData.COLUMN_NAME_LONG + COMMA +
                DataContract.MedicationData.COLUMN_NAME_SHORT + COMMA +
                DataContract.MedicationData.COLUMN_PRECAUTIONS + " );";

        String SQL_CREATE_CONTACTS_TABLE = "CREATE TABLE IF NOT EXISTS " +
                DataContract.ContactData.TABLE_NAME + " (" +
                DataContract.ContactData._ID + ID_INTEGER + COMMA +
                DataContract.ContactData.COLUMN_NAME_LONG + COMMA +
                DataContract.ContactData.COLUMN_NAME_SHORT + COMMA +
                DataContract.ContactData.COLUMN_NUMBER_MAIN + COMMA +
                DataContract.ContactData.COLUMN_NUMBER_ER + COMMA +
                DataContract.ContactData.COLUMN_NUMBER_FAX + COMMA +
                DataContract.ContactData.COLUMN_NUMBER_OTHER + COMMA +
                DataContract.ContactData.COLUMN_RADIO + COMMA +
                DataContract.ContactData.COLUMN_ADDRESS_STREET + COMMA +
                DataContract.ContactData.COLUMN_ADDRESS_CITY + COMMA +
                DataContract.ContactData.COLUMN_ADDRESS_STATE + COMMA +
                DataContract.ContactData.COLUMN_ZIP + " );";

        db.execSQL(SQL_CREATE_MEDICATIONS_TABLE);
        db.execSQL(SQL_CREATE_CONTACTS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
