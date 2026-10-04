package com.pairip.licensecheck;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class LicenseActivity extends Activity {
    public static final String ACTIVITY_TYPE_ARG_NAME = "activitytype";
    public static final String PAYWALL_INTENT_ARG_NAME = "paywallintent";
    private static final String TAG = "LicenseActivity";

    public enum ActivityType {
        PAYWALL,
        ERROR_DIALOG
    }

    @Override // android.app.Activity
    public void onStart() {
        try {
            int iOrdinal = ((ActivityType) getIntent().getSerializableExtra(ACTIVITY_TYPE_ARG_NAME)).ordinal();
            if (iOrdinal == 0) {
                showPaywallAndCloseApp();
            } else {
                if (iOrdinal != 1) {
                    return;
                }
                showErrorDialog();
            }
        } catch (Exception e) {
            logAndShowErrorDialog("Couldn't process license activity correctly.", e);
        }
    }

    private void showPaywallAndCloseApp() {
        final PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra(PAYWALL_INTENT_ARG_NAME);
        if (pendingIntent == null) {
            logAndShowErrorDialog("Paywall intent is not provided.");
        } else {
            runOnUiThread(new Runnable() { // from class: com.pairip.licensecheck.LicenseActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$showPaywallAndCloseApp$0(pendingIntent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPaywallAndCloseApp$0(PendingIntent pendingIntent) {
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
            } else {
                pendingIntent.send();
            }
            closeApp();
        } catch (PendingIntent.CanceledException e) {
            logAndShowErrorDialog("Paywall intent unexpectedly cancelled.", e);
        }
    }

    private void logAndShowErrorDialog(String message, Exception ex) {
        logAndShowErrorDialog(message + " " + Log.getStackTraceString(ex));
    }

    private void logAndShowErrorDialog(String message) {
        Log.e(TAG, message);
        showErrorDialog();
    }

    private void showErrorDialog() {
        runOnUiThread(new Runnable() { // from class: com.pairip.licensecheck.LicenseActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$showErrorDialog$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showErrorDialog$0() {
        try {
            new AlertDialog.Builder(this).setTitle("Something went wrong").setMessage("Check that Google Play is enabled on your device and that you're using an up-to-date version before opening the app. If the problem persists try reinstalling the app.").setPositiveButton("Close", new DialogInterface.OnClickListener() { // from class: com.pairip.licensecheck.LicenseActivity$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f$0.lambda$showErrorDialog$1(dialogInterface, i);
                }
            }).setCancelable(false).show();
        } catch (RuntimeException e) {
            Log.d(TAG, "Couldn't show the error dialog. " + Log.getStackTraceString(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showErrorDialog$1(DialogInterface dialogInterface, int i) {
        closeApp();
    }

    private void closeApp() {
        if (LicenseClient.gracefulShutdownEnabled) {
            closeAllTasks();
        } else {
            exitApp();
        }
    }

    protected void exitApp() {
        finishAndRemoveTask();
        System.exit(0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v3 ??, still in use, count: 1, list:
          (r1v3 ?? I:android.app.ActivityManager$RecentTaskInfo) from 0x0027: IGET (r1v4 ?? I:int) = (r1v3 ?? I:android.app.ActivityManager$RecentTaskInfo) android.app.ActivityManager.RecentTaskInfo.id int
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1123)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    protected void closeAllTasks() {
        /*
            r5 = this;
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L3d
            java.util.List r0 = r0.getAppTasks()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            r1.finishAndRemoveTask()     // Catch: java.lang.RuntimeException -> L22
            goto L12
        L22:
            r2 = move-exception
            void r1 = r1.<init>(r0, r0, r0)
            int r1 = r1.id
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to gracefully clear task="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "LicenseActivity"
            android.util.Log.e(r3, r1, r2)
            goto L12
        L3d:
            r5.exitApp()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pairip.licensecheck.LicenseActivity.closeAllTasks():void");
    }
}
