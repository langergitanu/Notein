package com.huawei.hms.network.embedded;

import Oooo0oO.C21023OooO0Oo;
import androidx.concurrent.futures.OooO00o;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import o00oO0O.o0OoOo0;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.h8 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18202h8 implements Closeable {

    /* JADX INFO: renamed from: a */
    public Reader f55040a;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.h8$a */
    public class a extends AbstractC18202h8 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C18442z7 f55041b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f55042c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC18289nb f55043d;

        public a(C18442z7 c18442z7, long j, InterfaceC18289nb interfaceC18289nb) {
            this.f55041b = c18442z7;
            this.f55042c = j;
            this.f55043d = interfaceC18289nb;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18202h8
        /* JADX INFO: renamed from: v */
        public long mo78124v() {
            return this.f55042c;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18202h8
        /* JADX INFO: renamed from: w */
        public C18442z7 mo78125w() {
            return this.f55041b;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18202h8
        /* JADX INFO: renamed from: x */
        public InterfaceC18289nb mo78126x() {
            return this.f55043d;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.h8$b */
    public static final class b extends Reader {

        /* JADX INFO: renamed from: a */
        public final InterfaceC18289nb f55044a;

        /* JADX INFO: renamed from: b */
        public final Charset f55045b;

        /* JADX INFO: renamed from: c */
        public boolean f55046c;

        /* JADX INFO: renamed from: d */
        public Reader f55047d;

        public b(InterfaceC18289nb interfaceC18289nb, Charset charset) {
            this.f55044a = interfaceC18289nb;
            this.f55045b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f55046c = true;
            Reader reader = this.f55047d;
            if (reader != null) {
                reader.close();
            } else {
                this.f55044a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (this.f55046c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f55047d;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.f55044a.mo78396l(), C18313p8.m79370a(this.f55044a, this.f55045b));
                this.f55047d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC18202h8 m78681a(C18442z7 c18442z7, long j, InterfaceC18289nb interfaceC18289nb) {
        if (interfaceC18289nb != null) {
            return new a(c18442z7, j, interfaceC18289nb);
        }
        throw new NullPointerException("source == null");
    }

    /* JADX INFO: renamed from: z */
    private Charset m78686z() {
        C18442z7 c18442z7Mo78125w = mo78125w();
        return c18442z7Mo78125w != null ? c18442z7Mo78125w.m80036a(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C18313p8.m79378a(mo78126x());
    }

    /* JADX INFO: renamed from: s */
    public final InputStream m78687s() {
        return mo78126x().mo78396l();
    }

    /* JADX INFO: renamed from: t */
    public final byte[] m78688t() throws Exception {
        long jMo78124v = mo78124v();
        if (jMo78124v > 2147483647L) {
            throw new IOException(OooO00o.OooO0O0(jMo78124v, "Cannot buffer entire body for content length: "));
        }
        InterfaceC18289nb interfaceC18289nbMo78126x = mo78126x();
        try {
            byte[] bArrMo78400q = interfaceC18289nbMo78126x.mo78400q();
            m78685a((Throwable) null, interfaceC18289nbMo78126x);
            if (jMo78124v == -1 || jMo78124v == bArrMo78400q.length) {
                return bArrMo78400q;
            }
            throw new IOException(C21023OooO0Oo.OooO0OO(") disagree", bArrMo78400q.length, o0OoOo0.OooO00o(jMo78124v, "Content-Length (", ") and stream length (")));
        } finally {
        }
    }

    /* JADX INFO: renamed from: u */
    public final Reader m78689u() {
        Reader reader = this.f55040a;
        if (reader != null) {
            return reader;
        }
        b bVar = new b(mo78126x(), m78686z());
        this.f55040a = bVar;
        return bVar;
    }

    /* JADX INFO: renamed from: v */
    public abstract long mo78124v();

    /* JADX INFO: renamed from: w */
    public abstract C18442z7 mo78125w();

    /* JADX INFO: renamed from: x */
    public abstract InterfaceC18289nb mo78126x();

    /* JADX INFO: renamed from: y */
    public final String m78690y() throws Exception {
        InterfaceC18289nb interfaceC18289nbMo78126x = mo78126x();
        try {
            String strMo78377a = interfaceC18289nbMo78126x.mo78377a(C18313p8.m79370a(interfaceC18289nbMo78126x, m78686z()));
            m78685a((Throwable) null, interfaceC18289nbMo78126x);
            return strMo78377a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (interfaceC18289nbMo78126x != null) {
                    m78685a(th, interfaceC18289nbMo78126x);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC18202h8 m78682a(C18442z7 c18442z7, C18303ob c18303ob) {
        return m78681a(c18442z7, c18303ob.mo78736j(), new C18261lb().mo78267b(c18303ob));
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC18202h8 m78683a(C18442z7 c18442z7, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (c18442z7 != null) {
            Charset charsetM80035a = c18442z7.m80035a();
            if (charsetM80035a == null) {
                c18442z7 = C18442z7.m80034b(c18442z7 + "; charset=utf-8");
            } else {
                charset = charsetM80035a;
            }
        }
        C18261lb c18261lbMo78264a = new C18261lb().mo78264a(str, charset);
        return m78681a(c18442z7, c18261lbMo78264a.m79076B(), c18261lbMo78264a);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC18202h8 m78684a(C18442z7 c18442z7, byte[] bArr) {
        return m78681a(c18442z7, bArr.length, new C18261lb().write(bArr));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m78685a(Throwable th, AutoCloseable autoCloseable) throws Exception {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }
}
