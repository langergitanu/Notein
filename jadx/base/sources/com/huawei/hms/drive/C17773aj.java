package com.huawei.hms.drive;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.drive.aj */
/* JADX INFO: loaded from: classes6.dex */
public final class C17773aj implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    final InterfaceC17812bv f52561a;

    /* JADX INFO: renamed from: b */
    final C17811bu f52562b;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f52562b.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f52562b.flush();
    }
}
