package com.huawei.hms.network.embedded;

import androidx.concurrent.futures.OooO00o;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ub */
/* JADX INFO: loaded from: classes9.dex */
public final class C18381ub implements InterfaceC18234jc {

    /* JADX INFO: renamed from: f */
    public static final byte f56318f = 1;

    /* JADX INFO: renamed from: g */
    public static final byte f56319g = 2;

    /* JADX INFO: renamed from: h */
    public static final byte f56320h = 3;

    /* JADX INFO: renamed from: i */
    public static final byte f56321i = 4;

    /* JADX INFO: renamed from: j */
    public static final byte f56322j = 0;

    /* JADX INFO: renamed from: k */
    public static final byte f56323k = 1;

    /* JADX INFO: renamed from: l */
    public static final byte f56324l = 2;

    /* JADX INFO: renamed from: m */
    public static final byte f56325m = 3;

    /* JADX INFO: renamed from: b */
    public final InterfaceC18289nb f56327b;

    /* JADX INFO: renamed from: c */
    public final Inflater f56328c;

    /* JADX INFO: renamed from: d */
    public final C18420xb f56329d;

    /* JADX INFO: renamed from: a */
    public int f56326a = 0;

    /* JADX INFO: renamed from: e */
    public final CRC32 f56330e = new CRC32();

    public C18381ub(InterfaceC18234jc interfaceC18234jc) {
        if (interfaceC18234jc == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f56328c = inflater;
        InterfaceC18289nb interfaceC18289nbM80007a = C18433yb.m80007a(interfaceC18234jc);
        this.f56327b = interfaceC18289nbM80007a;
        this.f56329d = new C18420xb(interfaceC18289nbM80007a, inflater);
    }

    /* JADX INFO: renamed from: a */
    private void m79655a(C18261lb c18261lb, long j, long j2) {
        C18178fc c18178fc = c18261lb.f55630a;
        while (true) {
            long j3 = c18178fc.f54867c - c18178fc.f54866b;
            if (j < j3) {
                break;
            }
            j -= j3;
            c18178fc = c18178fc.f54870f;
        }
        while (j2 > 0) {
            int i = (int) (((long) c18178fc.f54866b) + j);
            int iMin = (int) Math.min(c18178fc.f54867c - i, j2);
            this.f56330e.update(c18178fc.f54865a, i, iMin);
            j2 -= (long) iMin;
            c18178fc = c18178fc.f54870f;
            j = 0;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m79657g() throws IOException {
        this.f56327b.mo78393i(10L);
        byte bM79093j = this.f56327b.mo78374a().m79093j(3L);
        boolean z = ((bM79093j >> 1) & 1) == 1;
        if (z) {
            m79655a(this.f56327b.mo78374a(), 0L, 10L);
        }
        m79656a("ID1ID2", 8075, this.f56327b.readShort());
        this.f56327b.skip(8L);
        if (((bM79093j >> 2) & 1) == 1) {
            this.f56327b.mo78393i(2L);
            if (z) {
                m79655a(this.f56327b.mo78374a(), 0L, 2L);
            }
            long jMo78392i = this.f56327b.mo78374a().mo78392i();
            this.f56327b.mo78393i(jMo78392i);
            if (z) {
                m79655a(this.f56327b.mo78374a(), 0L, jMo78392i);
            }
            this.f56327b.skip(jMo78392i);
        }
        if (((bM79093j >> 3) & 1) == 1) {
            long jMo78368a = this.f56327b.mo78368a((byte) 0);
            if (jMo78368a == -1) {
                throw new EOFException();
            }
            if (z) {
                m79655a(this.f56327b.mo78374a(), 0L, jMo78368a + 1);
            }
            this.f56327b.skip(jMo78368a + 1);
        }
        if (((bM79093j >> 4) & 1) == 1) {
            long jMo78368a2 = this.f56327b.mo78368a((byte) 0);
            if (jMo78368a2 == -1) {
                throw new EOFException();
            }
            if (z) {
                m79655a(this.f56327b.mo78374a(), 0L, jMo78368a2 + 1);
            }
            this.f56327b.skip(jMo78368a2 + 1);
        }
        if (z) {
            m79656a("FHCRC", this.f56327b.mo78392i(), (short) this.f56330e.getValue());
            this.f56330e.reset();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m79658h() throws IOException {
        m79656a("CRC", this.f56327b.mo78381b(), (int) this.f56330e.getValue());
        m79656a("ISIZE", this.f56327b.mo78381b(), (int) this.f56328c.getBytesWritten());
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
    /* JADX INFO: renamed from: c */
    public long mo77914c(C18261lb c18261lb, long j) throws IOException {
        C18381ub c18381ub;
        if (j < 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount < 0: "));
        }
        if (j == 0) {
            return 0L;
        }
        if (this.f56326a == 0) {
            m79657g();
            this.f56326a = 1;
        }
        if (this.f56326a == 1) {
            long j2 = c18261lb.f55631b;
            long jMo77914c = this.f56329d.mo77914c(c18261lb, j);
            c18381ub = this;
            if (jMo77914c != -1) {
                c18381ub.m79655a(c18261lb, j2, jMo77914c);
                return jMo77914c;
            }
            c18381ub.f56326a = 2;
        } else {
            c18381ub = this;
        }
        if (c18381ub.f56326a == 2) {
            m79658h();
            c18381ub.f56326a = 3;
            if (!c18381ub.f56327b.mo78389f()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56329d.close();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
    public C18248kc timeout() {
        return this.f56327b.timeout();
    }

    /* JADX INFO: renamed from: a */
    private void m79656a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
