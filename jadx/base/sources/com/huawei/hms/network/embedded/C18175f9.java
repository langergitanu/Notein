package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18163eb;
import com.huawei.hms.network.embedded.C18188g8;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.f9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18175f9 {

    /* JADX INFO: renamed from: a */
    public final C18287n9 f54749a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC18159e7 f54750b;

    /* JADX INFO: renamed from: c */
    public final AbstractC18338r7 f54751c;

    /* JADX INFO: renamed from: d */
    public final C18189g9 f54752d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC18327q9 f54753e;

    /* JADX INFO: renamed from: f */
    public boolean f54754f;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.f9$a */
    public final class a extends AbstractC18329qb {

        /* JADX INFO: renamed from: b */
        public boolean f54755b;

        /* JADX INFO: renamed from: c */
        public long f54756c;

        /* JADX INFO: renamed from: d */
        public long f54757d;

        /* JADX INFO: renamed from: e */
        public boolean f54758e;

        public a(InterfaceC18220ic interfaceC18220ic, long j) {
            super(interfaceC18220ic);
            this.f54756c = j;
        }

        /* JADX INFO: renamed from: a */
        private IOException m78440a(IOException iOException) {
            if (this.f54755b) {
                return iOException;
            }
            this.f54755b = true;
            return C18175f9.this.m78423a(this.f54757d, false, true, iOException);
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18329qb, com.huawei.hms.network.embedded.InterfaceC18220ic
        /* JADX INFO: renamed from: b */
        public void mo78029b(C18261lb c18261lb, long j) throws IOException {
            if (this.f54758e) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f54756c;
            if (j2 == -1 || this.f54757d + j <= j2) {
                try {
                    super.mo78029b(c18261lb, j);
                    this.f54757d += j;
                    return;
                } catch (IOException e) {
                    throw m78440a(e);
                }
            }
            throw new ProtocolException("expected " + this.f54756c + " bytes but received " + (this.f54757d + j));
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18329qb, com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f54758e) {
                return;
            }
            this.f54758e = true;
            long j = this.f54756c;
            if (j != -1 && this.f54757d != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m78440a(null);
            } catch (IOException e) {
                throw m78440a(e);
            }
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18329qb, com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw m78440a(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.f9$b */
    public final class b extends AbstractC18342rb {

        /* JADX INFO: renamed from: b */
        public final long f54760b;

        /* JADX INFO: renamed from: c */
        public long f54761c;

        /* JADX INFO: renamed from: d */
        public boolean f54762d;

        /* JADX INFO: renamed from: e */
        public boolean f54763e;

        public b(InterfaceC18234jc interfaceC18234jc, long j) {
            super(interfaceC18234jc);
            this.f54760b = j;
            if (j == 0) {
                m78441a(null);
            }
        }

        /* JADX INFO: renamed from: a */
        public IOException m78441a(IOException iOException) {
            if (this.f54762d) {
                return iOException;
            }
            this.f54762d = true;
            return C18175f9.this.m78423a(this.f54761c, true, false, iOException);
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18342rb, com.huawei.hms.network.embedded.InterfaceC18234jc
        /* JADX INFO: renamed from: c */
        public long mo77914c(C18261lb c18261lb, long j) throws IOException {
            if (this.f54763e) {
                throw new IllegalStateException("closed");
            }
            try {
                long jMo77914c = m79467g().mo77914c(c18261lb, j);
                if (jMo77914c == -1) {
                    m78441a(null);
                    return -1L;
                }
                long j2 = this.f54761c + jMo77914c;
                long j3 = this.f54760b;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.f54760b + " bytes but received " + j2);
                }
                this.f54761c = j2;
                if (j2 == j3) {
                    m78441a(null);
                }
                return jMo77914c;
            } catch (IOException e) {
                throw m78441a(e);
            }
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18342rb, com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f54763e) {
                return;
            }
            this.f54763e = true;
            try {
                super.close();
                m78441a(null);
            } catch (IOException e) {
                throw m78441a(e);
            }
        }
    }

    public C18175f9(C18287n9 c18287n9, InterfaceC18159e7 interfaceC18159e7, AbstractC18338r7 abstractC18338r7, C18189g9 c18189g9, InterfaceC18327q9 interfaceC18327q9) {
        this.f54749a = c18287n9;
        this.f54750b = interfaceC18159e7;
        this.f54751c = abstractC18338r7;
        this.f54752d = c18189g9;
        this.f54753e = interfaceC18327q9;
    }

    /* JADX INFO: renamed from: a */
    public C18188g8.a m78420a(boolean z) throws IOException {
        try {
            C18188g8.a aVarMo78625a = this.f54753e.mo78625a(z);
            if (aVarMo78625a == null) {
                return aVarMo78625a;
            }
            AbstractC18286n8.f55777a.mo77970a(aVarMo78625a, this);
            return aVarMo78625a;
        } catch (IOException e) {
            this.f54751c.responseFailed(this.f54750b, e);
            m78426a(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public C18217i9 m78427b() {
        return this.f54753e.mo78626a();
    }

    /* JADX INFO: renamed from: c */
    public void m78429c() {
        this.f54753e.cancel();
        this.f54749a.exchangeMessageDone(this, true, true, null);
    }

    /* JADX INFO: renamed from: d */
    public void m78430d() throws IOException {
        try {
            this.f54753e.mo78631c();
        } catch (IOException e) {
            this.f54751c.requestFailed(this.f54750b, e);
            m78426a(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m78431e() throws IOException {
        try {
            this.f54753e.mo78632d();
        } catch (IOException e) {
            this.f54751c.requestFailed(this.f54750b, e);
            m78426a(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m78432f() {
        return this.f54754f;
    }

    /* JADX INFO: renamed from: g */
    public C18163eb.f m78433g() throws SocketException {
        this.f54749a.timeoutEarlyExit();
        return this.f54753e.mo78626a().m78779a(this);
    }

    /* JADX INFO: renamed from: h */
    public void m78434h() {
        this.f54753e.mo78626a().m78795h();
    }

    /* JADX INFO: renamed from: i */
    public void m78435i() {
        this.f54749a.exchangeMessageDone(this, true, false, null);
    }

    /* JADX INFO: renamed from: j */
    public void m78436j() {
        this.f54751c.responseHeadersStart(this.f54750b);
    }

    /* JADX INFO: renamed from: k */
    public void m78437k() {
        this.f54749a.timeoutEarlyExit();
    }

    /* JADX INFO: renamed from: l */
    public C18377u7 m78438l() throws IOException {
        return this.f54753e.mo78630b();
    }

    /* JADX INFO: renamed from: m */
    public void m78439m() {
        m78423a(-1L, true, true, null);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC18202h8 m78421a(C18188g8 c18188g8) throws IOException {
        try {
            this.f54751c.responseBodyStart(this.f54750b);
            String strM78582b = c18188g8.m78582b("Content-Type");
            long jMo78624a = this.f54753e.mo78624a(c18188g8);
            return new C18392v9(strM78582b, jMo78624a, C18433yb.m80007a(new b(this.f54753e.mo78629b(c18188g8), jMo78624a)));
        } catch (IOException e) {
            this.f54751c.responseFailed(this.f54750b, e);
            m78426a(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m78428b(C18188g8 c18188g8) {
        this.f54751c.responseHeadersEnd(this.f54750b, c18188g8);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC18220ic m78422a(C18160e8 c18160e8, boolean z) throws IOException {
        this.f54754f = z;
        long jContentLength = c18160e8.m78300b().contentLength();
        this.f54751c.requestBodyStart(this.f54750b);
        return new a(this.f54753e.mo78627a(c18160e8, jContentLength), jContentLength);
    }

    /* JADX INFO: renamed from: a */
    public IOException m78423a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            m78426a(iOException);
        }
        if (z2) {
            AbstractC18338r7 abstractC18338r7 = this.f54751c;
            InterfaceC18159e7 interfaceC18159e7 = this.f54750b;
            if (iOException != null) {
                abstractC18338r7.requestFailed(interfaceC18159e7, iOException);
            } else {
                abstractC18338r7.requestBodyEnd(interfaceC18159e7, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.f54751c.responseFailed(this.f54750b, iOException);
            } else {
                this.f54751c.responseBodyEnd(this.f54750b, j);
            }
        }
        return this.f54749a.exchangeMessageDone(this, z2, z, iOException);
    }

    /* JADX INFO: renamed from: a */
    public void m78424a() {
        this.f54753e.cancel();
    }

    /* JADX INFO: renamed from: a */
    public void m78425a(C18160e8 c18160e8) throws IOException {
        try {
            this.f54751c.requestHeadersStart(this.f54750b);
            this.f54753e.mo78628a(c18160e8);
            this.f54751c.requestHeadersEnd(this.f54750b, c18160e8);
        } catch (IOException e) {
            this.f54751c.requestFailed(this.f54750b, e);
            m78426a(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78426a(IOException iOException) {
        this.f54752d.m78621e();
        this.f54753e.mo78626a().m78784a(iOException);
    }
}
