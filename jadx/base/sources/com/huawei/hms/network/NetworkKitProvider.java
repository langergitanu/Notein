package com.huawei.hms.network;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.internal.IHttpClientBuilder;
import com.huawei.hms.network.restclient.internal.IRestClientBuilder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NetworkKitProvider extends BaseProvider {

    /* JADX INFO: renamed from: a */
    private static final String f53992a = "NetworkKitProvider";

    /* JADX INFO: renamed from: b */
    private static final String f53993b = "com.huawei.hms.network.httpclient.DefaultNetworkKitProvider";

    /* JADX INFO: renamed from: c */
    private static final Object f53994c = new Object();

    /* JADX INFO: renamed from: d */
    private static volatile NetworkKitProvider f53995d;

    /* JADX INFO: renamed from: a */
    private static List<NetworkKitProvider> m77723a(Context context) {
        ArrayList arrayList = new ArrayList();
        Logger.m76964i(f53992a, "load hms result is: %s", Boolean.valueOf(m77725a(arrayList)));
        return new ArrayList(arrayList);
    }

    public static NetworkKitProvider getEnableProvider() {
        return getEnableProvider(false);
    }

    public abstract IHttpClientBuilder createHttpClientBuilder();

    public abstract NetworkKit createNetworkKit();

    public abstract IRestClientBuilder createRestClientBuilder();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private static boolean m77724a(Context context, List<NetworkKitProvider> list) {
        try {
            list.add(context.getClassLoader().loadClass(f53993b).asSubclass(NetworkKitProvider.class).getConstructor(new Class[0]).newInstance(new Object[0]));
            return true;
        } catch (Exception e) {
            Logger.m76961e(f53992a, "com.huawei.hms.network.httpclient.DefaultNetworkKitProvider not found", e);
            return false;
        }
    }

    public static NetworkKitProvider getEnableProvider(boolean z) {
        NetworkKitProvider networkKitProvider;
        if (!z) {
            NetworkKit.getInstance();
        }
        synchronized (f53994c) {
            try {
                if (f53995d != null) {
                    networkKitProvider = f53995d;
                } else {
                    List<NetworkKitProvider> listM77723a = m77723a(NetworkKit.getContext());
                    for (int size = listM77723a.size() - 1; size >= 0; size--) {
                        if (listM77723a.get(size).getApiLevel() < Version.getApi() || listM77723a.get(size).getVersion().compareTo(Version.getVersion()) <= 0) {
                            listM77723a.remove(size);
                        }
                    }
                    Logger.m76963i(f53992a, "load local result is: " + m77724a(NetworkKit.getContext(), listM77723a));
                    if (listM77723a.size() <= 0) {
                        throw new IllegalStateException("Unable to find NetworkKitProvider provider");
                    }
                    f53995d = listM77723a.get(0);
                    Logger.m76964i(f53992a, "provider client version code: %s, api level: %s", f53995d.getVersion(), Integer.valueOf(f53995d.getApiLevel()));
                    DynamicLoaderHelper.getInstance().setDynamicStatus(f53995d.isDynamicProvider());
                    Logger.m76964i(f53992a, "NetworkKitProvider is dynamic provider result : %s", Boolean.valueOf(f53995d.isDynamicProvider()));
                    networkKitProvider = f53995d;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return networkKitProvider;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m77725a(List<NetworkKitProvider> list) {
        Context remoteContext = NetworkKit.getRemoteInitializer().getRemoteContext();
        if (remoteContext != null) {
            return m77724a(remoteContext, list);
        }
        return false;
    }
}
