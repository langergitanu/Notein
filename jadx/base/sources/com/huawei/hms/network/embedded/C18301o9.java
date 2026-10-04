package com.huawei.hms.network.embedded;

import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18160e8;
import com.huawei.hms.network.embedded.C18188g8;
import com.huawei.hms.network.embedded.InterfaceC18429y7;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.o9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18301o9 implements InterfaceC18429y7 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC18285n7 f55839a;

    public C18301o9(InterfaceC18285n7 interfaceC18285n7) {
        this.f55839a = interfaceC18285n7;
    }

    /* JADX INFO: renamed from: a */
    private String m79278a(List<C18271m7> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C18271m7 c18271m7 = list.get(i);
            sb.append(c18271m7.m79140e());
            sb.append('=');
            sb.append(c18271m7.m79144i());
        }
        return sb.toString();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7
    public C18188g8 intercept(InterfaceC18429y7.a aVar) throws IOException {
        C18160e8 c18160e8Request = aVar.request();
        C18160e8.a aVarM78308i = c18160e8Request.m78308i();
        AbstractC18174f8 abstractC18174f8M78300b = c18160e8Request.m78300b();
        if (abstractC18174f8M78300b != null) {
            C18442z7 c18442z7ContentType = abstractC18174f8M78300b.contentType();
            if (c18442z7ContentType != null) {
                aVarM78308i.m78327b("Content-Type", c18442z7ContentType.toString());
            }
            long jContentLength = abstractC18174f8M78300b.contentLength();
            if (jContentLength != -1) {
                aVarM78308i.m78327b("Content-Length", Long.toString(jContentLength));
                aVarM78308i.m78326b(HttpHeaders.TRANSFER_ENCODING);
            } else {
                aVarM78308i.m78327b(HttpHeaders.TRANSFER_ENCODING, "chunked");
                aVarM78308i.m78326b("Content-Length");
            }
        }
        boolean z = false;
        if (c18160e8Request.m78298a("Host") == null) {
            aVarM78308i.m78327b("Host", C18313p8.m79363a(c18160e8Request.m78310k(), false));
        }
        if (c18160e8Request.m78298a(HttpHeaders.CONNECTION) == null) {
            aVarM78308i.m78327b(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        }
        if (c18160e8Request.m78298a(HttpHeaders.ACCEPT_ENCODING) == null && c18160e8Request.m78298a("Range") == null) {
            aVarM78308i.m78327b(HttpHeaders.ACCEPT_ENCODING, "gzip");
            z = true;
        }
        List<C18271m7> listMo79258a = this.f55839a.mo79258a(c18160e8Request.m78310k());
        if (!listMo79258a.isEmpty()) {
            aVarM78308i.m78327b(HttpHeaders.COOKIE, m79278a(listMo79258a));
        }
        if (c18160e8Request.m78298a("User-Agent") == null) {
            aVarM78308i.m78327b("User-Agent", C18326q8.m79417a());
        }
        C18188g8 c18188g8Mo79643a = aVar.mo79643a(aVarM78308i.m78323a());
        C18353s9.m79523a(this.f55839a, c18160e8Request.m78310k(), c18188g8Mo79643a.m78591y());
        C18188g8.a aVarM78598a = c18188g8Mo79643a.m78574D().m78598a(c18160e8Request);
        if (z && "gzip".equalsIgnoreCase(c18188g8Mo79643a.m78582b("Content-Encoding")) && C18353s9.m79528b(c18188g8Mo79643a)) {
            C18381ub c18381ub = new C18381ub(c18188g8Mo79643a.m78585s().mo78126x());
            aVarM78598a.m78602a(c18188g8Mo79643a.m78591y().m79617c().m79634d("Content-Encoding").m79634d("Content-Length").m79627a());
            aVarM78598a.m78600a(new C18392v9(c18188g8Mo79643a.m78582b("Content-Type"), -1L, C18433yb.m80007a(c18381ub)));
        }
        return aVarM78598a.m78605a();
    }
}
