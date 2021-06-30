package com.example.android.pets.data;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.pets.data.PetContract.pets;

public class PetDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="sheter.db";
    public PetDbHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // Create a String that contains the SQL statement to create the pets table
        String SQL_CREATE_PETS_TABLE =  "CREATE TABLE " + pets.TABLE_NAME + " ("
                + pets.COLUNM_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + pets.COLUNM_NAME + " TEXT NOT NULL, "
                + pets.COLUNM_BREED + " TEXT, "
                + pets.COLUNM_GENDER + " INTEGER NOT NULL, "
                + pets.COLUNM_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";
        sqLiteDatabase.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
