package com.huawei.hms.network.embedded;

import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18188g8;
import com.huawei.hms.network.embedded.C18377u7;
import com.huawei.hms.network.embedded.C18378u8;
import com.huawei.hms.network.embedded.InterfaceC18429y7;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.s8 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18352s8 implements InterfaceC18429y7 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC18417x8 f56131a;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.s8$a */
    public class a implements InterfaceC18234jc {

        /* JADX INFO: renamed from: a */
        public boolean f56132a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC18289nb f56133b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC18365t8 f56134c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC18275mb f56135d;

        public a(InterfaceC18289nb interfaceC18289nb, InterfaceC18365t8 interfaceC18365t8, InterfaceC18275mb interfaceC18275mb) {
            this.f56133b = interfaceC18289nb;
            this.f56134c = interfaceC18365t8;
            this.f56135d = interfaceC18275mb;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        /* JADX INFO: renamed from: c */
        public long mo77914c(C18261lb c18261lb, long j) throws IOException {
            try {
                long jMo77914c = this.f56133b.mo77914c(c18261lb, j);
                if (jMo77914c != -1) {
                    c18261lb.m79080a(this.f56135d.mo78258a(), c18261lb.m79076B() - jMo77914c, jMo77914c);
                    this.f56135d.mo78273n();
                    return jMo77914c;
                }
                if (!this.f56132a) {
                    this.f56132a = true;
                    this.f56135d.close();
                }
                return -1L;
            } catch (IOException e) {
                if (this.f56132a) {
                    throw e;
                }
                this.f56132a = true;
                this.f56134c.abort();
                throw e;
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f56132a && !C18313p8.m79382a(this, 100, TimeUnit.MILLISECONDS)) {
                this.f56132a = true;
                this.f56134c.abort();
            }
            this.f56133b.close();
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        public C18248kc timeout() {
            return this.f56133b.timeout();
        }
    }

    public C18352s8(InterfaceC18417x8 interfaceC18417x8) {
        this.f56131a = interfaceC18417x8;
    }

    /* JADX INFO: renamed from: a */
    public static C18188g8 m79508a(C18188g8 c18188g8) {
        return (c18188g8 == null || c18188g8.m78585s() == null) ? c18188g8 : c18188g8.m78574D().m78600a((AbstractC18202h8) null).m78605a();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m79512b(String str) {
        return (HttpHeaders.CONNECTION.equalsIgnoreCase(str) || HttpHeaders.KEEP_ALIVE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || HttpHeaders.f51754TE.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) || HttpHeaders.UPGRADE.equalsIgnoreCase(str)) ? false : true;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7
    public C18188g8 intercept(InterfaceC18429y7.a aVar) throws IOException {
        InterfaceC18417x8 interfaceC18417x8 = this.f56131a;
        C18188g8 c18188g8Mo78117a = interfaceC18417x8 != null ? interfaceC18417x8.mo78117a(aVar.request()) : null;
        C18378u8 c18378u8M79642a = new C18378u8.a(System.currentTimeMillis(), aVar.request(), c18188g8Mo78117a).m79642a();
        C18160e8 c18160e8 = c18378u8M79642a.f56292a;
        C18188g8 c18188g8 = c18378u8M79642a.f56293b;
        InterfaceC18417x8 interfaceC18417x82 = this.f56131a;
        if (interfaceC18417x82 != null) {
            interfaceC18417x82.mo78121a(c18378u8M79642a);
        }
        if (c18188g8Mo78117a != null && c18188g8 == null) {
            C18313p8.m79378a(c18188g8Mo78117a.m78585s());
        }
        if (c18160e8 == null && c18188g8 == null) {
            return new C18188g8.a().m78598a(aVar.request()).m78597a(EnumC18132c8.HTTP_1_1).m78595a(504).m78603a("Unsatisfiable Request (only-if-cached)").m78600a(C18313p8.f55895d).m78607b(-1L).m78596a(System.currentTimeMillis()).m78605a();
        }
        if (c18160e8 == null) {
            return c18188g8.m78574D().m78599a(m79508a(c18188g8)).m78605a();
        }
        try {
            C18188g8 c18188g8Mo79643a = aVar.mo79643a(c18160e8);
            if (c18188g8Mo79643a == null && c18188g8Mo78117a != null) {
            }
            if (c18188g8 != null) {
                if (c18188g8Mo79643a.m78589w() == 304) {
                    C18188g8 c18188g8M78605a = c18188g8.m78574D().m78602a(m79510a(c18188g8.m78591y(), c18188g8Mo79643a.m78591y())).m78607b(c18188g8Mo79643a.m78579I()).m78596a(c18188g8Mo79643a.m78577G()).m78599a(m79508a(c18188g8)).m78608b(m79508a(c18188g8Mo79643a)).m78605a();
                    c18188g8Mo79643a.m78585s().close();
                    this.f56131a.mo78119a();
                    this.f56131a.mo78120a(c18188g8, c18188g8M78605a);
                    return c18188g8M78605a;
                }
                C18313p8.m79378a(c18188g8.m78585s());
            }
            C18188g8 c18188g8M78605a2 = c18188g8Mo79643a.m78574D().m78599a(m79508a(c18188g8)).m78608b(m79508a(c18188g8Mo79643a)).m78605a();
            if (this.f56131a != null) {
                if (C18353s9.m79528b(c18188g8M78605a2) && C18378u8.m79636a(c18188g8M78605a2, c18160e8)) {
                    return m79509a(this.f56131a.mo78118a(c18188g8M78605a2), c18188g8M78605a2);
                }
                if (C18366t9.m79566a(c18160e8.m78307h())) {
                    try {
                        this.f56131a.mo78122b(c18160e8);
                    } catch (IOException unused) {
                    }
                }
            }
            return c18188g8M78605a2;
        } finally {
            if (c18188g8Mo78117a != null) {
                C18313p8.m79378a(c18188g8Mo78117a.m78585s());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private C18188g8 m79509a(InterfaceC18365t8 interfaceC18365t8, C18188g8 c18188g8) throws IOException {
        InterfaceC18220ic interfaceC18220icMo78123a;
        if (interfaceC18365t8 == null || (interfaceC18220icMo78123a = interfaceC18365t8.mo78123a()) == null) {
            return c18188g8;
        }
        return c18188g8.m78574D().m78600a(new C18392v9(c18188g8.m78582b("Content-Type"), c18188g8.m78585s().mo78124v(), C18433yb.m80007a(new a(c18188g8.m78585s().mo78126x(), interfaceC18365t8, C18433yb.m80006a(interfaceC18220icMo78123a))))).m78605a();
    }

    /* JADX INFO: renamed from: a */
    public static C18377u7 m79510a(C18377u7 c18377u7, C18377u7 c18377u72) {
        C18377u7.a aVar = new C18377u7.a();
        int iM79619d = c18377u7.m79619d();
        for (int i = 0; i < iM79619d; i++) {
            String strM79612a = c18377u7.m79612a(i);
            String strM79614b = c18377u7.m79614b(i);
            if ((!HttpHeaders.WARNING.equalsIgnoreCase(strM79612a) || !strM79614b.startsWith("1")) && (m79511a(strM79612a) || !m79512b(strM79612a) || c18377u72.m79613a(strM79612a) == null)) {
                AbstractC18286n8.f55777a.mo77973a(aVar, strM79612a, strM79614b);
            }
        }
        int iM79619d2 = c18377u72.m79619d();
        for (int i2 = 0; i2 < iM79619d2; i2++) {
            String strM79612a2 = c18377u72.m79612a(i2);
            if (!m79511a(strM79612a2) && m79512b(strM79612a2)) {
                AbstractC18286n8.f55777a.mo77973a(aVar, strM79612a2, c18377u72.m79614b(i2));
            }
        }
        return aVar.m79627a();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79511a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }
}
