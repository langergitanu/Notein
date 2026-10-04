package com.huawei.hms.network.embedded;

import androidx.concurrent.futures.OooO00o;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ac */
/* JADX INFO: loaded from: classes9.dex */
public final class C18108ac implements InterfaceC18234jc {

    /* JADX INFO: renamed from: a */
    public final InterfaceC18289nb f54223a;

    /* JADX INFO: renamed from: b */
    public final C18261lb f54224b;

    /* JADX INFO: renamed from: c */
    public C18178fc f54225c;

    /* JADX INFO: renamed from: d */
    public int f54226d;

    /* JADX INFO: renamed from: e */
    public boolean f54227e;

    /* JADX INFO: renamed from: f */
    public long f54228f;

    public C18108ac(InterfaceC18289nb interfaceC18289nb) {
        this.f54223a = interfaceC18289nb;
        C18261lb c18261lbMo78374a = interfaceC18289nb.mo78374a();
        this.f54224b = c18261lbMo78374a;
        C18178fc c18178fc = c18261lbMo78374a.f55630a;
        this.f54225c = c18178fc;
        this.f54226d = c18178fc != null ? c18178fc.f54866b : -1;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
    /* JADX INFO: renamed from: c */
    public long mo77914c(C18261lb c18261lb, long j) throws IOException {
        C18178fc c18178fc;
        C18178fc c18178fc2;
        if (j < 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount < 0: "));
        }
        if (this.f54227e) {
            throw new IllegalStateException("closed");
        }
        C18178fc c18178fc3 = this.f54225c;
        if (c18178fc3 != null && (c18178fc3 != (c18178fc2 = this.f54224b.f55630a) || this.f54226d != c18178fc2.f54866b)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f54223a.mo78391g(this.f54228f + 1)) {
            return -1L;
        }
        if (this.f54225c == null && (c18178fc = this.f54224b.f55630a) != null) {
            this.f54225c = c18178fc;
            this.f54226d = c18178fc.f54866b;
        }
        long jMin = Math.min(j, this.f54224b.f55631b - this.f54228f);
        this.f54224b.m79080a(c18261lb, this.f54228f, jMin);
        this.f54228f += jMin;
        return jMin;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f54227e = true;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
    public C18248kc timeout() {
        return this.f54223a.timeout();
    }
}
