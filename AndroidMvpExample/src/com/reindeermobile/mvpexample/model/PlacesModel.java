
package com.reindeermobile.mvpexample.model;

import com.reindeermobile.mvpexample.mvp.IModel;

import android.content.Context;
import android.os.Message;

public class PlacesModel implements IModel {

    @Override
    public boolean handleMessage(final Message msg) {
        return false;
    }

    @Override
    public void init(final Context context) {
    }

}
