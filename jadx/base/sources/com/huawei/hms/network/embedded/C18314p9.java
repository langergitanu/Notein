package com.huawei.hms.network.embedded;

import OooO0O0.OooO0o;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18188g8;
import com.huawei.hms.network.embedded.InterfaceC18429y7;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.p9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18314p9 implements InterfaceC18429y7 {

    /* JADX INFO: renamed from: a */
    public final boolean f55904a;

    public C18314p9(boolean z) {
        this.f55904a = z;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7
    public C18188g8 intercept(InterfaceC18429y7.a aVar) throws IOException {
        boolean z;
        C18188g8.a aVarM78574D;
        AbstractC18202h8 abstractC18202h8M78421a;
        C18379u9 c18379u9 = (C18379u9) aVar;
        C18175f9 c18175f9M79652e = c18379u9.m79652e();
        C18160e8 c18160e8Request = c18379u9.request();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c18175f9M79652e.m78425a(c18160e8Request);
        C18188g8.a aVarM78420a = null;
        if (!C18366t9.m79567b(c18160e8Request.m78307h()) || c18160e8Request.m78300b() == null) {
            c18175f9M79652e.m78435i();
            z = false;
        } else {
            if ("100-continue".equalsIgnoreCase(c18160e8Request.m78298a(HttpHeaders.EXPECT))) {
                c18175f9M79652e.m78431e();
                c18175f9M79652e.m78436j();
                aVarM78420a = c18175f9M79652e.m78420a(true);
                z = true;
            } else {
                z = false;
            }
            if (aVarM78420a != null) {
                c18175f9M79652e.m78435i();
                if (!c18175f9M79652e.m78427b().m78794g()) {
                    c18175f9M79652e.m78434h();
                }
            } else if (c18160e8Request.m78300b().isDuplex()) {
                c18175f9M79652e.m78431e();
                c18160e8Request.m78300b().writeTo(C18433yb.m80006a(c18175f9M79652e.m78422a(c18160e8Request, true)));
            } else {
                InterfaceC18275mb interfaceC18275mbM80006a = C18433yb.m80006a(c18175f9M79652e.m78422a(c18160e8Request, false));
                c18160e8Request.m78300b().writeTo(interfaceC18275mbM80006a);
                interfaceC18275mbM80006a.close();
            }
        }
        if (c18160e8Request.m78300b() == null || !c18160e8Request.m78300b().isDuplex()) {
            c18175f9M79652e.m78430d();
        }
        if (!z) {
            c18175f9M79652e.m78436j();
        }
        if (aVarM78420a == null) {
            aVarM78420a = c18175f9M79652e.m78420a(false);
        }
        C18188g8 c18188g8M78605a = aVarM78420a.m78598a(c18160e8Request).m78601a(c18175f9M79652e.m78427b().mo78781a()).m78607b(jCurrentTimeMillis).m78596a(System.currentTimeMillis()).m78605a();
        int iM78589w = c18188g8M78605a.m78589w();
        if (iM78589w == 100) {
            c18188g8M78605a = c18175f9M79652e.m78420a(false).m78598a(c18160e8Request).m78601a(c18175f9M79652e.m78427b().mo78781a()).m78607b(jCurrentTimeMillis).m78596a(System.currentTimeMillis()).m78605a();
            iM78589w = c18188g8M78605a.m78589w();
        }
        c18175f9M79652e.m78428b(c18188g8M78605a);
        if (this.f55904a && iM78589w == 101) {
            aVarM78574D = c18188g8M78605a.m78574D();
            abstractC18202h8M78421a = C18313p8.f55895d;
        } else {
            aVarM78574D = c18188g8M78605a.m78574D();
            abstractC18202h8M78421a = c18175f9M79652e.m78421a(c18188g8M78605a);
        }
        C18188g8 c18188g8M78605a2 = aVarM78574D.m78600a(abstractC18202h8M78421a).m78605a();
        if ("close".equalsIgnoreCase(c18188g8M78605a2.m78578H().m78298a(HttpHeaders.CONNECTION)) || "close".equalsIgnoreCase(c18188g8M78605a2.m78582b(HttpHeaders.CONNECTION))) {
            c18175f9M79652e.m78434h();
        }
        if ((iM78589w != 204 && iM78589w != 205) || c18188g8M78605a2.m78585s().mo78124v() <= 0) {
            return c18188g8M78605a2;
        }
        StringBuilder sbOooO0OO = OooO0o.OooO0OO(iM78589w, "HTTP ", " had non-zero Content-Length: ");
        sbOooO0OO.append(c18188g8M78605a2.m78585s().mo78124v());
        throw new ProtocolException(sbOooO0OO.toString());
    }
}
