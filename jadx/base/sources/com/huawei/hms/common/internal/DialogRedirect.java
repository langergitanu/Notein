package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes6.dex */
public abstract class DialogRedirect implements DialogInterface.OnClickListener {
    public static DialogRedirect getInstance(Activity activity, Intent intent, int i) {
        return new DialogRedirectImpl(intent, activity, i);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                redirect();
            } catch (Throwable unused) {
                HMSLog.m80172e("DialogRedirect", "Failed to start resolution intent");
            }
        } finally {
            dialogInterface.dismiss();
        }
    }

    public abstract void redirect();
}
