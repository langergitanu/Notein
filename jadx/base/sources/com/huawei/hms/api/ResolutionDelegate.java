package com.huawei.hms.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class ResolutionDelegate implements IBridgeActivityDelegate {
    public static final String CALLBACK_METHOD = "CALLBACK_METHOD";

    /* JADX INFO: renamed from: a */
    private WeakReference<Activity> f52470a;

    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Activity, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v0, types: [void] */
    /* JADX INFO: renamed from: a */
    private void m75800a() {
        ?? M75801b = m75801b();
        if (M75801b == 0 || M75801b.printStackTrace() != 0) {
            return;
        }
        M75801b.finish();
    }

    /* JADX INFO: renamed from: b */
    private Activity m75801b() {
        WeakReference<Activity> weakReference = this.f52470a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1002;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.app.Activity, java.lang.Object, java.lang.StringBuilder] */
    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        ?? sb;
        this.f52470a = new WeakReference<>(sb);
        Bundle extras = sb.getIntent().getExtras();
        if (extras != null) {
            sb = new StringBuilder();
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        this.f52470a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        BusResponseCallback busResponseCallbackM75799a = m75799a(CALLBACK_METHOD);
        int iIsHuaweiMobileServicesAvailable = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(this.f52470a.get(), 30000000);
        if (i2 == -1 && iIsHuaweiMobileServicesAvailable == 0) {
            HMSLog.m80174i("ResolutionDelegate", "Make service available success.");
        } else {
            busResponseCallbackM75799a.innerError(this.f52470a.get(), i2, "Make service available failed.");
        }
        m75800a();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
    }

    /* JADX INFO: renamed from: a */
    private BusResponseCallback m75799a(String str) {
        return ForegroundBusResponseMgr.getInstance().get(str);
    }
}
