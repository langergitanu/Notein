package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.appcompat.app.DialogInterfaceC21484OooO0oO;
import com.microsoft.identity.common.C18549R;

/* JADX INFO: loaded from: classes9.dex */
public class SmartcardNfcLoadingDialog extends SmartcardDialog {
    public SmartcardNfcLoadingDialog(Activity activity) {
        super(activity);
        createDialog();
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardDialog
    public void createDialog() {
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardNfcLoadingDialog.1
            @Override // java.lang.Runnable
            public void run() {
                DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oOCreate = new DialogInterfaceC21484OooO0oO.OooO00o(SmartcardNfcLoadingDialog.this.mActivity, C18549R.style.UserChoiceAlertDialogTheme).setTitle(C18549R.string.smartcard_nfc_loading_dialog_title).setMessage(C18549R.string.smartcard_nfc_loading_dialog_message).setView(SmartcardNfcLoadingDialog.this.mActivity.getLayoutInflater().inflate(C18549R.layout.nfc_loading_layout, (ViewGroup) null)).create();
                dialogInterfaceC21484OooO0oOCreate.setCanceledOnTouchOutside(false);
                SmartcardNfcLoadingDialog.this.mDialog = dialogInterfaceC21484OooO0oOCreate;
            }
        });
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardDialog
    public void onUnexpectedUnplug() {
    }
}
