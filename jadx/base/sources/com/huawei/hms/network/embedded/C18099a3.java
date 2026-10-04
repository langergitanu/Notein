package com.huawei.hms.network.embedded;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.a3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18099a3 {

    /* JADX INFO: renamed from: f */
    public static final String f54140f = "TaskManager";

    /* JADX INFO: renamed from: g */
    public static final String f54141g = "TaskManager_lookupThreadPool";

    /* JADX INFO: renamed from: h */
    public static final String f54142h = "TaskManager_lazyUpdateThreadPool";

    /* JADX INFO: renamed from: i */
    public static volatile C18099a3 f54143i = null;

    /* JADX INFO: renamed from: j */
    public static final int f54144j = 10;

    /* JADX INFO: renamed from: a */
    public ExecutorService f54145a;

    /* JADX INFO: renamed from: b */
    public ExecutorService f54146b;

    /* JADX INFO: renamed from: c */
    public final Object f54147c = new Object();

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap<String, Future> f54148d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e */
    public ConcurrentHashMap<String, Future> f54149e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.a3$a */
    public static class a implements Callable {

        /* JADX INFO: renamed from: a */
        public final String f54150a;

        public a(String str) {
            this.f54150a = str;
        }

        @Override // java.util.concurrent.Callable
        public List<InetAddress> call() {
            return C18196h2.m78669a(InterfaceC18320q2.f55926b.lookup(this.f54150a).m79686d());
        }
    }

    public C18099a3() {
        Logger.m76963i(f54140f, "DNS ThreadPool init!");
        this.f54145a = ExecutorsUtils.newFixedThreadPool(10, f54142h);
        this.f54146b = ExecutorsUtils.newCachedThreadPool(f54141g);
    }

    /* JADX INFO: renamed from: a */
    public static C18099a3 m77842a() {
        if (f54143i == null) {
            synchronized (C18099a3.class) {
                try {
                    if (f54143i == null) {
                        f54143i = new C18099a3();
                    }
                } finally {
                }
            }
        }
        return f54143i;
    }

    /* JADX INFO: renamed from: b */
    public C18385v2 m77845b(String str) throws UnknownHostException {
        C18385v2 c18385v2M77846c = m77846c(str);
        if (!C18196h2.m78675b(c18385v2M77846c)) {
            return c18385v2M77846c;
        }
        Logger.m76967w(f54140f, "dns failed from DnsCallable, domain is :" + str);
        throw new UnknownHostException(OooO00o.OooO00o("Broken system behaviour for dns lookup of ", str));
    }

    /* JADX INFO: renamed from: c */
    public C18385v2 m77846c(String str) {
        Future futurePutIfAbsent;
        C18385v2 c18385v2;
        ExecutorService executorService;
        synchronized (this.f54147c) {
            try {
                Future futureSubmit = this.f54148d.get(str);
                if (futureSubmit != null || (futurePutIfAbsent = this.f54148d.putIfAbsent(str, (futureSubmit = (executorService = this.f54146b).submit(new CallableC18333r2(str, executorService))))) == null) {
                    futurePutIfAbsent = futureSubmit;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            c18385v2 = (C18385v2) futurePutIfAbsent.get(C18196h2.m78666a(), TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            Logger.m76968w(f54140f, "query failed DNS_TIMEOUT", e);
            c18385v2 = null;
        }
        this.f54148d.remove(str);
        return c18385v2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[PHI: r3
      0x0033: PHI (r3v3 java.util.concurrent.Future) = (r3v2 java.util.concurrent.Future), (r3v8 java.util.concurrent.Future) binds: [B:5:0x0012, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<InetAddress> m77843a(String str) throws UnknownHostException {
        Future futurePutIfAbsent;
        List<InetAddress> arrayList = new ArrayList<>();
        synchronized (this.f54147c) {
            Future futureSubmit = this.f54149e.get(str);
            if (futureSubmit == null) {
                Logger.m76963i(f54140f, "future == null");
                futureSubmit = this.f54146b.submit(new a(str));
                futurePutIfAbsent = this.f54149e.putIfAbsent(str, futureSubmit);
                if (futurePutIfAbsent == null) {
                    futurePutIfAbsent = futureSubmit;
                }
                Logger.m76965v(f54140f, "localDnslookup future = " + futurePutIfAbsent);
            }
        }
        try {
            arrayList = (List) futurePutIfAbsent.get(C18196h2.m78666a(), TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            Logger.m76968w(f54140f, "query failed CANCEL_TIMEOUT", e);
        }
        this.f54149e.remove(str);
        if (arrayList != null && !arrayList.isEmpty()) {
            return arrayList;
        }
        Logger.m76967w(f54140f, "dns failed from local, domain is :" + str);
        throw new UnknownHostException(OooO00o.OooO00o("dns failed from local, domain is :", str));
    }

    /* JADX INFO: renamed from: a */
    public void m77844a(Runnable runnable) {
        String str;
        try {
            this.f54145a.execute(runnable);
        } catch (RejectedExecutionException unused) {
            str = "the runnable task cannot be accepted for execution";
            Logger.m76965v(f54140f, str);
        } catch (Throwable unused2) {
            str = "the runnable task cannot be accepted for throwable";
            Logger.m76965v(f54140f, str);
        }
    }
}
