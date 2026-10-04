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
public class zm1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: u4 */
    private static final C7017h4 f33949u4 = new C7017h4("form:value", "form:current-value", "form:min-value", "form:max-value", "form:name", "form:control-implementation", "form:id", "xforms:bind", "form:disabled", "form:max-length", "form:printable", "form:readonly", "form:tab-index", "form:tab-stop", "form:title", "form:convert-empty-to-null", "form:data-field", "properties", "event-listeners");

    /* JADX INFO: renamed from: c5 */
    private boolean f33950c5;

    /* JADX INFO: renamed from: ck */
    private boolean f33951ck;

    /* JADX INFO: renamed from: du */
    private String f33952du;

    /* JADX INFO: renamed from: dy */
    private String f33953dy;

    /* JADX INFO: renamed from: fa */
    private boolean f33954fa;

    /* JADX INFO: renamed from: h4 */
    private String f33955h4;

    /* JADX INFO: renamed from: ix */
    private hec f33956ix;

    /* JADX INFO: renamed from: jd */
    private long f33957jd;

    /* JADX INFO: renamed from: ks */
    private String f33960ks;

    /* JADX INFO: renamed from: m9 */
    private String f33961m9;

    /* JADX INFO: renamed from: ne */
    private eyu f33962ne;

    /* JADX INFO: renamed from: rv */
    private boolean f33963rv;

    /* JADX INFO: renamed from: up */
    private long f33965up;

    /* JADX INFO: renamed from: x6 */
    private String f33967x6;

    /* JADX INFO: renamed from: yj */
    private boolean f33968yj;

    /* JADX INFO: renamed from: k4 */
    private C14084qq f33958k4 = new C14084qq();

    /* JADX INFO: renamed from: x1 */
    private C14084qq f33966x1 = new C14084qq();

    /* JADX INFO: renamed from: kk */
    private C14084qq f33959kk = new C14084qq();

    /* JADX INFO: renamed from: to */
    private C14084qq f33964to = new C14084qq();

    public zm1() {
        m45678x1();
    }

    public zm1(final AbstractC13912i5 abstractC13912i5) {
        m45678x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zm1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (zm1.f33949u4.m27428k4(str)) {
                    case 0:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(zm1.this.f33958k4);
                        break;
                    case 1:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(zm1.this.f33966x1);
                        break;
                    case 2:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(zm1.this.f33959kk);
                        break;
                    case 3:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(zm1.this.f33964to);
                        break;
                    case 4:
                        zm1.this.f33952du = str2;
                        break;
                    case 5:
                        zm1.this.f33955h4 = str2;
                        break;
                    case 6:
                        zm1.this.f33961m9 = str2;
                        break;
                    case 7:
                        zm1.this.f33953dy = str2;
                        break;
                    case 8:
                        zm1.this.f33950c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        zm1.this.f33957jd = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 10:
                        zm1.this.f33951ck = C13850af.m65068c5(str2);
                        break;
                    case 11:
                        zm1.this.f33954fa = C13850af.m65068c5(str2);
                        break;
                    case 12:
                        zm1.this.f33965up = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 13:
                        zm1.this.f33968yj = C13850af.m65068c5(str2);
                        break;
                    case 14:
                        zm1.this.f33960ks = str2;
                        break;
                    case 15:
                        zm1.this.f33963rv = C13850af.m65068c5(str2);
                        break;
                    case 16:
                        zm1.this.f33967x6 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zm1.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = zm1.f33949u4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 17) {
                    zm1.this.f33962ne = new eyu(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 18) {
                    return false;
                }
                zm1.this.f33956ix = new hec(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m45678x1() {
        C14084qq c14084qq = C14084qq.f47299x1;
        c14084qq.CloneTo(this.f33958k4);
        c14084qq.CloneTo(this.f33966x1);
        c14084qq.CloneTo(this.f33959kk);
        c14084qq.CloneTo(this.f33964to);
        this.f33950c5 = false;
        this.f33957jd = 4294967295L;
        this.f33951ck = true;
        this.f33954fa = false;
        this.f33965up = 0L;
        this.f33968yj = true;
        this.f33963rv = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C20986OooO0o0.OooO0O0(this.f33958k4, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "form:value");
        C20986OooO0o0.OooO0O0(this.f33966x1, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "form:current-value");
        C20986OooO0o0.OooO0O0(this.f33959kk, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "form:min-value");
        C20986OooO0o0.OooO0O0(this.f33964to, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "form:max-value");
        String str3 = this.f33952du;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f33955h4;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f33961m9);
        String str5 = this.f33953dy;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        boolean z = this.f33950c5;
        String str6 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:disabled", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j = this.f33957jd;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("form:max-length", C13850af.m65147x1(j));
        }
        boolean z2 = this.f33951ck;
        if (!z2) {
            c3059ii.m12955x1("form:printable", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f33954fa;
        if (z3) {
            c3059ii.m12955x1("form:readonly", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j2 = this.f33965up;
        if ((j2 & 4294967295L) != 0) {
            c3059ii.m12955x1("form:tab-index", C13850af.m65147x1(j2));
        }
        boolean z4 = this.f33968yj;
        if (!z4) {
            c3059ii.m12955x1("form:tab-stop", z4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str7 = this.f33960ks;
        if (str7 != null) {
            c3059ii.m12955x1("form:title", str7);
        }
        boolean z5 = this.f33963rv;
        if (z5) {
            if (z5) {
                str6 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:convert-empty-to-null", str6);
        }
        String str8 = this.f33967x6;
        if (str8 != null) {
            c3059ii.m12955x1("form:data-field", str8);
        }
        eyu eyuVar = this.f33962ne;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f33956ix;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        c3059ii.mo21898jd();
    }
}
