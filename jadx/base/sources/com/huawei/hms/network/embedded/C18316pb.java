package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.pb */
/* JADX INFO: loaded from: classes9.dex */
public final class C18316pb implements InterfaceC18220ic {

    /* JADX INFO: renamed from: a */
    public final InterfaceC18275mb f55905a;

    /* JADX INFO: renamed from: b */
    public final Deflater f55906b;

    /* JADX INFO: renamed from: c */
    public boolean f55907c;

    public C18316pb(InterfaceC18220ic interfaceC18220ic, Deflater deflater) {
        this(C18433yb.m80006a(interfaceC18220ic), deflater);
    }

    /* JADX INFO: renamed from: a */
    private void m79401a(boolean z) throws IOException {
        C18178fc c18178fcM79090e;
        C18261lb c18261lbMo78258a = this.f55905a.mo78258a();
        while (true) {
            c18178fcM79090e = c18261lbMo78258a.m79090e(1);
            Deflater deflater = this.f55906b;
            byte[] bArr = c18178fcM79090e.f54865a;
            int i = c18178fcM79090e.f54867c;
            int i2 = 8192 - i;
            int iDeflate = z ? deflater.deflate(bArr, i, i2, 2) : deflater.deflate(bArr, i, i2);
            if (iDeflate > 0) {
                c18178fcM79090e.f54867c += iDeflate;
                c18261lbMo78258a.f55631b += (long) iDeflate;
                this.f55905a.mo78273n();
            } else if (this.f55906b.needsInput()) {
                break;
            }
        }
        if (c18178fcM79090e.f54866b == c18178fcM79090e.f54867c) {
            c18261lbMo78258a.f55630a = c18178fcM79090e.m78512b();
            C18192gc.m78640a(c18178fcM79090e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m79402b() throws IOException {
        this.f55906b.finish();
        m79401a(false);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f55907c) {
            return;
        }
        try {
            m79402b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f55906b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f55905a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f55907c = true;
        if (th != null) {
            C18276mc.m79203a(th);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
    public void flush() throws IOException {
        m79401a(true);
        this.f55905a.flush();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
    public C18248kc timeout() {
        return this.f55905a.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f55905a + ")";
    }

    public C18316pb(InterfaceC18275mb interfaceC18275mb, Deflater deflater) {
        if (interfaceC18275mb == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f55905a = interfaceC18275mb;
        this.f55906b = deflater;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
    /* JADX INFO: renamed from: b */
    public void mo78029b(C18261lb c18261lb, long j) throws IOException {
        C18276mc.m79202a(c18261lb.f55631b, 0L, j);
        while (j > 0) {
            C18178fc c18178fc = c18261lb.f55630a;
            int iMin = (int) Math.min(j, c18178fc.f54867c - c18178fc.f54866b);
            this.f55906b.setInput(c18178fc.f54865a, c18178fc.f54866b, iMin);
            m79401a(false);
            long j2 = iMin;
            c18261lb.f55631b -= j2;
            int i = c18178fc.f54866b + iMin;
            c18178fc.f54866b = i;
            if (i == c18178fc.f54867c) {
                c18261lb.f55630a = c18178fc.m78512b();
                C18192gc.m78640a(c18178fc);
            }
            j -= j2;
        }
    }
}
