package com.huawei.hms.network.embedded;

import com.aspose.slides.PatternStyle;
import com.huawei.hms.network.embedded.C18377u7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.a8 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18104a8 extends AbstractC18174f8 {

    /* JADX INFO: renamed from: f */
    public static final C18442z7 f54181f = C18442z7.m80033a("multipart/mixed");

    /* JADX INFO: renamed from: g */
    public static final C18442z7 f54182g = C18442z7.m80033a("multipart/alternative");

    /* JADX INFO: renamed from: h */
    public static final C18442z7 f54183h = C18442z7.m80033a("multipart/digest");

    /* JADX INFO: renamed from: i */
    public static final C18442z7 f54184i = C18442z7.m80033a("multipart/parallel");

    /* JADX INFO: renamed from: j */
    public static final C18442z7 f54185j = C18442z7.m80033a("multipart/form-data");

    /* JADX INFO: renamed from: k */
    public static final byte[] f54186k = {58, 32};

    /* JADX INFO: renamed from: l */
    public static final byte[] f54187l = {13, 10};

    /* JADX INFO: renamed from: m */
    public static final byte[] f54188m = {PatternStyle.DottedGrid, PatternStyle.DottedGrid};

    /* JADX INFO: renamed from: a */
    public final C18303ob f54189a;

    /* JADX INFO: renamed from: b */
    public final C18442z7 f54190b;

    /* JADX INFO: renamed from: c */
    public final C18442z7 f54191c;

    /* JADX INFO: renamed from: d */
    public final List<b> f54192d;

    /* JADX INFO: renamed from: e */
    public long f54193e = -1;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.a8$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C18303ob f54194a;

        /* JADX INFO: renamed from: b */
        public C18442z7 f54195b;

        /* JADX INFO: renamed from: c */
        public final List<b> f54196c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        /* JADX INFO: renamed from: a */
        public a m77870a(b bVar) {
            if (bVar == null) {
                throw new NullPointerException("part == null");
            }
            this.f54196c.add(bVar);
            return this;
        }

        public a(String str) {
            this.f54195b = C18104a8.f54181f;
            this.f54196c = new ArrayList();
            this.f54194a = C18303ob.m79299d(str);
        }

        /* JADX INFO: renamed from: a */
        public a m77871a(AbstractC18174f8 abstractC18174f8) {
            return m77870a(b.m77877a(abstractC18174f8));
        }

        /* JADX INFO: renamed from: a */
        public a m77872a(C18377u7 c18377u7, AbstractC18174f8 abstractC18174f8) {
            return m77870a(b.m77878a(c18377u7, abstractC18174f8));
        }

        /* JADX INFO: renamed from: a */
        public a m77873a(C18442z7 c18442z7) {
            if (c18442z7 == null) {
                throw new NullPointerException("type == null");
            }
            if (c18442z7.m80038c().equals("multipart")) {
                this.f54195b = c18442z7;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + c18442z7);
        }

        /* JADX INFO: renamed from: a */
        public a m77874a(String str, String str2) {
            return m77870a(b.m77879a(str, str2));
        }

        /* JADX INFO: renamed from: a */
        public a m77875a(String str, String str2, AbstractC18174f8 abstractC18174f8) {
            return m77870a(b.m77880a(str, str2, abstractC18174f8));
        }

        /* JADX INFO: renamed from: a */
        public C18104a8 m77876a() {
            if (this.f54196c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new C18104a8(this.f54194a, this.f54195b, this.f54196c);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.a8$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final C18377u7 f54197a;

        /* JADX INFO: renamed from: b */
        public final AbstractC18174f8 f54198b;

        public b(C18377u7 c18377u7, AbstractC18174f8 abstractC18174f8) {
            this.f54197a = c18377u7;
            this.f54198b = abstractC18174f8;
        }

        /* JADX INFO: renamed from: a */
        public static b m77877a(AbstractC18174f8 abstractC18174f8) {
            return m77878a((C18377u7) null, abstractC18174f8);
        }

        /* JADX INFO: renamed from: b */
        public C18377u7 m77882b() {
            return this.f54197a;
        }

        /* JADX INFO: renamed from: a */
        public static b m77878a(C18377u7 c18377u7, AbstractC18174f8 abstractC18174f8) {
            if (abstractC18174f8 == null) {
                throw new NullPointerException("body == null");
            }
            if (c18377u7 != null && c18377u7.m79613a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (c18377u7 == null || c18377u7.m79613a("Content-Length") == null) {
                return new b(c18377u7, abstractC18174f8);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }

        /* JADX INFO: renamed from: a */
        public static b m77879a(String str, String str2) {
            return m77880a(str, null, AbstractC18174f8.create((C18442z7) null, str2));
        }

        /* JADX INFO: renamed from: a */
        public static b m77880a(String str, String str2, AbstractC18174f8 abstractC18174f8) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            StringBuilder sb = new StringBuilder("form-data; name=");
            C18104a8.m77864a(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                C18104a8.m77864a(sb, str2);
            }
            return m77878a(new C18377u7.a().m79632c("Content-Disposition", sb.toString()).m79627a(), abstractC18174f8);
        }

        /* JADX INFO: renamed from: a */
        public AbstractC18174f8 m77881a() {
            return this.f54198b;
        }
    }

    public C18104a8(C18303ob c18303ob, C18442z7 c18442z7, List<b> list) {
        this.f54189a = c18303ob;
        this.f54190b = c18442z7;
        this.f54191c = C18442z7.m80033a(c18442z7 + "; boundary=" + c18303ob.mo78740n());
        this.f54192d = C18313p8.m79372a(list);
    }

    /* JADX INFO: renamed from: a */
    private long m77863a(InterfaceC18275mb interfaceC18275mb, boolean z) throws IOException {
        InterfaceC18275mb interfaceC18275mb2;
        C18261lb c18261lb;
        if (z) {
            c18261lb = new C18261lb();
            interfaceC18275mb2 = c18261lb;
        } else {
            interfaceC18275mb2 = interfaceC18275mb;
            c18261lb = null;
        }
        int size = this.f54192d.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            b bVar = this.f54192d.get(i);
            C18377u7 c18377u7 = bVar.f54197a;
            AbstractC18174f8 abstractC18174f8 = bVar.f54198b;
            interfaceC18275mb2.write(f54188m);
            interfaceC18275mb2.mo78267b(this.f54189a);
            interfaceC18275mb2.write(f54187l);
            if (c18377u7 != null) {
                int iM79619d = c18377u7.m79619d();
                for (int i2 = 0; i2 < iM79619d; i2++) {
                    interfaceC18275mb2.mo78261a(c18377u7.m79612a(i2)).write(f54186k).mo78261a(c18377u7.m79614b(i2)).write(f54187l);
                }
            }
            C18442z7 c18442z7ContentType = abstractC18174f8.contentType();
            if (c18442z7ContentType != null) {
                interfaceC18275mb2.mo78261a("Content-Type: ").mo78261a(c18442z7ContentType.toString()).write(f54187l);
            }
            long jContentLength = abstractC18174f8.contentLength();
            if (jContentLength != -1) {
                interfaceC18275mb2.mo78261a("Content-Length: ").mo78266b(jContentLength).write(f54187l);
            } else if (z) {
                c18261lb.m79095s();
                return -1L;
            }
            byte[] bArr = f54187l;
            interfaceC18275mb2.write(bArr);
            if (z) {
                j += jContentLength;
            } else {
                abstractC18174f8.writeTo(interfaceC18275mb2);
            }
            interfaceC18275mb2.write(bArr);
        }
        byte[] bArr2 = f54188m;
        interfaceC18275mb2.write(bArr2);
        interfaceC18275mb2.mo78267b(this.f54189a);
        interfaceC18275mb2.write(bArr2);
        interfaceC18275mb2.write(f54187l);
        if (!z) {
            return j;
        }
        long jM79076B = c18261lb.m79076B() + j;
        c18261lb.m79095s();
        return jM79076B;
    }

    /* JADX INFO: renamed from: b */
    public List<b> m77867b() {
        return this.f54192d;
    }

    /* JADX INFO: renamed from: c */
    public int m77868c() {
        return this.f54192d.size();
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18174f8
    public long contentLength() throws IOException {
        long j = this.f54193e;
        if (j != -1) {
            return j;
        }
        long jM77863a = m77863a((InterfaceC18275mb) null, true);
        this.f54193e = jM77863a;
        return jM77863a;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18174f8
    public C18442z7 contentType() {
        return this.f54191c;
    }

    /* JADX INFO: renamed from: d */
    public C18442z7 m77869d() {
        return this.f54190b;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18174f8
    public void writeTo(InterfaceC18275mb interfaceC18275mb) throws IOException {
        m77863a(interfaceC18275mb, false);
    }

    /* JADX INFO: renamed from: a */
    public b m77865a(int i) {
        return this.f54192d.get(i);
    }

    /* JADX INFO: renamed from: a */
    public String m77866a() {
        return this.f54189a.mo78740n();
    }

    /* JADX INFO: renamed from: a */
    public static void m77864a(StringBuilder sb, String str) {
        String str2;
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                str2 = "%0A";
            } else if (cCharAt == '\r') {
                str2 = "%0D";
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                str2 = "%22";
            }
            sb.append(str2);
        }
        sb.append('\"');
    }
}
