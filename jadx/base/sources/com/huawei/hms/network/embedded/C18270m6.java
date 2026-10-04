package com.huawei.hms.network.embedded;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PackageManagerCompat;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.m6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18270m6 {

    /* JADX INFO: renamed from: e */
    public static final String f55664e = "NetworkServiceManager";

    /* JADX INFO: renamed from: f */
    public static final String f55665f = "networkservice_";

    /* JADX INFO: renamed from: g */
    public static final C18270m6 f55666g = new C18270m6();

    /* JADX INFO: renamed from: h */
    public static final String f55667h = "networkservice_config";

    /* JADX INFO: renamed from: a */
    public PolicyNetworkService f55668a;

    /* JADX INFO: renamed from: b */
    public Context f55669b;

    /* JADX INFO: renamed from: c */
    public volatile ConcurrentHashMap<String, NetworkService> f55670c = new ConcurrentHashMap<>(8);

    /* JADX INFO: renamed from: d */
    public C18284n6 f55671d;

    /* JADX INFO: renamed from: b */
    private NetworkService m79117b(Context context, String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            Logger.m76967w(f55664e, "networkService classPath is null");
            return null;
        }
        try {
            ClassLoader classLoader = C18270m6.class.getClassLoader();
            if (classLoader != null) {
                NetworkService networkService = (NetworkService) classLoader.loadClass(str).asSubclass(NetworkService.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                networkService.onCreate(context, bundle);
                return networkService;
            }
        } catch (Throwable unused) {
            Logger.m76967w(f55664e, "network service load failed");
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static C18270m6 m79118c() {
        return f55666g;
    }

    /* JADX INFO: renamed from: a */
    public NetworkService m79119a(String str) {
        return this.f55670c.get(str);
    }

    /* JADX INFO: renamed from: a */
    public List<NetworkService> m79120a() {
        return new ArrayList(this.f55670c.values());
    }

    /* JADX INFO: renamed from: b */
    public void m79123b() {
        this.f55670c.clear();
    }

    /* JADX INFO: renamed from: a */
    private Map<String, String> m79116a(Context context, Bundle bundle) {
        NetworkService networkServiceM79117b = m79117b(context, PackageManagerCompat.getMetaDataFromKitOrApp(context, f55667h, ""), bundle);
        if (!(networkServiceM79117b instanceof PolicyNetworkService)) {
            throw new IllegalStateException("configPolicyService is error");
        }
        this.f55668a = (PolicyNetworkService) networkServiceM79117b;
        this.f55670c.put(NetworkService.Constants.CONFIG_SERVICE, this.f55668a);
        Map<String, String> metaDataMapFromKitOrApp = PackageManagerCompat.getMetaDataMapFromKitOrApp(context, f55665f);
        if (!metaDataMapFromKitOrApp.isEmpty() && metaDataMapFromKitOrApp.containsKey(NetworkService.Constants.CONFIG_SERVICE)) {
            metaDataMapFromKitOrApp.remove(NetworkService.Constants.CONFIG_SERVICE);
        }
        return metaDataMapFromKitOrApp;
    }

    /* JADX INFO: renamed from: b */
    public void m79124b(String str) {
        if (str == null || !this.f55670c.containsKey(str)) {
            return;
        }
        this.f55670c.remove(str);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m79121a(Context context, String str, Bundle bundle) {
        NetworkService networkServiceM79117b;
        try {
            this.f55669b = context;
            Map<String, String> mapM79116a = m79116a(context, bundle);
            this.f55671d = new C18284n6(str);
            if (!mapM79116a.isEmpty()) {
                for (Map.Entry<String, String> entry : mapM79116a.entrySet()) {
                    String key = entry.getKey();
                    if (this.f55671d.m79257a(PolicyNetworkService.NETWORK_SWITCH_CONFIG_PRE + key) && (networkServiceM79117b = m79117b(context, entry.getValue(), bundle)) != null) {
                        this.f55670c.put(key, networkServiceM79117b);
                    }
                }
            }
            Logger.m76963i(f55664e, "networkServices map is: " + this.f55670c);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m79122a(PolicyNetworkService policyNetworkService) {
        if (this.f55669b == null) {
            return;
        }
        Iterator<String> it = NetworkService.Constants.NETWORK_SERVICES.iterator();
        while (it.hasNext()) {
            NetworkService networkServiceM79119a = m79119a(it.next());
            if (networkServiceM79119a != null) {
                networkServiceM79119a.serviceOptions(policyNetworkService.getValues("", (String[]) PolicyNetworkService.GlobalConstants.GLOBAL_CONSTANTS.toArray(new String[0])));
            }
        }
    }
}
