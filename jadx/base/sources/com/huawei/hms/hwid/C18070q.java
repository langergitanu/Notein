package com.huawei.hms.hwid;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.adapter.AvailableAdapter;

/* JADX INFO: renamed from: com.huawei.hms.hwid.q */
/* JADX INFO: loaded from: classes8.dex */
public class C18070q {
    /* JADX INFO: renamed from: a */
    public static int m77702a() {
        return 30000000;
    }

    /* JADX INFO: renamed from: a */
    public static void m77703a(Activity activity, AvailableAdapter.AvailableCallBack availableCallBack) {
        C18053as.m77659b("HmsAPKVersionCheckUtil", "====== HMSSDK version: 60400302 ======", true);
        Context applicationContext = activity.getApplicationContext();
        int iM77702a = m77702a();
        C18053as.m77659b("HmsAPKVersionCheckUtil", "check minVersion:" + iM77702a, true);
        AvailableAdapter availableAdapter = new AvailableAdapter(iM77702a);
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
