package com.huawei.agconnect.config;

import android.content.Context;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.config.impl.C17578c;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public abstract class AGConnectServicesConfig implements AGConnectOptions {
    private static final Map<String, AGConnectServicesConfig> INSTANCES = new HashMap();
    private static final Object INSTANCES_LOCK = new Object();

    public static AGConnectServicesConfig fromContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return fromContext(context, context.getPackageName());
    }

    public abstract void overlayWith(LazyInputStream lazyInputStream);

    public abstract void overlayWith(InputStream inputStream);

    public abstract void setParam(String str, String str2);

    public abstract void setRoutePolicy(AGCRoutePolicy aGCRoutePolicy);

    public static AGConnectServicesConfig fromContext(Context context, String str) {
        AGConnectServicesConfig c17578c;
        synchronized (INSTANCES_LOCK) {
            try {
                Map<String, AGConnectServicesConfig> map = INSTANCES;
                c17578c = map.get(str);
                if (c17578c == null) {
                    c17578c = new C17578c(context, str);
                    map.put(str, c17578c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c17578c;
    }
}
