package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.DialogInterfaceC21484OooO0oO;
import com.microsoft.identity.common.C18549R;

/* JADX INFO: loaded from: classes9.dex */
public class SmartcardPromptDialog extends SmartcardDialog {
    private final ICancelCbaCallback mCancelCbaCallback;

    public SmartcardPromptDialog(ICancelCbaCallback iCancelCbaCallback, Activity activity) {
        super(activity);
        if (iCancelCbaCallback == null) {
            throw new NullPointerException("cancelCbaCallback is marked non-null but is null");
        }
        if (activity == null) {
            throw new NullPointerException("activity is marked non-null but is null");
        }
        this.mCancelCbaCallback = iCancelCbaCallback;
        createDialog();
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardDialog
    public void createDialog() {
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardPromptDialog.1
            @Override // java.lang.Runnable
            public void run() {
                DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oOCreate = new DialogInterfaceC21484OooO0oO.OooO00o(SmartcardPromptDialog.this.mActivity, C18549R.style.UserChoiceAlertDialogTheme).setTitle(C18549R.string.smartcard_prompt_dialog_title).setMessage(C18549R.string.smartcard_prompt_dialog_message).setNegativeButton(C18549R.string.smartcard_prompt_dialog_negative_button, new DialogInterface.OnClickListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardPromptDialog.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        SmartcardPromptDialog.this.mCancelCbaCallback.onCancel();
                    }
                }).create();
                dialogInterfaceC21484OooO0oOCreate.setCanceledOnTouchOutside(false);
                dialogInterfaceC21484OooO0oOCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardPromptDialog.1.2
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        SmartcardPromptDialog.this.mCancelCbaCallback.onCancel();
                    }
                });
                SmartcardPromptDialog.this.mDialog = dialogInterfaceC21484OooO0oOCreate;
            }
        });
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardDialog
    public void onUnexpectedUnplug() {
        this.mCancelCbaCallback.onCancel();
    }
}
