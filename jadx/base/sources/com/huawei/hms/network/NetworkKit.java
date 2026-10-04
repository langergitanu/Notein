package com.huawei.hms.network;

import android.content.Context;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NetworkKit {

    /* JADX INFO: renamed from: a */
    private static final String f53984a = "NetworkKit";

    /* JADX INFO: renamed from: b */
    private static final int f53985b = 1000;

    /* JADX INFO: renamed from: c */
    private static String f53986c;

    /* JADX INFO: renamed from: d */
    private static volatile NetworkKit f53987d;

    /* JADX INFO: renamed from: e */
    private static RemoteInitializer f53988e;

    /* JADX INFO: renamed from: f */
    private static Context f53989f;

    /* JADX INFO: renamed from: g */
    private static volatile Future f53990g;

    public static abstract class Callback {
        public abstract void onResult(boolean z);
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.NetworkKit$a */
    public static class RunnableC18081a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Callback f53991a;

        public RunnableC18081a(Callback callback) {
            this.f53991a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkKit.getInstance();
            Callback callback = this.f53991a;
            if (callback != null) {
                callback.onResult(NetworkKit.f53987d != null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static synchronized Future m77722a(Callback callback, String str) {
        try {
            if (f53990g == null) {
                f53986c = str;
                f53990g = ExecutorsUtils.newSingleThreadExecutor(f53984a).submit(new RunnableC18081a(callback));
            } else {
                Logger.m76967w(f53984a, "only call once");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f53990g;
    }

    public static Context getContext() {
        Context context = f53989f;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("you must call init(final Context context, final Callback callback) or init(final Context context, final Callback callback, final String options) before all Method");
    }

    public static synchronized NetworkKit getInstance() {
        try {
            if (f53987d == null) {
                if (f53988e == null) {
                    f53988e = new RemoteInitializer();
                }
                Future futureInit = f53988e.init(getContext());
                if (futureInit != null) {
                    try {
                        futureInit.get(1000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
                        Logger.m76960e(f53984a, "create exception = ".concat(e.getClass().getSimpleName()));
                    }
                }
                f53987d = NetworkKitProvider.getEnableProvider(true).createNetworkKit();
                f53987d.initKit(f53989f, f53986c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f53987d;
    }

    public static RemoteInitializer getRemoteInitializer() {
        return f53988e;
    }

    public static synchronized Future init(Context context, Callback callback) {
        return init(context, callback, "");
    }

    public abstract void addQuicHint(boolean z, String... strArr);

    public abstract void evictAllConnections();

    public abstract String getOption(String str);

    public abstract void initConnectionPool(int i, long j, TimeUnit timeUnit);

    public abstract void initKit(Context context, String str);

    public abstract void setOptions(String str);

    public static synchronized Future init(Context context, Callback callback, String str) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        Context applicationContext = context.getApplicationContext();
        f53989f = applicationContext;
        ContextHolder.setAppContext(applicationContext);
        return m77722a(callback, str);
    }
}
