package com.huawei.hms.network.embedded;

import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.w8 */
/* JADX INFO: loaded from: classes9.dex */
public class C18404w8 extends AbstractC18329qb {

    /* JADX INFO: renamed from: b */
    public boolean f56547b;

    public C18404w8(InterfaceC18220ic interfaceC18220ic) {
        super(interfaceC18220ic);
    }

    /* JADX INFO: renamed from: a */
    public void mo79770a(IOException iOException) {
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18329qb, com.huawei.hms.network.embedded.InterfaceC18220ic
    /* JADX INFO: renamed from: b */
    public void mo78029b(C18261lb c18261lb, long j) throws IOException {
        if (this.f56547b) {
            c18261lb.skip(j);
            return;
        }
        try {
            super.mo78029b(c18261lb, j);
        } catch (IOException e) {
            this.f56547b = true;
            mo79770a(e);
        }
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18329qb, com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f56547b) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.f56547b = true;
            mo79770a(e);
        }
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18329qb, com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
    public void flush() throws IOException {
        if (this.f56547b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.f56547b = true;
            mo79770a(e);
        }
    }
}
