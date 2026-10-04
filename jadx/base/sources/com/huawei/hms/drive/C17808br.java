package com.huawei.hms.drive;

import com.google.common.net.HttpHeaders;
import com.huawei.hms.drive.C17788ay;
import com.huawei.hms.drive.C17800bj;
import com.huawei.hms.drive.C17810bt;
import com.huawei.hms.drive.InterfaceC17793bc;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34540OooOo0;
import oOo00OoO.C34547OooOoo;
import oOo00OoO.InterfaceC34525OooO0o;
import oOo00OoO.InterfaceC34544OooOoO;
import oOo00OoO.InterfaceC34548OooOoo0;

/* JADX INFO: renamed from: com.huawei.hms.drive.br */
/* JADX INFO: loaded from: classes6.dex */
public final class C17808br implements InterfaceC17793bc {

    /* JADX INFO: renamed from: a */
    final InterfaceC17812bv f52978a;

    public C17808br(InterfaceC17812bv interfaceC17812bv) {
        this.f52978a = interfaceC17812bv;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m76362b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    @Override // com.huawei.hms.drive.InterfaceC17793bc
    /* JADX INFO: renamed from: a */
    public C17800bj mo76180a(InterfaceC17793bc.a aVar) throws IOException {
        InterfaceC17812bv interfaceC17812bv = this.f52978a;
        C17800bj c17800bjM76381a = interfaceC17812bv != null ? interfaceC17812bv.m76381a(aVar.mo76181a()) : null;
        C17810bt c17810btM76371a = new C17810bt.a(System.currentTimeMillis(), aVar.mo76181a(), c17800bjM76381a).m76371a();
        C17798bh c17798bh = c17810btM76371a.f52984a;
        C17800bj c17800bj = c17810btM76371a.f52985b;
        InterfaceC17812bv interfaceC17812bv2 = this.f52978a;
        if (interfaceC17812bv2 != null) {
            interfaceC17812bv2.m76385a(c17810btM76371a);
        }
        if (c17800bjM76381a != null && c17800bj == null) {
            C17806bp.m76338a(c17800bjM76381a.m76287f());
        }
        if (c17798bh == null && c17800bj == null) {
            return new C17800bj.a().m76300a(aVar.mo76181a()).m76299a(EnumC17796bf.HTTP_1_1).m76295a(504).m76303a("Unsatisfiable Request (only-if-cached)").m76302a(C17806bp.f52956c).m76296a(-1L).m76306b(System.currentTimeMillis()).m76305a();
        }
        if (c17798bh == null) {
            return c17800bj.m76288g().m76307b(m76359a(c17800bj)).m76305a();
        }
        try {
            C17800bj c17800bjMo76182a = aVar.mo76182a(c17798bh);
            if (c17800bjMo76182a == null && c17800bjM76381a != null) {
            }
            if (c17800bj != null) {
                if (c17800bjMo76182a != null && c17800bjMo76182a.m76283b() == 304) {
                    C17800bj c17800bjM76305a = c17800bj.m76288g().m76298a(m76358a(c17800bj.m76286e(), c17800bjMo76182a.m76286e())).m76296a(c17800bjMo76182a.m76291j()).m76306b(c17800bjMo76182a.m76292k()).m76307b(m76359a(c17800bj)).m76301a(m76359a(c17800bjMo76182a)).m76305a();
                    c17800bjMo76182a.m76287f().close();
                    this.f52978a.m76383a();
                    this.f52978a.m76384a(c17800bj, c17800bjM76305a);
                    return c17800bjM76305a;
                }
                C17806bp.m76338a(c17800bj.m76287f());
            }
            if (c17800bjMo76182a == null) {
                throw new IOException("networkResponse is null in cache Interceptor");
            }
            C17800bj c17800bjM76305a2 = c17800bjMo76182a.m76288g().m76307b(m76359a(c17800bj)).m76301a(m76359a(c17800bjMo76182a)).m76305a();
            if (this.f52978a != null) {
                if (C17827cj.m76489b(c17800bjM76305a2) && C17810bt.m76365a(c17800bjM76305a2, c17798bh)) {
                    return m76360a(this.f52978a.m76382a(c17800bjM76305a2), c17800bjM76305a2);
                }
                if (C17828ck.m76490a(c17798bh.m76263b())) {
                    try {
                        this.f52978a.m76386b(c17798bh);
                    } catch (IOException unused) {
                    }
                }
            }
            return c17800bjM76305a2;
        } finally {
            if (c17800bjM76381a != null) {
                C17806bp.m76338a(c17800bjM76381a.m76287f());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static C17800bj m76359a(C17800bj c17800bj) {
        return (c17800bj == null || c17800bj.m76287f() == null) ? c17800bj : c17800bj.m76288g().m76302a((AbstractC17801bk) null).m76305a();
    }

    /* JADX INFO: renamed from: a */
    private C17800bj m76360a(final InterfaceC17809bs interfaceC17809bs, C17800bj c17800bj) throws IOException {
        InterfaceC34544OooOoO interfaceC34544OooOoOM76363a;
        if (interfaceC17809bs == null || (interfaceC34544OooOoOM76363a = interfaceC17809bs.m76363a()) == null) {
            return c17800bj;
        }
        final InterfaceC34525OooO0o interfaceC34525OooO0oMo76314c = c17800bj.m76287f().mo76314c();
        final C34540OooOo0 c34540OooOo0OooO00o = C34535OooOOOo.OooO00o(interfaceC34544OooOoOM76363a);
        return c17800bj.m76288g().m76302a(new C17830cm(c17800bj.m76281a("Content-Type"), c17800bj.m76287f().mo76312a(), C34535OooOOOo.OooO0O0(new InterfaceC34548OooOoo0() { // from class: com.huawei.hms.drive.br.1

            /* JADX INFO: renamed from: a */
            boolean f52979a;

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.f52979a && !C17806bp.m76344a(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f52979a = true;
                    interfaceC17809bs.m76364b();
                }
                interfaceC34525OooO0oMo76314c.close();
            }

            @Override // oOo00OoO.InterfaceC34548OooOoo0
            public long read(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
                try {
                    long j2 = interfaceC34525OooO0oMo76314c.read(c34524OooO0Oo, j);
                    if (j2 != -1) {
                        c34524OooO0Oo.OooOOoo(c34540OooOo0OooO00o.OooOO0(), c34524OooO0Oo.f123723OooOo - j2, j2);
                        c34540OooOo0OooO00o.o000000();
                        return j2;
                    }
                    if (!this.f52979a) {
                        this.f52979a = true;
                        c34540OooOo0OooO00o.close();
                    }
                    return -1L;
                } catch (IOException e) {
                    if (this.f52979a) {
                        throw e;
                    }
                    this.f52979a = true;
                    interfaceC17809bs.m76364b();
                    throw e;
                }
            }

            @Override // oOo00OoO.InterfaceC34548OooOoo0
            public C34547OooOoo timeout() {
                return interfaceC34525OooO0oMo76314c.timeout();
            }
        }))).m76305a();
    }

    /* JADX INFO: renamed from: a */
    private static C17788ay m76358a(C17788ay c17788ay, C17788ay c17788ay2) {
        C17788ay.a aVar = new C17788ay.a();
        int iM76072a = c17788ay.m76072a();
        for (int i = 0; i < iM76072a; i++) {
            String strM76073a = c17788ay.m76073a(i);
            String strM76076b = c17788ay.m76076b(i);
            if ((!HttpHeaders.WARNING.equalsIgnoreCase(strM76073a) || !strM76076b.startsWith("1")) && (m76362b(strM76073a) || !m76361a(strM76073a) || c17788ay2.m76074a(strM76073a) == null)) {
                AbstractC17804bn.f52952a.mo76228a(aVar, strM76073a, strM76076b);
            }
        }
        int iM76072a2 = c17788ay2.m76072a();
        for (int i2 = 0; i2 < iM76072a2; i2++) {
            String strM76073a2 = c17788ay2.m76073a(i2);
            if (!m76362b(strM76073a2) && m76361a(strM76073a2)) {
                AbstractC17804bn.f52952a.mo76228a(aVar, strM76073a2, c17788ay2.m76076b(i2));
            }
        }
        return aVar.m76081a();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m76361a(String str) {
        return (HttpHeaders.CONNECTION.equalsIgnoreCase(str) || HttpHeaders.KEEP_ALIVE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || HttpHeaders.f51754TE.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) || HttpHeaders.UPGRADE.equalsIgnoreCase(str)) ? false : true;
    }
}
