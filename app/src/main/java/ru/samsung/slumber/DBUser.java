package ru.samsung.slumber;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DBUser {

    private static final String DATABASE_NAME = "user.db";

    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "Data";

    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_NAME = "Name";
    private static final String COLUMN_EMAIL = "Email";
    private static final String COLUMN_PASSWORD = "Password";
    private static final String COLUMN_USER_ID = "UserId";
    private static final String COLUMN_GOAL = "Goal";
    private static final String COLUMN_AGE = "Age";
    private static final String COLUMN_WAKE = "Wake";
    private static final String COLUMN_FALL_ASLEEP = "FallAsleep";
    private static final String COLUMN_SLEEP_HOURS = "SleepHours";
    private static final String COLUMN_REGIME = "Regime";



    private static final int NUM_COLUMN_ID = 0;
    private static final int NUM_COLUMN_NAME = 1;
    private static final int NUM_COLUMN_EMAIL = 2;
    private static final int NUM_COLUMN_PASSWORD = 3;
    private static final int NUM_COLUMN_USER_ID = 4;
    private static final int NUM_COLUMN_GOAL = 5;
    private static final int NUM_COLUMN_AGE = 6;
    private static final int NUM_COLUMN_WAKE = 7;
    private static final int NUM_COLUMN_FALL_ASLEEP = 8;
    private static final int NUM_COLUMN_SLEEP_HOURS = 9;
    private static final int NUM_COLUMN_REGIME = 10;



    private SQLiteDatabase mDataBase;
    private OpenHelper mOpenHelper;

    public DBUser(Context context) {
        mOpenHelper = new OpenHelper(context);
        try {
            mDataBase = mOpenHelper.getWritableDatabase();
        } catch (SQLiteException ex) {
            mDataBase = mOpenHelper.getReadableDatabase();
        }
    }

    public void delete(long id) {
        mDataBase.delete(TABLE_NAME, COLUMN_ID + " = ?", new String[] { String.valueOf(id) });
    }


    public long insert(String name, String email, String password, String user_id, Integer goal, Integer age, String wake_up_time, String go_to_sleep_time, Integer sleep_hours, Boolean regime) {
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_NAME, name);
        cv.put(COLUMN_EMAIL, email);
        cv.put(COLUMN_PASSWORD, password);
        cv.put(COLUMN_USER_ID, user_id);
        cv.put(COLUMN_GOAL, goal);
        cv.put(COLUMN_AGE, age);
        cv.put(COLUMN_WAKE, wake_up_time);
        cv.put(COLUMN_FALL_ASLEEP, go_to_sleep_time);
        cv.put(COLUMN_SLEEP_HOURS, sleep_hours);
        cv.put(COLUMN_REGIME, regime);


        return mDataBase.insert(TABLE_NAME, null, cv);
    }

    public UserData select(long id) {
        Cursor mCursor = mDataBase.query(TABLE_NAME, null, COLUMN_ID + " = ?", new String[]{String.valueOf(id)}, null, null, null);
        if(mCursor.moveToFirst()) {
            mCursor.moveToFirst();
            String name = mCursor.getString(NUM_COLUMN_NAME);
            String email = mCursor.getString(NUM_COLUMN_EMAIL);
            String password = mCursor.getString(NUM_COLUMN_PASSWORD);
            String user_id = mCursor.getString(NUM_COLUMN_USER_ID);
            Integer goal = mCursor.getInt(NUM_COLUMN_GOAL);
            Integer age = mCursor.getInt(NUM_COLUMN_AGE);
            String wake_up_time = mCursor.getString(NUM_COLUMN_WAKE);
            String go_to_sleep_time = mCursor.getString(NUM_COLUMN_FALL_ASLEEP);
            Integer sleep_hours = mCursor.getInt(NUM_COLUMN_SLEEP_HOURS);
            Boolean regime = Boolean.valueOf(String.valueOf(mCursor.getInt(NUM_COLUMN_REGIME))) ;

            return new UserData(name,email,password,user_id,goal,age,wake_up_time,go_to_sleep_time,sleep_hours,regime);
        }else{
            return null;
        }
    }

    private class OpenHelper extends SQLiteOpenHelper {
        // Данные базы данных и таблиц


        OpenHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String query = "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_NAME + " TEXT, " + COLUMN_EMAIL +  " TEXT, " + COLUMN_PASSWORD + " TEXT, " + COLUMN_USER_ID +
                    " TEXT, " + COLUMN_GOAL + " INTEGER, " + COLUMN_AGE + " INTEGER, " + COLUMN_WAKE + " TEXT, " +
                    COLUMN_FALL_ASLEEP + " TEXT, " + COLUMN_SLEEP_HOURS + " INTEGER, " + COLUMN_REGIME + " INTEGER);" ;
            db.execSQL(query);
        }

        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(db);
        }
    }
}

