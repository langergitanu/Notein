package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.microsoft.identity.common.C18549R;

/* JADX INFO: loaded from: classes9.dex */
public class SmartcardRemovalPromptDialog extends SmartcardDialog {
    private final IDismissCallback mDismissCallback;

    public SmartcardRemovalPromptDialog(IDismissCallback iDismissCallback, Activity activity) {
        super(activity);
        this.mDismissCallback = iDismissCallback;
        createDialog();
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardDialog
    public void createDialog() {
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardRemovalPromptDialog.1
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog alertDialogCreate = new AlertDialog.Builder(SmartcardRemovalPromptDialog.this.mActivity, C18549R.style.TitleOnlyAlertDialogTheme).setTitle(C18549R.string.smartcard_removal_prompt_dialog_title).setPositiveButton(C18549R.string.smartcard_removal_prompt_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardRemovalPromptDialog.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        SmartcardRemovalPromptDialog.this.mDismissCallback.onDismiss();
                    }
                }).create();
                alertDialogCreate.setCanceledOnTouchOutside(false);
                SmartcardRemovalPromptDialog.this.mDialog = alertDialogCreate;
            }
        });
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardDialog
    public void onUnexpectedUnplug() {
        this.mDismissCallback.onDismiss();
    }
}
