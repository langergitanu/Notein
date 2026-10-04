package com.huawei.hms.p588ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractDialog {

    /* JADX INFO: renamed from: a */
    public Activity f56973a;

    /* JADX INFO: renamed from: b */
    public AlertDialog f56974b;

    /* JADX INFO: renamed from: c */
    public Callback f56975c;

    public interface Callback {
        void onCancel(AbstractDialog abstractDialog);

        void onDoWork(AbstractDialog abstractDialog);
    }

    /* JADX INFO: renamed from: com.huawei.hms.ui.AbstractDialog$a */
    public class DialogInterfaceOnClickListenerC18489a implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC18489a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractDialog.this.fireDoWork();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.ui.AbstractDialog$b */
    public class DialogInterfaceOnClickListenerC18490b implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC18490b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractDialog.this.cancel();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.ui.AbstractDialog$c */
    public class DialogInterfaceOnCancelListenerC18491c implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC18491c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            AbstractDialog.this.fireCancel();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.ui.AbstractDialog$d */
    public class DialogInterfaceOnKeyListenerC18492d implements DialogInterface.OnKeyListener {
        public DialogInterfaceOnKeyListenerC18492d() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (4 != i || keyEvent.getAction() != 1) {
                return false;
            }
            AbstractDialog.this.cancel();
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m80177a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }

    public void cancel() {
        AlertDialog alertDialog = this.f56974b;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }

    public void dismiss() {
        AlertDialog alertDialog = this.f56974b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void fireCancel() {
        Callback callback = this.f56975c;
        if (callback != null) {
            callback.onCancel(this);
        }
    }

    public void fireDoWork() {
        Callback callback = this.f56975c;
        if (callback != null) {
            callback.onDoWork(this);
        }
    }

    public Activity getActivity() {
        return this.f56973a;
    }

    public int getDialogThemeId() {
        return m80177a(this.f56973a) != 0 ? 0 : 3;
    }

    public AlertDialog onCreateDialog(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), getDialogThemeId());
        String strOnGetTitleString = onGetTitleString(activity);
        if (strOnGetTitleString != null) {
            builder.setTitle(strOnGetTitleString);
        }
        String strOnGetMessageString = onGetMessageString(activity);
        if (strOnGetMessageString != null) {
            builder.setMessage(strOnGetMessageString);
        }
        String strOnGetPositiveButtonString = onGetPositiveButtonString(activity);
        if (strOnGetPositiveButtonString != null) {
            builder.setPositiveButton(strOnGetPositiveButtonString, new DialogInterfaceOnClickListenerC18489a());
        }
        String strOnGetNegativeButtonString = onGetNegativeButtonString(activity);
        if (strOnGetNegativeButtonString != null) {
            builder.setNegativeButton(strOnGetNegativeButtonString, new DialogInterfaceOnClickListenerC18490b());
        }
        return builder.create();
    }

    public abstract String onGetMessageString(Context context);

    public abstract String onGetNegativeButtonString(Context context);

    public abstract String onGetPositiveButtonString(Context context);

    public abstract String onGetTitleString(Context context);

    public void setMessage(CharSequence charSequence) {
        AlertDialog alertDialog = this.f56974b;
        if (alertDialog != null) {
            alertDialog.setMessage(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        AlertDialog alertDialog = this.f56974b;
        if (alertDialog != null) {
            alertDialog.setTitle(charSequence);
        }
    }

    public void show(Activity activity, Callback callback) {
        this.f56973a = activity;
        this.f56975c = callback;
        if (activity == null || activity.isFinishing()) {
            HMSLog.m80172e("AbstractDialog", "In show, The activity is null or finishing.");
            return;
        }
        AlertDialog alertDialogOnCreateDialog = onCreateDialog(this.f56973a);
        this.f56974b = alertDialogOnCreateDialog;
        alertDialogOnCreateDialog.setCanceledOnTouchOutside(false);
        this.f56974b.setOnCancelListener(new DialogInterfaceOnCancelListenerC18491c());
        this.f56974b.setOnKeyListener(new DialogInterfaceOnKeyListenerC18492d());
        this.f56974b.show();
    }
}
