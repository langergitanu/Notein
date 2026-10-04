package com.huawei.hms.network.embedded;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.cc */
/* JADX INFO: loaded from: classes9.dex */
public final class C18136cc extends C18248kc {

    /* JADX INFO: renamed from: e */
    public C18248kc f54502e;

    /* JADX INFO: renamed from: f */
    public boolean f54503f;

    /* JADX INFO: renamed from: g */
    public long f54504g;

    /* JADX INFO: renamed from: h */
    public long f54505h;

    /* JADX INFO: renamed from: a */
    public void m78152a(C18248kc c18248kc) {
        long jMo79000c;
        this.f54502e = c18248kc;
        boolean zMo79001d = c18248kc.mo79001d();
        this.f54503f = zMo79001d;
        this.f54504g = zMo79001d ? c18248kc.mo79000c() : -1L;
        long jMo79003f = c18248kc.mo79003f();
        this.f54505h = jMo79003f;
        c18248kc.mo78999b(C18248kc.m78993a(jMo79003f, mo79003f()), TimeUnit.NANOSECONDS);
        if (this.f54503f && mo79001d()) {
            jMo79000c = Math.min(mo79000c(), this.f54504g);
        } else if (!mo79001d()) {
            return;
        } else {
            jMo79000c = mo79000c();
        }
        c18248kc.mo78995a(jMo79000c);
    }

    /* JADX INFO: renamed from: g */
    public void m78153g() {
        this.f54502e.mo78999b(this.f54505h, TimeUnit.NANOSECONDS);
        if (this.f54503f) {
            this.f54502e.mo78995a(this.f54504g);
        } else {
            this.f54502e.mo78994a();
        }
    }
}
