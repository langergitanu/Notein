package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.DialogInterfaceC21484OooO0oO;
import com.microsoft.identity.common.C18549R;

/* JADX INFO: loaded from: classes9.dex */
public class SmartcardNfcReminderDialog extends SmartcardDialog {
    private final IDismissCallback mDismissCallback;

    public SmartcardNfcReminderDialog(IDismissCallback iDismissCallback, Activity activity) {
        super(activity);
        this.mDismissCallback = iDismissCallback;
        createDialog();
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardDialog
    public void createDialog() {
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardNfcReminderDialog.1
            @Override // java.lang.Runnable
            public void run() {
                DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oOCreate = new DialogInterfaceC21484OooO0oO.OooO00o(SmartcardNfcReminderDialog.this.mActivity, C18549R.style.UserChoiceAlertDialogTheme).setTitle(C18549R.string.smartcard_nfc_reminder_dialog_title).setMessage(C18549R.string.smartcard_nfc_reminder_dialog_message).setPositiveButton(C18549R.string.smartcard_nfc_reminder_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardNfcReminderDialog.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        SmartcardNfcReminderDialog.this.mDismissCallback.onDismiss();
                    }
                }).create();
                dialogInterfaceC21484OooO0oOCreate.setCanceledOnTouchOutside(false);
                dialogInterfaceC21484OooO0oOCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardNfcReminderDialog.1.2
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        SmartcardNfcReminderDialog.this.mDismissCallback.onDismiss();
                    }
                });
                SmartcardNfcReminderDialog.this.mDialog = dialogInterfaceC21484OooO0oOCreate;
            }
        });
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardDialog
    public void onUnexpectedUnplug() {
    }
}
