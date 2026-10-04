package com.huawei.hms.drive;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.drive.C17788ay;
import com.huawei.hms.drive.C17800bj;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.OooOOO0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34530OooOO0O;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34547OooOoo;
import oOo00OoO.InterfaceC34525OooO0o;
import oOo00OoO.InterfaceC34526OooO0o0;
import oOo00OoO.InterfaceC34544OooOoO;
import oOo00OoO.InterfaceC34548OooOoo0;

/* JADX INFO: renamed from: com.huawei.hms.drive.cr */
/* JADX INFO: loaded from: classes6.dex */
public final class C17835cr implements InterfaceC17825ch {

    /* JADX INFO: renamed from: a */
    final C17795be f53139a;

    /* JADX INFO: renamed from: b */
    final C17822ce f53140b;

    /* JADX INFO: renamed from: c */
    final InterfaceC34525OooO0o f53141c;

    /* JADX INFO: renamed from: d */
    final InterfaceC34526OooO0o0 f53142d;

    /* JADX INFO: renamed from: e */
    int f53143e = 0;

    /* JADX INFO: renamed from: f */
    private long f53144f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* JADX INFO: renamed from: com.huawei.hms.drive.cr$a */
    public abstract class a implements InterfaceC34548OooOoo0 {

        /* JADX INFO: renamed from: a */
        protected final C34530OooOO0O f53145a;

        /* JADX INFO: renamed from: b */
        protected boolean f53146b;

        /* JADX INFO: renamed from: c */
        protected long f53147c;

        private a() {
            this.f53145a = new C34530OooOO0O(C17835cr.this.f53141c.timeout());
            this.f53147c = 0L;
        }

