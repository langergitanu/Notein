package com.huawei.hms.network.embedded;

import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.qb */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18329qb implements InterfaceC18220ic {

    /* JADX INFO: renamed from: a */
    public final InterfaceC18220ic f55983a;

    public AbstractC18329qb(InterfaceC18220ic interfaceC18220ic) {
        if (interfaceC18220ic == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f55983a = interfaceC18220ic;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC18220ic m79435b() {
        return this.f55983a;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f55983a.close();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
    public void flush() throws IOException {
        this.f55983a.flush();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
    public C18248kc timeout() {
        return this.f55983a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f55983a.toString() + ")";
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
    /* JADX INFO: renamed from: b */
    public void mo78029b(C18261lb c18261lb, long j) throws IOException {
        this.f55983a.mo78029b(c18261lb, j);
    }
}
