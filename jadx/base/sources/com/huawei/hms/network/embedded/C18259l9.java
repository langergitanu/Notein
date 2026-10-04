package com.huawei.hms.network.embedded;

import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.l9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18259l9 extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public IOException f55625a;

    /* JADX INFO: renamed from: b */
    public IOException f55626b;

    public C18259l9(IOException iOException) {
        super(iOException);
        this.f55625a = iOException;
        this.f55626b = iOException;
    }

    /* JADX INFO: renamed from: a */
    public IOException m79064a() {
        return this.f55625a;
    }

    /* JADX INFO: renamed from: b */
    public IOException m79066b() {
        return this.f55626b;
    }

    /* JADX INFO: renamed from: a */
    public void m79065a(IOException iOException) {
        C18313p8.m79379a(this.f55625a, iOException);
        this.f55626b = iOException;
    }
}
