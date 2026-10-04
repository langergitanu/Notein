package com.huawei.hms.network.embedded;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.concurrent.futures.OooO00o;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18188g8;
import com.huawei.hms.network.embedded.C18377u7;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.z9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18444z9 implements InterfaceC18327q9 {

    /* JADX INFO: renamed from: i */
    public static final int f56832i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f56833j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f56834k = 2;

    /* JADX INFO: renamed from: l */
    public static final int f56835l = 3;

    /* JADX INFO: renamed from: m */
    public static final int f56836m = 4;

    /* JADX INFO: renamed from: n */
    public static final int f56837n = 5;

    /* JADX INFO: renamed from: o */
    public static final int f56838o = 6;

    /* JADX INFO: renamed from: p */
    public static final int f56839p = 262144;

    /* JADX INFO: renamed from: b */
    public final C18118b8 f56840b;

    /* JADX INFO: renamed from: c */
    public final C18217i9 f56841c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC18289nb f56842d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC18275mb f56843e;

    /* JADX INFO: renamed from: f */
    public int f56844f = 0;

    /* JADX INFO: renamed from: g */
    public long f56845g = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* JADX INFO: renamed from: h */
    public C18377u7 f56846h;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.z9$b */
    public abstract class b implements InterfaceC18234jc {

        /* JADX INFO: renamed from: a */
        public final C18355sb f56847a;

        /* JADX INFO: renamed from: b */
        public boolean f56848b;

        public b() {
            this.f56847a = new C18355sb(C18444z9.this.f56842d.timeout());
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        /* JADX INFO: renamed from: c */
        public long mo77914c(C18261lb c18261lb, long j) throws IOException {
            try {
                return C18444z9.this.f56842d.mo77914c(c18261lb, j);
            } catch (IOException e) {
                C18444z9.this.f56841c.m78795h();
                m80068g();
                throw e;
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m80068g() {
            if (C18444z9.this.f56844f == 6) {
                return;
            }
            if (C18444z9.this.f56844f == 5) {
                C18444z9.this.m80052a(this.f56847a);
                C18444z9.this.f56844f = 6;
            } else {
                throw new IllegalStateException("state: " + C18444z9.this.f56844f);
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        public C18248kc timeout() {
            return this.f56847a;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.z9$c */
    public final class c implements InterfaceC18220ic {

        /* JADX INFO: renamed from: a */
        public final C18355sb f56850a;

        /* JADX INFO: renamed from: b */
        public boolean f56851b;

        public c() {
            this.f56850a = new C18355sb(C18444z9.this.f56843e.timeout());
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        /* JADX INFO: renamed from: b */
        public void mo78029b(C18261lb c18261lb, long j) throws IOException {
            if (this.f56851b) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            C18444z9.this.f56843e.mo78272h(j);
            C18444z9.this.f56843e.mo78261a(IOUtils.LINE_SEPARATOR_WINDOWS);
            C18444z9.this.f56843e.mo78029b(c18261lb, j);
            C18444z9.this.f56843e.mo78261a(IOUtils.LINE_SEPARATOR_WINDOWS);
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f56851b) {
                return;
            }
            this.f56851b = true;
            C18444z9.this.f56843e.mo78261a("0\r\n\r\n");
            C18444z9.this.m80052a(this.f56850a);
            C18444z9.this.f56844f = 3;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f56851b) {
                return;
            }
            C18444z9.this.f56843e.flush();
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        public C18248kc timeout() {
            return this.f56850a;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.z9$d */
    public class d extends b {

        /* JADX INFO: renamed from: h */
        public static final long f56853h = -1;

        /* JADX INFO: renamed from: d */
        public final C18416x7 f56854d;

        /* JADX INFO: renamed from: e */
        public long f56855e;

        /* JADX INFO: renamed from: f */
        public boolean f56856f;

        public d(C18416x7 c18416x7) {
            super();
            this.f56855e = -1L;
            this.f56856f = true;
            this.f56854d = c18416x7;
        }

        /* JADX INFO: renamed from: h */
        private void m80069h() throws IOException {
            if (this.f56855e != -1) {
                C18444z9.this.f56842d.mo78397m();
            }
            try {
                this.f56855e = C18444z9.this.f56842d.mo78394j();
                String strTrim = C18444z9.this.f56842d.mo78397m().trim();
                if (this.f56855e < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f56855e + strTrim + "\"");
                }
                if (this.f56855e == 0) {
                    this.f56856f = false;
                    C18444z9 c18444z9 = C18444z9.this;
                    c18444z9.f56846h = c18444z9.m80064j();
                    C18353s9.m79523a(C18444z9.this.f56840b.m77948i(), this.f56854d, C18444z9.this.f56846h);
                    m80068g();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // com.huawei.hms.network.embedded.C18444z9.b, com.huawei.hms.network.embedded.InterfaceC18234jc
        /* JADX INFO: renamed from: c */
        public long mo77914c(C18261lb c18261lb, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount < 0: "));
            }
            if (this.f56848b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f56856f) {
                return -1L;
            }
            long j2 = this.f56855e;
            if (j2 == 0 || j2 == -1) {
                m80069h();
                if (!this.f56856f) {
                    return -1L;
                }
            }
            long jMo77914c = super.mo77914c(c18261lb, Math.min(j, this.f56855e));
            if (jMo77914c != -1) {
                this.f56855e -= jMo77914c;
                return jMo77914c;
            }
            C18444z9.this.f56841c.m78795h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m80068g();
            throw protocolException;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f56848b) {
                return;
            }
            if (this.f56856f && !C18313p8.m79382a(this, 100, TimeUnit.MILLISECONDS)) {
                C18444z9.this.f56841c.m78795h();
                m80068g();
            }
            this.f56848b = true;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.z9$e */
    public class e extends b {

        /* JADX INFO: renamed from: d */
        public long f56858d;

        public e(long j) {
            super();
            this.f56858d = j;
            if (j == 0) {
                m80068g();
            }
        }

        @Override // com.huawei.hms.network.embedded.C18444z9.b, com.huawei.hms.network.embedded.InterfaceC18234jc
        /* JADX INFO: renamed from: c */
        public long mo77914c(C18261lb c18261lb, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount < 0: "));
            }
            if (this.f56848b) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f56858d;
            if (j2 == 0) {
                return -1L;
            }
            long jMo77914c = super.mo77914c(c18261lb, Math.min(j2, j));
            if (jMo77914c == -1) {
                C18444z9.this.f56841c.m78795h();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m80068g();
                throw protocolException;
            }
            long j3 = this.f56858d - jMo77914c;
            this.f56858d = j3;
            if (j3 == 0) {
                m80068g();
            }
            return jMo77914c;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f56848b) {
                return;
            }
            if (this.f56858d != 0 && !C18313p8.m79382a(this, 100, TimeUnit.MILLISECONDS)) {
                C18444z9.this.f56841c.m78795h();
                m80068g();
            }
            this.f56848b = true;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.z9$f */
    public final class f implements InterfaceC18220ic {

        /* JADX INFO: renamed from: a */
        public final C18355sb f56860a;

        /* JADX INFO: renamed from: b */
        public boolean f56861b;

        public f() {
            this.f56860a = new C18355sb(C18444z9.this.f56843e.timeout());
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        /* JADX INFO: renamed from: b */
        public void mo78029b(C18261lb c18261lb, long j) throws IOException {
            if (this.f56861b) {
                throw new IllegalStateException("closed");
            }
            C18313p8.m79377a(c18261lb.m79076B(), 0L, j);
            C18444z9.this.f56843e.mo78029b(c18261lb, j);
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f56861b) {
                return;
            }
            this.f56861b = true;
            C18444z9.this.m80052a(this.f56860a);
            C18444z9.this.f56844f = 3;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
        public void flush() throws IOException {
            if (this.f56861b) {
                return;
            }
            C18444z9.this.f56843e.flush();
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        public C18248kc timeout() {
            return this.f56860a;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.z9$g */
    public class g extends b {

        /* JADX INFO: renamed from: d */
        public boolean f56863d;

        public g() {
            super();
        }

        @Override // com.huawei.hms.network.embedded.C18444z9.b, com.huawei.hms.network.embedded.InterfaceC18234jc
        /* JADX INFO: renamed from: c */
        public long mo77914c(C18261lb c18261lb, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount < 0: "));
            }
            if (this.f56848b) {
                throw new IllegalStateException("closed");
            }
            if (this.f56863d) {
                return -1L;
            }
            long jMo77914c = super.mo77914c(c18261lb, j);
            if (jMo77914c != -1) {
                return jMo77914c;
            }
            this.f56863d = true;
            m80068g();
            return -1L;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f56848b) {
                return;
            }
            if (!this.f56863d) {
                m80068g();
            }
            this.f56848b = true;
        }
    }

    public C18444z9(C18118b8 c18118b8, C18217i9 c18217i9, InterfaceC18289nb interfaceC18289nb, InterfaceC18275mb interfaceC18275mb) {
        this.f56840b = c18118b8;
        this.f56841c = c18217i9;
        this.f56842d = interfaceC18289nb;
        this.f56843e = interfaceC18275mb;
    }

    /* JADX INFO: renamed from: f */
    private InterfaceC18220ic m80058f() {
        if (this.f56844f == 1) {
            this.f56844f = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f56844f);
    }

    /* JADX INFO: renamed from: g */
    private InterfaceC18220ic m80060g() {
        if (this.f56844f == 1) {
            this.f56844f = 2;
            return new f();
        }
        throw new IllegalStateException("state: " + this.f56844f);
    }

    /* JADX INFO: renamed from: h */
    private InterfaceC18234jc m80062h() {
        if (this.f56844f == 4) {
            this.f56844f = 5;
            this.f56841c.m78795h();
            return new g();
        }
        throw new IllegalStateException("state: " + this.f56844f);
    }

    /* JADX INFO: renamed from: i */
    private String m80063i() throws IOException {
        String strMo78385c = this.f56842d.mo78385c(this.f56845g);
        this.f56845g -= (long) strMo78385c.length();
        return strMo78385c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public C18377u7 m80064j() throws IOException {
        C18377u7.a aVar = new C18377u7.a();
        while (true) {
            String strM80063i = m80063i();
            if (strM80063i.length() == 0) {
                return aVar.m79627a();
            }
            AbstractC18286n8.f55777a.mo77972a(aVar, strM80063i);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: b */
    public InterfaceC18234jc mo78629b(C18188g8 c18188g8) {
        if (!C18353s9.m79528b(c18188g8)) {
            return m80049a(0L);
        }
        if ("chunked".equalsIgnoreCase(c18188g8.m78582b(HttpHeaders.TRANSFER_ENCODING))) {
            return m80050a(c18188g8.m78578H().m78310k());
        }
        long jM79516a = C18353s9.m79516a(c18188g8);
        return jM79516a != -1 ? m80049a(jM79516a) : m80062h();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    public void cancel() {
        C18217i9 c18217i9 = this.f56841c;
        if (c18217i9 != null) {
            c18217i9.m78792e();
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: a */
    public long mo78624a(C18188g8 c18188g8) {
        if (!C18353s9.m79528b(c18188g8)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(c18188g8.m78582b(HttpHeaders.TRANSFER_ENCODING))) {
            return -1L;
        }
        return C18353s9.m79516a(c18188g8);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: c */
    public void mo78631c() throws IOException {
        this.f56843e.flush();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: d */
    public void mo78632d() throws IOException {
        this.f56843e.flush();
    }

    /* JADX INFO: renamed from: e */
    public boolean m80067e() {
        return this.f56844f == 6;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: b */
    public C18377u7 mo78630b() {
        if (this.f56844f != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        C18377u7 c18377u7 = this.f56846h;
        return c18377u7 != null ? c18377u7 : C18313p8.f55894c;
    }

    /* JADX INFO: renamed from: c */
    public void m80066c(C18188g8 c18188g8) throws IOException {
        long jM79516a = C18353s9.m79516a(c18188g8);
        if (jM79516a == -1) {
            return;
        }
        InterfaceC18234jc interfaceC18234jcM80049a = m80049a(jM79516a);
        C18313p8.m79390b(interfaceC18234jcM80049a, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        interfaceC18234jcM80049a.close();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: a */
    public C18188g8.a mo78625a(boolean z) throws IOException {
        int i = this.f56844f;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f56844f);
        }
        try {
            C18431y9 c18431y9M79996a = C18431y9.m79996a(m80063i());
            C18188g8.a aVarM78602a = new C18188g8.a().m78597a(c18431y9M79996a.f56724a).m78595a(c18431y9M79996a.f56725b).m78603a(c18431y9M79996a.f56726c).m78602a(m80064j());
            if (z && c18431y9M79996a.f56725b == 100) {
                return null;
            }
            if (c18431y9M79996a.f56725b == 100) {
                this.f56844f = 3;
                return aVarM78602a;
            }
            this.f56844f = 4;
            return aVarM78602a;
        } catch (EOFException e2) {
            C18217i9 c18217i9 = this.f56841c;
            throw new IOException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("unexpected end of stream on ", c18217i9 != null ? c18217i9.mo78789b().m78766a().m77862l().m79939r() : "unknown"), e2);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: a */
    public C18217i9 mo78626a() {
        return this.f56841c;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: a */
    public InterfaceC18220ic mo78627a(C18160e8 c18160e8, long j) throws IOException {
        if (c18160e8.m78300b() != null && c18160e8.m78300b().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(c18160e8.m78298a(HttpHeaders.TRANSFER_ENCODING))) {
            return m80058f();
        }
        if (j != -1) {
            return m80060g();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC18234jc m80049a(long j) {
        if (this.f56844f == 4) {
            this.f56844f = 5;
            return new e(j);
        }
        throw new IllegalStateException("state: " + this.f56844f);
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC18234jc m80050a(C18416x7 c18416x7) {
        if (this.f56844f == 4) {
            this.f56844f = 5;
            return new d(c18416x7);
        }
        throw new IllegalStateException("state: " + this.f56844f);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18327q9
    /* JADX INFO: renamed from: a */
    public void mo78628a(C18160e8 c18160e8) throws IOException {
        m80065a(c18160e8.m78304e(), C18405w9.m79836a(c18160e8, this.f56841c.mo78789b().m78767b().type()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m80052a(C18355sb c18355sb) {
        C18248kc c18248kcM79539g = c18355sb.m79539g();
        c18355sb.m79538a(C18248kc.f55445d);
        c18248kcM79539g.mo78994a();
        c18248kcM79539g.mo78998b();
    }

    /* JADX INFO: renamed from: a */
    public void m80065a(C18377u7 c18377u7, String str) throws IOException {
        if (this.f56844f != 0) {
            throw new IllegalStateException("state: " + this.f56844f);
        }
        this.f56843e.mo78261a(str).mo78261a(IOUtils.LINE_SEPARATOR_WINDOWS);
        int iM79619d = c18377u7.m79619d();
        for (int i = 0; i < iM79619d; i++) {
            this.f56843e.mo78261a(c18377u7.m79612a(i)).mo78261a(": ").mo78261a(c18377u7.m79614b(i)).mo78261a(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        this.f56843e.mo78261a(IOUtils.LINE_SEPARATOR_WINDOWS);
        this.f56844f = 1;
    }
}
