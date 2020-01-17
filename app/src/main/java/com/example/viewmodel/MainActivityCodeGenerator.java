package com.example.viewmodel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityCodeGenerator extends ViewModel {

    private String TAG=this.getClass().getName();
    private String myRandomNumber;


    public String getNumber()
    {
        Log.i(TAG,"Get number");
        if(myRandomNumber==null)
        {
            createNumber();
        }
        return myRandomNumber;
    }

    private void createNumber()
    {
        Log.i(TAG,"Create new Number");
        Random random=new Random();
        myRandomNumber="Number " +(random.nextInt(10-1)+1);

    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG,"Oncleared");
    }
}
