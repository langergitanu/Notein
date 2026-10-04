package com.huawei.hms.network.embedded;

import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.t1 */
/* JADX INFO: loaded from: classes9.dex */
public class C18358t1 {

    /* JADX INFO: renamed from: a */
    public static final String f56147a = "networkkit_";

    /* JADX INFO: renamed from: b */
    public static final String f56148b = "core_configversion";

    /* JADX INFO: renamed from: c */
    public static final String f56149c = "core_unitransenable";

    /* JADX INFO: renamed from: d */
    public static final String f56150d = "core_switch_profile";

    /* JADX INFO: renamed from: e */
    public static final String f56151e = "1.0.0.100";

    /* JADX INFO: renamed from: f */
    public static final Map<String, Object> f56152f = new HashMap();

    /* JADX INFO: renamed from: g */
    public static final C18358t1 f56153g = new C18358t1();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t1$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final String f56154a = "abtest_enable";

        /* JADX INFO: renamed from: b */
        public static final String f56155b = "abtest_items";
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t1$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final boolean f56156a = false;

        /* JADX INFO: renamed from: b */
        public static final String[] f56157b = null;
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t1$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final boolean f56158a = true;

        /* JADX INFO: renamed from: b */
        public static final boolean f56159b = false;

        /* JADX INFO: renamed from: c */
        public static final boolean f56160c = false;

        /* JADX INFO: renamed from: d */
        public static final int f56161d = 8;

        /* JADX INFO: renamed from: e */
        public static final int f56162e = 5;
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t1$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public static final String[] f56163a = null;

        /* JADX INFO: renamed from: b */
        public static final String[] f56164b = null;
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t1$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public static final int f56165a = 10000;

        /* JADX INFO: renamed from: b */
        public static final int f56166b = 10000;

        /* JADX INFO: renamed from: c */
        public static final int f56167c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f56168d = 0;

        /* JADX INFO: renamed from: e */
        public static final int f56169e = 0;

        /* JADX INFO: renamed from: f */
        public static final int f56170f = 10000;

        /* JADX INFO: renamed from: g */
        public static final int f56171g = 500;

        /* JADX INFO: renamed from: h */
        public static final boolean f56172h = true;

        /* JADX INFO: renamed from: i */
        public static final boolean f56173i = false;

        /* JADX INFO: renamed from: j */
        public static final boolean f56174j = true;

        /* JADX INFO: renamed from: k */
        public static final boolean f56175k = false;

        /* JADX INFO: renamed from: l */
        public static final boolean f56176l = false;

        /* JADX INFO: renamed from: m */
        public static final int f56177m = 0;

        /* JADX INFO: renamed from: n */
        public static final int f56178n = 0;
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t1$f */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public static final int f56179a = 2;

        /* JADX INFO: renamed from: b */
        public static final int f56180b = 2097152;
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t1$g */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public static final String f56181a = "profile_app_exclusion";

        /* JADX INFO: renamed from: b */
        public static final String f56182b = "profile_app_inclusion";

        /* JADX INFO: renamed from: c */
        public static final String f56183c = "*";
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t1$h */
    public static final class h {

        /* JADX INFO: renamed from: a */
        public static final String f56184a = "core_threshold_min_call_timeout";

        /* JADX INFO: renamed from: b */
        public static final String f56185b = "core_threshold_min_connect_timeout";

        /* JADX INFO: renamed from: c */
        public static final String f56186c = "core_threshold_min_connection_attempt_delay";

        /* JADX INFO: renamed from: d */
        public static final String f56187d = "core_threshold_max_connection_attempt_delay";

        /* JADX INFO: renamed from: e */
        public static final String f56188e = "core_threshold_max_request_discrete_time";

        /* JADX INFO: renamed from: f */
        public static final String f56189f = "core_threshold_max_retry_waiting_time";

        /* JADX INFO: renamed from: g */
        public static final String f56190g = "core_threshold_max_retry_after_time";
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t1$i */
    public static final class i {

