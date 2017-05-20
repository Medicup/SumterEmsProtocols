package com.red6tech.android.scfems2.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Project: SCFEMS2
 * Created by stitched on 5/16/2017.
 */

public class DataProvider extends ContentProvider {
    public static final String TAG = DataProvider.class.getSimpleName();

    /*
     * Creates a UriMatcher object for the ContentProvider. Variable
     * declared with  lower s to indicate it is a static variable
     */
    private static final UriMatcher sUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

    static {
        /*
         * calls for UriMatcher are declared here as static URI's for reference.
         * Each table is set with a three digit integer code and the specific action
         * to perform on the table has its own unique integer.  For example: the
         * incidents table is assigned 100 to query all and 101 to query a specific
         * row. _ID pattern is for a single row.
         */
        sUriMatcher.addURI(DataContract.CONTENT_AUTHORITY, DataContract.PATH_MEDICATIONS,
                DataContract.URI_MEDICATIONS);

        sUriMatcher.addURI(DataContract.CONTENT_AUTHORITY, DataContract.PATH_MEDICATIONS + "/#",
                DataContract.URI_MEDICATIONS_ID);

    }

    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] strings, String s, String[] strings1, String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(Uri uri, String s, String[] strings) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
        return 0;
    }
}
