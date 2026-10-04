package com.huawei.hms.network.embedded;

import androidx.concurrent.futures.OooO00o;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.tb */
/* JADX INFO: loaded from: classes9.dex */
public final class C18368tb implements InterfaceC18220ic {

    /* JADX INFO: renamed from: a */
    public final InterfaceC18275mb f56252a;

    /* JADX INFO: renamed from: b */
    public final Deflater f56253b;

    /* JADX INFO: renamed from: c */
    public final C18316pb f56254c;

    /* JADX INFO: renamed from: d */
    public boolean f56255d;

    /* JADX INFO: renamed from: e */
    public final CRC32 f56256e = new CRC32();

    public C18368tb(InterfaceC18220ic interfaceC18220ic) {
        if (interfaceC18220ic == null) {
            throw new IllegalArgumentException("sink == null");
        }
        Deflater deflater = new Deflater(-1, true);
        this.f56253b = deflater;
        InterfaceC18275mb interfaceC18275mbM80006a = C18433yb.m80006a(interfaceC18220ic);
        this.f56252a = interfaceC18275mbM80006a;
        this.f56254c = new C18316pb(interfaceC18275mbM80006a, deflater);
        m79575d();
    }

    /* JADX INFO: renamed from: a */
    private void m79573a(C18261lb c18261lb, long j) {
        C18178fc c18178fc = c18261lb.f55630a;
        while (j > 0) {
            int iMin = (int) Math.min(j, c18178fc.f54867c - c18178fc.f54866b);
            this.f56256e.update(c18178fc.f54865a, c18178fc.f54866b, iMin);
            j -= (long) iMin;
            c18178fc = c18178fc.f54870f;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m79574c() throws IOException {
        this.f56252a.mo78259a((int) this.f56256e.getValue());
        this.f56252a.mo78259a((int) this.f56253b.getBytesRead());
    }

    /* JADX INFO: renamed from: d */
    private void m79575d() {
        C18261lb c18261lbMo78258a = this.f56252a.mo78258a();
        c18261lbMo78258a.writeShort(8075);
        c18261lbMo78258a.writeByte(8);
        c18261lbMo78258a.writeByte(0);
        c18261lbMo78258a.writeInt(0);
        c18261lbMo78258a.writeByte(0);
        c18261lbMo78258a.writeByte(0);
    }

    /* JADX INFO: renamed from: b */
    public final Deflater m79576b() {
        return this.f56253b;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f56255d) {
            return;
        }
        try {
            this.f56254c.m79402b();
            m79574c();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f56253b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f56252a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f56255d = true;
        if (th != null) {
            C18276mc.m79203a(th);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
    public void flush() throws IOException {
        this.f56254c.flush();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
    public C18248kc timeout() {
        return this.f56252a.timeout();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
    /* JADX INFO: renamed from: b */
    public void mo78029b(C18261lb c18261lb, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount < 0: "));
        }
        if (j == 0) {
            return;
        }
        m79573a(c18261lb, j);
        this.f56254c.mo78029b(c18261lb, j);
    }
}
