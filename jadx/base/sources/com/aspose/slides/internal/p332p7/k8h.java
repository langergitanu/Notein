package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class k8h extends AbstractC7361bz {

    /* JADX INFO: renamed from: ne */
    private static final C7017h4 f25504ne = new C7017h4("form:name", "form:control-implementation", "form:id", "xforms:bind", "form:current-value", "form:disabled", "form:max-length", "form:printable", "form:readonly", "form:tab-index", "form:tab-stop", "form:title", "form:value", "form:convert-empty-to-null", "form:data-field", "properties", "event-listeners");

    /* JADX INFO: renamed from: c5 */
    private boolean f25505c5;

    /* JADX INFO: renamed from: ck */
    private boolean f25506ck;

    /* JADX INFO: renamed from: du */
    private String f25507du;

    /* JADX INFO: renamed from: dy */
    private boolean f25508dy;

    /* JADX INFO: renamed from: fa */
    private String f25509fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f25510h4;

    /* JADX INFO: renamed from: jd */
    private long f25511jd;

    /* JADX INFO: renamed from: k4 */
    private String f25512k4;

    /* JADX INFO: renamed from: kk */
    private String f25513kk;

    /* JADX INFO: renamed from: ks */
    private String f25514ks;

    /* JADX INFO: renamed from: m9 */
    private long f25515m9;

    /* JADX INFO: renamed from: rv */
    private eyu f25516rv;

    /* JADX INFO: renamed from: to */
    private String f25517to;

    /* JADX INFO: renamed from: up */
    private String f25518up;

    /* JADX INFO: renamed from: x1 */
    private String f25519x1;

    /* JADX INFO: renamed from: x6 */
    private hec f25520x6;

    /* JADX INFO: renamed from: yj */
    private boolean f25521yj;

    public k8h() {
        m35206x1();
    }

    public k8h(final AbstractC13912i5 abstractC13912i5) {
        m35206x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.k8h.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (k8h.f25504ne.m27428k4(str)) {
                    case 0:
                        k8h.this.f25512k4 = str2;
                        break;
                    case 1:
                        k8h.this.f25519x1 = str2;
                        break;
                    case 2:
                        k8h.this.f25513kk = str2;
                        break;
                    case 3:
                        k8h.this.f25517to = str2;
                        break;
                    case 4:
                        k8h.this.f25507du = str2;
                        break;
                    case 5:
                        k8h.this.f25510h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        k8h.this.f25515m9 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 7:
                        k8h.this.f25508dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        k8h.this.f25505c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        k8h.this.f25511jd = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 10:
                        k8h.this.f25506ck = C13850af.m65068c5(str2);
                        break;
                    case 11:
                        k8h.this.f25509fa = str2;
                        break;
                    case 12:
                        k8h.this.f25518up = str2;
                        break;
                    case 13:
                        k8h.this.f25521yj = C13850af.m65068c5(str2);
                        break;
                    case 14:
                        k8h.this.f25514ks = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.k8h.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = k8h.f25504ne.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 15) {
                    k8h.this.f25516rv = new eyu(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 16) {
                    return false;
                }
                k8h.this.f25520x6 = new hec(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m35206x1() {
        this.f25510h4 = false;
        this.f25515m9 = 4294967295L;
        this.f25508dy = true;
        this.f25505c5 = false;
        this.f25511jd = 0L;
        this.f25506ck = true;
        this.f25521yj = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f25512k4;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f25519x1;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f25513kk);
        String str5 = this.f25517to;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        c3059ii.m12955x1("form:current-value", this.f25507du);
        boolean z = this.f25510h4;
        String str6 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:disabled", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j = this.f25515m9;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("form:max-length", C13850af.m65147x1(j));
        }
        boolean z2 = this.f25508dy;
        if (!z2) {
            c3059ii.m12955x1("form:printable", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f25505c5;
        if (z3) {
            c3059ii.m12955x1("form:readonly", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j2 = this.f25511jd;
        if ((j2 & 4294967295L) != 0) {
            c3059ii.m12955x1("form:tab-index", C13850af.m65147x1(j2));
        }
        boolean z4 = this.f25506ck;
        if (!z4) {
            c3059ii.m12955x1("form:tab-stop", z4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str7 = this.f25509fa;
        if (str7 != null) {
            c3059ii.m12955x1("form:title", str7);
        }
        c3059ii.m12955x1("form:value", this.f25518up);
        boolean z5 = this.f25521yj;
        if (z5) {
            if (z5) {
                str6 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:convert-empty-to-null", str6);
        }
        String str8 = this.f25514ks;
        if (str8 != null) {
            c3059ii.m12955x1("form:data-field", str8);
        }
        eyu eyuVar = this.f25516rv;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f25520x6;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        c3059ii.mo21898jd();
    }
}
