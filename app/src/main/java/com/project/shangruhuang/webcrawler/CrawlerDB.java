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

    interface COLUMN_NAME {

    }

    public CrawlerDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
