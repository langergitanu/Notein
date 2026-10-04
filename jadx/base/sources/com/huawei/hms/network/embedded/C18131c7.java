package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18160e8;
import com.huawei.hms.network.embedded.C18188g8;
import com.huawei.hms.network.embedded.C18377u7;
import com.huawei.hms.network.embedded.C18391v8;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.c7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18131c7 implements Closeable, Flushable {

    /* JADX INFO: renamed from: h */
    public static final int f54422h = 201105;

    /* JADX INFO: renamed from: i */
    public static final int f54423i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f54424j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f54425k = 2;

    /* JADX INFO: renamed from: a */
    public final InterfaceC18417x8 f54426a;

    /* JADX INFO: renamed from: b */
    public final C18391v8 f54427b;

    /* JADX INFO: renamed from: c */
    public int f54428c;

    /* JADX INFO: renamed from: d */
    public int f54429d;

    /* JADX INFO: renamed from: e */
    public int f54430e;

    /* JADX INFO: renamed from: f */
    public int f54431f;

    /* JADX INFO: renamed from: g */
    public int f54432g;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c7$a */
    public class a implements InterfaceC18417x8 {
        public a() {
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18417x8
        /* JADX INFO: renamed from: a */
        public C18188g8 mo78117a(C18160e8 c18160e8) throws IOException {
            return C18131c7.this.m78104a(c18160e8);
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18417x8
        /* JADX INFO: renamed from: b */
        public void mo78122b(C18160e8 c18160e8) throws IOException {
            C18131c7.this.m78108b(c18160e8);
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18417x8
        /* JADX INFO: renamed from: a */
        public InterfaceC18365t8 mo78118a(C18188g8 c18188g8) throws IOException {
            return C18131c7.this.m78105a(c18188g8);
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18417x8
        /* JADX INFO: renamed from: a */
        public void mo78119a() {
            C18131c7.this.m78100C();
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18417x8
        /* JADX INFO: renamed from: a */
        public void mo78120a(C18188g8 c18188g8, C18188g8 c18188g82) {
            C18131c7.this.m78106a(c18188g8, c18188g82);
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18417x8
        /* JADX INFO: renamed from: a */
        public void mo78121a(C18378u8 c18378u8) {
            C18131c7.this.m78107a(c18378u8);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c7$b */
    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: a */
        public final Iterator<C18391v8.f> f54434a;

        /* JADX INFO: renamed from: b */
        public String f54435b;

        /* JADX INFO: renamed from: c */
        public boolean f54436c;

        public b() throws IOException {
            this.f54434a = C18131c7.this.f54427b.m79753B();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f54435b != null) {
                return true;
            }
            this.f54436c = false;
            while (this.f54434a.hasNext()) {
                try {
                    C18391v8.f next = this.f54434a.next();
                    try {
                        continue;
                        this.f54435b = C18433yb.m80007a(next.m79783e(0)).mo78397m();
                        next.close();
                        return true;
                    } finally {
                        try {
                            continue;
                        } finally {
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f54436c) {
                throw new IllegalStateException("remove() before next()");
            }
            this.f54434a.remove();
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f54435b;
            this.f54435b = null;
            this.f54436c = true;
            return str;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c7$c */
    public final class c implements InterfaceC18365t8 {

        /* JADX INFO: renamed from: a */
        public final C18391v8.d f54438a;

        /* JADX INFO: renamed from: b */
        public InterfaceC18220ic f54439b;

        /* JADX INFO: renamed from: c */
        public InterfaceC18220ic f54440c;

        /* JADX INFO: renamed from: d */
        public boolean f54441d;

        /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c7$c$a */
        public class a extends AbstractC18329qb {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C18131c7 f54443b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C18391v8.d f54444c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC18220ic interfaceC18220ic, C18131c7 c18131c7, C18391v8.d dVar) {
                super(interfaceC18220ic);
                this.f54443b = c18131c7;
                this.f54444c = dVar;
            }

            @Override // com.huawei.hms.network.embedded.AbstractC18329qb, com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (C18131c7.this) {
                    try {
                        c cVar = c.this;
                        if (cVar.f54441d) {
                            return;
                        }
                        cVar.f54441d = true;
                        C18131c7.this.f54428c++;
                        super.close();
                        this.f54444c.m79775c();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public c(C18391v8.d dVar) {
            this.f54438a = dVar;
            InterfaceC18220ic interfaceC18220icM79771a = dVar.m79771a(1);
            this.f54439b = interfaceC18220icM79771a;
            this.f54440c = new a(interfaceC18220icM79771a, C18131c7.this, dVar);
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18365t8
        /* JADX INFO: renamed from: a */
        public InterfaceC18220ic mo78123a() {
            return this.f54440c;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18365t8
        public void abort() {
            synchronized (C18131c7.this) {
                try {
                    if (this.f54441d) {
                        return;
                    }
                    this.f54441d = true;
                    C18131c7.this.f54429d++;
                    C18313p8.m79378a(this.f54439b);
                    try {
                        this.f54438a.m79772a();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c7$d */
    public static class d extends AbstractC18202h8 {

        /* JADX INFO: renamed from: b */
        public final C18391v8.f f54446b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC18289nb f54447c;

        /* JADX INFO: renamed from: d */
        public final String f54448d;

        /* JADX INFO: renamed from: e */
        public final String f54449e;

        /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c7$d$a */
        public class a extends AbstractC18342rb {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C18391v8.f f54450b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC18234jc interfaceC18234jc, C18391v8.f fVar) {
                super(interfaceC18234jc);
                this.f54450b = fVar;
            }

            @Override // com.huawei.hms.network.embedded.AbstractC18342rb, com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f54450b.close();
                super.close();
            }
        }

        public d(C18391v8.f fVar, String str, String str2) {
            this.f54446b = fVar;
            this.f54448d = str;
            this.f54449e = str2;
            this.f54447c = C18433yb.m80007a(new a(fVar.m79783e(1), fVar));
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18202h8
        /* JADX INFO: renamed from: v */
        public long mo78124v() {
            try {
                String str = this.f54449e;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18202h8
        /* JADX INFO: renamed from: w */
        public C18442z7 mo78125w() {
            String str = this.f54448d;
            if (str != null) {
                return C18442z7.m80034b(str);
            }
            return null;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18202h8
        /* JADX INFO: renamed from: x */
        public InterfaceC18289nb mo78126x() {
            return this.f54447c;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c7$e */
    public static final class e {

        /* JADX INFO: renamed from: k */
        public static final String f54452k = C18406wa.m79845f().m79849a() + "-Sent-Millis";

        /* JADX INFO: renamed from: l */
        public static final String f54453l = C18406wa.m79845f().m79849a() + "-Received-Millis";

        /* JADX INFO: renamed from: a */
        public final String f54454a;

        /* JADX INFO: renamed from: b */
        public final C18377u7 f54455b;

        /* JADX INFO: renamed from: c */
        public final String f54456c;

        /* JADX INFO: renamed from: d */
        public final EnumC18132c8 f54457d;

        /* JADX INFO: renamed from: e */
        public final int f54458e;

        /* JADX INFO: renamed from: f */
        public final String f54459f;

        /* JADX INFO: renamed from: g */
        public final C18377u7 f54460g;

        /* JADX INFO: renamed from: h */
        public final C18364t7 f54461h;

        /* JADX INFO: renamed from: i */
        public final long f54462i;

        /* JADX INFO: renamed from: j */
        public final long f54463j;

        public e(C18188g8 c18188g8) {
            this.f54454a = c18188g8.m78578H().m78310k().toString();
            this.f54455b = C18353s9.m79534e(c18188g8);
            this.f54456c = c18188g8.m78578H().m78307h();
            this.f54457d = c18188g8.m78576F();
            this.f54458e = c18188g8.m78589w();
            this.f54459f = c18188g8.m78572B();
            this.f54460g = c18188g8.m78591y();
            this.f54461h = c18188g8.m78590x();
            this.f54462i = c18188g8.m78579I();
            this.f54463j = c18188g8.m78577G();
        }

        /* JADX INFO: renamed from: a */
        public C18188g8 m78130a(C18391v8.f fVar) {
            String strM79613a = this.f54460g.m79613a("Content-Type");
            String strM79613a2 = this.f54460g.m79613a("Content-Length");
            return new C18188g8.a().m78598a(new C18160e8.a().m78330c(this.f54454a).m78318a(this.f54456c, (AbstractC18174f8) null).m78313a(this.f54455b).m78323a()).m78597a(this.f54457d).m78595a(this.f54458e).m78603a(this.f54459f).m78602a(this.f54460g).m78600a(new d(fVar, strM79613a, strM79613a2)).m78601a(this.f54461h).m78607b(this.f54462i).m78596a(this.f54463j).m78605a();
        }

        public e(InterfaceC18234jc interfaceC18234jc) throws IOException {
            try {
                InterfaceC18289nb interfaceC18289nbM80007a = C18433yb.m80007a(interfaceC18234jc);
                this.f54454a = interfaceC18289nbM80007a.mo78397m();
                this.f54456c = interfaceC18289nbM80007a.mo78397m();
                C18377u7.a aVar = new C18377u7.a();
                int iM78095a = C18131c7.m78095a(interfaceC18289nbM80007a);
                for (int i = 0; i < iM78095a; i++) {
                    aVar.m79628b(interfaceC18289nbM80007a.mo78397m());
                }
                this.f54455b = aVar.m79627a();
                C18431y9 c18431y9M79996a = C18431y9.m79996a(interfaceC18289nbM80007a.mo78397m());
                this.f54457d = c18431y9M79996a.f56724a;
                this.f54458e = c18431y9M79996a.f56725b;
                this.f54459f = c18431y9M79996a.f56726c;
                C18377u7.a aVar2 = new C18377u7.a();
                int iM78095a2 = C18131c7.m78095a(interfaceC18289nbM80007a);
                for (int i2 = 0; i2 < iM78095a2; i2++) {
                    aVar2.m79628b(interfaceC18289nbM80007a.mo78397m());
                }
                String str = f54452k;
                String strM79633c = aVar2.m79633c(str);
                String str2 = f54453l;
                String strM79633c2 = aVar2.m79633c(str2);
                aVar2.m79634d(str);
                aVar2.m79634d(str2);
                this.f54462i = strM79633c != null ? Long.parseLong(strM79633c) : 0L;
                this.f54463j = strM79633c2 != null ? Long.parseLong(strM79633c2) : 0L;
                this.f54460g = aVar2.m79627a();
                if (m78129a()) {
                    String strMo78397m = interfaceC18289nbM80007a.mo78397m();
                    if (strMo78397m.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strMo78397m + "\"");
                    }
                    this.f54461h = C18364t7.m79557a(!interfaceC18289nbM80007a.mo78389f() ? EnumC18230j8.m78883a(interfaceC18289nbM80007a.mo78397m()) : EnumC18230j8.SSL_3_0, C18215i7.m78761a(interfaceC18289nbM80007a.mo78397m()), m78127a(interfaceC18289nbM80007a), m78127a(interfaceC18289nbM80007a));
                } else {
                    this.f54461h = null;
                }
                interfaceC18234jc.close();
            } catch (Throwable th) {
                interfaceC18234jc.close();
                throw th;
            }
        }

        /* JADX INFO: renamed from: a */
        private List<Certificate> m78127a(InterfaceC18289nb interfaceC18289nb) throws IOException {
            int iM78095a = C18131c7.m78095a(interfaceC18289nb);
            if (iM78095a == -1) {
                return Collections.EMPTY_LIST;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iM78095a);
                for (int i = 0; i < iM78095a; i++) {
                    String strMo78397m = interfaceC18289nb.mo78397m();
                    C18261lb c18261lb = new C18261lb();
                    c18261lb.mo78267b(C18303ob.m79290a(strMo78397m));
                    arrayList.add(certificateFactory.generateCertificate(c18261lb.mo78396l()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* JADX INFO: renamed from: a */
        private void m78128a(InterfaceC18275mb interfaceC18275mb, List<Certificate> list) throws IOException {
            try {
                interfaceC18275mb.mo78266b(list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    interfaceC18275mb.mo78261a(C18303ob.m79300e(list.get(i).getEncoded()).mo78727b()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* JADX INFO: renamed from: a */
        public void m78131a(C18391v8.d dVar) throws IOException {
            InterfaceC18275mb interfaceC18275mbM80006a = C18433yb.m80006a(dVar.m79771a(0));
            interfaceC18275mbM80006a.mo78261a(this.f54454a).writeByte(10);
            interfaceC18275mbM80006a.mo78261a(this.f54456c).writeByte(10);
            interfaceC18275mbM80006a.mo78266b(this.f54455b.m79619d()).writeByte(10);
            int iM79619d = this.f54455b.m79619d();
            for (int i = 0; i < iM79619d; i++) {
                interfaceC18275mbM80006a.mo78261a(this.f54455b.m79612a(i)).mo78261a(": ").mo78261a(this.f54455b.m79614b(i)).writeByte(10);
            }
            interfaceC18275mbM80006a.mo78261a(new C18431y9(this.f54457d, this.f54458e, this.f54459f).toString()).writeByte(10);
            interfaceC18275mbM80006a.mo78266b(this.f54460g.m79619d() + 2).writeByte(10);
            int iM79619d2 = this.f54460g.m79619d();
            for (int i2 = 0; i2 < iM79619d2; i2++) {
                interfaceC18275mbM80006a.mo78261a(this.f54460g.m79612a(i2)).mo78261a(": ").mo78261a(this.f54460g.m79614b(i2)).writeByte(10);
            }
            interfaceC18275mbM80006a.mo78261a(f54452k).mo78261a(": ").mo78266b(this.f54462i).writeByte(10);
            interfaceC18275mbM80006a.mo78261a(f54453l).mo78261a(": ").mo78266b(this.f54463j).writeByte(10);
            if (m78129a()) {
                interfaceC18275mbM80006a.writeByte(10);
                interfaceC18275mbM80006a.mo78261a(this.f54461h.m79560a().m78765a()).writeByte(10);
                m78128a(interfaceC18275mbM80006a, this.f54461h.m79563d());
                m78128a(interfaceC18275mbM80006a, this.f54461h.m79561b());
                interfaceC18275mbM80006a.mo78261a(this.f54461h.m79565f().m78885a()).writeByte(10);
            }
            interfaceC18275mbM80006a.close();
        }

        /* JADX INFO: renamed from: a */
        private boolean m78129a() {
            return this.f54454a.startsWith("https://");
        }

        /* JADX INFO: renamed from: a */
        public boolean m78132a(C18160e8 c18160e8, C18188g8 c18188g8) {
            return this.f54454a.equals(c18160e8.m78310k().toString()) && this.f54456c.equals(c18160e8.m78307h()) && C18353s9.m79525a(c18188g8, this.f54455b, c18160e8);
        }
    }

    public C18131c7(File file, long j) {
        this(file, j, InterfaceC18302oa.f55840a);
    }

    /* JADX INFO: renamed from: a */
    public static int m78095a(InterfaceC18289nb interfaceC18289nb) throws IOException {
        try {
            long jMo78399p = interfaceC18289nb.mo78399p();
            String strMo78397m = interfaceC18289nb.mo78397m();
            if (jMo78399p >= 0 && jMo78399p <= 2147483647L && strMo78397m.isEmpty()) {
                return (int) jMo78399p;
            }
            throw new IOException("expected an int but was \"" + jMo78399p + strMo78397m + "\"");
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: A */
    public synchronized int m78098A() {
        return this.f54432g;
    }

    /* JADX INFO: renamed from: B */
    public long m78099B() throws IOException {
        return this.f54427b.m79752A();
    }

    /* JADX INFO: renamed from: C */
    public synchronized void m78100C() {
        this.f54431f++;
    }

    /* JADX INFO: renamed from: D */
    public Iterator<String> m78101D() throws IOException {
        return new b();
    }

    /* JADX INFO: renamed from: E */
    public synchronized int m78102E() {
        return this.f54429d;
    }

    /* JADX INFO: renamed from: F */
    public synchronized int m78103F() {
        return this.f54428c;
    }

    /* JADX INFO: renamed from: b */
    public void m78108b(C18160e8 c18160e8) throws IOException {
        this.f54427b.m79760d(m78096a(c18160e8.m78310k()));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f54427b.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f54427b.flush();
    }

    /* JADX INFO: renamed from: s */
    public void m78109s() throws IOException {
        this.f54427b.m79762s();
    }

    /* JADX INFO: renamed from: t */
    public File m78110t() {
        return this.f54427b.m79764u();
    }

    /* JADX INFO: renamed from: u */
    public void m78111u() throws IOException {
        this.f54427b.m79763t();
    }

    /* JADX INFO: renamed from: v */
    public synchronized int m78112v() {
        return this.f54431f;
    }

    /* JADX INFO: renamed from: w */
    public void m78113w() throws IOException {
        this.f54427b.m79766w();
    }

    /* JADX INFO: renamed from: x */
    public boolean m78114x() {
        return this.f54427b.m79767x();
    }

    /* JADX INFO: renamed from: y */
    public long m78115y() {
        return this.f54427b.m79765v();
    }

    /* JADX INFO: renamed from: z */
    public synchronized int m78116z() {
        return this.f54430e;
    }

    public C18131c7(File file, long j, InterfaceC18302oa interfaceC18302oa) {
        this.f54426a = new a();
        this.f54427b = C18391v8.m79748a(interfaceC18302oa, file, f54422h, 2, j);
    }

    /* JADX INFO: renamed from: a */
    public C18188g8 m78104a(C18160e8 c18160e8) {
        try {
            C18391v8.f fVarM79759c = this.f54427b.m79759c(m78096a(c18160e8.m78310k()));
            if (fVarM79759c == null) {
                return null;
            }
            try {
                e eVar = new e(fVarM79759c.m79783e(0));
                C18188g8 c18188g8M78130a = eVar.m78130a(fVarM79759c);
                if (eVar.m78132a(c18160e8, c18188g8M78130a)) {
                    return c18188g8M78130a;
                }
                C18313p8.m79378a(c18188g8M78130a.m78585s());
                return null;
            } catch (IOException unused) {
                C18313p8.m79378a(fVarM79759c);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC18365t8 m78105a(C18188g8 c18188g8) {
        C18391v8.d dVarM79758b;
        String strM78307h = c18188g8.m78578H().m78307h();
        if (C18366t9.m79566a(c18188g8.m78578H().m78307h())) {
            try {
                m78108b(c18188g8.m78578H());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!strM78307h.equals("GET") || C18353s9.m79531c(c18188g8)) {
            return null;
        }
        e eVar = new e(c18188g8);
        try {
            dVarM79758b = this.f54427b.m79758b(m78096a(c18188g8.m78578H().m78310k()));
            if (dVarM79758b == null) {
                return null;
            }
            try {
                eVar.m78131a(dVarM79758b);
                return new c(dVarM79758b);
            } catch (IOException unused2) {
                m78097a(dVarM79758b);
                return null;
            }
        } catch (IOException unused3) {
            dVarM79758b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m78096a(C18416x7 c18416x7) {
        return C18303ob.m79299d(c18416x7.toString()).mo78733f().mo78731d();
    }

    /* JADX INFO: renamed from: a */
    public void m78106a(C18188g8 c18188g8, C18188g8 c18188g82) {
        C18391v8.d dVarM79784s;
        e eVar = new e(c18188g82);
        try {
            dVarM79784s = ((d) c18188g8.m78585s()).f54446b.m79784s();
            if (dVarM79784s != null) {
                try {
                    eVar.m78131a(dVarM79784s);
                    dVarM79784s.m79775c();
                } catch (IOException unused) {
                    m78097a(dVarM79784s);
                }
            }
        } catch (IOException unused2) {
            dVarM79784s = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78107a(C18378u8 c18378u8) {
        try {
            this.f54432g++;
            if (c18378u8.f56292a != null) {
                this.f54430e++;
            } else if (c18378u8.f56293b != null) {
                this.f54431f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78097a(C18391v8.d dVar) {
        if (dVar != null) {
            try {
                dVar.m79772a();
            } catch (IOException unused) {
            }
        }
    }
}
