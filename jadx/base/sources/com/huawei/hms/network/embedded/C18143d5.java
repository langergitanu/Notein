package com.huawei.hms.network.embedded;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.network.inner.api.NetworkReceiver;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.d5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18143d5 {
    public static final String APP_NAME = "app_name";
    public static final String EVENT_ID = "sysevent";
    public static final String EVENT_TYPE = "sysevent_type";
    public static final String EVENT_VALUE = "sysevent_value";
    public static final String NETSWITCH_EVENT = "netswitch";

    /* JADX INFO: renamed from: a */
    public static final String f54528a = "u4";

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.d5$a */
    public static class a implements NetworkReceiver {

        /* JADX INFO: renamed from: a */
        public final NetworkInfo f54529a = NetworkUtil.getNetworkInfo(ContextHolder.getAppContext());

        @Override // com.huawei.hms.network.inner.api.NetworkReceiver
        public void onReceiveMsg(Context context, Intent intent) {
            NetworkInfo networkInfo = NetworkUtil.getNetworkInfo(context);
            if (networkInfo == null) {
                Logger.m76965v(C18143d5.f54528a, "Get NetworkInfo failed");
            } else {
                Logger.m76966v(C18143d5.f54528a, "networkInfo: %s", networkInfo);
                C18143d5.reportNetSwitch(this.f54529a, networkInfo);
            }
        }
    }

    public static void init() {
        C18374u4.getInstance().init();
        C18361t4.getInstance().init();
        C18256l6.m79045b().m79047a(new a());
    }

    public static void reportNetSwitch(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if (NetworkUtil.isConnectTypeChange(networkInfo, networkInfo2)) {
            reportSysEvent(Long.valueOf(System.currentTimeMillis()), NETSWITCH_EVENT, NetworkUtil.getPrimaryNetworkType(networkInfo) + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + NetworkUtil.getPrimaryNetworkType(networkInfo2));
        }
    }

    public static void reportSysEvent(Long l, String str, String str2) {
        if (HianalyticsHelper.getInstance().isEnableReportNoSeed(ContextHolder.getAppContext())) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(HianalyticsBaseData.SDK_TYPE, "UxPP");
            linkedHashMap.put(HianalyticsBaseData.SDK_NAME, "networkkit");
            linkedHashMap.put("sdk_version", "5.0.4.300");
            linkedHashMap.put("time", l + "");
            linkedHashMap.put(EVENT_TYPE, str);
            linkedHashMap.put(EVENT_VALUE, str2);
            linkedHashMap.put(APP_NAME, ContextHolder.getAppContext() != null ? ContextHolder.getAppContext().getPackageName() : "null context");
            HianalyticsHelper.getInstance().onEvent(linkedHashMap, EVENT_ID);
            Logger.m76966v(f54528a, "%s", linkedHashMap);
        }
    }
}
