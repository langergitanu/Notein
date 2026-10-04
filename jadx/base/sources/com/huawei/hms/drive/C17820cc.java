package com.huawei.hms.drive;

import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.drive.cc */
/* JADX INFO: loaded from: classes6.dex */
public final class C17820cc extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private IOException f53074a;

    /* JADX INFO: renamed from: b */
    private IOException f53075b;

    public C17820cc(IOException iOException) {
        super(iOException);
        this.f53074a = iOException;
        this.f53075b = iOException;
    }

    /* JADX INFO: renamed from: a */
    public IOException m76430a() {
        return this.f53074a;
    }

    /* JADX INFO: renamed from: b */
    public IOException m76432b() {
        return this.f53075b;
    }

    /* JADX INFO: renamed from: a */
    public void m76431a(IOException iOException) {
        C17806bp.m76339a((Throwable) this.f53074a, (Throwable) iOException);
        this.f53075b = iOException;
    }
}
