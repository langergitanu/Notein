package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class eem extends AbstractC7361bz {

    /* JADX INFO: renamed from: u4 */
    private static final C7017h4 f22127u4 = new C7017h4("form:value", "form:current-value", "form:min-value", "form:max-value", "form:name", "form:control-implementation", "form:id", "xforms:bind", "form:disabled", "form:max-length", "form:printable", "form:readonly", "form:tab-index", "form:tab-stop", "form:title", "form:convert-empty-to-null", "form:data-field", "properties", "event-listeners");

    /* JADX INFO: renamed from: c5 */
    private boolean f22128c5;

    /* JADX INFO: renamed from: ck */
    private boolean f22129ck;

    /* JADX INFO: renamed from: du */
    private String f22130du;

    /* JADX INFO: renamed from: dy */
    private String f22131dy;

    /* JADX INFO: renamed from: fa */
    private boolean f22132fa;

    /* JADX INFO: renamed from: h4 */
    private String f22133h4;

    /* JADX INFO: renamed from: ix */
    private hec f22134ix;

    /* JADX INFO: renamed from: jd */
    private long f22135jd;

    /* JADX INFO: renamed from: ks */
    private String f22138ks;

    /* JADX INFO: renamed from: m9 */
    private String f22139m9;

    /* JADX INFO: renamed from: ne */
    private eyu f22140ne;

    /* JADX INFO: renamed from: rv */
    private boolean f22141rv;

    /* JADX INFO: renamed from: up */
    private long f22143up;

    /* JADX INFO: renamed from: x6 */
    private String f22145x6;

    /* JADX INFO: renamed from: yj */
    private boolean f22146yj;

    /* JADX INFO: renamed from: k4 */
    private C14084qq f22136k4 = new C14084qq();

    /* JADX INFO: renamed from: x1 */
    private C14084qq f22144x1 = new C14084qq();

    /* JADX INFO: renamed from: kk */
    private C14084qq f22137kk = new C14084qq();

    /* JADX INFO: renamed from: to */
    private C14084qq f22142to = new C14084qq();

    public eem() {
        m30960x1();
    }

    public eem(final AbstractC13912i5 abstractC13912i5) {
        m30960x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.eem.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (eem.f22127u4.m27428k4(str)) {
                    case 0:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(eem.this.f22136k4);
                        break;
                    case 1:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(eem.this.f22144x1);
                        break;
                    case 2:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(eem.this.f22137kk);
                        break;
                    case 3:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(eem.this.f22142to);
                        break;
                    case 4:
                        eem.this.f22130du = str2;
                        break;
                    case 5:
                        eem.this.f22133h4 = str2;
                        break;
                    case 6:
                        eem.this.f22139m9 = str2;
                        break;
                    case 7:
                        eem.this.f22131dy = str2;
                        break;
                    case 8:
                        eem.this.f22128c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        eem.this.f22135jd = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 10:
                        eem.this.f22129ck = C13850af.m65068c5(str2);
                        break;
                    case 11:
                        eem.this.f22132fa = C13850af.m65068c5(str2);
                        break;
                    case 12:
                        eem.this.f22143up = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 13:
                        eem.this.f22146yj = C13850af.m65068c5(str2);
                        break;
                    case 14:
                        eem.this.f22138ks = str2;
                        break;
                    case 15:
                        eem.this.f22141rv = C13850af.m65068c5(str2);
                        break;
                    case 16:
                        eem.this.f22145x6 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.eem.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = eem.f22127u4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 17) {
                    eem.this.f22140ne = new eyu(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 18) {
                    return false;
                }
                eem.this.f22134ix = new hec(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m30960x1() {
        C14084qq c14084qq = C14084qq.f47299x1;
        c14084qq.CloneTo(this.f22136k4);
        c14084qq.CloneTo(this.f22144x1);
        c14084qq.CloneTo(this.f22137kk);
        c14084qq.CloneTo(this.f22142to);
        this.f22128c5 = false;
        this.f22135jd = 4294967295L;
        this.f22129ck = true;
        this.f22132fa = false;
        this.f22143up = 0L;
        this.f22146yj = true;
        this.f22141rv = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C20986OooO0o0.OooO0O0(this.f22136k4, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "form:value");
        C20986OooO0o0.OooO0O0(this.f22144x1, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "form:current-value");
        C20986OooO0o0.OooO0O0(this.f22137kk, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "form:min-value");
        C20986OooO0o0.OooO0O0(this.f22142to, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "form:max-value");
        String str3 = this.f22130du;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f22133h4;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f22139m9);
        String str5 = this.f22131dy;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        boolean z = this.f22128c5;
        String str6 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:disabled", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j = this.f22135jd;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("form:max-length", C13850af.m65147x1(j));
        }
        boolean z2 = this.f22129ck;
        if (!z2) {
            c3059ii.m12955x1("form:printable", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f22132fa;
        if (z3) {
            c3059ii.m12955x1("form:readonly", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j2 = this.f22143up;
        if ((j2 & 4294967295L) != 0) {
            c3059ii.m12955x1("form:tab-index", C13850af.m65147x1(j2));
        }
        boolean z4 = this.f22146yj;
        if (!z4) {
            c3059ii.m12955x1("form:tab-stop", z4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str7 = this.f22138ks;
        if (str7 != null) {
            c3059ii.m12955x1("form:title", str7);
        }
        boolean z5 = this.f22141rv;
        if (z5) {
            if (z5) {
                str6 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:convert-empty-to-null", str6);
        }
        String str8 = this.f22145x6;
        if (str8 != null) {
            c3059ii.m12955x1("form:data-field", str8);
        }
        eyu eyuVar = this.f22140ne;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f22134ix;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        c3059ii.mo21898jd();
    }
}
