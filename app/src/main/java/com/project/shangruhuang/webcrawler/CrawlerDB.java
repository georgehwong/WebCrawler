package com.project.shangruhuang.webcrawler;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Helper class to manage crawler database creation and version management
 * @author Shangru
 *
 */
public class CrawlerDB extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "crawler.db";
    public static final String TABLE_NAME = "CrawledURLs";
    private static final String TEXT_TYPE = "TEXT";

    public interface COLUMNS_NAME {
        String _ID = "id";
        String CRAWLED_URL = "crawled_url";
        String CRAWLED_PAGE_CONTENT = "crawled_page_content";
    }

    public static final String SQL_CREATE_ENTRIES = "CREATE TABLE " + TABLE_NAME + " (" +
            COLUMNS_NAME._ID + " INTEGER PRIMARY KEY" + COLUMNS_NAME.CRAWLED_URL + TEXT_TYPE +
            ", " + COLUMNS_NAME.CRAWLED_PAGE_CONTENT + TEXT_TYPE + " )";

    public static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public CrawlerDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}
