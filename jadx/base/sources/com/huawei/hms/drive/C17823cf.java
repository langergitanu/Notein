package com.huawei.hms.drive;

import com.google.common.net.HttpHeaders;
import com.huawei.hms.drive.C17798bh;
import com.huawei.hms.drive.C17800bj;
import com.huawei.hms.drive.InterfaceC17793bc;
import java.io.IOException;
import java.util.List;
import oOo00OoO.C34533OooOOO0;
import oOo00OoO.C34535OooOOOo;

/* JADX INFO: renamed from: com.huawei.hms.drive.cf */
/* JADX INFO: loaded from: classes6.dex */
public final class C17823cf implements InterfaceC17793bc {

    /* JADX INFO: renamed from: a */
    private final InterfaceC17783at f53108a;

    public C17823cf(InterfaceC17783at interfaceC17783at) {
        this.f53108a = interfaceC17783at;
    }

    @Override // com.huawei.hms.drive.InterfaceC17793bc
    /* JADX INFO: renamed from: a */
    public C17800bj mo76180a(InterfaceC17793bc.a aVar) throws IOException {
        C17798bh c17798bhMo76181a = aVar.mo76181a();
        C17798bh.a aVarM76268g = c17798bhMo76181a.m76268g();
        AbstractC17799bi abstractC17799biM76265d = c17798bhMo76181a.m76265d();
        if (abstractC17799biM76265d != null) {
            C17794bd c17794bdContentType = abstractC17799biM76265d.contentType();
            if (c17794bdContentType != null) {
                aVarM76268g.m76276a("Content-Type", c17794bdContentType.toString());
            }
            long jContentLength = abstractC17799biM76265d.contentLength();
            if (jContentLength != -1) {
                aVarM76268g.m76276a("Content-Length", Long.toString(jContentLength));
                aVarM76268g.m76278b(HttpHeaders.TRANSFER_ENCODING);
            } else {
                aVarM76268g.m76276a(HttpHeaders.TRANSFER_ENCODING, "chunked");
                aVarM76268g.m76278b("Content-Length");
            }
        }
        boolean z = false;
        if (c17798bhMo76181a.m76262a("Host") == null) {
            aVarM76268g.m76276a("Host", C17806bp.m76328a(c17798bhMo76181a.m76261a(), false));
        }
        if (c17798bhMo76181a.m76262a(HttpHeaders.CONNECTION) == null) {
            aVarM76268g.m76276a(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        }
        if (c17798bhMo76181a.m76262a(HttpHeaders.ACCEPT_ENCODING) == null && c17798bhMo76181a.m76262a("Range") == null) {
            aVarM76268g.m76276a(HttpHeaders.ACCEPT_ENCODING, "gzip");
            z = true;
        }
        List<C17782as> listMo76034a = this.f53108a.mo76034a(c17798bhMo76181a.m76261a());
        if (!listMo76034a.isEmpty()) {
            aVarM76268g.m76276a(HttpHeaders.COOKIE, m76471a(listMo76034a));
        }
        if (c17798bhMo76181a.m76262a("User-Agent") == null) {
            aVarM76268g.m76276a("User-Agent", C17807bq.m76357a());
        }
        C17800bj c17800bjMo76182a = aVar.mo76182a(aVarM76268g.m76277a());
        C17827cj.m76487a(this.f53108a, c17798bhMo76181a.m76261a(), c17800bjMo76182a.m76286e());
        C17800bj.a aVarM76300a = c17800bjMo76182a.m76288g().m76300a(c17798bhMo76181a);
        if (z && "gzip".equalsIgnoreCase(c17800bjMo76182a.m76281a("Content-Encoding")) && C17827cj.m76489b(c17800bjMo76182a)) {
            C34533OooOOO0 c34533OooOOO0 = new C34533OooOOO0(c17800bjMo76182a.m76287f().mo76314c());
            aVarM76300a.m76298a(c17800bjMo76182a.m76286e().m76075b().m76082b("Content-Encoding").m76082b("Content-Length").m76081a());
            aVarM76300a.m76302a(new C17830cm(c17800bjMo76182a.m76281a("Content-Type"), -1L, C34535OooOOOo.OooO0O0(c34533OooOOO0)));
        }
        return aVarM76300a.m76305a();
    }

    /* JADX INFO: renamed from: a */
    private String m76471a(List<C17782as> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C17782as c17782as = list.get(i);
            sb.append(c17782as.m76031a());
            sb.append('=');
            sb.append(c17782as.m76033b());
        }
        return sb.toString();
    }
}
