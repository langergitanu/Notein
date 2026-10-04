package com.orion.notein.richeditor.api;

import android.app.DialogFragment;
import android.content.Intent;
import android.widget.Toast;

/* JADX INFO: loaded from: classes9.dex */
public interface RTProxy {
    Toast makeText(int i, int i2);

    Toast makeText(CharSequence charSequence, int i);

    void openDialogFragment(String str, DialogFragment dialogFragment);

    void removeFragment(String str);

    void runOnUiThread(Runnable runnable);

    void startActivityForResult(Intent intent, int i);
}
