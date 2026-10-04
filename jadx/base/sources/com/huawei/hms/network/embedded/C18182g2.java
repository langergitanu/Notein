package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Utils;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.g2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18182g2 {

    /* JADX INFO: renamed from: e */
    public static final String f54904e = "DnsInfo";

    /* JADX INFO: renamed from: a */
    public int f54905a;

    /* JADX INFO: renamed from: b */
    public long f54906b = 0;

    /* JADX INFO: renamed from: c */
    public long f54907c = 0;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f54908d = new AtomicLong(0);

    /* JADX INFO: renamed from: a */
    public void m78554a() {
        this.f54908d.set(0L);
        this.f54907c = 0L;
    }

    /* JADX INFO: renamed from: b */
    public long m78557b() {
        return this.f54906b;
    }

    /* JADX INFO: renamed from: c */
    public long m78558c() {
        if (this.f54907c == 0) {
            this.f54907c = Utils.getCurrentTime(true);
        }
        return this.f54907c;
    }

    /* JADX INFO: renamed from: d */
    public int m78559d() {
        return this.f54905a;
    }

    /* JADX INFO: renamed from: e */
    public long m78560e() {
        return this.f54908d.incrementAndGet();
    }

    /* JADX INFO: renamed from: a */
    public void m78555a(int i) {
        this.f54905a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m78556a(long j) {
        this.f54906b = j;
    }
}
