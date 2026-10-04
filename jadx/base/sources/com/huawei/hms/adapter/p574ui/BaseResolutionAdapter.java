package com.huawei.hms.adapter.p574ui;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import androidx.datastore.preferences.protobuf.C21791OooO0o0;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class BaseResolutionAdapter implements IBridgeActivityDelegate {

    /* JADX INFO: renamed from: a */
    public WeakReference<Activity> f52385a;

    /* JADX INFO: renamed from: b */
    public String f52386b = "";

    /* JADX INFO: renamed from: a */
    public final void m75739a() {
        Activity activityM75740b = m75740b();
        if (activityM75740b == null || activityM75740b.isFinishing()) {
            return;
        }
        activityM75740b.finish();
    }

    /* JADX INFO: renamed from: b */
    public final Activity m75740b() {
        WeakReference<Activity> weakReference = this.f52385a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: renamed from: c */
    public final void m75741c() {
        SystemManager.getInstance().notifyResolutionResult(null, this.f52386b);
        m75739a();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.f52385a = new WeakReference<>(activity);
        Intent intent = activity.getIntent();
        if (intent == null) {
            m75741c();
            return;
        }
        Bundle extras = intent.getExtras();
        this.f52386b = intent.getStringExtra("transaction_id");
        if (extras == null) {
            m75741c();
            return;
        }
        Parcelable parcelable = extras.getParcelable("resolution");
        if (parcelable == null) {
            m75741c();
            return;
        }
        if (parcelable instanceof Intent) {
            try {
                activity.startActivityForResult((Intent) parcelable, 1001);
                return;
            } catch (ActivityNotFoundException unused) {
                m75741c();
                HMSLog.m80172e("BaseResolutionAdapter", "ActivityNotFoundException:exception");
                return;
            }
        }
        if (parcelable instanceof PendingIntent) {
            try {
                activity.startIntentSenderForResult(((PendingIntent) parcelable).getIntentSender(), 1001, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused2) {
                m75741c();
                HMSLog.m80172e("BaseResolutionAdapter", "SendIntentException:exception");
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m80174i("BaseResolutionAdapter", "onBridgeActivityDestroy");
        this.f52385a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        C21791OooO0o0.OooO0OO(i2, "onBridgeActivityResult, resultCode: ", "BaseResolutionAdapter");
        if (i2 == 1001 || i2 == 1002) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, i2);
        }
        if (i2 == -1 || intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT) || intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            SystemManager.getInstance().notifyResolutionResult(intent, this.f52386b);
        } else {
            SystemManager.getInstance().notifyResolutionResult(null, this.f52386b);
        }
        m75739a();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m80174i("BaseResolutionAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m80174i("BaseResolutionAdapter", "On key up when resolve conn error");
    }
}
