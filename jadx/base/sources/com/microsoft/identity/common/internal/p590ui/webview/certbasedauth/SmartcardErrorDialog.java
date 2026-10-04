package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.DialogInterfaceC21484OooO0oO;
import com.microsoft.identity.common.C18549R;

/* JADX INFO: loaded from: classes9.dex */
public class SmartcardErrorDialog extends SmartcardDialog {
    private final int mDismissButtonStringResourceId;
    private final IDismissCallback mDismissCallback;
    private final int mMessageStringResourceId;
    private final int mTitleStringResourceId;

    public SmartcardErrorDialog(int i, int i2, int i3, IDismissCallback iDismissCallback, Activity activity) {
        super(activity);
        this.mTitleStringResourceId = i;
        this.mMessageStringResourceId = i2;
        this.mDismissButtonStringResourceId = i3;
        this.mDismissCallback = iDismissCallback;
        createDialog();
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardDialog
    public void createDialog() {
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardErrorDialog.1
            @Override // java.lang.Runnable
            public void run() {
                DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oOCreate = new DialogInterfaceC21484OooO0oO.OooO00o(SmartcardErrorDialog.this.mActivity, C18549R.style.ErrorAlertDialogTheme).setTitle(SmartcardErrorDialog.this.mTitleStringResourceId).setMessage(SmartcardErrorDialog.this.mMessageStringResourceId).setPositiveButton(SmartcardErrorDialog.this.mDismissButtonStringResourceId, new DialogInterface.OnClickListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardErrorDialog.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        SmartcardErrorDialog.this.mDismissCallback.onDismiss();
                    }
                }).create();
                dialogInterfaceC21484OooO0oOCreate.setCanceledOnTouchOutside(false);
                dialogInterfaceC21484OooO0oOCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardErrorDialog.1.2
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        SmartcardErrorDialog.this.mDismissCallback.onDismiss();
                    }
                });
                SmartcardErrorDialog.this.mDialog = dialogInterfaceC21484OooO0oOCreate;
            }
        });
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardDialog
    public void onUnexpectedUnplug() {
        this.mDismissCallback.onDismiss();
    }
}
