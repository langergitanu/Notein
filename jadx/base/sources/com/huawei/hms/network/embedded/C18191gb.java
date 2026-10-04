package com.huawei.hms.network.embedded;

import androidx.core.graphics.OooO0O0;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.huawei.hms.network.embedded.C18261lb;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.gb */
/* JADX INFO: loaded from: classes9.dex */
public final class C18191gb {

    /* JADX INFO: renamed from: a */
    public final boolean f54979a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC18289nb f54980b;

    /* JADX INFO: renamed from: c */
    public final a f54981c;

    /* JADX INFO: renamed from: d */
    public boolean f54982d;

    /* JADX INFO: renamed from: e */
    public int f54983e;

    /* JADX INFO: renamed from: f */
    public long f54984f;

    /* JADX INFO: renamed from: g */
    public boolean f54985g;

    /* JADX INFO: renamed from: h */
    public boolean f54986h;

    /* JADX INFO: renamed from: i */
    public final C18261lb f54987i = new C18261lb();

    /* JADX INFO: renamed from: j */
    public final C18261lb f54988j = new C18261lb();

    /* JADX INFO: renamed from: k */
    public final byte[] f54989k;

    /* JADX INFO: renamed from: l */
    public final C18261lb.c f54990l;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.gb$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo78347a(C18303ob c18303ob);

        /* JADX INFO: renamed from: a */
        void mo78349a(String str) throws IOException;

        /* JADX INFO: renamed from: b */
        void mo78354b(int i, String str);

        /* JADX INFO: renamed from: c */
        void mo78357c(C18303ob c18303ob);

        /* JADX INFO: renamed from: d */
        void mo78360d(C18303ob c18303ob) throws IOException;
    }

    public C18191gb(boolean z, InterfaceC18289nb interfaceC18289nb, a aVar) {
        if (interfaceC18289nb == null) {
            throw new NullPointerException("source == null");
        }
        if (aVar == null) {
            throw new NullPointerException("frameCallback == null");
        }
        this.f54979a = z;
        this.f54980b = interfaceC18289nb;
        this.f54981c = aVar;
        this.f54989k = z ? null : new byte[4];
        this.f54990l = z ? null : new C18261lb.c();
    }

    /* JADX INFO: renamed from: b */
    private void m78633b() throws IOException {
        short s;
        String strMo78398o;
        long j = this.f54984f;
        if (j > 0) {
            this.f54980b.mo78378a(this.f54987i, j);
            if (!this.f54979a) {
                this.f54987i.m79079a(this.f54990l);
                this.f54990l.m79105k(0L);
                C18177fb.m78506a(this.f54990l, this.f54989k);
                this.f54990l.close();
            }
        }
        switch (this.f54983e) {
            case 8:
                long jM79076B = this.f54987i.m79076B();
                if (jM79076B == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (jM79076B != 0) {
                    s = this.f54987i.readShort();
                    strMo78398o = this.f54987i.mo78398o();
                    String strM78504a = C18177fb.m78504a(s);
                    if (strM78504a != null) {
                        throw new ProtocolException(strM78504a);
                    }
                } else {
                    s = 1005;
                    strMo78398o = "";
                }
                this.f54981c.mo78354b(s, strMo78398o);
                this.f54982d = true;
                return;
            case 9:
                this.f54981c.mo78357c(this.f54987i.mo78401r());
                return;
            case 10:
                this.f54981c.mo78347a(this.f54987i.mo78401r());
                return;
            default:
                throw new ProtocolException(OooO0O0.OooO00o(this.f54983e, new StringBuilder("Unknown control opcode: ")));
        }
    }

    /* JADX INFO: renamed from: c */
    private void m78634c() throws IOException {
        if (this.f54982d) {
            throw new IOException("closed");
        }
        long jMo79003f = this.f54980b.timeout().mo79003f();
        this.f54980b.timeout().mo78998b();
        try {
            byte b = this.f54980b.readByte();
            this.f54980b.timeout().mo78999b(jMo79003f, TimeUnit.NANOSECONDS);
            this.f54983e = b & 15;
            boolean z = (b & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
            this.f54985g = z;
            boolean z2 = (b & 8) != 0;
            this.f54986h = z2;
            if (z2 && !z) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z3 = (b & SignedBytes.MAX_POWER_OF_TWO) != 0;
            boolean z4 = (b & 32) != 0;
            boolean z5 = (b & 16) != 0;
            if (z3 || z4 || z5) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            byte b2 = this.f54980b.readByte();
            boolean z6 = (b2 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
            boolean z7 = this.f54979a;
            if (z6 == z7) {
                throw new ProtocolException(z7 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = b2 & Ascii.DEL;
            this.f54984f = j;
            if (j == 126) {
                this.f54984f = ((long) this.f54980b.readShort()) & C18177fb.f54859s;
            } else if (j == 127) {
                long j2 = this.f54980b.readLong();
                this.f54984f = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f54984f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f54986h && this.f54984f > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z6) {
                this.f54980b.readFully(this.f54989k);
            }
        } catch (Throwable th) {
            this.f54980b.timeout().mo78999b(jMo79003f, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m78635d() throws IOException {
        while (!this.f54982d) {
            long j = this.f54984f;
            if (j > 0) {
                this.f54980b.mo78378a(this.f54988j, j);
                if (!this.f54979a) {
                    this.f54988j.m79079a(this.f54990l);
                    this.f54990l.m79105k(this.f54988j.m79076B() - this.f54984f);
                    C18177fb.m78506a(this.f54990l, this.f54989k);
                    this.f54990l.close();
                }
            }
            if (this.f54985g) {
                return;
            }
            m78637f();
            if (this.f54983e != 0) {
                throw new ProtocolException(OooO0O0.OooO00o(this.f54983e, new StringBuilder("Expected continuation opcode. Got: ")));
            }
        }
        throw new IOException("closed");
    }

    /* JADX INFO: renamed from: e */
    private void m78636e() throws IOException {
        int i = this.f54983e;
        if (i != 1 && i != 2) {
            throw new ProtocolException(OooO0O0.OooO00o(i, new StringBuilder("Unknown opcode: ")));
        }
        m78635d();
        if (i == 1) {
            this.f54981c.mo78349a(this.f54988j.mo78398o());
        } else {
            this.f54981c.mo78360d(this.f54988j.mo78401r());
        }
    }

    /* JADX INFO: renamed from: f */
    private void m78637f() throws IOException {
        while (!this.f54982d) {
            m78634c();
            if (!this.f54986h) {
                return;
            } else {
                m78633b();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78638a() throws IOException {
        m78634c();
        if (this.f54986h) {
            m78633b();
        } else {
            m78636e();
        }
    }
}
