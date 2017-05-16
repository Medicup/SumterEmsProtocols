package com.red6tech.android.scfems2.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Project: SCFEMS2
 * Created by stitched on 5/16/2017.
 */

public class DataContract {
    public static final String TAG = DataContract.class.getSimpleName();

    /*
    * Database definitions
    */
    public static final String DB_NAME = "scfems.db";
    public static final int DB_VERSION = 1;

    /*
    todo add remainder of tables to DataContract.java
     */
    /*
     * Data url to parse
     */
    public static final String INCIDENT_TYPE_URL = "http://192.168.51.240/read_medications.php";

    /*
    * Unique integers assigned for each UriMatch
    */
    public static final int URI_MEDICATIONS = 100;
    public static final int URI_MEDICATIONS_ID = 101;
    public static final int URI_CONTACTS = 102;
    public static final int URI_CONTACTS_ID = 103;


    /*
     * CONTENT_AUTHORITY represents the entire name for the content provider
     * It is found in the AndroidManifest.xml and necessary for the app to
     * forward all content requests.  The provider section in the AndroidManifest
     * then directs the requests to the provider class identified as the
     * provider name: .data.DataProvider
     */
    public static final String CONTENT_AUTHORITY = "com.red6tech.android.scfems";

    /*
     * BASE_CONTEENT_URI is derived from parsing the URI of the
     * "content://" string with the CONTENT_AUTHORITY.
     */
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    /*
     * Each table must identify a unique PATH outside of their respective
     * class.  This will be used with the BASE_CONTENT URI to uniquely
     * identify them
     */
    public static final String PATH_MEDICATIONS = "path_medications";
    public static final String PATH_CONTACTS = "path_contacts";

    /*
     * making constructor private prevents someone from accidentally
     * instantiating the contract class
     */
    private DataContract() {
    }

    /*
         * CONTENT_URI is the unique uri for the table name. It
         * concatenates the BASE_CONTENT_URI with the unique table name.
         * Each table will have its own unique CONTENT_URI configured
         */

    // Inner class for category table
    public static final class MedicationData implements BaseColumns {
        public static final Uri CONTENT_URI =
                Uri.withAppendedPath(BASE_CONTENT_URI, PATH_MEDICATIONS);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" +
                        CONTENT_AUTHORITY + PATH_MEDICATIONS;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" +
                        CONTENT_AUTHORITY + PATH_MEDICATIONS;

        public static final String TABLE_NAME = "tbl_medications";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_NAME_SHORT = "name_short";
        public static final String COLUMN_NAME_LONG = "name_long";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_INDICATION = "indication";
        public static final String COLUMN_PRECAUTIONS = "precautions";
        public static final String COLUMN_DOSAGE = "dosage";
    }

    public static final class ContactData implements BaseColumns {
        public static final Uri CONTENT_URI =
                Uri.withAppendedPath(BASE_CONTENT_URI, PATH_CONTACTS);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" +
                        CONTENT_AUTHORITY + PATH_CONTACTS;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" +
                        CONTENT_AUTHORITY + PATH_CONTACTS;

        public static final String TABLE_NAME = "tbl_contacts";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_NAME_SHORT = "name_short";
        public static final String COLUMN_NAME_LONG = "name_long";
        public static final String COLUMN_NUMBER_MAIN = "number_main";
        public static final String COLUMN_NUMBER_ER = "number_er";
        public static final String COLUMN_NUMBER_FAX = "fax";
        public static final String COLUMN_NUMBER_OTHER = "other_number";
        public static final String COLUMN_RADIO = "radio_communication";
        public static final String COLUMN_ADDRESS_STREET = "street_address";
        public static final String COLUMN_ADDRESS_CITY = "city_address";
        public static final String COLUMN_ADDRESS_STATE = "state";
        public static final String COLUMN_ZIP = "zip";
    }

}
