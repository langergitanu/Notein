package com.huawei.hms.api;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.datastore.preferences.protobuf.C21791OooO0o0;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.EnableServiceActivity;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.BusResponseResult;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ErrorDialogFragment;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.api.AvailabilityException;
import com.huawei.hms.common.api.HuaweiApiCallable;
import com.huawei.hms.common.internal.DialogRedirect;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.note.AppSpoofResolution;
import com.huawei.hms.update.note.DoNothingResolution;
import com.huawei.hms.update.note.NotInstalledHmsResolution;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.Util;
import o0O00OOO.C25834OooO0oO;
import o0O00OOO.OooO0o;
import o0O00Oo.C25840OooO0oo;

/* JADX INFO: renamed from: com.huawei.hms.api.b */
/* JADX INFO: loaded from: classes6.dex */
final class C17728b extends HuaweiApiAvailability {

    /* JADX INFO: renamed from: b */
    private static final C17728b f52475b = new C17728b();

    /* JADX INFO: renamed from: com.huawei.hms.api.b$a */
    public class a implements BusResponseCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C25834OooO0oO[] f52476a;

        public a(C17728b c17728b, C25834OooO0oO[] c25834OooO0oOArr) {
            this.f52476a = c25834OooO0oOArr;
        }

        @Override // com.huawei.hms.activity.internal.BusResponseCallback
        public BusResponseResult innerError(Activity activity, int i, String str) {
            HMSLog.m80172e("HuaweiApiAvailabilityImpl", "Test foreground bus error: resultCode " + i + ", errMessage" + str);
            this.f52476a[0].OooO00o(new AvailabilityException());
            return null;
        }

