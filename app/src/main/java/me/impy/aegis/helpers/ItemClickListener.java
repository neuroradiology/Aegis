package me.impy.aegis.helpers;

import android.view.View;

public interface ItemClickListener
{
    void onItemClick(int position, View v);
    void onLongItemClick(int position, View v);
}