        /* JADX INFO: renamed from: a */
        public static final String f56191a = "abtest_dyfrag_groupid";

        /* JADX INFO: renamed from: b */
        public static final String f56192b = "filemanager_slice_threshold";

        /* JADX INFO: renamed from: c */
        public static final String f56193c = "filemanager_slice_num";
    }

    public C18358t1() {
        m79543c();
    }

    /* JADX INFO: renamed from: b */
    public static C18358t1 m79542b() {
        return f56153g;
    }

    /* JADX INFO: renamed from: c */
    private void m79543c() {
        Map<String, Object> map = f56152f;
        Boolean bool = Boolean.TRUE;
        map.put("core_switch_ai", bool);
        Boolean bool2 = Boolean.FALSE;
        map.put(NetworkService.Constants.AI_IPSORT, bool2);
        map.put("core_switch_dns", bool);
        map.put(f56150d, bool2);
        map.put(f56149c, bool2);
        map.put("core_configversion", f56151e);
        map.put(PolicyNetworkService.GlobalConstants.ENABLE_DETECT_WITH_HTTP, bool);
        map.put(PolicyNetworkService.GlobalConstants.ENABLE_HTTPDNS, bool2);
        map.put(PolicyNetworkService.GlobalConstants.HA_TAG, "");
        map.put(PolicyNetworkService.GlobalConstants.CONNECT_POOL_SIZE, 8);
        map.put(PolicyNetworkService.GlobalConstants.CONNECT_KEEP_ALIVE_DURATION, 5);
        map.put(PolicyNetworkService.GlobalConstants.ENABLE_PRIVACY_POLICY, bool2);
        map.put(PolicyNetworkService.ClientConstants.DISABLE_WEAKNETWORK_RETRY, bool);
        map.put(PolicyNetworkService.ClientConstants.ENABLE_PLAINTEXT_URL_PATH, bool2);
        map.put(PolicyNetworkService.RequestConstants.CALL_TIMEOUT, 0);
        map.put(PolicyNetworkService.RequestConstants.CONNECT_TIMEOUT, 10000);
        map.put(PolicyNetworkService.RequestConstants.WRITE_TIMEOUT, 10000);
        map.put(PolicyNetworkService.RequestConstants.READ_TIMEOUT, 10000);
        map.put(PolicyNetworkService.RequestConstants.RETRY_TIME, 1);
        map.put(PolicyNetworkService.RequestConstants.CONCURRENT_CONNECT_DELAY, 500);
        map.put(PolicyNetworkService.RequestConstants.PING_INTERVAL, 0);
        map.put(PolicyNetworkService.RequestConstants.ENABLE_CONCURRENT_CONNECT, bool);
        map.put(PolicyNetworkService.RequestConstants.CONNECT_EMPTY_BODY, bool2);
        map.put(PolicyNetworkService.RequestConstants.ENABLE_TRAFFIC_CONTROL_WITH_429, bool2);
        map.put(PolicyNetworkService.RequestConstants.MAX_REQUEST_DISCRETE_TIME, 0);
        map.put(PolicyNetworkService.RequestConstants.MAX_RETRY_WAITING_TIME, 0);
        map.put(i.f56191a, "");
        map.put(i.f56192b, 2097152);
        map.put(i.f56193c, 2);
        map.put(a.f56154a, bool2);
        map.put(a.f56155b, b.f56157b);
        map.put(g.f56181a, d.f56163a);
        map.put(g.f56182b, d.f56164b);
        map.put(h.f56184a, 20);
        map.put(h.f56185b, 1000);
        map.put(h.f56186c, 100);
        map.put(h.f56187d, 2000);
        map.put(h.f56188e, 3000);
        map.put(h.f56189f, 8000);
        map.put(h.f56190g, 8000);
    }

    /* JADX INFO: renamed from: a */
    public Object m79544a(String str) {
        return f56152f.get(str);
    }

    /* JADX INFO: renamed from: a */
    public Set<String> m79545a() {
        return f56152f.keySet();
    }
}
