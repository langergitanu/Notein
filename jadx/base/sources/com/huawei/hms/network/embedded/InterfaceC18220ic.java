package com.huawei.hms.network.embedded;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ic */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC18220ic extends Closeable, Flushable {
    /* JADX INFO: renamed from: b */
    void mo78029b(C18261lb c18261lb, long j) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    C18248kc timeout();
}
