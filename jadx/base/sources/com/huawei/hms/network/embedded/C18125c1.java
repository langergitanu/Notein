package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.network.conf.api.ConfigAPI;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.c1 */
/* JADX INFO: loaded from: classes9.dex */
public class C18125c1 {

    /* JADX INFO: renamed from: a */
    public static final String f54356a = "ReportDataUtils";

    /* JADX INFO: renamed from: b */
    public static final String f54357b = "ai";

    /* JADX INFO: renamed from: c */
    public static final String f54358c = "connect_pool_size";

    /* JADX INFO: renamed from: d */
    public static final String f54359d = "request_accuracy";

    /* JADX INFO: renamed from: e */
    public static final String f54360e = "dns_accuracy";

    /* JADX INFO: renamed from: f */
    public static final String f54361f = "connect_count";

    /* JADX INFO: renamed from: g */
    public static final String f54362g = "dns_count";

    /* JADX INFO: renamed from: h */
    public static final String f54363h = "model_tpye";

    /* JADX INFO: renamed from: i */
    public static final String f54364i = "config_version";

    /* JADX INFO: renamed from: j */
    public static final String f54365j = "core_configversion";

    /* JADX INFO: renamed from: k */
    public static final String f54366k = "real_request_accuracy";

    /* JADX INFO: renamed from: l */
    public static final String f54367l = "domain_accuracy";

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c1$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map f54368a;

        public a(Map map) {
            this.f54368a = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(HianalyticsBaseData.SDK_TYPE, "UxPP");
            linkedHashMap.put(HianalyticsBaseData.SDK_NAME, "networkkit");
            linkedHashMap.put("sdk_version", "5.0.4.300");
            linkedHashMap.put(C18125c1.f54358c, String.valueOf(C18255l5.getInstance().getMaxIdleConnections()));
            linkedHashMap.put("config_version", (String) ConfigAPI.getValue("core_configversion"));
            for (Map.Entry entry : this.f54368a.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            HianalyticsHelper.getInstance().onEvent(linkedHashMap, "ai");
            Logger.m76966v(C18125c1.f54356a, "%s", linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m78041a(Map<String, String> map) {
        if (HianalyticsHelper.getInstance().isEnableReportNoSeed(ContextHolder.getAppContext())) {
            if (map == null) {
                Logger.m76963i(f54356a, "the accuracy data has error! accuracyMap = null");
            } else {
                HianalyticsHelper.getInstance().getReportExecutor().execute(new a(map));
            }
        }
    }
}