        /* JADX INFO: renamed from: a */
        public final void m76524a(boolean z, IOException iOException) throws IOException {
            C17835cr c17835cr = C17835cr.this;
            int i = c17835cr.f53143e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException("state: " + C17835cr.this.f53143e);
            }
            c17835cr.m76519a(this.f53145a);
            C17835cr c17835cr2 = C17835cr.this;
            c17835cr2.f53143e = 6;
            C17822ce c17822ce = c17835cr2.f53140b;
            if (c17822ce != null) {
                c17822ce.m76464a(!z, c17835cr2, this.f53147c, iOException);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close() throws IOException;

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public long read(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
            try {
                long j2 = C17835cr.this.f53141c.read(c34524OooO0Oo, j);
                if (j2 <= 0) {
                    return j2;
                }
                this.f53147c += j2;
                return j2;
            } catch (IOException e) {
                m76524a(false, e);
                throw e;
            }
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public C34547OooOoo timeout() {
            return this.f53145a;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.cr$b */
    public final class b implements InterfaceC34544OooOoO {

        /* JADX INFO: renamed from: b */
        private final C34530OooOO0O f53150b;

        /* JADX INFO: renamed from: c */
        private boolean f53151c;

        public b() {
            this.f53150b = new C34530OooOO0O(C17835cr.this.f53142d.timeout());
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f53151c) {
                return;
            }
            this.f53151c = true;
            C17835cr.this.f53142d.o00000Oo("0\r\n\r\n");
            C17835cr.this.m76519a(this.f53150b);
            C17835cr.this.f53143e = 3;
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f53151c) {
                return;
            }
            C17835cr.this.f53142d.flush();
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO
        public C34547OooOoo timeout() {
            return this.f53150b;
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO
        public void write(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
            if (this.f53151c) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            C17835cr.this.f53142d.Oooooo(j);
            C17835cr.this.f53142d.o00000Oo(IOUtils.LINE_SEPARATOR_WINDOWS);
            C17835cr.this.f53142d.write(c34524OooO0Oo, j);
            C17835cr.this.f53142d.o00000Oo(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.cr$c */
    public class c extends a {

        /* JADX INFO: renamed from: f */
        private final C17792bb f53153f;

        /* JADX INFO: renamed from: g */
        private long f53154g;

        /* JADX INFO: renamed from: h */
        private boolean f53155h;

        public c(C17792bb c17792bb) {
            super();
            this.f53154g = -1L;
            this.f53155h = true;
            this.f53153f = c17792bb;
        }

        /* JADX INFO: renamed from: a */
        private void m76525a() throws IOException {
            if (this.f53154g != -1) {
                C17835cr.this.f53141c.o00000oo();
            }
            try {
                this.f53154g = C17835cr.this.f53141c.o00oO0O();
                String strTrim = C17835cr.this.f53141c.o00000oo().trim();
                if (this.f53154g < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f53154g + strTrim + "\"");
                }
                if (this.f53154g == 0) {
                    this.f53155h = false;
                    C17827cj.m76487a(C17835cr.this.f53139a.m76202h(), this.f53153f, C17835cr.this.m76521d());
                    m76524a(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // com.huawei.hms.drive.C17835cr.a, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f53146b) {
                return;
            }
            if (this.f53155h && !C17806bp.m76344a(this, 100, TimeUnit.MILLISECONDS)) {
                m76524a(false, null);
            }
            this.f53146b = true;
        }

        @Override // com.huawei.hms.drive.C17835cr.a, oOo00OoO.InterfaceC34548OooOoo0
        public long read(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount < 0: "));
            }
            if (this.f53146b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f53155h) {
                return -1L;
            }
            long j2 = this.f53154g;
            if (j2 == 0 || j2 == -1) {
                m76525a();
                if (!this.f53155h) {
                    return -1L;
                }
            }
            long j3 = super.read(c34524OooO0Oo, Math.min(j, this.f53154g));
            if (j3 != -1) {
                this.f53154g -= j3;
                return j3;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m76524a(false, protocolException);
            throw protocolException;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.cr$d */
    public final class d implements InterfaceC34544OooOoO {

        /* JADX INFO: renamed from: b */
        private final C34530OooOO0O f53157b;

        /* JADX INFO: renamed from: c */
        private boolean f53158c;

        /* JADX INFO: renamed from: d */
        private long f53159d;

        public d(long j) {
            this.f53157b = new C34530OooOO0O(C17835cr.this.f53142d.timeout());
            this.f53159d = j;
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f53158c) {
                return;
            }
            this.f53158c = true;
            if (this.f53159d > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            C17835cr.this.m76519a(this.f53157b);
            C17835cr.this.f53143e = 3;
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
        public void flush() throws IOException {
            if (this.f53158c) {
                return;
            }
            C17835cr.this.f53142d.flush();
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO
        public C34547OooOoo timeout() {
            return this.f53157b;
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO
        public void write(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
            if (this.f53158c) {
                throw new IllegalStateException("closed");
            }
            C17806bp.m76337a(c34524OooO0Oo.f123723OooOo, 0L, j);
            if (j <= this.f53159d) {
                C17835cr.this.f53142d.write(c34524OooO0Oo, j);
                this.f53159d -= j;
            } else {
                throw new ProtocolException("expected " + this.f53159d + " bytes but received " + j);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.cr$e */
    public class e extends a {

        /* JADX INFO: renamed from: f */
        private long f53161f;

        public e(long j) throws IOException {
            super();
            this.f53161f = j;
            if (j == 0) {
                m76524a(true, null);
            }
        }

        @Override // com.huawei.hms.drive.C17835cr.a, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f53146b) {
                return;
            }
            if (this.f53161f != 0 && !C17806bp.m76344a(this, 100, TimeUnit.MILLISECONDS)) {
                m76524a(false, null);
            }
            this.f53146b = true;
        }

        @Override // com.huawei.hms.drive.C17835cr.a, oOo00OoO.InterfaceC34548OooOoo0
        public long read(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount < 0: "));
            }
            if (this.f53146b) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f53161f;
            if (j2 == 0) {
                return -1L;
            }
            long j3 = super.read(c34524OooO0Oo, Math.min(j2, j));
            if (j3 == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m76524a(false, protocolException);
                throw protocolException;
            }
            long j4 = this.f53161f - j3;
            this.f53161f = j4;
            if (j4 == 0) {
                m76524a(true, null);
            }
            return j3;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.cr$f */
    public class f extends a {

        /* JADX INFO: renamed from: f */
        private boolean f53163f;

        public f() {
            super();
        }

        @Override // com.huawei.hms.drive.C17835cr.a, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f53146b) {
                return;
            }
            if (!this.f53163f) {
                m76524a(false, null);
            }
            this.f53146b = true;
        }

        @Override // com.huawei.hms.drive.C17835cr.a, oOo00OoO.InterfaceC34548OooOoo0
        public long read(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount < 0: "));
            }
            if (this.f53146b) {
                throw new IllegalStateException("closed");
            }
            if (this.f53163f) {
                return -1L;
            }
            long j2 = super.read(c34524OooO0Oo, j);
            if (j2 != -1) {
                return j2;
            }
            this.f53163f = true;
            m76524a(true, null);
            return -1L;
        }
    }

    public C17835cr(C17795be c17795be, C17822ce c17822ce, InterfaceC34525OooO0o interfaceC34525OooO0o, InterfaceC34526OooO0o0 interfaceC34526OooO0o0) {
        this.f53139a = c17795be;
        this.f53140b = c17822ce;
        this.f53141c = interfaceC34525OooO0o;
        this.f53142d = interfaceC34526OooO0o0;
    }

    /* JADX INFO: renamed from: g */
    private String m76515g() throws IOException {
        String strO000000o = this.f53141c.o000000o(this.f53144f);
        this.f53144f -= (long) strO000000o.length();
        return strO000000o;
    }

    /* JADX INFO: renamed from: a */
    public void m76519a(C34530OooOO0O c34530OooOO0O) {
        C34547OooOoo c34547OooOoo = c34530OooOO0O.f123741OooO00o;
        C34547OooOoo delegate = C34547OooOoo.NONE;
        OooOOO0.OooO0oO(delegate, "delegate");
        c34530OooOO0O.f123741OooO00o = delegate;
        c34547OooOoo.clearDeadline();
        c34547OooOoo.clearTimeout();
    }

    @Override // com.huawei.hms.drive.InterfaceC17825ch
    /* JADX INFO: renamed from: b */
    public void mo76477b() throws IOException {
        this.f53142d.flush();
    }

    @Override // com.huawei.hms.drive.InterfaceC17825ch
    /* JADX INFO: renamed from: c */
    public void mo76478c() {
        C17818ca c17818caM76466c = this.f53140b.m76466c();
        if (c17818caM76466c != null) {
            c17818caM76466c.m76423c();
        }
    }

    /* JADX INFO: renamed from: d */
    public C17788ay m76521d() throws IOException {
        C17788ay.a aVar = new C17788ay.a();
        while (true) {
            String strM76515g = m76515g();
            if (strM76515g.length() == 0) {
                return aVar.m76081a();
            }
            AbstractC17804bn.f52952a.mo76227a(aVar, strM76515g);
        }
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC34544OooOoO m76522e() {
        if (this.f53143e == 1) {
            this.f53143e = 2;
            return new b();
        }
        throw new IllegalStateException("state: " + this.f53143e);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC34548OooOoo0 m76523f() throws IOException {
        if (this.f53143e != 4) {
            throw new IllegalStateException("state: " + this.f53143e);
        }
        C17822ce c17822ce = this.f53140b;
        if (c17822ce == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f53143e = 5;
        c17822ce.m76468e();
        return new f();
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC34548OooOoo0 m76520b(long j) throws IOException {
        if (this.f53143e == 4) {
            this.f53143e = 5;
            return new e(j);
        }
        throw new IllegalStateException("state: " + this.f53143e);
    }

    @Override // com.huawei.hms.drive.InterfaceC17825ch
    /* JADX INFO: renamed from: a */
    public InterfaceC34544OooOoO mo76474a(C17798bh c17798bh, long j) {
        if ("chunked".equalsIgnoreCase(c17798bh.m76262a(HttpHeaders.TRANSFER_ENCODING))) {
            return m76522e();
        }
        if (j != -1) {
            return m76516a(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.huawei.hms.drive.InterfaceC17825ch
    /* JADX INFO: renamed from: a */
    public void mo76476a(C17798bh c17798bh) throws IOException {
        m76518a(c17798bh.m76264c(), C17831cn.m76502a(c17798bh, this.f53140b.m76466c().m76422b().m76316b().type()));
    }

    @Override // com.huawei.hms.drive.InterfaceC17825ch
    /* JADX INFO: renamed from: a */
    public AbstractC17801bk mo76473a(C17800bj c17800bj) throws IOException {
        C17822ce c17822ce = this.f53140b;
        c17822ce.f53094c.m76063f(c17822ce.f53093b);
        String strM76281a = c17800bj.m76281a("Content-Type");
        if (!C17827cj.m76489b(c17800bj)) {
            return new C17830cm(strM76281a, 0L, C34535OooOOOo.OooO0O0(m76520b(0L)));
        }
        if ("chunked".equalsIgnoreCase(c17800bj.m76281a(HttpHeaders.TRANSFER_ENCODING))) {
            return new C17830cm(strM76281a, -1L, C34535OooOOOo.OooO0O0(m76517a(c17800bj.m76280a().m76261a())));
        }
        long jM76485a = C17827cj.m76485a(c17800bj);
        if (jM76485a != -1) {
            return new C17830cm(strM76281a, jM76485a, C34535OooOOOo.OooO0O0(m76520b(jM76485a)));
        }
        return new C17830cm(strM76281a, -1L, C34535OooOOOo.OooO0O0(m76523f()));
    }

    @Override // com.huawei.hms.drive.InterfaceC17825ch
    /* JADX INFO: renamed from: a */
    public void mo76475a() throws IOException {
        this.f53142d.flush();
    }

    /* JADX INFO: renamed from: a */
    public void m76518a(C17788ay c17788ay, String str) throws IOException {
        if (this.f53143e == 0) {
            this.f53142d.o00000Oo(str).o00000Oo(IOUtils.LINE_SEPARATOR_WINDOWS);
            int iM76072a = c17788ay.m76072a();
            for (int i = 0; i < iM76072a; i++) {
                this.f53142d.o00000Oo(c17788ay.m76073a(i)).o00000Oo(": ").o00000Oo(c17788ay.m76076b(i)).o00000Oo(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            this.f53142d.o00000Oo(IOUtils.LINE_SEPARATOR_WINDOWS);
            this.f53143e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f53143e);
    }

    @Override // com.huawei.hms.drive.InterfaceC17825ch
    /* JADX INFO: renamed from: a */
    public C17800bj.a mo76472a(boolean z) throws IOException {
        int i = this.f53143e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f53143e);
        }
        try {
            C17833cp c17833cpM76514a = C17833cp.m76514a(m76515g());
            C17800bj.a aVarM76298a = new C17800bj.a().m76299a(c17833cpM76514a.f53136a).m76295a(c17833cpM76514a.f53137b).m76303a(c17833cpM76514a.f53138c).m76298a(m76521d());
            if (z && c17833cpM76514a.f53137b == 100) {
                return null;
            }
            if (c17833cpM76514a.f53137b == 100) {
                this.f53143e = 3;
                return aVarM76298a;
            }
            this.f53143e = 4;
            return aVarM76298a;
        } catch (EOFException e2) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f53140b);
            iOException.initCause(e2);
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC34544OooOoO m76516a(long j) {
        if (this.f53143e == 1) {
            this.f53143e = 2;
            return new d(j);
        }
        throw new IllegalStateException("state: " + this.f53143e);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC34548OooOoo0 m76517a(C17792bb c17792bb) throws IOException {
        if (this.f53143e == 4) {
            this.f53143e = 5;
            return new c(c17792bb);
        }
        throw new IllegalStateException("state: " + this.f53143e);
    }
}
