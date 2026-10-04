package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.ReflectionUtils;
import com.huawei.hms.network.embedded.C18118b8;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.l5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18255l5 {

    /* JADX INFO: renamed from: g */
    public static final String f55596g = "OkHttpClientGlobal";

    /* JADX INFO: renamed from: h */
    public static C18255l5 f55597h = null;

    /* JADX INFO: renamed from: i */
    public static final int f55598i = 200;

    /* JADX INFO: renamed from: j */
    public static final int f55599j = 32;

    /* JADX INFO: renamed from: k */
    public static final int f55600k = 8;

    /* JADX INFO: renamed from: l */
    public static final int f55601l = 5;

    /* JADX INFO: renamed from: m */
    public static final TimeUnit f55602m = TimeUnit.MINUTES;

    /* JADX INFO: renamed from: a */
    public int f55603a;

    /* JADX INFO: renamed from: b */
    public long f55604b;

    /* JADX INFO: renamed from: c */
    public TimeUnit f55605c;

    /* JADX INFO: renamed from: d */
    public C18118b8 f55606d;

    /* JADX INFO: renamed from: e */
    public Deque<C18217i9> f55607e;

    /* JADX INFO: renamed from: f */
    public C18231j9 f55608f;

    public C18255l5() {
        this(8, 5L, f55602m);
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m79043a() {
        try {
            if (this.f55608f == null) {
                getConnectionPool();
            }
            C18231j9 c18231j9 = this.f55608f;
            if (c18231j9 != null) {
                Object fieldObj = ReflectionUtils.getFieldObj(c18231j9, "connections");
                if (fieldObj instanceof ArrayDeque) {
                    this.f55607e = ((ArrayDeque) fieldObj).clone();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized C18255l5 getInstance() {
        try {
            if (f55597h == null) {
                f55597h = new C18255l5();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f55597h;
    }

    public static synchronized void init(int i, long j, TimeUnit timeUnit) {
        try {
            if (f55597h == null) {
                f55597h = new C18255l5(i, j, timeUnit);
            } else if (getInstance().getMaxIdleConnections() < i && getInstance().getConnectionTimeUnit().toMillis(getInstance().getConnectionKeepAliveDuration()) < timeUnit.toMillis(j)) {
                getInstance().m79044a(i, j, timeUnit);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void evictAll() {
        C18118b8 c18118b8 = this.f55606d;
        if (c18118b8 != null) {
            c18118b8.m77946g().m78976b();
        }
    }

    public synchronized C18118b8 getClient() {
        try {
            if (this.f55606d == null) {
                C18390v7 c18390v7 = new C18390v7();
                c18390v7.mo79159b(200);
                c18390v7.m79740e(32);
                this.f55606d = new C18118b8.c().m77979a(new C18243k7(this.f55603a, this.f55604b, this.f55605c)).m77981a(c18390v7).m78001b(C18313p8.m79373a(EnumC18132c8.HTTP_2, EnumC18132c8.HTTP_1_1)).m78004c(C18375u5.getInstance().getChainInterval(), TimeUnit.MILLISECONDS).m77983a(C18227j5.getFactory()).m77995a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f55606d;
    }

    public synchronized long getConnectionKeepAliveDuration() {
        return this.f55604b;
    }

    public synchronized void getConnectionPool() {
        Object fieldObj = ReflectionUtils.getFieldObj(getInstance().getClient().m77946g(), "delegate");
        if (fieldObj instanceof C18231j9) {
            this.f55608f = (C18231j9) fieldObj;
        }
    }

    public synchronized TimeUnit getConnectionTimeUnit() {
        return this.f55605c;
    }

    public synchronized List<String> getHostsInConnectionPool() {
        ArrayList arrayList;
        arrayList = new ArrayList(8);
        m79043a();
        if (this.f55607e != null) {
            Logger.m76963i(f55596g, "connection pool size is: " + this.f55607e.size());
            Iterator<C18217i9> it = this.f55607e.iterator();
            while (it.hasNext()) {
                String strM79929h = it.next().mo78789b().m78766a().m77862l().m79929h();
                if (!arrayList.contains(strM79929h)) {
                    arrayList.add(strM79929h);
                }
            }
        }
        return arrayList;
    }

    public synchronized int getMaxIdleConnections() {
        return this.f55603a;
    }

    public C18255l5(int i, long j, TimeUnit timeUnit) {
        this.f55603a = 8;
        this.f55603a = i <= 0 ? 8 : i;
        if (j <= 0) {
            this.f55604b = 5L;
            this.f55605c = f55602m;
        } else {
            this.f55604b = j;
            this.f55605c = timeUnit;
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m79044a(int i, long j, TimeUnit timeUnit) {
        try {
            if (this.f55608f == null) {
                getConnectionPool();
            }
            C18231j9 c18231j9 = this.f55608f;
            if (c18231j9 != null) {
                try {
                    ReflectionUtils.getField(c18231j9, "maxIdleConnections").set(this.f55608f, Integer.valueOf(i));
                    this.f55603a = i;
                } catch (IllegalAccessException unused) {
                    Logger.m76967w(f55596g, "maxIdleConnections set value failed !!!");
                }
                try {
                    ReflectionUtils.getField(this.f55608f, "keepAliveDurationNs").set(this.f55608f, Long.valueOf(timeUnit.toNanos(j)));
                    this.f55604b = j;
                    this.f55605c = timeUnit;
                } catch (IllegalAccessException unused2) {
                    Logger.m76967w(f55596g, "connectionTimeUnit and connectionKeepAliveDuration set value failed !!!");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
