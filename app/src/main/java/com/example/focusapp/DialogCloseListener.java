package com.example.focusapp;

import android.content.DialogInterface;

//bir alt sayfanın kapatıldığında ana aktiviteye bildirim göndermek için bir arayüz
public interface DialogCloseListener {
    public void handleDialogClose(DialogInterface dialog);
}