        @Override // com.huawei.hms.activity.internal.BusResponseCallback
        public BusResponseResult succeedReturn(Activity activity, int i, Intent intent) {
            HMSLog.m80174i("HuaweiApiAvailabilityImpl", "Test foreground bus success: resultCode " + i + ", data" + intent);
            return null;
        }
    }

    private C17728b() {
    }

    /* JADX INFO: renamed from: a */
    private static Intent m75806a(Activity activity, String str) {
        return BridgeActivity.getIntentStartBridgeActivity(activity, str);
    }

    public static C17728b getInstance() {
        return f52475b;
    }

    /* JADX INFO: renamed from: b */
    public PendingIntent m75811b(Context context, int i) {
        C21791OooO0o0.OooO0OO(i, "Enter getResolveErrorPendingIntent, errorCode: ", "HuaweiApiAvailabilityImpl");
        Intent intentM75810a = m75810a(context, i);
        if (intentM75810a != null) {
            return PendingIntent.getActivity(context, 0, intentM75810a, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public OooO0o<Void> checkApiAccessible(HuaweiApi<?> huaweiApi, HuaweiApi<?>... huaweiApiArr) {
        C25840OooO0oo c25840OooO0oo = new C25840OooO0oo();
        if (huaweiApi != null) {
            try {
                m75809a(huaweiApi);
            } catch (AvailabilityException e) {
                HMSLog.m80174i("HuaweiApiAvailabilityImpl", "checkApi has AvailabilityException " + e.getMessage());
            }
        }
        if (huaweiApiArr != null) {
            for (HuaweiApi<?> huaweiApi2 : huaweiApiArr) {
                m75809a(huaweiApi2);
            }
        }
        return c25840OooO0oo;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getErrPendingIntent(Context context, ConnectionResult connectionResult) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(connectionResult);
        return m75811b(context, connectionResult.getErrorCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Dialog getErrorDialog(Activity activity, int i, int i2) {
        Checker.checkNonNull(activity, "activity must not be null.");
        HMSLog.m80174i("HuaweiApiAvailabilityImpl", "Enter getErrorDialog, errorCode: " + i);
        return getErrorDialog(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public String getErrorString(int i) {
        HMSLog.m80174i("HuaweiApiAvailabilityImpl", "Enter getErrorString, errorCode: " + i);
        return ConnectionResult.m75763a(i);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public OooO0o<Void> getHuaweiServicesReady(Activity activity) {
        Preconditions.checkNotNull(activity);
        C25834OooO0oO[] c25834OooO0oOArr = {new C25834OooO0oO()};
        OooO0o oooO0o = c25834OooO0oOArr[0].f88150OooO00o;
        int iIsHuaweiMobileServicesAvailable = isHuaweiMobileServicesAvailable(activity.getApplicationContext(), 30000000);
        Intent resolveErrorIntent = getResolveErrorIntent(activity, iIsHuaweiMobileServicesAvailable);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, ResolutionDelegate.class.getName());
        if (resolveErrorIntent != null) {
            ForegroundIntentBuilder.registerResponseCallback(ResolutionDelegate.CALLBACK_METHOD, new a(this, c25834OooO0oOArr));
            Bundle bundle = new Bundle();
            bundle.putParcelable("resolution", resolveErrorIntent);
            intentStartBridgeActivity.putExtras(bundle);
            activity.startActivity(intentStartBridgeActivity);
            return oooO0o;
        }
        if (iIsHuaweiMobileServicesAvailable == 3) {
            Intent intent = new Intent();
            intent.setClass(activity, EnableServiceActivity.class);
            activity.startActivity(intent);
            return oooO0o;
        }
        if (iIsHuaweiMobileServicesAvailable == 0) {
            HMSLog.m80174i("HuaweiApiAvailabilityImpl", "The HMS service is available.");
            return oooO0o;
        }
        HMSLog.m80172e("HuaweiApiAvailabilityImpl", "Framework can not solve the availability problem.");
        c25834OooO0oOArr[0].OooO00o(new AvailabilityException());
        return oooO0o;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Intent getResolveErrorIntent(Activity activity, int i) {
        C21791OooO0o0.OooO0OO(i, "Enter getResolveErrorIntent, errorCode: ", "HuaweiApiAvailabilityImpl");
        if (i == 1 || i == 2) {
            return m75806a(activity, NotInstalledHmsResolution.class.getName());
        }
        if (i == 6) {
            return m75806a(activity, BindingFailedResolution.class.getName());
        }
        if (i == 9 && Util.isAvailableLibExist(activity)) {
            return m75806a(activity, AppSpoofResolution.class.getName());
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getResolveErrorPendingIntent(Activity activity, int i) {
        C21791OooO0o0.OooO0OO(i, "Enter getResolveErrorPendingIntent, errorCode: ", "HuaweiApiAvailabilityImpl");
        Intent resolveErrorIntent = getResolveErrorIntent(activity, i);
        if (resolveErrorIntent != null) {
            return PendingIntent.getActivity(activity, 0, resolveErrorIntent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileNoticeAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(new PackageManagerHelper(context).getPackageStates(HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService()))) {
            return 1;
        }
        return HMSPackageManager.getInstance(context).isApkUpdateNecessary(20600000) ? 2 : 0;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        return HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(context, HuaweiApiAvailability.getServicesVersionCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean isUserResolvableError(int i, PendingIntent pendingIntent) {
        if (i == 0) {
            return false;
        }
        return pendingIntent != null || i == 1 || i == 2 || i == 6 || i == 9;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void popupErrNotification(Context context, ConnectionResult connectionResult) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(connectionResult);
        showErrorNotification(context, connectionResult.getErrorCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void resolveError(Activity activity, int i, int i2) {
        resolveError(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void showErrorNotification(Context context, int i) {
        Checker.checkNonNull(context, "context must not be null.");
        HMSLog.m80174i("HuaweiApiAvailabilityImpl", "Enter showErrorNotification, errorCode: " + i);
        if (!(context instanceof Activity)) {
            HMSLog.m80174i("HuaweiApiAvailabilityImpl", "context not instanceof Activity");
            return;
        }
        Dialog errorDialog = getErrorDialog((Activity) context, i, 0);
        if (errorDialog == null) {
            HMSLog.m80174i("HuaweiApiAvailabilityImpl", "showErrorNotification errorDialog can not be null");
        } else {
            errorDialog.show();
        }
    }

    /* JADX INFO: renamed from: a */
    private static Intent m75807a(Context context, String str) {
        return BridgeActivity.getIntentStartBridgeActivity(context, str);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean isUserResolvableError(int i) {
        return isUserResolvableError(i, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void resolveError(Activity activity, int i, int i2, PendingIntent pendingIntent) {
        Checker.checkNonNull(activity, "activity must not be null.");
        if (pendingIntent != null) {
            C21791OooO0o0.OooO0OO(i, "Enter resolveError, param pendingIntent is not null. and.errorCode: ", "HuaweiApiAvailabilityImpl");
        } else {
            C21791OooO0o0.OooO0OO(i, "Enter resolveError, param pendingIntent is  null. get pendingIntent from error code.and.errorCode: ", "HuaweiApiAvailabilityImpl");
            pendingIntent = getResolveErrorPendingIntent(activity, i);
        }
        if (pendingIntent != null) {
            C21791OooO0o0.OooO0OO(i, "In resolveError, start pendingIntent.errorCode: ", "HuaweiApiAvailabilityImpl");
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                HMSLog.m80172e("HuaweiApiAvailabilityImpl", "Enter resolveError, start pendingIntent failed.errorCode: " + i);
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        m75808a(activity, errorDialog, HuaweiMobileServicesUtil.HMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public Intent m75810a(Context context, int i) {
        C21791OooO0o0.OooO0OO(i, "Enter getResolveErrorIntent, errorCode: ", "HuaweiApiAvailabilityImpl");
        if (i == 1 || i == 2) {
            return m75807a(context, NotInstalledHmsResolution.class.getName());
        }
        if (i != 6) {
            if (i == 9 && Util.isAvailableLibExist(context)) {
                return m75807a(context, AppSpoofResolution.class.getName());
            }
            return null;
        }
        return m75807a(context, BindingFailedResolution.class.getName());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Dialog getErrorDialog(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Checker.checkNonNull(activity, "activity must not be null.");
        HMSLog.m80174i("HuaweiApiAvailabilityImpl", "Enter getErrorDialog, errorCode: " + i);
        return m75804a(activity, i, DialogRedirect.getInstance(activity, m75805a(activity, i), i2), onCancelListener);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileServicesAvailable(Context context, int i) {
        Checker.checkNonNull(context, "context must not be null.");
        return HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(context, i);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i, Fragment fragment, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(activity, i, i2, onCancelListener);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getErrPendingIntent(Context context, int i, int i2) {
        HMSLog.m80174i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorPendingIntent, errorCode: " + i + " requestCode: " + i2);
        Intent intentM75810a = m75810a(context, i);
        if (intentM75810a != null) {
            return PendingIntent.getActivity(context, i2, intentM75810a, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public OooO0o<Void> checkApiAccessible(HuaweiApiCallable huaweiApiCallable, HuaweiApiCallable... huaweiApiCallableArr) {
        C25840OooO0oo c25840OooO0oo = new C25840OooO0oo();
        if (huaweiApiCallable != null) {
            try {
                m75809a(huaweiApiCallable);
            } catch (AvailabilityException e) {
                HMSLog.m80174i("HuaweiApiAvailabilityImpl", "HuaweiApiCallable checkApi has AvailabilityException " + e.getMessage());
            }
        }
        if (huaweiApiCallableArr != null) {
            for (HuaweiApiCallable huaweiApiCallable2 : huaweiApiCallableArr) {
                m75809a(huaweiApiCallable2);
            }
        }
        return c25840OooO0oo;
    }

    /* JADX INFO: renamed from: a */
    private Intent m75805a(Activity activity, int i) {
        C21791OooO0o0.OooO0OO(i, "getErrorResolutionIntent, errorCode: ", "HuaweiApiAvailabilityImpl");
        if (i == 1 || i == 2) {
            return BridgeActivity.getIntentStartBridgeActivity(activity, DoNothingResolution.class.getName());
        }
        if (i != 6) {
            if (i == 9 && Util.isAvailableLibExist(activity)) {
                return BridgeActivity.getIntentStartBridgeActivity(activity, AppSpoofResolution.class.getName());
            }
            return null;
        }
        return BridgeActivity.getIntentStartBridgeActivity(activity, BindingFailedResolution.class.getName());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.AlertDialog$Builder, android.util.Log, java.lang.String, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.app.Dialog, int] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 8, list:
          (r0v0 ?? I:java.lang.StringBuilder) from 0x000a: INVOKE (r0v0 ?? I:java.lang.StringBuilder) DIRECT call: java.lang.StringBuilder.toString():java.lang.String A[MD:():java.lang.String (c)]
          (r0v0 ?? I:android.app.AlertDialog$Builder) from 0x0011: INVOKE (r0v0 ?? I:android.app.AlertDialog$Builder), (r1v1 java.lang.String) VIRTUAL call: android.app.AlertDialog.Builder.setMessage(java.lang.CharSequence):android.app.AlertDialog$Builder A[MD:(java.lang.CharSequence):android.app.AlertDialog$Builder (c)]
          (r0v0 ?? I:android.app.AlertDialog$Builder) from 0x001d: INVOKE 
          (r0v0 ?? I:android.app.AlertDialog$Builder)
          (r5v1 java.lang.String)
          (r4v0 com.huawei.hms.common.internal.DialogRedirect)
         VIRTUAL call: android.app.AlertDialog.Builder.setPositiveButton(java.lang.CharSequence, android.content.DialogInterface$OnClickListener):android.app.AlertDialog$Builder A[MD:(java.lang.CharSequence, android.content.DialogInterface$OnClickListener):android.app.AlertDialog$Builder (c)] (LINE:29)
          (r0v0 ?? I:android.util.Log) from 0x0029: INVOKE (r2v2 ?? I:int) = (r0v0 ?? I:android.util.Log), (r0v0 ?? I:java.lang.String), (r0v0 ?? I:java.lang.String) VIRTUAL call: android.util.Log.e(java.lang.String, java.lang.String):int A[MD:(java.lang.String, java.lang.String):int (c)] (LINE:32)
          (r0v0 ?? I:java.lang.String) from 0x0029: INVOKE (r2v2 ?? I:int) = (r0v0 ?? I:android.util.Log), (r0v0 ?? I:java.lang.String), (r0v0 ?? I:java.lang.String) VIRTUAL call: android.util.Log.e(java.lang.String, java.lang.String):int A[MD:(java.lang.String, java.lang.String):int (c)] (LINE:32)
          (r0v0 ?? I:java.lang.String) from 0x0029: INVOKE (r2v2 ?? I:int) = (r0v0 ?? I:android.util.Log), (r0v0 ?? I:java.lang.String), (r0v0 ?? I:java.lang.String) VIRTUAL call: android.util.Log.e(java.lang.String, java.lang.String):int A[MD:(java.lang.String, java.lang.String):int (c)] (LINE:32)
          (r0v0 ?? I:android.app.AlertDialog$Builder) from 0x0026: INVOKE (r0v0 ?? I:android.app.AlertDialog$Builder), (r2v1 java.lang.String) VIRTUAL call: android.app.AlertDialog.Builder.setTitle(java.lang.CharSequence):android.app.AlertDialog$Builder A[MD:(java.lang.CharSequence):android.app.AlertDialog$Builder (c)] (LINE:31)
          (r0v0 ?? I:android.app.AlertDialog$Builder) from 0x0016: INVOKE (r0v0 ?? I:android.app.AlertDialog$Builder), (r5v0 android.content.DialogInterface$OnCancelListener) VIRTUAL call: android.app.AlertDialog.Builder.setOnCancelListener(android.content.DialogInterface$OnCancelListener):android.app.AlertDialog$Builder A[MD:(android.content.DialogInterface$OnCancelListener):android.app.AlertDialog$Builder (c)] (LINE:27)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: a */
    private static android.app.Dialog m75804a(android.app.Activity r2, int r3, com.huawei.hms.common.internal.DialogRedirect r4, android.content.DialogInterface.OnCancelListener r5) {
        /*
            if (r3 != 0) goto L4
            r2 = 0
            return r2
        L4:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            int r1 = com.huawei.hms.update.p589ui.NotInstalledHmsDialogHelper.getDialogThemeId(r2)
            r0.toString()
            java.lang.String r1 = com.huawei.hms.common.internal.ConnectionErrorMessages.getErrorMessage(r2, r3)
            r0.setMessage(r1)
            if (r5 == 0) goto L19
            r0.setOnCancelListener(r5)
        L19:
            java.lang.String r5 = com.huawei.hms.common.internal.ConnectionErrorMessages.getErrorDialogButtonMessage(r2, r3)
            r0.setPositiveButton(r5, r4)
            java.lang.String r2 = com.huawei.hms.common.internal.ConnectionErrorMessages.getErrorTitle(r2, r3)
            if (r2 == 0) goto L29
            r0.setTitle(r2)
        L29:
            int r2 = r0.e(r0, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.api.C17728b.m75804a(android.app.Activity, int, com.huawei.hms.common.internal.DialogRedirect, android.content.DialogInterface$OnCancelListener):android.app.Dialog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.FragmentManager, void] */
    /* JADX INFO: renamed from: a */
    private static void m75808a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        Checker.checkNonNull(activity, "activity must not be null.");
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show((FragmentManager) activity.unserialize("activity must not be null."), str);
    }

    /* JADX INFO: renamed from: a */
    private void m75809a(Object obj) throws AvailabilityException {
        ConnectionResult connectionResult;
        AvailabilityException availabilityException = new AvailabilityException();
        if (obj instanceof HuaweiApi) {
            connectionResult = availabilityException.getConnectionResult((HuaweiApi<? extends Api.ApiOptions>) obj);
        } else {
            connectionResult = availabilityException.getConnectionResult((HuaweiApiCallable) obj);
        }
        if (connectionResult.getErrorCode() == 0) {
            return;
        }
        HMSLog.m80174i("HuaweiApiAvailabilityImpl", "The service is unavailable: " + availabilityException.getMessage());
        throw availabilityException;
    }
}
