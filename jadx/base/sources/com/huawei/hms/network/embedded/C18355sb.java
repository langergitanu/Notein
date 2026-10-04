package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.sb */
/* JADX INFO: loaded from: classes9.dex */
public class C18355sb extends C18248kc {

    /* JADX INFO: renamed from: e */
    public C18248kc f56139e;

    public C18355sb(C18248kc c18248kc) {
        if (c18248kc == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f56139e = c18248kc;
    }

    @Override // com.huawei.hms.network.embedded.C18248kc
    /* JADX INFO: renamed from: a */
    public C18248kc mo78994a() {
        return this.f56139e.mo78994a();
    }

    @Override // com.huawei.hms.network.embedded.C18248kc
    /* JADX INFO: renamed from: b */
    public C18248kc mo78998b() {
        return this.f56139e.mo78998b();
    }

    @Override // com.huawei.hms.network.embedded.C18248kc
    /* JADX INFO: renamed from: c */
    public long mo79000c() {
        return this.f56139e.mo79000c();
    }

    @Override // com.huawei.hms.network.embedded.C18248kc
    /* JADX INFO: renamed from: d */
    public boolean mo79001d() {
        return this.f56139e.mo79001d();
    }

    @Override // com.huawei.hms.network.embedded.C18248kc
    /* JADX INFO: renamed from: e */
    public void mo79002e() throws IOException {
        this.f56139e.mo79002e();
    }

    @Override // com.huawei.hms.network.embedded.C18248kc
    /* JADX INFO: renamed from: f */
    public long mo79003f() {
        return this.f56139e.mo79003f();
    }

    /* JADX INFO: renamed from: g */
    public final C18248kc m79539g() {
        return this.f56139e;
    }

    @Override // com.huawei.hms.network.embedded.C18248kc
    /* JADX INFO: renamed from: a */
    public C18248kc mo78995a(long j) {
        return this.f56139e.mo78995a(j);
    }

    @Override // com.huawei.hms.network.embedded.C18248kc
    /* JADX INFO: renamed from: b */
    public C18248kc mo78999b(long j, TimeUnit timeUnit) {
        return this.f56139e.mo78999b(j, timeUnit);
    }

    /* JADX INFO: renamed from: a */
    public final C18355sb m79538a(C18248kc c18248kc) {
        if (c18248kc == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f56139e = c18248kc;
        return this;
    }
}
