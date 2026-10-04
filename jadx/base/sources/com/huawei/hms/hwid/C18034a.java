package com.huawei.hms.hwid;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.adapter.AvailableAdapter;

/* JADX INFO: renamed from: com.huawei.hms.hwid.a */
/* JADX INFO: loaded from: classes8.dex */
public class C18034a {
    /* JADX INFO: renamed from: a */
    public static int m77606a() {
        return 40004000;
    }

    /* JADX INFO: renamed from: a */
    public static void m77607a(Activity activity, AvailableAdapter.AvailableCallBack availableCallBack) {
        C18053as.m77659b("HmsAccountKitVersionCheckUtil", "====== HMSSDK version: 60400302 ======", true);
        Context applicationContext = activity.getApplicationContext();
        int iM77606a = m77606a();
        C18053as.m77659b("HmsAccountKitVersionCheckUtil", "check minVersion:" + iM77606a, true);
        AvailableAdapter availableAdapter = new AvailableAdapter(iM77606a);
        int iIsHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(applicationContext);
        if (iIsHuaweiMobileServicesAvailable == 0) {
            availableCallBack.onComplete(iIsHuaweiMobileServicesAvailable);
        } else if (availableAdapter.isUserResolvableError(iIsHuaweiMobileServicesAvailable)) {
            availableAdapter.startResolution(activity, availableCallBack);
        } else {
            availableCallBack.onComplete(iIsHuaweiMobileServicesAvailable);
        }
    }
}
