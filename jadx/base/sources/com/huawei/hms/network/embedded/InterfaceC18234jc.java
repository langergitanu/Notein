package com.huawei.hms.network.embedded;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.jc */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC18234jc extends Closeable {
    /* JADX INFO: renamed from: c */
    long mo77914c(C18261lb c18261lb, long j) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    C18248kc timeout();
}
