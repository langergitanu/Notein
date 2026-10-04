package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.app.Activity;
import android.app.Dialog;

/* JADX INFO: loaded from: classes9.dex */
public abstract class SmartcardDialog {
    protected final Activity mActivity;
    protected Dialog mDialog = null;

    public SmartcardDialog(Activity activity) {
        this.mActivity = activity;
    }

    public abstract void createDialog();

    public void dismiss() {
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardDialog.2
            @Override // java.lang.Runnable
            public void run() {
                SmartcardDialog.this.mDialog.dismiss();
            }
        });
    }

    public abstract void onUnexpectedUnplug();

    public void show() {
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardDialog.1
            @Override // java.lang.Runnable
            public void run() {
                SmartcardDialog.this.mDialog.show();
            }
        });
    }
}
