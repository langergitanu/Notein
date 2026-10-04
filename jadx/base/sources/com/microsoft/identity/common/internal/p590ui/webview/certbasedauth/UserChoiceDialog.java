package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.DialogInterfaceC21484OooO0oO;
import com.microsoft.identity.common.C18549R;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class UserChoiceDialog extends SmartcardDialog {
    private final ICancelCbaCallback mCancelCbaCallback;
    private final PositiveButtonListener mPositiveButtonListener;

    public interface PositiveButtonListener {
        void onClick(int i);
    }

    public UserChoiceDialog(PositiveButtonListener positiveButtonListener, ICancelCbaCallback iCancelCbaCallback, Activity activity) {
        super(activity);
        this.mPositiveButtonListener = positiveButtonListener;
        this.mCancelCbaCallback = iCancelCbaCallback;
        createDialog();
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardDialog
    public void createDialog() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mActivity.getResources().getString(C18549R.string.user_choice_dialog_on_device_name));
        arrayList.add(this.mActivity.getResources().getString(C18549R.string.user_choice_dialog_smartcard_name));
        DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oOCreate = new DialogInterfaceC21484OooO0oO.OooO00o(this.mActivity, C18549R.style.UserChoiceAlertDialogTheme).setTitle(C18549R.string.user_choice_dialog_title).setSingleChoiceItems((String[]) Arrays.copyOf(arrayList.toArray(), arrayList.size(), String[].class), 0, (DialogInterface.OnClickListener) null).setPositiveButton(C18549R.string.user_choice_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.UserChoiceDialog.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                UserChoiceDialog.this.mPositiveButtonListener.onClick(((DialogInterfaceC21484OooO0oO) dialogInterface).f62437OooOo0o.f62252OooO0oO.getCheckedItemPosition());
            }
        }).setNegativeButton(C18549R.string.user_choice_dialog_negative_button, new DialogInterface.OnClickListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.UserChoiceDialog.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                UserChoiceDialog.this.mCancelCbaCallback.onCancel();
            }
        }).create();
        dialogInterfaceC21484OooO0oOCreate.setCanceledOnTouchOutside(false);
        dialogInterfaceC21484OooO0oOCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.UserChoiceDialog.3
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                UserChoiceDialog.this.mCancelCbaCallback.onCancel();
            }
        });
        this.mDialog = dialogInterfaceC21484OooO0oOCreate;
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardDialog
    public void onUnexpectedUnplug() {
    }
}
