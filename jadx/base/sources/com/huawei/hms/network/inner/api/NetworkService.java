package com.huawei.hms.network.inner.api;

import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NetworkService {

    public static final class Constants {
        public static final String AI_IPSORT = "ai_ipsort";
        public static final String AI_SERVICE = "ai";
        public static final String CONFIG_SERVICE = "config";
        public static final String DNS_SERVICE = "dns";
        public static final String GRS_SERVICE = "grs";
        public static final List<String> NETWORK_SERVICES = Collections.unmodifiableList(Arrays.asList("ai", "dns", GRS_SERVICE));
    }

    public abstract String getServiceName();

    public abstract String getServiceType();

    public abstract String getVersion();

    public abstract void onCreate(Context context, Bundle bundle);

    public abstract void onDestroy(Context context);

    public void serviceOptions(Map<String, String> map) {
    }
}
