package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class xxf extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f33120k4 = kwd.m35760k4("push");

    /* JADX INFO: renamed from: ne */
    private static final C7017h4 f33121ne = new C7017h4("form:name", "form:control-implementation", "form:id", "xforms:bind", "form:button-type", "form:disabled", "form:image-data", "form:printable", "form:tab-index", "form:tab-stop", "office:target-frame", "xlink:href", "form:title", "form:value", "properties", "event-listeners");

    /* JADX INFO: renamed from: c5 */
    private boolean f33122c5;

    /* JADX INFO: renamed from: ck */
    private boolean f33123ck;

    /* JADX INFO: renamed from: du */
    private String f33124du;

    /* JADX INFO: renamed from: dy */
    private String f33125dy;

    /* JADX INFO: renamed from: fa */
    private String f33126fa;

    /* JADX INFO: renamed from: h4 */
    private int f33127h4;

    /* JADX INFO: renamed from: jd */
    private long f33128jd;

    /* JADX INFO: renamed from: kk */
    private String f33129kk;

    /* JADX INFO: renamed from: ks */
    private String f33130ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f33131m9;

    /* JADX INFO: renamed from: rv */
    private eyu f33132rv;

    /* JADX INFO: renamed from: to */
    private String f33133to;

    /* JADX INFO: renamed from: up */
    private String f33134up;

    /* JADX INFO: renamed from: x1 */
    private String f33135x1;

    /* JADX INFO: renamed from: x6 */
    private hec f33136x6;

    /* JADX INFO: renamed from: yj */
    private String f33137yj;

    public xxf() {
        m44732x1();
    }

    public xxf(final AbstractC13912i5 abstractC13912i5) {
        m44732x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xxf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (xxf.f33121ne.m27428k4(str)) {
                    case 0:
                        xxf.this.f33135x1 = str2;
                        break;
                    case 1:
                        xxf.this.f33129kk = str2;
                        break;
                    case 2:
                        xxf.this.f33133to = str2;
                        break;
                    case 3:
                        xxf.this.f33124du = str2;
                        break;
                    case 4:
                        xxf.this.f33127h4 = kwd.m35760k4(str2);
                        break;
                    case 5:
                        xxf.this.f33131m9 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        xxf.this.f33125dy = str2;
                        break;
                    case 7:
                        xxf.this.f33122c5 = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        xxf.this.f33128jd = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 9:
                        xxf.this.f33123ck = C13850af.m65068c5(str2);
                        break;
                    case 10:
                        xxf.this.f33126fa = str2;
                        break;
                    case 11:
                        xxf.this.f33134up = str2;
                        break;
                    case 12:
                        xxf.this.f33137yj = str2;
                        break;
                    case 13:
                        xxf.this.f33130ks = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xxf.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = xxf.f33121ne.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 14) {
                    xxf.this.f33132rv = new eyu(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 15) {
                    return false;
                }
                xxf.this.f33136x6 = new hec(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m44732x1() {
        this.f33127h4 = f33120k4;
        this.f33131m9 = false;
        this.f33122c5 = true;
        this.f33128jd = 0L;
        this.f33123ck = true;
        this.f33126fa = "_blank";
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f33135x1;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f33129kk;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f33133to);
        String str5 = this.f33124du;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        int i = this.f33127h4;
        if (i != f33120k4) {
            c3059ii.m12955x1("form:button-type", kwd.m35761k4(i));
        }
        boolean z = this.f33131m9;
        String str6 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:disabled", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str7 = this.f33125dy;
        if (str7 != null) {
            c3059ii.m12955x1("form:image-data", str7);
        }
        boolean z2 = this.f33122c5;
        if (!z2) {
            c3059ii.m12955x1("form:printable", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j = this.f33128jd;
        if ((4294967295L & j) != 0) {
            c3059ii.m12955x1("form:tab-index", C13850af.m65147x1(j));
        }
        boolean z3 = this.f33123ck;
        if (!z3) {
            if (z3) {
                str6 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:tab-stop", str6);
        }
        if (!"_blank".equals(this.f33126fa)) {
            c3059ii.m12955x1("office:target-frame", this.f33126fa);
        }
        String str8 = this.f33134up;
        if (str8 != null) {
            c3059ii.m12955x1("xlink:href", str8);
        }
        String str9 = this.f33137yj;
        if (str9 != null) {
            c3059ii.m12955x1("form:title", str9);
        }
        c3059ii.m12955x1("form:value", this.f33130ks);
        eyu eyuVar = this.f33132rv;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f33136x6;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        c3059ii.mo21898jd();
    }
}
