package com.hfad.wellbeingtechheartapp;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAODBHeartRate {

    private final DatabaseReference databaseReference;

    public DAODBHeartRate(){

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference(DBHeartRate.class.getSimpleName());


    }

    public Task<Void> insert(DBHeartRate record){

        return databaseReference.push().setValue(record);
    }


}
