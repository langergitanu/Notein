package com.huawei.hms.network.embedded;

import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.rb */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18342rb implements InterfaceC18234jc {

    /* JADX INFO: renamed from: a */
    public final InterfaceC18234jc f56048a;

    public AbstractC18342rb(InterfaceC18234jc interfaceC18234jc) {
        if (interfaceC18234jc == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f56048a = interfaceC18234jc;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
    /* JADX INFO: renamed from: c */
    public long mo77914c(C18261lb c18261lb, long j) throws IOException {
        return this.f56048a.mo77914c(c18261lb, j);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56048a.close();
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC18234jc m79467g() {
        return this.f56048a;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
    public C18248kc timeout() {
        return this.f56048a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f56048a.toString() + ")";
    }
}
